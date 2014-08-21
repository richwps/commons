/**
 */
package de.hsos.richwps.dSL.impl;

import de.hsos.richwps.dSL.Assignment;
import de.hsos.richwps.dSL.DSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.impl.AssignmentImpl#getLefthand <em>Lefthand</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.AssignmentImpl#getRighthand <em>Righthand</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.AssignmentImpl#getVal_s <em>Val s</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.AssignmentImpl#getVal_i <em>Val i</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends OperationImpl implements Assignment
{
  /**
   * The cached value of the '{@link #getLefthand() <em>Lefthand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLefthand()
   * @generated
   * @ordered
   */
  protected EObject lefthand;

  /**
   * The cached value of the '{@link #getRighthand() <em>Righthand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRighthand()
   * @generated
   * @ordered
   */
  protected EObject righthand;

  /**
   * The default value of the '{@link #getVal_s() <em>Val s</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_s()
   * @generated
   * @ordered
   */
  protected static final String VAL_S_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal_s() <em>Val s</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_s()
   * @generated
   * @ordered
   */
  protected String val_s = VAL_S_EDEFAULT;

  /**
   * The default value of the '{@link #getVal_i() <em>Val i</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_i()
   * @generated
   * @ordered
   */
  protected static final int VAL_I_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVal_i() <em>Val i</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_i()
   * @generated
   * @ordered
   */
  protected int val_i = VAL_I_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentImpl()
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
    return DSLPackage.Literals.ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getLefthand()
  {
    return lefthand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLefthand(EObject newLefthand, NotificationChain msgs)
  {
    EObject oldLefthand = lefthand;
    lefthand = newLefthand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.ASSIGNMENT__LEFTHAND, oldLefthand, newLefthand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLefthand(EObject newLefthand)
  {
    if (newLefthand != lefthand)
    {
      NotificationChain msgs = null;
      if (lefthand != null)
        msgs = ((InternalEObject)lefthand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.ASSIGNMENT__LEFTHAND, null, msgs);
      if (newLefthand != null)
        msgs = ((InternalEObject)newLefthand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.ASSIGNMENT__LEFTHAND, null, msgs);
      msgs = basicSetLefthand(newLefthand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.ASSIGNMENT__LEFTHAND, newLefthand, newLefthand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getRighthand()
  {
    return righthand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRighthand(EObject newRighthand, NotificationChain msgs)
  {
    EObject oldRighthand = righthand;
    righthand = newRighthand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.ASSIGNMENT__RIGHTHAND, oldRighthand, newRighthand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRighthand(EObject newRighthand)
  {
    if (newRighthand != righthand)
    {
      NotificationChain msgs = null;
      if (righthand != null)
        msgs = ((InternalEObject)righthand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.ASSIGNMENT__RIGHTHAND, null, msgs);
      if (newRighthand != null)
        msgs = ((InternalEObject)newRighthand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.ASSIGNMENT__RIGHTHAND, null, msgs);
      msgs = basicSetRighthand(newRighthand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.ASSIGNMENT__RIGHTHAND, newRighthand, newRighthand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVal_s()
  {
    return val_s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal_s(String newVal_s)
  {
    String oldVal_s = val_s;
    val_s = newVal_s;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.ASSIGNMENT__VAL_S, oldVal_s, val_s));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVal_i()
  {
    return val_i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal_i(int newVal_i)
  {
    int oldVal_i = val_i;
    val_i = newVal_i;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.ASSIGNMENT__VAL_I, oldVal_i, val_i));
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
      case DSLPackage.ASSIGNMENT__LEFTHAND:
        return basicSetLefthand(null, msgs);
      case DSLPackage.ASSIGNMENT__RIGHTHAND:
        return basicSetRighthand(null, msgs);
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
      case DSLPackage.ASSIGNMENT__LEFTHAND:
        return getLefthand();
      case DSLPackage.ASSIGNMENT__RIGHTHAND:
        return getRighthand();
      case DSLPackage.ASSIGNMENT__VAL_S:
        return getVal_s();
      case DSLPackage.ASSIGNMENT__VAL_I:
        return getVal_i();
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
      case DSLPackage.ASSIGNMENT__LEFTHAND:
        setLefthand((EObject)newValue);
        return;
      case DSLPackage.ASSIGNMENT__RIGHTHAND:
        setRighthand((EObject)newValue);
        return;
      case DSLPackage.ASSIGNMENT__VAL_S:
        setVal_s((String)newValue);
        return;
      case DSLPackage.ASSIGNMENT__VAL_I:
        setVal_i((Integer)newValue);
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
      case DSLPackage.ASSIGNMENT__LEFTHAND:
        setLefthand((EObject)null);
        return;
      case DSLPackage.ASSIGNMENT__RIGHTHAND:
        setRighthand((EObject)null);
        return;
      case DSLPackage.ASSIGNMENT__VAL_S:
        setVal_s(VAL_S_EDEFAULT);
        return;
      case DSLPackage.ASSIGNMENT__VAL_I:
        setVal_i(VAL_I_EDEFAULT);
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
      case DSLPackage.ASSIGNMENT__LEFTHAND:
        return lefthand != null;
      case DSLPackage.ASSIGNMENT__RIGHTHAND:
        return righthand != null;
      case DSLPackage.ASSIGNMENT__VAL_S:
        return VAL_S_EDEFAULT == null ? val_s != null : !VAL_S_EDEFAULT.equals(val_s);
      case DSLPackage.ASSIGNMENT__VAL_I:
        return val_i != VAL_I_EDEFAULT;
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
    result.append(" (val_s: ");
    result.append(val_s);
    result.append(", val_i: ");
    result.append(val_i);
    result.append(')');
    return result.toString();
  }

} //AssignmentImpl
