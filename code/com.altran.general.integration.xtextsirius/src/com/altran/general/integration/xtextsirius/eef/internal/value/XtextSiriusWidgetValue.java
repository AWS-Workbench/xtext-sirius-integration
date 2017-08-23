package com.altran.general.integration.xtextsirius.eef.internal.value;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.widgets.Composite;

import com.altran.general.integration.xtextsirius.eef.internal.AXtextSiriusWidget;
import com.google.inject.Injector;

public class XtextSiriusWidgetValue extends AXtextSiriusWidget {
	
	private final @NonNull String prefixText;
	private final @NonNull String suffixText;
	
	public XtextSiriusWidgetValue(
			final @NonNull Composite parent,
			final @NonNull Injector injector,
			final @NonNull String prefixText,
			final @NonNull String suffixText) {
		super(parent, injector);
		this.prefixText = prefixText;
		this.suffixText = suffixText;
	}
	
	@SuppressWarnings("restriction")
	public void update(final @NonNull String newValue) {
		this.editorAccess.updateModel(this.prefixText, newValue, this.suffixText);
	}
}
