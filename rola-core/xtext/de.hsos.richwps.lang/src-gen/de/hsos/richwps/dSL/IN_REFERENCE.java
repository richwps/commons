/**
 */
package de.hsos.richwps.dSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IN REFERENCE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.IN_REFERENCE#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hsos.richwps.dSL.DSLPackage#getIN_REFERENCE()
 * @model
 * @generated
 */
public interface IN_REFERENCE extends EObject
{
  /**
   * Returns the value of the '<em><b>Refname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refname</em>' attribute.
   * @see #setRefname(String)
   * @see de.hsos.richwps.dSL.DSLPackage#getIN_REFERENCE_Refname()
   * @model
   * @generated
   */
  String getRefname();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.IN_REFERENCE#getRefname <em>Refname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refname</em>' attribute.
   * @see #getRefname()
   * @generated
   */
  void setRefname(String value);

} // IN_REFERENCE
