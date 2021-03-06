/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * This is the item provider adapter for a
 * {@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditValueDescription}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class XtextDirectEditValueDescriptionItemProvider extends AXtextDirectEditLabelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public XtextDirectEditValueDescriptionItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
		if (this.itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);
			
			addInjectorIdPropertyDescriptor(object);
			addCancelOnValidationErrorPropertyDescriptor(object);
			addEnableFormatterPropertyDescriptor(object);
			addMultiLinePropertyDescriptor(object);
			addPrefixTextExpressionPropertyDescriptor(object);
			addSuffixTextExpressionPropertyDescriptor(object);
		}
		return this.itemPropertyDescriptors;
	}
	
	/**
	 * This adds a property descriptor for the Injector Id feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addInjectorIdPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IXtextDescription_injectorId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IXtextDescription_injectorId_feature",
								"_UI_IXtextDescription_type"),
						XtextsiriusPackage.Literals.IXTEXT_DESCRIPTION__INJECTOR_ID,
						true,
						false,
						false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null,
						null));
	}
	
	/**
	 * This adds a property descriptor for the Cancel On Validation Error
	 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCancelOnValidationErrorPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IXtextDescription_cancelOnValidationError_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_IXtextDescription_cancelOnValidationError_feature", "_UI_IXtextDescription_type"),
						XtextsiriusPackage.Literals.IXTEXT_DESCRIPTION__CANCEL_ON_VALIDATION_ERROR,
						true,
						false,
						false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
						null,
						null));
	}
	
	/**
	 * This adds a property descriptor for the Enable Formatter feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEnableFormatterPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_IXtextDescription_enableFormatter_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IXtextDescription_enableFormatter_feature",
								"_UI_IXtextDescription_type"),
						XtextsiriusPackage.Literals.IXTEXT_DESCRIPTION__ENABLE_FORMATTER,
						true,
						false,
						false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
						null,
						null));
	}
	
	/**
	 * This adds a property descriptor for the Multi Line feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addMultiLinePropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_IXtextDirectEditDescription_multiLine_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_IXtextDirectEditDescription_multiLine_feature",
						"_UI_IXtextDirectEditDescription_type"),
				XtextsiriusPackage.Literals.IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE,
				true,
				false,
				false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				null,
				null));
	}
	
	/**
	 * This adds a property descriptor for the Prefix Text Expression feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addPrefixTextExpressionPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_IXtextValueDescription_prefixTextExpression_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IXtextValueDescription_prefixTextExpression_feature", "_UI_IXtextValueDescription_type"),
				XtextsiriusPackage.Literals.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}
	
	/**
	 * This adds a property descriptor for the Suffix Text Expression feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSuffixTextExpressionPropertyDescriptor(final Object object) {
		this.itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_IXtextValueDescription_suffixTextExpression_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IXtextValueDescription_suffixTextExpression_feature", "_UI_IXtextValueDescription_type"),
				XtextsiriusPackage.Literals.IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION,
				true,
				false,
				false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				null,
				null));
	}
	
	/**
	 * This returns XtextDirectEditValueDescription.gif. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(final Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XtextDirectEditValueDescription"));
	}
	
	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(final Object object) {
		final String label = ((XtextDirectEditValueDescription) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_XtextDirectEditValueDescription_type")
				: getString("_UI_XtextDirectEditValueDescription_type") + " " + label;
	}
	
	
	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		updateChildren(notification);
		
		switch (notification.getFeatureID(XtextDirectEditValueDescription.class)) {
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__INJECTOR_ID:
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__CANCEL_ON_VALIDATION_ERROR:
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__ENABLE_FORMATTER:
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__MULTI_LINE:
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			case DiagramxtextPackage.XTEXT_DIRECT_EDIT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}
	
	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}
	
}
