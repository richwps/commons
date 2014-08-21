/**
 */
package de.hsos.richwps.dSL.impl;

import de.hsos.richwps.dSL.DSLPackage;
import de.hsos.richwps.dSL.ExecInput;
import de.hsos.richwps.dSL.ExecOutput;
import de.hsos.richwps.dSL.ExecuteStatement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.impl.ExecuteStatementImpl#getHandle <em>Handle</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.ExecuteStatementImpl#getExecinputs <em>Execinputs</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.ExecuteStatementImpl#getExecoutputs <em>Execoutputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecuteStatementImpl extends OperationImpl implements ExecuteStatement
{
  /**
   * The default value of the '{@link #getHandle() <em>Handle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandle()
   * @generated
   * @ordered
   */
  protected static final String HANDLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHandle() <em>Handle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHandle()
   * @generated
   * @ordered
   */
  protected String handle = HANDLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getExecinputs() <em>Execinputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecinputs()
   * @generated
   * @ordered
   */
  protected EList<ExecInput> execinputs;

  /**
   * The cached value of the '{@link #getExecoutputs() <em>Execoutputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecoutputs()
   * @generated
   * @ordered
   */
  protected EList<ExecOutput> execoutputs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecuteStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DSLPackage.Literals.EXECUTE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHandle()
  {
    return handle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHandle(String newHandle)
  {
    String oldHandle = handle;
    handle = newHandle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.EXECUTE_STATEMENT__HANDLE, oldHandle, handle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExecInput> getExecinputs()
  {
    if (execinputs == null)
    {
      execinputs = new EObjectContainmentEList<ExecInput>(ExecInput.class, this, DSLPackage.EXECUTE_STATEMENT__EXECINPUTS);
    }
    return execinputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExecOutput> getExecoutputs()
  {
    if (execoutputs == null)
    {
      execoutputs = new EObjectContainmentEList<ExecOutput>(ExecOutput.class, this, DSLPackage.EXECUTE_STATEMENT__EXECOUTPUTS);
    }
    return execoutputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DSLPackage.EXECUTE_STATEMENT__EXECINPUTS:
        return ((InternalEList<?>)getExecinputs()).basicRemove(otherEnd, msgs);
      case DSLPackage.EXECUTE_STATEMENT__EXECOUTPUTS:
        return ((InternalEList<?>)getExecoutputs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DSLPackage.EXECUTE_STATEMENT__HANDLE:
        return getHandle();
      case DSLPackage.EXECUTE_STATEMENT__EXECINPUTS:
        return getExecinputs();
      case DSLPackage.EXECUTE_STATEMENT__EXECOUTPUTS:
        return getExecoutputs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DSLPackage.EXECUTE_STATEMENT__HANDLE:
        setHandle((String)newValue);
        return;
      case DSLPackage.EXECUTE_STATEMENT__EXECINPUTS:
        getExecinputs().clear();
        getExecinputs().addAll((Collection<? extends ExecInput>)newValue);
        return;
      case DSLPackage.EXECUTE_STATEMENT__EXECOUTPUTS:
        getExecoutputs().clear();
        getExecoutputs().addAll((Collection<? extends ExecOutput>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DSLPackage.EXECUTE_STATEMENT__HANDLE:
        setHandle(HANDLE_EDEFAULT);
        return;
      case DSLPackage.EXECUTE_STATEMENT__EXECINPUTS:
        getExecinputs().clear();
        return;
      case DSLPackage.EXECUTE_STATEMENT__EXECOUTPUTS:
        getExecoutputs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DSLPackage.EXECUTE_STATEMENT__HANDLE:
        return HANDLE_EDEFAULT == null ? handle != null : !HANDLE_EDEFAULT.equals(handle);
      case DSLPackage.EXECUTE_STATEMENT__EXECINPUTS:
        return execinputs != null && !execinputs.isEmpty();
      case DSLPackage.EXECUTE_STATEMENT__EXECOUTPUTS:
        return execoutputs != null && !execoutputs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (handle: ");
    result.append(handle);
    result.append(')');
    return result.toString();
  }

} //ExecuteStatementImpl
