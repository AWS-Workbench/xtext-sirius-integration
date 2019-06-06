/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editor.modeladjust;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;

public interface IModelAdjuster {
	public @Nullable EObject getSemanticElement(final @NonNull ModelEntryPoint modelEntryPoint);
	
	public @NonNull EObject getFallbackContainer(final @NonNull ModelEntryPoint modelEntryPoint);

	public @NonNull EObject getClosestElement(final @NonNull ModelEntryPoint modelEntryPoint);
	
	public @NonNull EStructuralFeature getStructuralFeature(final @NonNull ModelEntryPoint modelEntryPoint);

	public @Nullable Object getValue(final @NonNull ModelEntryPoint modelEntryPoint);
	
	public @NonNull ModelEntryPoint adjust(final @NonNull ModelEntryPoint modelEntryPoint);
}
