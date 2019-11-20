/**
 * generated by Xtext 2.17.0
 */
package com.example.classes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.classes.ClassRef#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.example.classes.ClassesPackage#getClassRef()
 * @model
 * @generated
 */
public interface ClassRef extends Type
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(com.example.classes.Class)
   * @see com.example.classes.ClassesPackage#getClassRef_Target()
   * @model
   * @generated
   */
  com.example.classes.Class getTarget();

  /**
   * Sets the value of the '{@link com.example.classes.ClassRef#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(com.example.classes.Class value);

} // ClassRef