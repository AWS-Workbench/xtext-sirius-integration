/**
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
import org.eclipse.sirius.business.api.query.IdentifiedElementQuery;
import org.eclipse.sirius.viewpoint.description.IdentifiedElement;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * This is the item provider adapter for a {@link com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XtextDirectEditModelDescriptionItemProvider extends AXtextDirectEditLabelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtextDirectEditModelDescriptionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInjectorIdPropertyDescriptor(object);
			addMultiLinePropertyDescriptor(object);
			addEditableFeaturesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Injector Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * This adds a property descriptor for the Multi Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_IXtextDirectEditDescription_multiLine_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_IXtextDirectEditDescription_multiLine_feature",
						"_UI_IXtextDirectEditDescription_type"),
				XtextsiriusPackage.Literals.IXTEXT_DIRECT_EDIT_DESCRIPTION__MULTI_LINE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Editable Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditableFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_IXtextModelDescription_editableFeatures_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_IXtextModelDescription_editableFeatures_feature",
						"_UI_IXtextModelDescription_type"),
				XtextsiriusPackage.Literals.IXTEXT_MODEL_DESCRIPTION__EDITABLE_FEATURES, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns XtextDirectEditModelDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XtextDirectEditModelDescription"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public String getText(final Object object) {
		final String label = new IdentifiedElementQuery((IdentifiedElement) object).getLabel();
		return label == null || label.length() == 0 ? getString("_UI_XtextDirectEditModelDescription_type")
				: getString("_UI_XtextDirectEditModelDescription_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(XtextDirectEditModelDescription.class)) {
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__INJECTOR_ID:
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__MULTI_LINE:
		case DiagramxtextPackage.XTEXT_DIRECT_EDIT_MODEL_DESCRIPTION__EDITABLE_FEATURES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
