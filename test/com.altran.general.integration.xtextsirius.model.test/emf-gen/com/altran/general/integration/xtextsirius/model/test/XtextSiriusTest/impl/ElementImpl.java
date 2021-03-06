/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement;
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage;

import static org.junit.Assert.fail;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ElementImpl#getDerivedAttr <em>Derived Attr</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.impl.ElementImpl#getDerivedRef <em>Derived Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends AElementImpl<Element> implements Element {
	/**
	 * The default value of the '{@link #getDerivedAttr() <em>Derived Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String DERIVED_ATTR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerivedRef() <em>Derived Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedRef()
	 * @generated
	 * @ordered
	 */
	protected EList<IElement<?>> derivedRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XtextSiriusTestPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setChangeableRef(Element newChangeableRef) {
		super.setChangeableRef(newChangeableRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Element> getChangeableListRef() {
		if (changeableListRef == null) {
			changeableListRef = new EObjectResolvingEList<Element>(Element.class, this,
					XtextSiriusTestPackage.ELEMENT__CHANGEABLE_LIST_REF);
		}
		return changeableListRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Element> getUnchangeableListRef() {
		if (unchangeableListRef == null) {
			unchangeableListRef = new EObjectResolvingEList<Element>(Element.class, this,
					XtextSiriusTestPackage.ELEMENT__UNCHANGEABLE_LIST_REF);
		}
		return unchangeableListRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Element> getChangeableSetRef() {
		if (changeableSetRef == null) {
			changeableSetRef = new EObjectResolvingEList<Element>(Element.class, this,
					XtextSiriusTestPackage.ELEMENT__CHANGEABLE_SET_REF);
		}
		return changeableSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Element> getUnchangeableSetRef() {
		if (unchangeableSetRef == null) {
			unchangeableSetRef = new EObjectResolvingEList<Element>(Element.class, this,
					XtextSiriusTestPackage.ELEMENT__UNCHANGEABLE_SET_REF);
		}
		return unchangeableSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Element> getChangeableBagRef() {
		if (changeableBagRef == null) {
			changeableBagRef = new EObjectResolvingEList<Element>(Element.class, this,
					XtextSiriusTestPackage.ELEMENT__CHANGEABLE_BAG_REF);
		}
		return changeableBagRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Element> getUnchangeableBagRef() {
		if (unchangeableBagRef == null) {
			unchangeableBagRef = new EObjectResolvingEList<Element>(Element.class, this,
					XtextSiriusTestPackage.ELEMENT__UNCHANGEABLE_BAG_REF);
		}
		return unchangeableBagRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Element> getChangeableUniqueListCont() {
		if (changeableUniqueListCont == null) {
			changeableUniqueListCont = new EObjectContainmentEList<Element>(Element.class, this,
					XtextSiriusTestPackage.ELEMENT__CHANGEABLE_UNIQUE_LIST_CONT);
		}
		return changeableUniqueListCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Element> getUnchangeableUniqueListCont() {
		if (unchangeableUniqueListCont == null) {
			unchangeableUniqueListCont = new EObjectContainmentEList<Element>(Element.class, this,
					XtextSiriusTestPackage.ELEMENT__UNCHANGEABLE_UNIQUE_LIST_CONT);
		}
		return unchangeableUniqueListCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Element> getChangeableSetCont() {
		if (changeableSetCont == null) {
			changeableSetCont = new EObjectContainmentEList<Element>(Element.class, this,
					XtextSiriusTestPackage.ELEMENT__CHANGEABLE_SET_CONT);
		}
		return changeableSetCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetChangeableCont(Element newChangeableCont, NotificationChain msgs) {
		return super.basicSetChangeableCont(newChangeableCont, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetUnchangeableCont(Element newUnchangeableCont, NotificationChain msgs) {
		return super.basicSetUnchangeableCont(newUnchangeableCont, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Element> getUnchangeableSetCont() {
		if (unchangeableSetCont == null) {
			unchangeableSetCont = new EObjectContainmentEList<Element>(Element.class, this,
					XtextSiriusTestPackage.ELEMENT__UNCHANGEABLE_SET_CONT);
		}
		return unchangeableSetCont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDerivedAttr() {
		fail("EMerger should not call this method");
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<IElement<?>> getDerivedRef() {
		fail("EMerger should not call this method");
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case XtextSiriusTestPackage.ELEMENT__DERIVED_ATTR:
			return getDerivedAttr();
		case XtextSiriusTestPackage.ELEMENT__DERIVED_REF:
			return getDerivedRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case XtextSiriusTestPackage.ELEMENT__DERIVED_ATTR:
			return DERIVED_ATTR_EDEFAULT == null ? getDerivedAttr() != null
					: !DERIVED_ATTR_EDEFAULT.equals(getDerivedAttr());
		case XtextSiriusTestPackage.ELEMENT__DERIVED_REF:
			return derivedRef != null && !derivedRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementImpl
