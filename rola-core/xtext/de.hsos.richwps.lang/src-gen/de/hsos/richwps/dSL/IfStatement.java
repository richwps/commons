/**
 */
package de.hsos.richwps.dSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.IfStatement#getLefthand <em>Lefthand</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.IfStatement#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.IfStatement#getRighthand <em>Righthand</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.IfStatement#getVal_s <em>Val s</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.IfStatement#getVal_i <em>Val i</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.IfStatement#getIfoperations <em>Ifoperations</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.IfStatement#getElseoperations <em>Elseoperations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hsos.richwps.dSL.DSLPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Operation
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
   * @see de.hsos.richwps.dSL.DSLPackage#getIfStatement_Lefthand()
   * @model containment="true"
   * @generated
   */
  EObject getLefthand();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.IfStatement#getLefthand <em>Lefthand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lefthand</em>' containment reference.
   * @see #getLefthand()
   * @generated
   */
  void setLefthand(EObject value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see de.hsos.richwps.dSL.DSLPackage#getIfStatement_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.IfStatement#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

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
   * @see de.hsos.richwps.dSL.DSLPackage#getIfStatement_Righthand()
   * @model containment="true"
   * @generated
   */
  EObject getRighthand();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.IfStatement#getRighthand <em>Righthand</em>}' containment reference.
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
   * @see de.hsos.richwps.dSL.DSLPackage#getIfStatement_Val_s()
   * @model
   * @generated
   */
  String getVal_s();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.IfStatement#getVal_s <em>Val s</em>}' attribute.
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
   * @see de.hsos.richwps.dSL.DSLPackage#getIfStatement_Val_i()
   * @model
   * @generated
   */
  int getVal_i();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.IfStatement#getVal_i <em>Val i</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val i</em>' attribute.
   * @see #getVal_i()
   * @generated
   */
  void setVal_i(int value);

  /**
   * Returns the value of the '<em><b>Ifoperations</b></em>' containment reference list.
   * The list contents are of type {@link de.hsos.richwps.dSL.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ifoperations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ifoperations</em>' containment reference list.
   * @see de.hsos.richwps.dSL.DSLPackage#getIfStatement_Ifoperations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getIfoperations();

  /**
   * Returns the value of the '<em><b>Elseoperations</b></em>' containment reference list.
   * The list contents are of type {@link de.hsos.richwps.dSL.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elseoperations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elseoperations</em>' containment reference list.
   * @see de.hsos.richwps.dSL.DSLPackage#getIfStatement_Elseoperations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getElseoperations();

} // IfStatement
