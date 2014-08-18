/**
 */
package de.hsos.richwps.dSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.LocalBinding#getProcessid <em>Processid</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.LocalBinding#getHandle <em>Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hsos.richwps.dSL.DSLPackage#getLocalBinding()
 * @model
 * @generated
 */
public interface LocalBinding extends Operation
{
  /**
   * Returns the value of the '<em><b>Processid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processid</em>' attribute.
   * @see #setProcessid(String)
   * @see de.hsos.richwps.dSL.DSLPackage#getLocalBinding_Processid()
   * @model
   * @generated
   */
  String getProcessid();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.LocalBinding#getProcessid <em>Processid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Processid</em>' attribute.
   * @see #getProcessid()
   * @generated
   */
  void setProcessid(String value);

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
   * @see de.hsos.richwps.dSL.DSLPackage#getLocalBinding_Handle()
   * @model
   * @generated
   */
  String getHandle();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.LocalBinding#getHandle <em>Handle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Handle</em>' attribute.
   * @see #getHandle()
   * @generated
   */
  void setHandle(String value);

} // LocalBinding
