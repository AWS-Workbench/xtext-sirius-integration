package com.altran.general.integration.xtextsirius.editpart.internal.value;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.altran.general.integration.xtextsirius.editpart.internal.AEditPartDescriptor;

public class EditPartDescriptorValue extends AEditPartDescriptor {
	public EditPartDescriptorValue(final @Nullable String identifier, final boolean singleLine,
			final @Nullable IXtextDirectEditConfiguration config) {
		super(identifier, singleLine, config);
	}

	@Override
	public @NonNull XtextLabelEditPart createEditPart(final @NonNull View view) {
		return new XtextSiriusEditPartValue(this, view);
	}
}
