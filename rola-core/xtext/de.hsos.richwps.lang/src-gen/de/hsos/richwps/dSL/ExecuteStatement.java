/**
 */
package de.hsos.richwps.dSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execute Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.ExecuteStatement#getHandle <em>Handle</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.ExecuteStatement#getExecinputs <em>Execinputs</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.ExecuteStatement#getExecoutputs <em>Execoutputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hsos.richwps.dSL.DSLPackage#getExecuteStatement()
 * @model
 * @generated
 */
public interface ExecuteStatement extends Operation
{
  /**
   * Returns the value of the '<em><b>Handle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Handle</em>' attribute.
   * @see #setHandle(String)
   * @see de.hsos.richwps.dSL.DSLPackage#getExecuteStatement_Handle()
   * @model
   * @generated
   */
  String getHandle();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.ExecuteStatement#getHandle <em>Handle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handle</em>' attribute.
   * @see #getHandle()
   * @generated
   */
  void setHandle(String value);

  /**
   * Returns the value of the '<em><b>Execinputs</b></em>' containment reference list.
   * The list contents are of type {@link de.hsos.richwps.dSL.ExecInput}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Execinputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execinputs</em>' containment reference list.
   * @see de.hsos.richwps.dSL.DSLPackage#getExecuteStatement_Execinputs()
   * @model containment="true"
   * @generated
   */
  EList<ExecInput> getExecinputs();

  /**
   * Returns the value of the '<em><b>Execoutputs</b></em>' containment reference list.
   * The list contents are of type {@link de.hsos.richwps.dSL.ExecOutput}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Execoutputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execoutputs</em>' containment reference list.
   * @see de.hsos.richwps.dSL.DSLPackage#getExecuteStatement_Execoutputs()
   * @model containment="true"
   * @generated
   */
  EList<ExecOutput> getExecoutputs();

} // ExecuteStatement
