/**
 */
package de.hsos.richwps.dSL.util;

import de.hsos.richwps.dSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hsos.richwps.dSL.DSLPackage
 * @generated
 */
public class DSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSLSwitch<Adapter> modelSwitch =
    new DSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseWorksequence(Worksequence object)
      {
        return createWorksequenceAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseLocalBinding(LocalBinding object)
      {
        return createLocalBindingAdapter();
      }
      @Override
      public Adapter caseRemoteBinding(RemoteBinding object)
      {
        return createRemoteBindingAdapter();
      }
      @Override
      public Adapter caseExecuteStatement(ExecuteStatement object)
      {
        return createExecuteStatementAdapter();
      }
      @Override
      public Adapter caseExecInput(ExecInput object)
      {
        return createExecInputAdapter();
      }
      @Override
      public Adapter caseExecOutput(ExecOutput object)
      {
        return createExecOutputAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseIN_REFERENCE(IN_REFERENCE object)
      {
        return createIN_REFERENCEAdapter();
      }
      @Override
      public Adapter caseOUT_REFERENCE(OUT_REFERENCE object)
      {
        return createOUT_REFERENCEAdapter();
      }
      @Override
      public Adapter caseVAR_REFERENCE(VAR_REFERENCE object)
      {
        return createVAR_REFERENCEAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.dSL.Worksequence <em>Worksequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.dSL.Worksequence
   * @generated
   */
  public Adapter createWorksequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.dSL.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.dSL.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.dSL.LocalBinding <em>Local Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.dSL.LocalBinding
   * @generated
   */
  public Adapter createLocalBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.dSL.RemoteBinding <em>Remote Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.dSL.RemoteBinding
   * @generated
   */
  public Adapter createRemoteBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.dSL.ExecuteStatement <em>Execute Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.dSL.ExecuteStatement
   * @generated
   */
  public Adapter createExecuteStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.dSL.ExecInput <em>Exec Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.dSL.ExecInput
   * @generated
   */
  public Adapter createExecInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.dSL.ExecOutput <em>Exec Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.dSL.ExecOutput
   * @generated
   */
  public Adapter createExecOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.dSL.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.dSL.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.dSL.IN_REFERENCE <em>IN REFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.dSL.IN_REFERENCE
   * @generated
   */
  public Adapter createIN_REFERENCEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.dSL.OUT_REFERENCE <em>OUT REFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.dSL.OUT_REFERENCE
   * @generated
   */
  public Adapter createOUT_REFERENCEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.dSL.VAR_REFERENCE <em>VAR REFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.dSL.VAR_REFERENCE
   * @generated
   */
  public Adapter createVAR_REFERENCEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DSLAdapterFactory
