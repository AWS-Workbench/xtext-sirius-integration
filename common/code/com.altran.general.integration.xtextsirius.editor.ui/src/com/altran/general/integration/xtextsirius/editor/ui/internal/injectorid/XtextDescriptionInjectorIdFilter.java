package com.altran.general.integration.xtextsirius.editor.ui.internal.injectorid;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.editor.properties.filters.common.ViewpointPropertyFilter;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

public class XtextDescriptionInjectorIdFilter extends ViewpointPropertyFilter {
	
	@Override
	protected EStructuralFeature getFeature() {
		return XtextsiriusPackage.eINSTANCE.getIXtextDescription_InjectorId();
	}
	
	@Override
	protected boolean isRightInputType(final Object arg0) {
		return arg0 instanceof IXtextDescription;
	}
	
}
