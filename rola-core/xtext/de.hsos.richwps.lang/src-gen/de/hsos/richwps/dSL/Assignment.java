/**
 */
package de.hsos.richwps.dSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.Assignment#getLefthand <em>Lefthand</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.Assignment#getRighthand <em>Righthand</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.Assignment#getVal_s <em>Val s</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.Assignment#getVal_i <em>Val i</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hsos.richwps.dSL.DSLPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Operation
{
  /**
   * Returns the value of the '<em><b>Lefthand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lefthand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lefthand</em>' containment reference.
   * @see #setLefthand(EObject)
   * @see de.hsos.richwps.dSL.DSLPackage#getAssignment_Lefthand()
   * @model containment="true"
   * @generated
   */
  EObject getLefthand();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.Assignment#getLefthand <em>Lefthand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lefthand</em>' containment reference.
   * @see #getLefthand()
   * @generated
   */
  void setLefthand(EObject value);

  /**
   * Returns the value of the '<em><b>Righthand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Righthand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Righthand</em>' containment reference.
   * @see #setRighthand(EObject)
   * @see de.hsos.richwps.dSL.DSLPackage#getAssignment_Righthand()
   * @model containment="true"
   * @generated
   */
  EObject getRighthand();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.Assignment#getRighthand <em>Righthand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Righthand</em>' containment reference.
   * @see #getRighthand()
   * @generated
   */
  void setRighthand(EObject value);

  /**
   * Returns the value of the '<em><b>Val s</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val s</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val s</em>' attribute.
   * @see #setVal_s(String)
   * @see de.hsos.richwps.dSL.DSLPackage#getAssignment_Val_s()
   * @model
   * @generated
   */
  String getVal_s();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.Assignment#getVal_s <em>Val s</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val s</em>' attribute.
   * @see #getVal_s()
   * @generated
   */
  void setVal_s(String value);

  /**
   * Returns the value of the '<em><b>Val i</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val i</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val i</em>' attribute.
   * @see #setVal_i(int)
   * @see de.hsos.richwps.dSL.DSLPackage#getAssignment_Val_i()
   * @model
   * @generated
   */
  int getVal_i();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.Assignment#getVal_i <em>Val i</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val i</em>' attribute.
   * @see #getVal_i()
   * @generated
   */
  void setVal_i(int value);

} // Assignment
