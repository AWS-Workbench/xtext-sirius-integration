/**
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.sirius.properties.PropertiesPackage;
import org.eclipse.sirius.properties.provider.TextAreaDescriptionItemProvider;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * This is the item provider adapter for a {@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class XtextMultiLineValueDescriptionItemProvider extends TextAreaDescriptionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public XtextMultiLineValueDescriptionItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns XtextMultiLineValueDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XtextMultiLineValueDescription"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
<<<<<<< b7f31d8da2d0f8863339344fb2e4db4be675bd51
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
	public String getText(final Object object) {
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
		final String label = ((XtextMultiLineValueDescription) object).getInjectorId();
=======
	public String getText(Object object) {
		String label = ((XtextMultiLineValueDescription) object).getIdentifier();
>>>>>>> preliminary fix for using guava v16
=======
	public String getText(final Object object) {
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
		final String label = ((XtextMultiLineValueDescription) object).getIdentifier();
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
		final String label = ((XtextMultiLineValueDescription) object).getInjectorId();
>>>>>>> updated to Oxygen.2
=======
		final String label = ((XtextMultiLineValueDescription) object).getIdentifier();
>>>>>>> fixed invalid import in generated files
=======
	public String getText(Object object) {
		String label = ((XtextMultiLineValueDescription) object).getIdentifier();
>>>>>>> intermediate commit: non-working start of delegate implmenetation
		return label == null || label.length() == 0 ? getString("_UI_XtextMultiLineValueDescription_type")
				: getString("_UI_XtextMultiLineValueDescription_type") + " " + label;
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

		switch (notification.getFeatureID(XtextMultiLineValueDescription.class)) {
		case PropertiesxtextPackage.XTEXT_MULTI_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
		case PropertiesxtextPackage.XTEXT_MULTI_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
		case PropertiesxtextPackage.XTEXT_MULTI_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
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
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
<<<<<<< b7f31d8da2d0f8863339344fb2e4db4be675bd51
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
<<<<<<< 1ddaf0147f100efe4802fdb6e688f21ab9b3b799
<<<<<<< 8321d5157cd6ff75c654826d35f6a74ca50e0b2c
<<<<<<< 1a6e8bd3e6f71b6e27aa8db10a884de044d8cdeb
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) this.adapterFactory).getResourceLocator();
=======
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;
=======
=======
>>>>>>> fixed invalid import in generated files
	public String getCreateChildText(final Object owner, final Object feature, final Object child,
			final Collection<?> selection) {
		final Object childFeature = feature;
		final Object childObject = child;
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> improved adaptation to old guava version by using partial backport instead of code copy
=======
>>>>>>> fixed invalid import in generated files
=======
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;
>>>>>>> intermediate commit: non-working start of delegate implmenetation

		boolean qualify = childFeature == PropertiesPackage.Literals.TEXT_DESCRIPTION__INITIAL_OPERATION;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
<<<<<<< 4d5096812efe0325615aba5a2ae92991741aa7c7
>>>>>>> preliminary fix for using guava v16
=======
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) this.adapterFactory).getResourceLocator();
>>>>>>> updated to Oxygen.2
=======
>>>>>>> fixed invalid import in generated files
	}

}
