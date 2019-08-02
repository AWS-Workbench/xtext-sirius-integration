/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.validator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

public class DuplicateEKeyValidatorFast extends ADuplicateEKeyValidator {
	
	@Override
	@Check(CheckType.FAST)
	public void checkDuplicateEKey(final EObject eObject) {
		super.checkDuplicateEKey(eObject);
	}
}
