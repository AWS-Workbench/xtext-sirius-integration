package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestFactory
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage
import com.altran.general.integration.xtextsirius.util.EMerger
import org.eclipse.emf.common.util.URI

abstract class ATestEMerger<T extends IElement<?>> {
	protected extension XtextSiriusTestPackage xtextSiriusTestPackage = XtextSiriusTestPackage.eINSTANCE
	protected extension XtextSiriusTestFactory xtextSiriusTestFactory = XtextSiriusTestFactory.eINSTANCE
	
	protected T edited
	
	protected def createEMerger(T existing, T edited) {
		this.edited = edited
		new EMerger(existing, emptySet, emptySet, URI.createURI("resourceName.xmi#/42"))
	}

	public def T newElement(int id, String attrValue) {
		createRootElement => [
			changeableAttr = attrValue
		]
	}
	
	protected def T createRootElement() {
		createElement as T
	}
}
