package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.util.ModelRegionEditorPreparer;
import com.google.inject.Injector;

@SuppressWarnings({ "restriction" })
public abstract class AModelRegionEditorPreparer extends AFowlerdslDefaultModelTest {
	protected static class AccessibleModelRegionEditorPreparer extends ModelRegionEditorPreparer {
		public AccessibleModelRegionEditorPreparer(final EObject semanticElement, final EObject parentSemanticElement,
				final Injector injector, final boolean multiLine, final Collection<String> editableFeatures,
				final EStructuralFeature semanticElementFeature) {
			super(semanticElement, parentSemanticElement, injector, multiLine, editableFeatures,
					semanticElementFeature);
		}

		public AccessibleModelRegionEditorPreparer(final EObject semanticElement, final Injector injector,
				final boolean multiLine, final Collection<String> editableFeatures) {
			super(semanticElement, injector, multiLine, editableFeatures);
		}

		@Override
		public TextRegion calculateRegionForFeatures(final EObject semanticElement) {
			return super.calculateRegionForFeatures(semanticElement);
		}

		@Override
		public void collectGrammarElementsBeforeAndAfter(final AbstractElement containedElement,
				final Group containingGroup, final List<AbstractElement> elementsBefore,
				final List<AbstractElement> elementsAfter) {
			super.collectGrammarElementsBeforeAndAfter(containedElement, containingGroup, elementsBefore,
					elementsAfter);
		}

		@Override
		public String collectToTerminalText(final List<AbstractElement> grammarElements) {
			return super.collectToTerminalText(grammarElements);
		}

		@Override
		public SemanticElementLocation constructXtextFragmentSchemeBasedLocation() {
			return super.constructXtextFragmentSchemeBasedLocation();
		}

		@Override
		public TextRegion ensureRequiredGrammarTerminalsPresent(final EObject element,
				final EStructuralFeature feature) {
			return super.ensureRequiredGrammarTerminalsPresent(element, feature);
		}

		@Override
		public List<AbstractElement> findContainedElementPath(final AbstractElement abstractElement,
				final EStructuralFeature feature) {
			return super.findContainedElementPath(abstractElement, feature);
		}

		@Override
		public Set<ISemanticRegion> findRegionsOfContainedElements(final IEObjectRegion elementRegion,
				final List<@NonNull AbstractElement> containedElementPath) {
			return super.findRegionsOfContainedElements(elementRegion, containedElementPath);
		}

		@Override
		public void prepare() {
			super.prepare();
		}

		@Override
		public Set<EStructuralFeature> resolveDefinedFeatures(final EObject semanticElement) {
			return super.resolveDefinedFeatures(semanticElement);
		}

		@Override
		public Set<@NonNull EStructuralFeature> resolveEditableFeatures(final EObject semanticElement) {
			return super.resolveEditableFeatures(semanticElement);
		}

		@Override
		public ISemanticRegion selectLastmostRegion(final Set<@NonNull ISemanticRegion> regionsOfContainedElements) {
			return super.selectLastmostRegion(regionsOfContainedElements);
		}
	}
}
