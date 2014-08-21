/**
 */
package de.hsos.richwps.dSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hsos.richwps.dSL.DSLPackage
 * @generated
 */
public interface DSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DSLFactory eINSTANCE = de.hsos.richwps.dSL.impl.DSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Worksequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Worksequence</em>'.
   * @generated
   */
  Worksequence createWorksequence();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Local Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Binding</em>'.
   * @generated
   */
  LocalBinding createLocalBinding();

  /**
   * Returns a new object of class '<em>Remote Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remote Binding</em>'.
   * @generated
   */
  RemoteBinding createRemoteBinding();

  /**
   * Returns a new object of class '<em>Execute Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Execute Statement</em>'.
   * @generated
   */
  ExecuteStatement createExecuteStatement();

  /**
   * Returns a new object of class '<em>Exec Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exec Input</em>'.
   * @generated
   */
  ExecInput createExecInput();

  /**
   * Returns a new object of class '<em>Exec Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exec Output</em>'.
   * @generated
   */
  ExecOutput createExecOutput();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>IN REFERENCE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IN REFERENCE</em>'.
   * @generated
   */
  IN_REFERENCE createIN_REFERENCE();

  /**
   * Returns a new object of class '<em>OUT REFERENCE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OUT REFERENCE</em>'.
   * @generated
   */
  OUT_REFERENCE createOUT_REFERENCE();

  /**
   * Returns a new object of class '<em>VAR REFERENCE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VAR REFERENCE</em>'.
   * @generated
   */
  VAR_REFERENCE createVAR_REFERENCE();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DSLPackage getDSLPackage();

} //DSLFactory
