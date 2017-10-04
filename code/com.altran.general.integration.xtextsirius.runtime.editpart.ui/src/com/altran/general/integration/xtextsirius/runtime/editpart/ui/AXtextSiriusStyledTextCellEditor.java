package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.xtext.resource.XtextResource;
import org.yakindu.base.xtext.utils.gmf.viewers.XtextStyledTextCellEditorEx;
import org.yakindu.base.xtext.utils.jface.viewers.context.IXtextFakeContextResourcesProvider;

import com.altran.general.integration.xtextsirius.util.FakeResourceUtil;
import com.google.inject.Injector;

public abstract class AXtextSiriusStyledTextCellEditor extends XtextStyledTextCellEditorEx {

	private final boolean multiLine;

	private EObject semanticElement;
	private EObject fallbackContainer;
	
	private long modificationStamp = IDocumentExtension4.UNKNOWN_MODIFICATION_STAMP;

	public AXtextSiriusStyledTextCellEditor(
			final int style,
			final @NonNull Injector injector,
			final boolean multiLine) {
		super(style, injector);
		this.multiLine = multiLine;
	}

	public boolean isMultiLine() {
		return this.multiLine;
	}

	public abstract @Nullable Object getValueToCommit();

	@Override
	protected XtextSiriusStyledTextXtextAdapter createXtextAdapter() {
		return new XtextSiriusStyledTextXtextAdapter(getInjector(),
				getContextFakeResourceProvider() == null ? IXtextFakeContextResourcesProvider.NULL_CONTEXT_PROVIDER
						: getContextFakeResourceProvider());
	}

	@Override
	public XtextSiriusStyledTextXtextAdapter getXtextAdapter() {
		return (XtextSiriusStyledTextXtextAdapter) super.getXtextAdapter();
	}

	@Override
	protected void doSetValue(final Object value) {
		super.doSetValue(value);
		final EObject element = getSemanticElement();
		final XtextResource fakeResource = getXtextAdapter().getFakeResourceContext().getFakeResource();
		if (element != null) {
			FakeResourceUtil.getInstance().updateFakeResourceUri(fakeResource, element.eResource().getURI());
		} else {
			final EObject fallback = getFallbackContainer();
			FakeResourceUtil.getInstance().updateFakeResourceUri(fakeResource, fallback.eResource().getURI());
		}
		
		resetDirty();
	}

	protected void setSemanticElement(final @Nullable EObject element) {
		this.semanticElement = element;
	}

	protected @Nullable EObject getSemanticElement() {
		return this.semanticElement;
	}

	protected void setFallbackContainer(final @NonNull EObject fallbackContainer) {
		this.fallbackContainer = fallbackContainer;
	}

	protected void resetDirty() {
		this.modificationStamp = retrieveModificationStamp();
	}
	
	protected long retrieveModificationStamp() {
		return getXtextAdapter().getModificationStamp();
	}

	@Override
	public boolean isDirty() {
		return this.modificationStamp != retrieveModificationStamp();
	}

	protected EObject getFallbackContainer() {
		return this.fallbackContainer;
	}

}