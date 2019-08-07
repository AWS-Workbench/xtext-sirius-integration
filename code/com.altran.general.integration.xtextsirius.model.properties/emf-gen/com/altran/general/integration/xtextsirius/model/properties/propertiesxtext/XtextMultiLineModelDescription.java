/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext;

import org.eclipse.sirius.properties.TextAreaDescription;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyModelDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Xtext
 * Multi Line Model Description</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage#getXtextMultiLineModelDescription()
 * @model
 * @generated
 */
public interface XtextMultiLineModelDescription extends TextAreaDescription, IXtextPropertyModelDescription {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return
	 *        true;'"
	 * @generated
	 */
	@Override
	boolean isMultiLine();
	
} // XtextMultiLineModelDescription
