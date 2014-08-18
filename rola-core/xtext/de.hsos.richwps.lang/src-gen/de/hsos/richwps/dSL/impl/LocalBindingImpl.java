/**
 */
package de.hsos.richwps.dSL.impl;

import de.hsos.richwps.dSL.DSLPackage;
import de.hsos.richwps.dSL.LocalBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.impl.LocalBindingImpl#getProcessid <em>Processid</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.LocalBindingImpl#getHandle <em>Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalBindingImpl extends OperationImpl implements LocalBinding
{
  /**
   * The default value of the '{@link #getProcessid() <em>Processid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessid()
   * @generated
   * @ordered
   */
  protected static final String PROCESSID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcessid() <em>Processid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessid()
   * @generated
   * @ordered
   */
  protected String processid = PROCESSID_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalBindingImpl()
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
    return DSLPackage.Literals.LOCAL_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProcessid()
  {
    return processid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessid(String newProcessid)
  {
    String oldProcessid = processid;
    processid = newProcessid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.LOCAL_BINDING__PROCESSID, oldProcessid, processid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.LOCAL_BINDING__HANDLE, oldHandle, handle));
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
      case DSLPackage.LOCAL_BINDING__PROCESSID:
        return getProcessid();
      case DSLPackage.LOCAL_BINDING__HANDLE:
        return getHandle();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DSLPackage.LOCAL_BINDING__PROCESSID:
        setProcessid((String)newValue);
        return;
      case DSLPackage.LOCAL_BINDING__HANDLE:
        setHandle((String)newValue);
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
      case DSLPackage.LOCAL_BINDING__PROCESSID:
        setProcessid(PROCESSID_EDEFAULT);
        return;
      case DSLPackage.LOCAL_BINDING__HANDLE:
        setHandle(HANDLE_EDEFAULT);
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
      case DSLPackage.LOCAL_BINDING__PROCESSID:
        return PROCESSID_EDEFAULT == null ? processid != null : !PROCESSID_EDEFAULT.equals(processid);
      case DSLPackage.LOCAL_BINDING__HANDLE:
        return HANDLE_EDEFAULT == null ? handle != null : !HANDLE_EDEFAULT.equals(handle);
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
    result.append(" (processid: ");
    result.append(processid);
    result.append(", handle: ");
    result.append(handle);
    result.append(')');
    return result.toString();
  }

} //LocalBindingImpl
