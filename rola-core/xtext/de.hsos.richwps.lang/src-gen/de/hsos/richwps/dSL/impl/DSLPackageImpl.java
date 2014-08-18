/**
 */
package de.hsos.richwps.dSL.impl;

import de.hsos.richwps.dSL.Assignment;
import de.hsos.richwps.dSL.DSLFactory;
import de.hsos.richwps.dSL.DSLPackage;
import de.hsos.richwps.dSL.ExecInput;
import de.hsos.richwps.dSL.ExecOutput;
import de.hsos.richwps.dSL.ExecuteStatement;
import de.hsos.richwps.dSL.LocalBinding;
import de.hsos.richwps.dSL.Operation;
import de.hsos.richwps.dSL.RemoteBinding;
import de.hsos.richwps.dSL.Worksequence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSLPackageImpl extends EPackageImpl implements DSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass worksequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remoteBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass execInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass execOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iN_REFERENCEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ouT_REFERENCEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vaR_REFERENCEEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.hsos.richwps.dSL.DSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DSLPackageImpl()
  {
    super(eNS_URI, DSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DSLPackage init()
  {
    if (isInited) return (DSLPackage)EPackage.Registry.INSTANCE.getEPackage(DSLPackage.eNS_URI);

    // Obtain or create and register package
    DSLPackageImpl theDSLPackage = (DSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDSLPackage.createPackageContents();

    // Initialize created meta-data
    theDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DSLPackage.eNS_URI, theDSLPackage);
    return theDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorksequence()
  {
    return worksequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorksequence_Operations()
  {
    return (EReference)worksequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalBinding()
  {
    return localBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalBinding_Processid()
  {
    return (EAttribute)localBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalBinding_Handle()
  {
    return (EAttribute)localBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoteBinding()
  {
    return remoteBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Protocol()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Host()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Port()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Path()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Processid()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Handle()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecuteStatement()
  {
    return executeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecuteStatement_Handle()
  {
    return (EAttribute)executeStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecuteStatement_Execinputs()
  {
    return (EReference)executeStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecuteStatement_Execoutputs()
  {
    return (EReference)executeStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecInput()
  {
    return execInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecInput_Reference()
  {
    return (EReference)execInputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecInput_Wpsid()
  {
    return (EAttribute)execInputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecOutput()
  {
    return execOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecOutput_Wpsid()
  {
    return (EAttribute)execOutputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecOutput_Reference()
  {
    return (EReference)execOutputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Lefthand()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Righthand()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Val_s()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Val_i()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIN_REFERENCE()
  {
    return iN_REFERENCEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIN_REFERENCE_Refname()
  {
    return (EAttribute)iN_REFERENCEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOUT_REFERENCE()
  {
    return ouT_REFERENCEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOUT_REFERENCE_Refname()
  {
    return (EAttribute)ouT_REFERENCEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVAR_REFERENCE()
  {
    return vaR_REFERENCEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVAR_REFERENCE_Refname()
  {
    return (EAttribute)vaR_REFERENCEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLFactory getDSLFactory()
  {
    return (DSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    worksequenceEClass = createEClass(WORKSEQUENCE);
    createEReference(worksequenceEClass, WORKSEQUENCE__OPERATIONS);

    operationEClass = createEClass(OPERATION);

    localBindingEClass = createEClass(LOCAL_BINDING);
    createEAttribute(localBindingEClass, LOCAL_BINDING__PROCESSID);
    createEAttribute(localBindingEClass, LOCAL_BINDING__HANDLE);

    remoteBindingEClass = createEClass(REMOTE_BINDING);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__PROTOCOL);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__HOST);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__PORT);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__PATH);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__PROCESSID);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__HANDLE);

    executeStatementEClass = createEClass(EXECUTE_STATEMENT);
    createEAttribute(executeStatementEClass, EXECUTE_STATEMENT__HANDLE);
    createEReference(executeStatementEClass, EXECUTE_STATEMENT__EXECINPUTS);
    createEReference(executeStatementEClass, EXECUTE_STATEMENT__EXECOUTPUTS);

    execInputEClass = createEClass(EXEC_INPUT);
    createEReference(execInputEClass, EXEC_INPUT__REFERENCE);
    createEAttribute(execInputEClass, EXEC_INPUT__WPSID);

    execOutputEClass = createEClass(EXEC_OUTPUT);
    createEAttribute(execOutputEClass, EXEC_OUTPUT__WPSID);
    createEReference(execOutputEClass, EXEC_OUTPUT__REFERENCE);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEReference(assignmentEClass, ASSIGNMENT__LEFTHAND);
    createEReference(assignmentEClass, ASSIGNMENT__RIGHTHAND);
    createEAttribute(assignmentEClass, ASSIGNMENT__VAL_S);
    createEAttribute(assignmentEClass, ASSIGNMENT__VAL_I);

    iN_REFERENCEEClass = createEClass(IN_REFERENCE);
    createEAttribute(iN_REFERENCEEClass, IN_REFERENCE__REFNAME);

    ouT_REFERENCEEClass = createEClass(OUT_REFERENCE);
    createEAttribute(ouT_REFERENCEEClass, OUT_REFERENCE__REFNAME);

    vaR_REFERENCEEClass = createEClass(VAR_REFERENCE);
    createEAttribute(vaR_REFERENCEEClass, VAR_REFERENCE__REFNAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    localBindingEClass.getESuperTypes().add(this.getOperation());
    remoteBindingEClass.getESuperTypes().add(this.getOperation());
    executeStatementEClass.getESuperTypes().add(this.getOperation());
    assignmentEClass.getESuperTypes().add(this.getOperation());

    // Initialize classes and features; add operations and parameters
    initEClass(worksequenceEClass, Worksequence.class, "Worksequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWorksequence_Operations(), this.getOperation(), null, "operations", null, 0, -1, Worksequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localBindingEClass, LocalBinding.class, "LocalBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalBinding_Processid(), ecorePackage.getEString(), "processid", null, 0, 1, LocalBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocalBinding_Handle(), ecorePackage.getEString(), "handle", null, 0, 1, LocalBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(remoteBindingEClass, RemoteBinding.class, "RemoteBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRemoteBinding_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRemoteBinding_Host(), ecorePackage.getEString(), "host", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRemoteBinding_Port(), ecorePackage.getEInt(), "port", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRemoteBinding_Path(), ecorePackage.getEString(), "path", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRemoteBinding_Processid(), ecorePackage.getEString(), "processid", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRemoteBinding_Handle(), ecorePackage.getEString(), "handle", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(executeStatementEClass, ExecuteStatement.class, "ExecuteStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExecuteStatement_Handle(), ecorePackage.getEString(), "handle", null, 0, 1, ExecuteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecuteStatement_Execinputs(), this.getExecInput(), null, "execinputs", null, 0, -1, ExecuteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecuteStatement_Execoutputs(), this.getExecOutput(), null, "execoutputs", null, 0, -1, ExecuteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(execInputEClass, ExecInput.class, "ExecInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecInput_Reference(), ecorePackage.getEObject(), null, "reference", null, 0, 1, ExecInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExecInput_Wpsid(), ecorePackage.getEString(), "wpsid", null, 0, 1, ExecInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(execOutputEClass, ExecOutput.class, "ExecOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExecOutput_Wpsid(), ecorePackage.getEString(), "wpsid", null, 0, 1, ExecOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecOutput_Reference(), ecorePackage.getEObject(), null, "reference", null, 0, 1, ExecOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignment_Lefthand(), ecorePackage.getEObject(), null, "lefthand", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Righthand(), ecorePackage.getEObject(), null, "righthand", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignment_Val_s(), ecorePackage.getEString(), "val_s", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignment_Val_i(), ecorePackage.getEInt(), "val_i", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iN_REFERENCEEClass, de.hsos.richwps.dSL.IN_REFERENCE.class, "IN_REFERENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIN_REFERENCE_Refname(), ecorePackage.getEString(), "refname", null, 0, 1, de.hsos.richwps.dSL.IN_REFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ouT_REFERENCEEClass, de.hsos.richwps.dSL.OUT_REFERENCE.class, "OUT_REFERENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOUT_REFERENCE_Refname(), ecorePackage.getEString(), "refname", null, 0, 1, de.hsos.richwps.dSL.OUT_REFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vaR_REFERENCEEClass, de.hsos.richwps.dSL.VAR_REFERENCE.class, "VAR_REFERENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVAR_REFERENCE_Refname(), ecorePackage.getEString(), "refname", null, 0, 1, de.hsos.richwps.dSL.VAR_REFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DSLPackageImpl
