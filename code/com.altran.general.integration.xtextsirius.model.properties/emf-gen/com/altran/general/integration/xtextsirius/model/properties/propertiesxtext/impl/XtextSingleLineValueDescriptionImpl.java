/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.sirius.properties.impl.TextDescriptionImpl;

import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.PropertiesxtextPackage;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextPropertyValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Xtext
 * Single Line Value Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getInjectorId
 * <em>Injector Id</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#isCancelOnValidationError
 * <em>Cancel On Validation Error</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#isEnableFormatter
 * <em>Enable Formatter</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getPrefixTextExpression
 * <em>Prefix Text Expression</em>}</li>
 * <li>{@link com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.impl.XtextSingleLineValueDescriptionImpl#getSuffixTextExpression
 * <em>Suffix Text Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XtextSingleLineValueDescriptionImpl extends TextDescriptionImpl
		implements XtextSingleLineValueDescription {
	/**
	 * The default value of the '{@link #getInjectorId() <em>Injector Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInjectorId()
	 * @generated
	 * @ordered
	 */
	protected static final String INJECTOR_ID_EDEFAULT = null;
	
	/**
	 * The cached value of the '{@link #getInjectorId() <em>Injector Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInjectorId()
	 * @generated
	 * @ordered
	 */
	protected String injectorId = INJECTOR_ID_EDEFAULT;
	
	/**
	 * The default value of the '{@link #isCancelOnValidationError() <em>Cancel
	 * On Validation Error</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isCancelOnValidationError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CANCEL_ON_VALIDATION_ERROR_EDEFAULT = false;
	
	/**
	 * The cached value of the '{@link #isCancelOnValidationError() <em>Cancel
	 * On Validation Error</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isCancelOnValidationError()
	 * @generated
	 * @ordered
	 */
	protected boolean cancelOnValidationError = CANCEL_ON_VALIDATION_ERROR_EDEFAULT;
	
	/**
	 * The default value of the '{@link #isEnableFormatter() <em>Enable
	 * Formatter</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isEnableFormatter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_FORMATTER_EDEFAULT = true;
	
	/**
	 * The cached value of the '{@link #isEnableFormatter() <em>Enable
	 * Formatter</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isEnableFormatter()
	 * @generated
	 * @ordered
	 */
	protected boolean enableFormatter = ENABLE_FORMATTER_EDEFAULT;
	
	/**
	 * The default value of the '{@link #getPrefixTextExpression() <em>Prefix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPrefixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_TEXT_EXPRESSION_EDEFAULT = null;
	
	/**
	 * The cached value of the '{@link #getPrefixTextExpression() <em>Prefix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getPrefixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected String prefixTextExpression = PREFIX_TEXT_EXPRESSION_EDEFAULT;
	
	/**
	 * The default value of the '{@link #getSuffixTextExpression() <em>Suffix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSuffixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_TEXT_EXPRESSION_EDEFAULT = null;
	
	/**
	 * The cached value of the '{@link #getSuffixTextExpression() <em>Suffix
	 * Text Expression</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSuffixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected String suffixTextExpression = SUFFIX_TEXT_EXPRESSION_EDEFAULT;
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected XtextSingleLineValueDescriptionImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesxtextPackage.Literals.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getInjectorId() {
		return this.injectorId;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setInjectorId(final String newInjectorId) {
		final String oldInjectorId = this.injectorId;
		this.injectorId = newInjectorId;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID, oldInjectorId,
					this.injectorId));
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isCancelOnValidationError() {
		return this.cancelOnValidationError;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setCancelOnValidationError(final boolean newCancelOnValidationError) {
		final boolean oldCancelOnValidationError = this.cancelOnValidationError;
		this.cancelOnValidationError = newCancelOnValidationError;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__CANCEL_ON_VALIDATION_ERROR,
					oldCancelOnValidationError, this.cancelOnValidationError));
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isEnableFormatter() {
		return this.enableFormatter;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEnableFormatter(final boolean newEnableFormatter) {
		final boolean oldEnableFormatter = this.enableFormatter;
		this.enableFormatter = newEnableFormatter;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__ENABLE_FORMATTER, oldEnableFormatter,
					this.enableFormatter));
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getPrefixTextExpression() {
		return this.prefixTextExpression;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPrefixTextExpression(final String newPrefixTextExpression) {
		final String oldPrefixTextExpression = this.prefixTextExpression;
		this.prefixTextExpression = newPrefixTextExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION,
					oldPrefixTextExpression, this.prefixTextExpression));
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getSuffixTextExpression() {
		return this.suffixTextExpression;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSuffixTextExpression(final String newSuffixTextExpression) {
		final String oldSuffixTextExpression = this.suffixTextExpression;
		this.suffixTextExpression = newSuffixTextExpression;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION,
					oldSuffixTextExpression, this.suffixTextExpression));
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isMultiLine() {
		return false;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
				return getInjectorId();
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__CANCEL_ON_VALIDATION_ERROR:
				return isCancelOnValidationError();
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__ENABLE_FORMATTER:
				return isEnableFormatter();
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return getPrefixTextExpression();
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				return getSuffixTextExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
				setInjectorId((String) newValue);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__CANCEL_ON_VALIDATION_ERROR:
				setCancelOnValidationError((Boolean) newValue);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__ENABLE_FORMATTER:
				setEnableFormatter((Boolean) newValue);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				setPrefixTextExpression((String) newValue);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				setSuffixTextExpression((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
				setInjectorId(INJECTOR_ID_EDEFAULT);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__CANCEL_ON_VALIDATION_ERROR:
				setCancelOnValidationError(CANCEL_ON_VALIDATION_ERROR_EDEFAULT);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__ENABLE_FORMATTER:
				setEnableFormatter(ENABLE_FORMATTER_EDEFAULT);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				setPrefixTextExpression(PREFIX_TEXT_EXPRESSION_EDEFAULT);
				return;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				setSuffixTextExpression(SUFFIX_TEXT_EXPRESSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
				return INJECTOR_ID_EDEFAULT == null ? this.injectorId != null
						: !INJECTOR_ID_EDEFAULT.equals(this.injectorId);
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__CANCEL_ON_VALIDATION_ERROR:
				return this.cancelOnValidationError != CANCEL_ON_VALIDATION_ERROR_EDEFAULT;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__ENABLE_FORMATTER:
				return this.enableFormatter != ENABLE_FORMATTER_EDEFAULT;
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return PREFIX_TEXT_EXPRESSION_EDEFAULT == null ? this.prefixTextExpression != null
						: !PREFIX_TEXT_EXPRESSION_EDEFAULT.equals(this.prefixTextExpression);
			case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				return SUFFIX_TEXT_EXPRESSION_EDEFAULT == null ? this.suffixTextExpression != null
						: !SUFFIX_TEXT_EXPRESSION_EDEFAULT.equals(this.suffixTextExpression);
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
		if (baseClass == IXtextDescription.class) {
			switch (derivedFeatureID) {
				case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID:
					return XtextsiriusPackage.IXTEXT_DESCRIPTION__INJECTOR_ID;
				case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__CANCEL_ON_VALIDATION_ERROR:
					return XtextsiriusPackage.IXTEXT_DESCRIPTION__CANCEL_ON_VALIDATION_ERROR;
				case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__ENABLE_FORMATTER:
					return XtextsiriusPackage.IXTEXT_DESCRIPTION__ENABLE_FORMATTER;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextPropertyDescription.class) {
			switch (derivedFeatureID) {
				default:
					return -1;
			}
		}
		if (baseClass == IXtextValueDescription.class) {
			switch (derivedFeatureID) {
				case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
					return XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
				case PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
					return XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextPropertyValueDescription.class) {
			switch (derivedFeatureID) {
				default:
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
		if (baseClass == IXtextDescription.class) {
			switch (baseFeatureID) {
				case XtextsiriusPackage.IXTEXT_DESCRIPTION__INJECTOR_ID:
					return PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__INJECTOR_ID;
				case XtextsiriusPackage.IXTEXT_DESCRIPTION__CANCEL_ON_VALIDATION_ERROR:
					return PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__CANCEL_ON_VALIDATION_ERROR;
				case XtextsiriusPackage.IXTEXT_DESCRIPTION__ENABLE_FORMATTER:
					return PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__ENABLE_FORMATTER;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextPropertyDescription.class) {
			switch (baseFeatureID) {
				default:
					return -1;
			}
		}
		if (baseClass == IXtextValueDescription.class) {
			switch (baseFeatureID) {
				case XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
					return PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
				case XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
					return PropertiesxtextPackage.XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;
				default:
					return -1;
			}
		}
		if (baseClass == IXtextPropertyValueDescription.class) {
			switch (baseFeatureID) {
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}
		
		final StringBuilder result = new StringBuilder(super.toString());
		result.append(" (injectorId: ");
		result.append(this.injectorId);
		result.append(", cancelOnValidationError: ");
		result.append(this.cancelOnValidationError);
		result.append(", enableFormatter: ");
		result.append(this.enableFormatter);
		result.append(", prefixTextExpression: ");
		result.append(this.prefixTextExpression);
		result.append(", suffixTextExpression: ");
		result.append(this.suffixTextExpression);
		result.append(')');
		return result.toString();
	}
	
} // XtextSingleLineValueDescriptionImpl
