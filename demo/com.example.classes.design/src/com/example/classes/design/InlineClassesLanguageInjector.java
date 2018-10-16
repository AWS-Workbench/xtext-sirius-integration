/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.example.classes.design;

import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.example.classes.inlineedit.ui.internal.InlineeditActivator;
import com.google.inject.Injector;

public class InlineClassesLanguageInjector implements IXtextLanguageInjector {
	
	@Override
	public Injector getInjector() {
		return InlineeditActivator.getInstance()
				.getInjector(InlineeditActivator.COM_EXAMPLE_CLASSES_INLINEEDIT);
	}

}
