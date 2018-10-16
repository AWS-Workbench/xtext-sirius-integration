/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.modelregion;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.formatting2.FormatterPreferences;
import org.eclipse.xtext.formatting2.FormatterRequest;
import org.eclipse.xtext.formatting2.IFormatter2;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.formatting2.regionaccess.ITextReplacement;
import org.eclipse.xtext.formatting2.regionaccess.TextRegionAccessBuilder;
import org.eclipse.xtext.preferences.IPreferenceValuesProvider;
import org.eclipse.xtext.preferences.TypedPreferenceValues;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.util.ExceptionAcceptor;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

/**
 * Prepares an Xtext-based EObject to be edited in an embedded editor.
 *
 * <p>
 * Takes care of:
 * </p>
 *
 * <ul>
 * <li>Serializing the current model state (independent of persistence)</li>
 * <li>Moving the text of the target to the beginning of a line (as
 * StyledTextEditor can only show subparts of the document starting at a new
 * line)</li>
 * <li>Calculating the correct TextRegion that can be edited, based on the
 * target and the <i>editableFeatures</i></li>
 * <li>Calculating the location of the target</li>
 * <li>Removing newlines if {@code multiLine} is NOT set</li>
 * <li>Adds terminals from the grammar if required (i.e. the target itself or
 * the single <i>editableFeature</i> is {@code null}, and its position in the
 * grammar requires delimiters)</li>
 * </ul>
 *
 * <p>
 * Limitations:
 * </p>
 * <ul>
 * <li>If several <i>editableFeatures</i> are defined, but other features are
 * serialized in between, the other features will still be included.
 * <p>
 * <b>Example:</b><br/>
 * Grammar: <tt>Event: name=ID code=INT? ('[' guard=Guard ']')?;</tt><br/>
 * Model: <tt>myEvent 123 [1..2]</tt><br/>
 * <i>editableFeatures:</i> <tt>[name, guard]</tt><br/>
 * <i>semanticText:</i> <tt>myEvent 123 [1..2]</tt> (i.e. including the
 * <tt>code</tt> value)
 * </p>
 * </li>
 * <li>Adding required terminals might not work reliably if we use a complex
 * grammar. However, it should be influenced only by the grammar, not the model
 * text, therefore we can test it during language development.</li>
 * </ul>
 *
 *
 * @author nstotz
 *
 */
@SuppressWarnings("restriction")
public class ModelRegionEditorPreparer {

	/*
	 * @formatter:off
	Examples for technical understanding

	Grammar (partial):
		Event:
			name=ID code=INT? ('[' guard=Guard ']')?
		;

		Guard:
			ValueGuard | RangeGuard
		;

		ValueGuard:
			cond=Value
		;

		RangeGuard:
			min=Value '..' max=Value
		;

		Value:
			ConstantRef | IntLiteral
		;

		ConstantRef:
			constant=[Constant]
		;

		IntLiteral:
			value=INT
		;

		Constant:
			name=ID value=Value
		;


	GrammarModel (partial):
		ParserRule name=Event
			alternatives=Group elements=
				Assignment feature=name
					terminal=RuleCall rule=ID
				Assignment feature=code
					terminal=RuleCall rule=INT
				Group elements=
					Keyword value=[
					Assignment feature=guard
						terminal=RuleCall rule=Guard
					Keyword value=]

		ParserRule name=Guard
			alternatives=Alternatives elements=
				RuleCall rule=ValueGuard
				RuleCall rule=RangeGuard

		ParserRule name=ValueGuard
			alternatives=Assignment feature=cond
				terminal=RuleCall rule=Value

		ParserRule name=Value
			alternatives=Alternatives elements=
				RuleCall rule=ConstantRef
				RuleCall rule=IntLiteral

		ParserRule name=ConstantRef
			alternatives=Assignment feature=constant
				terminal=CrossReference type=Constant
					terminal=RuleCall rule=ID

		ParserRule name=IntLiteral
			alternatives=Assignment feature=value
				terminal=RuleCall rule=INT

		ParserRule name=Constant
			alternatives=Group elements=
				Assignment feature=name
					terminal=RuleCall rule=ID
				Assignment feature=value
					terminal=RuleCall rule=Value


	ParentMap (partial):
		<<element>>={<<allParentElements>>}

		Event={Event}
		Event.group[0]={Event}
		Event.group[1]={Event}
		Event.group[2]={Event}
		Event.group[0].terminal={Event.group[0]}
		Event.group[1].terminal={Event.group[1]}
		Event.group[2].group[0]={Event.group[2]}
		Event.group[2].group[1]={Event.group[2]}
		Event.group[2].group[2]={Event.group[2]}
		Event.group[2].group[1].terminal={Event.group[2].group[1]}
		Guard={Event.group[2].group[1].terminal}
		Guard.alternatives[0]={Guard}
		Guard.alternatives[1]={Guard}
		ValueGuard={Guard.alternatives[0]}
		ValueGuard.assignment={ValueGuard}
		ValueGuard.assignment.terminal={ValueGuard.assignment}
		Constant.group[0]={Constant}
		Constant.group[0].terminal={Constant.group[0]}
		Constant.group[1]={Constant}
		Constant.group[1].terminal={Constant.group[1]}
		Value={ValueGuard.assigment.terminal, Constant.group[1].terminal}
		Value.alternatives[0]={Value}
		Value.alternatives[1]={Value}
		ConstantRef={Value.alternatives[0]}
		ConstantRef.assignment={ConstantRef}
		ConstantRef.assignment.terminal={ConstantRef.assignment}
		IntLiteral={Value.alternatives[1]}
		IntLiteral.assignment={IntLiteral}
		IntLiteral.assignment.terminal={IntLiteral.assignment}
		ID={Event.group[0].terminal, Constant.group[0].terminal, ConstantRef.assignment.terminal}
		INT={Event.group[1].terminal, IntLiteral.assignment.terminal}


	Model (partial):
		events
			event0 1 [pi..1]
			event1 [42]
			event3
		end

		constants
			pi 314
		end

	ParserModel (partial):
		(A) SemanticRegion offset=28 length=13
			grammarElement=RuleCall rule=Event
			semanticElement=event1
			semanticRegions=
				(B) SemanticRegion offset=28 length=6
					grammarElement=RuleCall(Event.group[0].terminal)
					semanticElement=event1
					nextSemanticRegion
						--> (C)
				(C) SemanticRegion offset=35 length=1
					grammarElement=RuleCall(Event.group[1].terminal)
					semanticElement=event1
					nextSemanticRegion
						--> (D)
				(D) SemanticRegion offset=37 length=1
					grammarElement=Keyword(Event.group[2].group[0])
					semanticElement=event140 length=1
					nextSemanticRegion
						--> (F)
				(E) SemanticRegion offset=40 length=1
					grammarElement=Keyword(Event.group[2].group[2])
					semanticElement=event1

		(contained somewhere else)
		(F) SemanticRegion offset=38 length=2
			grammarElement=RuleCall(IntLiteral.assignment.terminal)
			semanticElement=IntLiteral(42)
			nextSemanticRegion
				--> (E)

	 * @formatter:on
	 */

	@Inject
	private ISerializer serializer;

	@Inject(optional = true)
	private Provider<IFormatter2> formatterProvider;

	@Inject(optional = true)
	private Provider<FormatterRequest> requestProvider;

	@Inject(optional = true)
	@FormatterPreferences
	private IPreferenceValuesProvider preferencesProvider;

	@Inject(optional = true)
	private XtextResourceFactory xtextResourceFactory;

	@Inject(optional = true)
	private Provider<TextRegionAccessBuilder> textRegionBuilderProvider;

	private final @Nullable EObject semanticElement;
	private final @NonNull EObject parentSemanticElement;
	private final EStructuralFeature semanticElementFeature;

	private boolean multiLine = false;
	private @NonNull Set<@NonNull String> editableFeatures = Collections.emptySet();
	private @NonNull Set<@NonNull String> ignoredNestedFeatures = Collections.emptySet();
	private @NonNull Set<@NonNull String> selectedFeatures = Collections.emptySet();
	private @Nullable String prefixText = null;
	private @Nullable String suffixText = null;

	private final Set<@NonNull EStructuralFeature> definedEditableFeatures = Sets.newLinkedHashSet();
	private final Set<@NonNull EStructuralFeature> definedSelectedFeatures = Sets.newLinkedHashSet();

	private boolean prepared;

	private TextRegion textRegion;
	private TextRegion selectedRegion;
	private SemanticElementLocation semanticElementLocation;
	
	// protected for testing purposes
	protected ITextRegionAccess rootRegion;
	protected IEObjectRegion semanticRegion;
	protected StringBuffer allText;
	
	
	/**
	 * Creates a ModelRegionEditorPreparer based on a non-null target.
	 *
	 * @param injector
	 *            Injector of the edited Xtext language.
	 * @param semanticElement
	 *            Target to edit.
	 */
	public ModelRegionEditorPreparer(
			final @NonNull Injector injector,
			final @NonNull EObject semanticElement) {
		this(injector, semanticElement, semanticElement.eContainer(), semanticElement.eContainingFeature());
	}

	/**
	 * Creates a ModelRegionEditorPreparer based on a nullable target.
	 *
	 * @param injector
	 *            Injector of the edited Xtext language.
	 * @param semanticElement
	 *            Target to edit.
	 * @param parentSemanticElement
	 *            EContainer of {@code semanticElement}.
	 * @param semanticElementFeature
	 *            Feature of {@code semanticElement} within
	 *            {@code parentSemanticElement}.
	 */
	public ModelRegionEditorPreparer(
			final @NonNull Injector injector,
			final @Nullable EObject semanticElement,
			final @NonNull EObject parentSemanticElement,
			final @NonNull EStructuralFeature semanticElementFeature) {
		this.semanticElement = semanticElement;
		this.parentSemanticElement = parentSemanticElement;
		this.semanticElementFeature = semanticElementFeature;

		injector.injectMembers(this);
	}

	/**
	 * Returns the subpart of the text that should be edited.
	 *
	 * @return The subpart of the text that should be edited.
	 */
	public @NonNull TextRegion getTextRegion() {
		prepare();
		return this.textRegion;
	}

	public @NonNull TextRegion getSelectedRegion() {
		prepare();
		return this.selectedRegion;
	}

	/**
	 * Returns the complete text that should be contained in the editor,
	 * including hidden parts.
	 *
	 * @return The complete text that should be contained in the editor,
	 *         including hidden parts.
	 */
	public @NonNull String getText() {
		prepare();
		return getAllText().toString();
	}

	/**
	 * Returns the location of the target.
	 *
	 * @return The location of the target.
	 */
	public @NonNull SemanticElementLocation getSemanticElementLocation() {
		prepare();
		return this.semanticElementLocation;
	}


	/**
	 * Returns the substring of the text that should be edited.
	 *
	 * @return The substring of the text that should be edited.
	 */
	public @NonNull String getSemanticText() {
		prepare();
		return getAllText().substring(getTextRegion().getOffset(),
				getTextRegion().getOffset() + getTextRegion().getLength());
	}
	
	protected TextRegion getTextRegionInternal() {
		return this.textRegion;
	}

	protected TextRegion getSelectedRegionInternal() {
		return this.selectedRegion;
	}

	/**
	 * Whether the editor support several lines.
	 *
	 * @param multiLine
	 */
	public void setMultiLine(final boolean multiLine) {
		this.multiLine = multiLine;
	}
	
	/**
	 * Collection of names of {@link EStructuralFeatures} valid for
	 * {@code semanticElement} that should be editable. If empty, all features
	 * are assumed to be editable.
	 *
	 * @param editableFeatures
	 */
	public void setEditableFeatures(final Set<String> editableFeatures) {
		this.editableFeatures = editableFeatures;
	}
	
	public void setIgnoredNestedFeatures(final Set<String> ignoredNestedFeatures) {
		this.ignoredNestedFeatures = ignoredNestedFeatures;
	}
	
	public void setSelectedFeatures(final Set<String> selectedFeatures) {
		this.selectedFeatures = selectedFeatures;
	}
	
	public void setPrefixText(final String prefixText) {
		this.prefixText = prefixText;
	}
	
	public void setSuffixText(final String suffixText) {
		this.suffixText = suffixText;
	}

	protected void prepare() {
		if (isPrepared()) {
			return;
		}

		final EObject rootContainer = EcoreUtil.getRootContainer(getParent());
		this.rootRegion = new ModelRegionSerializer(this).serialize(rootContainer);

		// formatIfPossible(rootContainer);

		if (getAllText() == null) {
			this.allText = new StringBuffer(getRootRegion().regionForDocument().getText());
		}

		final EObject element = getSemanticElement();

		if (element != null) {
			this.semanticElementLocation = new SemanticElementLocation(element);
			this.semanticRegion = getRootRegion().regionForEObject(element);

			this.textRegion = new ModelRegionCalculator(this).calculateFeatureRegion(element, getEditableFeatures(),
					getDefinedEditableFeatures(), true);
			this.selectedRegion = new ModelRegionCalculator(this).calculateFeatureRegion(element, getSelectedFeatures(),
					getDefinedSelectedFeatures(), false);
		} else {
			this.semanticElementLocation = constructXtextFragmentSchemeBasedLocation();
			this.semanticRegion = getRootRegion().regionForEObject(getParent());
			this.textRegion = new RequiredGrammarTerminalsPresentEnsurer(getParent(), getSemanticElementFeature(),
					getRootRegion(), getAllText()).ensure();
			this.selectedRegion = new TextRegion(getSemanticRegion().getOffset(), 0);
		}

		this.textRegion = StyledTextUtil.getInstance().insertNewline(getAllText(), getTextRegionInternal());
		this.selectedRegion = StyledTextUtil.getInstance().moveByInsertedNewline(getAllText(),
				getSelectedRegionInternal());

		StyledTextUtil.getInstance().removeNewlinesIfSingleLine(getAllText(), getTextRegionInternal(), isMultiLine());

		this.prepared = true;
	}
	
	// TODO: Not used -- remove?
	protected void formatIfPossible(final EObject rootContainer) {
		if (this.requestProvider != null && this.formatterProvider != null && this.xtextResourceFactory != null
				&& this.textRegionBuilderProvider != null && this.parentSemanticElement.eResource() != null) {
			this.allText = new StringBuffer();
			final FormatterRequest request = this.requestProvider.get();
			request.setAllowIdentityEdits(false);
			request.setFormatUndefinedHiddenRegionsOnly(false);
			if (this.preferencesProvider != null) {
				request.setPreferences(TypedPreferenceValues
						.castOrWrap(this.preferencesProvider.getPreferenceValues(rootContainer.eResource())));
			}
			request.setTextRegionAccess(getRootRegion());
			request.setExceptionHandler(ExceptionAcceptor.IGNORING);
			final IFormatter2 formatter = this.formatterProvider.get();
			final List<ITextReplacement> replacements = formatter.format(request);
			try {
				getRootRegion().getRewriter().renderToAppendable(replacements, getAllText());
				final XtextResource resource = (XtextResource) this.xtextResourceFactory
						.createResource(this.parentSemanticElement.eResource().getURI());
				resource.load(new StringInputStream(getAllText().toString()), Collections.emptyMap());
				this.rootRegion = this.textRegionBuilderProvider.get().forNodeModel(resource).create();
			} catch (final IOException e) {
				this.allText = null;
			}
		}
	}

	/**
	 * Mimics the URI fragment scheme used by Xtext.
	 */
	protected SemanticElementLocation constructXtextFragmentSchemeBasedLocation() {
		final EStructuralFeature feature = getSemanticElementFeature();
		final String parentFragment = EcoreUtil.getURI(getParent()).fragment();
		final String fragment = parentFragment + "/@" + feature.getName() + (feature.isMany() ? ".0" : "");
		return new SemanticElementLocation(fragment, parentFragment, feature, 0);
	}


	protected EObject getSemanticElement() {
		return this.semanticElement;
	}

	protected boolean isMultiLine() {
		return this.multiLine;
	}

	protected EObject getParent() {
		return this.parentSemanticElement;
	}

	protected @NonNull Set<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}

	protected @NonNull Set<@NonNull String> getIgnoredNestedFeatures() {
		return this.ignoredNestedFeatures;
	}

	protected @NonNull Set<@NonNull String> getSelectedFeatures() {
		return this.selectedFeatures;
	}
	
	protected @NonNull EStructuralFeature getSemanticElementFeature() {
		return this.semanticElementFeature;
	}
	
	protected @Nullable String getPrefixText() {
		return this.prefixText;
	}

	protected @Nullable String getSuffixText() {
		return this.suffixText;
	}
	
	protected Serializer getSerializer() {
		return (Serializer) this.serializer;
	}

	protected boolean isPrepared() {
		return this.prepared;
	}

	protected ITextRegionAccess getRootRegion() {
		return this.rootRegion;
	}

	protected IEObjectRegion getSemanticRegion() {
		return this.semanticRegion;
	}

	protected StringBuffer getAllText() {
		return this.allText;
	}
	
	protected Set<@NonNull EStructuralFeature> getDefinedEditableFeatures() {
		return this.definedEditableFeatures;
	}
	
	protected Set<@NonNull EStructuralFeature> getDefinedSelectedFeatures() {
		return this.definedSelectedFeatures;
	}
}