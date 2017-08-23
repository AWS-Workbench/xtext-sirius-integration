package com.altran.general.integration.xtextsirius.eef.internal;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import com.google.inject.Inject;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public abstract class AXtextSiriusWidget {
	@Inject
	private EmbeddedEditorFactory embeddedEditorFactory;

	private final Injector injector;

	protected EmbeddedEditor editor;
	protected EmbeddedEditorModelAccess editorAccess;

	protected XtextSiriusEditedResourceProvider editedResourceProvider;


	public AXtextSiriusWidget(final @NonNull Composite parent, final @NonNull Injector injector) {
		this.injector = injector;
		injector.injectMembers(this);

		createEditor(parent);
	}

	private void createEditor(final @NonNull Composite parent) {
		this.editedResourceProvider = new XtextSiriusEditedResourceProvider(this.injector);
		this.editor = this.embeddedEditorFactory.newEditor(this.editedResourceProvider)
				.withParent(parent);

		this.editorAccess = this.editor.createPartialEditor(true);
	}

	public @Nullable Control getControl() {
		if (this.editor != null) {
			return this.editor.getViewer().getControl();
		}

		return null;
	}

	public @Nullable StyledText getTextWidget() {
		if (this.editor != null) {
			return this.editor.getViewer().getTextWidget();
		}

		return null;
	}

	public void cleanup() {
		if (this.editor != null) {
			this.editor.getDocument().set("");
		}
	}
}
