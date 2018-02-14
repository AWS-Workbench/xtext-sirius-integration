/**
 */
package com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.util;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage
 * @generated
 */
public class XtextsiriusSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XtextsiriusPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XtextsiriusSwitch() {
		if (modelPackage == null) {
			modelPackage = XtextsiriusPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case XtextsiriusPackage.IXTEXT_DESCRIPTION: {
			IXtextDescription iXtextDescription = (IXtextDescription) theEObject;
			T result = caseIXtextDescription(iXtextDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextsiriusPackage.IXTEXT_MODEL_DESCRIPTION: {
			IXtextModelDescription iXtextModelDescription = (IXtextModelDescription) theEObject;
			T result = caseIXtextModelDescription(iXtextModelDescription);
			if (result == null)
				result = caseIXtextDescription(iXtextModelDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextsiriusPackage.IXTEXT_VALUE_DESCRIPTION: {
			IXtextValueDescription iXtextValueDescription = (IXtextValueDescription) theEObject;
			T result = caseIXtextValueDescription(iXtextValueDescription);
			if (result == null)
				result = caseIXtextDescription(iXtextValueDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextsiriusPackage.IXTEXT_PROPERTY_DESCRIPTION: {
			IXtextPropertyDescription iXtextPropertyDescription = (IXtextPropertyDescription) theEObject;
			T result = caseIXtextPropertyDescription(iXtextPropertyDescription);
			if (result == null)
				result = caseIXtextDescription(iXtextPropertyDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextsiriusPackage.IXTEXT_DIRECT_EDIT_DESCRIPTION: {
			IXtextDirectEditDescription iXtextDirectEditDescription = (IXtextDirectEditDescription) theEObject;
			T result = caseIXtextDirectEditDescription(iXtextDirectEditDescription);
			if (result == null)
				result = caseIXtextDescription(iXtextDirectEditDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextsiriusPackage.IXTEXT_DIRECT_EDIT_MODEL_DESCRIPTION: {
			IXtextDirectEditModelDescription iXtextDirectEditModelDescription = (IXtextDirectEditModelDescription) theEObject;
			T result = caseIXtextDirectEditModelDescription(iXtextDirectEditModelDescription);
			if (result == null)
				result = caseIXtextDirectEditDescription(iXtextDirectEditModelDescription);
			if (result == null)
				result = caseIXtextModelDescription(iXtextDirectEditModelDescription);
			if (result == null)
				result = caseIXtextDescription(iXtextDirectEditModelDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextsiriusPackage.IXTEXT_DIRECT_EDIT_VALUE_DESCRIPTION: {
			IXtextDirectEditValueDescription iXtextDirectEditValueDescription = (IXtextDirectEditValueDescription) theEObject;
			T result = caseIXtextDirectEditValueDescription(iXtextDirectEditValueDescription);
			if (result == null)
				result = caseIXtextDirectEditDescription(iXtextDirectEditValueDescription);
			if (result == null)
				result = caseIXtextValueDescription(iXtextDirectEditValueDescription);
			if (result == null)
				result = caseIXtextDescription(iXtextDirectEditValueDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextsiriusPackage.IXTEXT_PROPERTY_MODEL_DESCRIPTION: {
			IXtextPropertyModelDescription iXtextPropertyModelDescription = (IXtextPropertyModelDescription) theEObject;
			T result = caseIXtextPropertyModelDescription(iXtextPropertyModelDescription);
			if (result == null)
				result = caseIXtextPropertyDescription(iXtextPropertyModelDescription);
			if (result == null)
				result = caseIXtextModelDescription(iXtextPropertyModelDescription);
			if (result == null)
				result = caseIXtextDescription(iXtextPropertyModelDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case XtextsiriusPackage.IXTEXT_PROPERTY_VALUE_DESCRIPTION: {
			IXtextPropertyValueDescription iXtextPropertyValueDescription = (IXtextPropertyValueDescription) theEObject;
			T result = caseIXtextPropertyValueDescription(iXtextPropertyValueDescription);
			if (result == null)
				result = caseIXtextPropertyDescription(iXtextPropertyValueDescription);
			if (result == null)
				result = caseIXtextValueDescription(iXtextPropertyValueDescription);
			if (result == null)
				result = caseIXtextDescription(iXtextPropertyValueDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDescription(IXtextDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Model Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextModelDescription(IXtextModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Value Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextValueDescription(IXtextValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Property Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Property Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyDescription(IXtextPropertyDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Direct Edit Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Direct Edit Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDirectEditDescription(IXtextDirectEditDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Direct Edit Model Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Direct Edit Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDirectEditModelDescription(IXtextDirectEditModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Direct Edit Value Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Direct Edit Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextDirectEditValueDescription(IXtextDirectEditValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Property Model Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Property Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyModelDescription(IXtextPropertyModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IXtext Property Value Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IXtext Property Value Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIXtextPropertyValueDescription(IXtextPropertyValueDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //XtextsiriusSwitch
