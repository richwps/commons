/**
 */
package de.hsos.richwps.dSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hsos.richwps.dSL.DSLFactory
 * @model kind="package"
 * @generated
 */
public interface DSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hsos.de/richwps/DSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DSLPackage eINSTANCE = de.hsos.richwps.dSL.impl.DSLPackageImpl.init();

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.WorksequenceImpl <em>Worksequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.WorksequenceImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getWorksequence()
   * @generated
   */
  int WORKSEQUENCE = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSEQUENCE__OPERATIONS = 0;

  /**
   * The number of structural features of the '<em>Worksequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.OperationImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.LocalBindingImpl <em>Local Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.LocalBindingImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getLocalBinding()
   * @generated
   */
  int LOCAL_BINDING = 2;

  /**
   * The feature id for the '<em><b>Processid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_BINDING__PROCESSID = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Handle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_BINDING__HANDLE = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_BINDING_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.RemoteBindingImpl <em>Remote Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.RemoteBindingImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getRemoteBinding()
   * @generated
   */
  int REMOTE_BINDING = 3;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__PROTOCOL = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__HOST = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__PORT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__PATH = OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Processid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__PROCESSID = OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Handle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__HANDLE = OPERATION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Remote Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.ExecuteStatementImpl <em>Execute Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.ExecuteStatementImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getExecuteStatement()
   * @generated
   */
  int EXECUTE_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Handle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_STATEMENT__HANDLE = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Execinputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_STATEMENT__EXECINPUTS = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Execoutputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_STATEMENT__EXECOUTPUTS = OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Execute Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_STATEMENT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.ExecInputImpl <em>Exec Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.ExecInputImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getExecInput()
   * @generated
   */
  int EXEC_INPUT = 5;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_INPUT__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Wpsid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_INPUT__WPSID = 1;

  /**
   * The number of structural features of the '<em>Exec Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_INPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.ExecOutputImpl <em>Exec Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.ExecOutputImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getExecOutput()
   * @generated
   */
  int EXEC_OUTPUT = 6;

  /**
   * The feature id for the '<em><b>Wpsid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_OUTPUT__WPSID = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_OUTPUT__REFERENCE = 1;

  /**
   * The number of structural features of the '<em>Exec Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_OUTPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.IfStatementImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Lefthand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__LEFTHAND = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__OPERATOR = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Righthand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__RIGHTHAND = OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Val s</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__VAL_S = OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Val i</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__VAL_I = OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ifoperations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__IFOPERATIONS = OPERATION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Elseoperations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSEOPERATIONS = OPERATION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.AssignmentImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 8;

  /**
   * The feature id for the '<em><b>Lefthand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__LEFTHAND = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Righthand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__RIGHTHAND = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Val s</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VAL_S = OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Val i</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VAL_I = OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.IN_REFERENCEImpl <em>IN REFERENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.IN_REFERENCEImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getIN_REFERENCE()
   * @generated
   */
  int IN_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Refname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_REFERENCE__REFNAME = 0;

  /**
   * The number of structural features of the '<em>IN REFERENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.OUT_REFERENCEImpl <em>OUT REFERENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.OUT_REFERENCEImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getOUT_REFERENCE()
   * @generated
   */
  int OUT_REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Refname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_REFERENCE__REFNAME = 0;

  /**
   * The number of structural features of the '<em>OUT REFERENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hsos.richwps.dSL.impl.VAR_REFERENCEImpl <em>VAR REFERENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.dSL.impl.VAR_REFERENCEImpl
   * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getVAR_REFERENCE()
   * @generated
   */
  int VAR_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Refname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REFERENCE__REFNAME = 0;

  /**
   * The number of structural features of the '<em>VAR REFERENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REFERENCE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.Worksequence <em>Worksequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Worksequence</em>'.
   * @see de.hsos.richwps.dSL.Worksequence
   * @generated
   */
  EClass getWorksequence();

  /**
   * Returns the meta object for the containment reference list '{@link de.hsos.richwps.dSL.Worksequence#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see de.hsos.richwps.dSL.Worksequence#getOperations()
   * @see #getWorksequence()
   * @generated
   */
  EReference getWorksequence_Operations();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see de.hsos.richwps.dSL.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.LocalBinding <em>Local Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Binding</em>'.
   * @see de.hsos.richwps.dSL.LocalBinding
   * @generated
   */
  EClass getLocalBinding();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.LocalBinding#getProcessid <em>Processid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Processid</em>'.
   * @see de.hsos.richwps.dSL.LocalBinding#getProcessid()
   * @see #getLocalBinding()
   * @generated
   */
  EAttribute getLocalBinding_Processid();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.LocalBinding#getHandle <em>Handle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handle</em>'.
   * @see de.hsos.richwps.dSL.LocalBinding#getHandle()
   * @see #getLocalBinding()
   * @generated
   */
  EAttribute getLocalBinding_Handle();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.RemoteBinding <em>Remote Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remote Binding</em>'.
   * @see de.hsos.richwps.dSL.RemoteBinding
   * @generated
   */
  EClass getRemoteBinding();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.RemoteBinding#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protocol</em>'.
   * @see de.hsos.richwps.dSL.RemoteBinding#getProtocol()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Protocol();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.RemoteBinding#getHost <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host</em>'.
   * @see de.hsos.richwps.dSL.RemoteBinding#getHost()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Host();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.RemoteBinding#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see de.hsos.richwps.dSL.RemoteBinding#getPort()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Port();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.RemoteBinding#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see de.hsos.richwps.dSL.RemoteBinding#getPath()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Path();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.RemoteBinding#getProcessid <em>Processid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Processid</em>'.
   * @see de.hsos.richwps.dSL.RemoteBinding#getProcessid()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Processid();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.RemoteBinding#getHandle <em>Handle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handle</em>'.
   * @see de.hsos.richwps.dSL.RemoteBinding#getHandle()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Handle();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.ExecuteStatement <em>Execute Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Execute Statement</em>'.
   * @see de.hsos.richwps.dSL.ExecuteStatement
   * @generated
   */
  EClass getExecuteStatement();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.ExecuteStatement#getHandle <em>Handle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handle</em>'.
   * @see de.hsos.richwps.dSL.ExecuteStatement#getHandle()
   * @see #getExecuteStatement()
   * @generated
   */
  EAttribute getExecuteStatement_Handle();

  /**
   * Returns the meta object for the containment reference list '{@link de.hsos.richwps.dSL.ExecuteStatement#getExecinputs <em>Execinputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Execinputs</em>'.
   * @see de.hsos.richwps.dSL.ExecuteStatement#getExecinputs()
   * @see #getExecuteStatement()
   * @generated
   */
  EReference getExecuteStatement_Execinputs();

  /**
   * Returns the meta object for the containment reference list '{@link de.hsos.richwps.dSL.ExecuteStatement#getExecoutputs <em>Execoutputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Execoutputs</em>'.
   * @see de.hsos.richwps.dSL.ExecuteStatement#getExecoutputs()
   * @see #getExecuteStatement()
   * @generated
   */
  EReference getExecuteStatement_Execoutputs();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.ExecInput <em>Exec Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec Input</em>'.
   * @see de.hsos.richwps.dSL.ExecInput
   * @generated
   */
  EClass getExecInput();

  /**
   * Returns the meta object for the containment reference '{@link de.hsos.richwps.dSL.ExecInput#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see de.hsos.richwps.dSL.ExecInput#getReference()
   * @see #getExecInput()
   * @generated
   */
  EReference getExecInput_Reference();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.ExecInput#getWpsid <em>Wpsid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wpsid</em>'.
   * @see de.hsos.richwps.dSL.ExecInput#getWpsid()
   * @see #getExecInput()
   * @generated
   */
  EAttribute getExecInput_Wpsid();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.ExecOutput <em>Exec Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec Output</em>'.
   * @see de.hsos.richwps.dSL.ExecOutput
   * @generated
   */
  EClass getExecOutput();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.ExecOutput#getWpsid <em>Wpsid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wpsid</em>'.
   * @see de.hsos.richwps.dSL.ExecOutput#getWpsid()
   * @see #getExecOutput()
   * @generated
   */
  EAttribute getExecOutput_Wpsid();

  /**
   * Returns the meta object for the containment reference '{@link de.hsos.richwps.dSL.ExecOutput#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see de.hsos.richwps.dSL.ExecOutput#getReference()
   * @see #getExecOutput()
   * @generated
   */
  EReference getExecOutput_Reference();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see de.hsos.richwps.dSL.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link de.hsos.richwps.dSL.IfStatement#getLefthand <em>Lefthand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lefthand</em>'.
   * @see de.hsos.richwps.dSL.IfStatement#getLefthand()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Lefthand();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.IfStatement#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see de.hsos.richwps.dSL.IfStatement#getOperator()
   * @see #getIfStatement()
   * @generated
   */
  EAttribute getIfStatement_Operator();

  /**
   * Returns the meta object for the containment reference '{@link de.hsos.richwps.dSL.IfStatement#getRighthand <em>Righthand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Righthand</em>'.
   * @see de.hsos.richwps.dSL.IfStatement#getRighthand()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Righthand();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.IfStatement#getVal_s <em>Val s</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val s</em>'.
   * @see de.hsos.richwps.dSL.IfStatement#getVal_s()
   * @see #getIfStatement()
   * @generated
   */
  EAttribute getIfStatement_Val_s();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.IfStatement#getVal_i <em>Val i</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val i</em>'.
   * @see de.hsos.richwps.dSL.IfStatement#getVal_i()
   * @see #getIfStatement()
   * @generated
   */
  EAttribute getIfStatement_Val_i();

  /**
   * Returns the meta object for the containment reference list '{@link de.hsos.richwps.dSL.IfStatement#getIfoperations <em>Ifoperations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ifoperations</em>'.
   * @see de.hsos.richwps.dSL.IfStatement#getIfoperations()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Ifoperations();

  /**
   * Returns the meta object for the containment reference list '{@link de.hsos.richwps.dSL.IfStatement#getElseoperations <em>Elseoperations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elseoperations</em>'.
   * @see de.hsos.richwps.dSL.IfStatement#getElseoperations()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Elseoperations();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see de.hsos.richwps.dSL.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the containment reference '{@link de.hsos.richwps.dSL.Assignment#getLefthand <em>Lefthand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lefthand</em>'.
   * @see de.hsos.richwps.dSL.Assignment#getLefthand()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Lefthand();

  /**
   * Returns the meta object for the containment reference '{@link de.hsos.richwps.dSL.Assignment#getRighthand <em>Righthand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Righthand</em>'.
   * @see de.hsos.richwps.dSL.Assignment#getRighthand()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Righthand();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.Assignment#getVal_s <em>Val s</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val s</em>'.
   * @see de.hsos.richwps.dSL.Assignment#getVal_s()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Val_s();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.Assignment#getVal_i <em>Val i</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val i</em>'.
   * @see de.hsos.richwps.dSL.Assignment#getVal_i()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Val_i();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.IN_REFERENCE <em>IN REFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IN REFERENCE</em>'.
   * @see de.hsos.richwps.dSL.IN_REFERENCE
   * @generated
   */
  EClass getIN_REFERENCE();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.IN_REFERENCE#getRefname <em>Refname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Refname</em>'.
   * @see de.hsos.richwps.dSL.IN_REFERENCE#getRefname()
   * @see #getIN_REFERENCE()
   * @generated
   */
  EAttribute getIN_REFERENCE_Refname();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.OUT_REFERENCE <em>OUT REFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OUT REFERENCE</em>'.
   * @see de.hsos.richwps.dSL.OUT_REFERENCE
   * @generated
   */
  EClass getOUT_REFERENCE();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.OUT_REFERENCE#getRefname <em>Refname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Refname</em>'.
   * @see de.hsos.richwps.dSL.OUT_REFERENCE#getRefname()
   * @see #getOUT_REFERENCE()
   * @generated
   */
  EAttribute getOUT_REFERENCE_Refname();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.dSL.VAR_REFERENCE <em>VAR REFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VAR REFERENCE</em>'.
   * @see de.hsos.richwps.dSL.VAR_REFERENCE
   * @generated
   */
  EClass getVAR_REFERENCE();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.dSL.VAR_REFERENCE#getRefname <em>Refname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Refname</em>'.
   * @see de.hsos.richwps.dSL.VAR_REFERENCE#getRefname()
   * @see #getVAR_REFERENCE()
   * @generated
   */
  EAttribute getVAR_REFERENCE_Refname();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DSLFactory getDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.WorksequenceImpl <em>Worksequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.WorksequenceImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getWorksequence()
     * @generated
     */
    EClass WORKSEQUENCE = eINSTANCE.getWorksequence();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSEQUENCE__OPERATIONS = eINSTANCE.getWorksequence_Operations();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.OperationImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.LocalBindingImpl <em>Local Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.LocalBindingImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getLocalBinding()
     * @generated
     */
    EClass LOCAL_BINDING = eINSTANCE.getLocalBinding();

    /**
     * The meta object literal for the '<em><b>Processid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_BINDING__PROCESSID = eINSTANCE.getLocalBinding_Processid();

    /**
     * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_BINDING__HANDLE = eINSTANCE.getLocalBinding_Handle();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.RemoteBindingImpl <em>Remote Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.RemoteBindingImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getRemoteBinding()
     * @generated
     */
    EClass REMOTE_BINDING = eINSTANCE.getRemoteBinding();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__PROTOCOL = eINSTANCE.getRemoteBinding_Protocol();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__HOST = eINSTANCE.getRemoteBinding_Host();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__PORT = eINSTANCE.getRemoteBinding_Port();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__PATH = eINSTANCE.getRemoteBinding_Path();

    /**
     * The meta object literal for the '<em><b>Processid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__PROCESSID = eINSTANCE.getRemoteBinding_Processid();

    /**
     * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__HANDLE = eINSTANCE.getRemoteBinding_Handle();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.ExecuteStatementImpl <em>Execute Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.ExecuteStatementImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getExecuteStatement()
     * @generated
     */
    EClass EXECUTE_STATEMENT = eINSTANCE.getExecuteStatement();

    /**
     * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXECUTE_STATEMENT__HANDLE = eINSTANCE.getExecuteStatement_Handle();

    /**
     * The meta object literal for the '<em><b>Execinputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTE_STATEMENT__EXECINPUTS = eINSTANCE.getExecuteStatement_Execinputs();

    /**
     * The meta object literal for the '<em><b>Execoutputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTE_STATEMENT__EXECOUTPUTS = eINSTANCE.getExecuteStatement_Execoutputs();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.ExecInputImpl <em>Exec Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.ExecInputImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getExecInput()
     * @generated
     */
    EClass EXEC_INPUT = eINSTANCE.getExecInput();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC_INPUT__REFERENCE = eINSTANCE.getExecInput_Reference();

    /**
     * The meta object literal for the '<em><b>Wpsid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC_INPUT__WPSID = eINSTANCE.getExecInput_Wpsid();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.ExecOutputImpl <em>Exec Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.ExecOutputImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getExecOutput()
     * @generated
     */
    EClass EXEC_OUTPUT = eINSTANCE.getExecOutput();

    /**
     * The meta object literal for the '<em><b>Wpsid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC_OUTPUT__WPSID = eINSTANCE.getExecOutput_Wpsid();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXEC_OUTPUT__REFERENCE = eINSTANCE.getExecOutput_Reference();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.IfStatementImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Lefthand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__LEFTHAND = eINSTANCE.getIfStatement_Lefthand();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_STATEMENT__OPERATOR = eINSTANCE.getIfStatement_Operator();

    /**
     * The meta object literal for the '<em><b>Righthand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__RIGHTHAND = eINSTANCE.getIfStatement_Righthand();

    /**
     * The meta object literal for the '<em><b>Val s</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_STATEMENT__VAL_S = eINSTANCE.getIfStatement_Val_s();

    /**
     * The meta object literal for the '<em><b>Val i</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_STATEMENT__VAL_I = eINSTANCE.getIfStatement_Val_i();

    /**
     * The meta object literal for the '<em><b>Ifoperations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__IFOPERATIONS = eINSTANCE.getIfStatement_Ifoperations();

    /**
     * The meta object literal for the '<em><b>Elseoperations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSEOPERATIONS = eINSTANCE.getIfStatement_Elseoperations();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.AssignmentImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Lefthand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__LEFTHAND = eINSTANCE.getAssignment_Lefthand();

    /**
     * The meta object literal for the '<em><b>Righthand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__RIGHTHAND = eINSTANCE.getAssignment_Righthand();

    /**
     * The meta object literal for the '<em><b>Val s</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__VAL_S = eINSTANCE.getAssignment_Val_s();

    /**
     * The meta object literal for the '<em><b>Val i</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__VAL_I = eINSTANCE.getAssignment_Val_i();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.IN_REFERENCEImpl <em>IN REFERENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.IN_REFERENCEImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getIN_REFERENCE()
     * @generated
     */
    EClass IN_REFERENCE = eINSTANCE.getIN_REFERENCE();

    /**
     * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_REFERENCE__REFNAME = eINSTANCE.getIN_REFERENCE_Refname();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.OUT_REFERENCEImpl <em>OUT REFERENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.OUT_REFERENCEImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getOUT_REFERENCE()
     * @generated
     */
    EClass OUT_REFERENCE = eINSTANCE.getOUT_REFERENCE();

    /**
     * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUT_REFERENCE__REFNAME = eINSTANCE.getOUT_REFERENCE_Refname();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.dSL.impl.VAR_REFERENCEImpl <em>VAR REFERENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.dSL.impl.VAR_REFERENCEImpl
     * @see de.hsos.richwps.dSL.impl.DSLPackageImpl#getVAR_REFERENCE()
     * @generated
     */
    EClass VAR_REFERENCE = eINSTANCE.getVAR_REFERENCE();

    /**
     * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_REFERENCE__REFNAME = eINSTANCE.getVAR_REFERENCE_Refname();

  }

} //DSLPackage
