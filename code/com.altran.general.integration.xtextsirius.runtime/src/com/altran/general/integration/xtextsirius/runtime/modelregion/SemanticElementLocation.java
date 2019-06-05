/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.modelregion;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * Stores the location of an {@link EObject} in a robust way.
 *
 * <p>
 * We can store the location of any EObject or a non-existing EObject, given its
 * parent, containing feature and index (if the containing feature is a
 * collection). The location can be resolved even if there are major changes to
 * the target or descendants. It might not be resolvable if the model changed
 * outside of the target.
 * </p>
 *
 * <p>
 * We do not keep any expensive / highly connected state of the target; We keep
 * a reference to the target's metamodel. This should reduce memory leaks.
 * </p>
 *
 * @author nstotz
 *
 */
public class SemanticElementLocation {
	
	@Nullable
	private String uriFragment;
	@Nullable
	private String parentUriFragment;
	@Nullable
	private EStructuralFeature containingFeature;
	@Nullable
	private Integer index;
	
	public SemanticElementLocation(final @NonNull EObject semanticElement) {
		storeLocation(semanticElement);
	}
	
	public SemanticElementLocation(
			final @Nullable String uriFragment,
			final @NonNull String parentUriFragment,
			final @NonNull EStructuralFeature containingFeature,
			final @Nullable Integer index) {
		this.uriFragment = uriFragment;
		this.parentUriFragment = parentUriFragment;
		this.containingFeature = containingFeature;
		this.index = index;
	}
	
	@SuppressWarnings("unchecked")
	private void storeLocation(final @NonNull EObject semanticElement) {
		final Resource resource = semanticElement.eResource();
		this.uriFragment = resource.getURIFragment(semanticElement);
		final EObject parent = semanticElement.eContainer();
		if (parent != null) {
			this.parentUriFragment = resource.getURIFragment(parent);
			final EStructuralFeature eContainingFeature = semanticElement.eContainingFeature();
			this.containingFeature = eContainingFeature;
			if (eContainingFeature.isMany()) {
				this.index = ((EList<EObject>) parent
						.eGet(this.containingFeature)).indexOf(semanticElement);
			}
		} else {
			this.parentUriFragment = null;
			this.containingFeature = null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public Object resolve(final @NonNull Resource resource) {
		if (this.uriFragment != null) {
			final EObject result = resource.getEObject(this.uriFragment);
			if (result != null) {
				return result;
			}
		}
		
		final EStructuralFeature nerv = this.containingFeature;
		if (nerv != null && this.parentUriFragment != null) {
			final Object containingElement = resource.getEObject(this.parentUriFragment)
					.eGet(nerv);
			return containingElement;
			// if (nerv.isMany() && this.index != null) {
			// return ((EList<EObject>) containingElement).get(this.index);
			// } else {
			// return (EObject) containingElement;
			// }
		}
		throw new IllegalStateException("cannot resolve EObject without container");
	}
}
