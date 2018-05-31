/**
 */
package com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineValueDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextPackage;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Eef
 * Xtext Single Line Value Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefXtextSingleLineValueDescriptionImpl#getPrefixTextExpression <em>Prefix Text Expression</em>}</li>
 *   <li>{@link com.altran.general.integration.xtextsirius.model.eef.eefxtext.impl.EefXtextSingleLineValueDescriptionImpl#getSuffixTextExpression <em>Suffix Text Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EefXtextSingleLineValueDescriptionImpl extends IEefXtextDescriptionImpl
		implements EefXtextSingleLineValueDescription {
	/**
	 * The default value of the '{@link #getPrefixTextExpression() <em>Prefix Text Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPrefixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_TEXT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefixTextExpression() <em>Prefix Text Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPrefixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected String prefixTextExpression = PREFIX_TEXT_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuffixTextExpression() <em>Suffix Text Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSuffixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_TEXT_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffixTextExpression() <em>Suffix Text Expression</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getSuffixTextExpression()
	 * @generated
	 * @ordered
	 */
	protected String suffixTextExpression = SUFFIX_TEXT_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EefXtextSingleLineValueDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefxtextPackage.Literals.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefixTextExpression() {
		return prefixTextExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefixTextExpression(String newPrefixTextExpression) {
		String oldPrefixTextExpression = prefixTextExpression;
		prefixTextExpression = newPrefixTextExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION,
					oldPrefixTextExpression, prefixTextExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffixTextExpression() {
		return suffixTextExpression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffixTextExpression(String newSuffixTextExpression) {
		String oldSuffixTextExpression = suffixTextExpression;
		suffixTextExpression = newSuffixTextExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION,
					oldSuffixTextExpression, suffixTextExpression));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			return getPrefixTextExpression();
		case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
			return getSuffixTextExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			setPrefixTextExpression((String) newValue);
			return;
		case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
			setSuffixTextExpression((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			setPrefixTextExpression(PREFIX_TEXT_EXPRESSION_EDEFAULT);
			return;
		case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
			setSuffixTextExpression(SUFFIX_TEXT_EXPRESSION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
			return PREFIX_TEXT_EXPRESSION_EDEFAULT == null ? prefixTextExpression != null
					: !PREFIX_TEXT_EXPRESSION_EDEFAULT.equals(prefixTextExpression);
		case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
			return SUFFIX_TEXT_EXPRESSION_EDEFAULT == null ? suffixTextExpression != null
					: !SUFFIX_TEXT_EXPRESSION_EDEFAULT.equals(suffixTextExpression);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IEefXtextValueDescription.class) {
			switch (derivedFeatureID) {
			case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return EefxtextPackage.IEEF_XTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
			case EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				return EefxtextPackage.IEEF_XTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IEefXtextValueDescription.class) {
			switch (baseFeatureID) {
			case EefxtextPackage.IEEF_XTEXT_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION:
				return EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__PREFIX_TEXT_EXPRESSION;
			case EefxtextPackage.IEEF_XTEXT_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION:
				return EefxtextPackage.EEF_XTEXT_SINGLE_LINE_VALUE_DESCRIPTION__SUFFIX_TEXT_EXPRESSION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (prefixTextExpression: ");
		result.append(prefixTextExpression);
		result.append(", suffixTextExpression: ");
		result.append(suffixTextExpression);
		result.append(')');
		return result.toString();
	}

} // EefXtextSingleLineValueDescriptionImpl
