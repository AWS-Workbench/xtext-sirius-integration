/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * This is the item provider adapter for a {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class XtextSingleLineValueDescriptionItemProvider extends ItemProviderAdapter {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public XtextSingleLineValueDescriptionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInjectorIdPropertyDescriptor(object);
			addPrefixTextExpressionPropertyDescriptor(object);
			addSuffixTextExpressionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Injector Id feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void addInjectorIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_IXtextDescription_injectorId_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_IXtextDescription_injectorId_feature",
						"_UI_IXtextDescription_type"),
				XtextsiriusPackage.Literals.IXTEXT_DESCRIPTION__INJECTOR_ID, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prefix Text Expression feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixTextExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_IXtextValueDescription_prefixTextExpression_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IXtextValueDescription_prefixTextExpression_feature", "_UI_IXtextValueDescription_type"),
				XtextsiriusPackage.Literals.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Suffix Text Expression feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuffixTextExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_IXtextValueDescription_suffixTextExpression_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_IXtextValueDescription_suffixTextExpression_feature", "_UI_IXtextValueDescription_type"),
				XtextsiriusPackage.Literals.IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns XtextSingleLineValueDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XtextSingleLineValueDescription"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		final String label = ((TextDescription) object).getLabelExpression();
		return label == null || label.length() == 0 ? getString("_UI_XtextSingleLineValueDescription_type") : //$NON-NLS-1$
				label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(XtextSingleLineValueDescription.class)) {
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
		case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) adapterFactory).getResourceLocator();
	}

}
