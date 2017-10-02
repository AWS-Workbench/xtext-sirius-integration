package com.altran.general.integration.xtextsirius.editor.ui.internal.editablefeatures;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.editor.properties.filters.common.ViewpointPropertyFilter;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

public class XtextDirectEditModelDescriptionEditableFeaturesFilter extends ViewpointPropertyFilter {
	
	@Override
	protected EStructuralFeature getFeature() {
		return XtextsiriusPackage.eINSTANCE.getIXtextModelDescription_EditableFeatures();
	}
	
	@Override
	protected boolean isRightInputType(final Object arg0) {
		return arg0 instanceof IXtextDirectEditModelDescription;
	}

}
