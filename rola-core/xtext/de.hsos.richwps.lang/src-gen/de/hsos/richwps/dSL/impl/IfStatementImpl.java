/**
 */
package de.hsos.richwps.dSL.impl;

import de.hsos.richwps.dSL.DSLPackage;
import de.hsos.richwps.dSL.IfStatement;
import de.hsos.richwps.dSL.Operation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.impl.IfStatementImpl#getLefthand <em>Lefthand</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.IfStatementImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.IfStatementImpl#getRighthand <em>Righthand</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.IfStatementImpl#getVal_s <em>Val s</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.IfStatementImpl#getVal_i <em>Val i</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.IfStatementImpl#getIfoperations <em>Ifoperations</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.IfStatementImpl#getElseoperations <em>Elseoperations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStatementImpl extends OperationImpl implements IfStatement
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
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

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
   * The cached value of the '{@link #getIfoperations() <em>Ifoperations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfoperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> ifoperations;

  /**
   * The cached value of the '{@link #getElseoperations() <em>Elseoperations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseoperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> elseoperations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStatementImpl()
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
    return DSLPackage.Literals.IF_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.IF_STATEMENT__LEFTHAND, oldLefthand, newLefthand);
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
        msgs = ((InternalEObject)lefthand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.IF_STATEMENT__LEFTHAND, null, msgs);
      if (newLefthand != null)
        msgs = ((InternalEObject)newLefthand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.IF_STATEMENT__LEFTHAND, null, msgs);
      msgs = basicSetLefthand(newLefthand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.IF_STATEMENT__LEFTHAND, newLefthand, newLefthand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.IF_STATEMENT__OPERATOR, oldOperator, operator));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSLPackage.IF_STATEMENT__RIGHTHAND, oldRighthand, newRighthand);
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
        msgs = ((InternalEObject)righthand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSLPackage.IF_STATEMENT__RIGHTHAND, null, msgs);
      if (newRighthand != null)
        msgs = ((InternalEObject)newRighthand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSLPackage.IF_STATEMENT__RIGHTHAND, null, msgs);
      msgs = basicSetRighthand(newRighthand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.IF_STATEMENT__RIGHTHAND, newRighthand, newRighthand));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.IF_STATEMENT__VAL_S, oldVal_s, val_s));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.IF_STATEMENT__VAL_I, oldVal_i, val_i));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getIfoperations()
  {
    if (ifoperations == null)
    {
      ifoperations = new EObjectContainmentEList<Operation>(Operation.class, this, DSLPackage.IF_STATEMENT__IFOPERATIONS);
    }
    return ifoperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getElseoperations()
  {
    if (elseoperations == null)
    {
      elseoperations = new EObjectContainmentEList<Operation>(Operation.class, this, DSLPackage.IF_STATEMENT__ELSEOPERATIONS);
    }
    return elseoperations;
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
      case DSLPackage.IF_STATEMENT__LEFTHAND:
        return basicSetLefthand(null, msgs);
      case DSLPackage.IF_STATEMENT__RIGHTHAND:
        return basicSetRighthand(null, msgs);
      case DSLPackage.IF_STATEMENT__IFOPERATIONS:
        return ((InternalEList<?>)getIfoperations()).basicRemove(otherEnd, msgs);
      case DSLPackage.IF_STATEMENT__ELSEOPERATIONS:
        return ((InternalEList<?>)getElseoperations()).basicRemove(otherEnd, msgs);
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
      case DSLPackage.IF_STATEMENT__LEFTHAND:
        return getLefthand();
      case DSLPackage.IF_STATEMENT__OPERATOR:
        return getOperator();
      case DSLPackage.IF_STATEMENT__RIGHTHAND:
        return getRighthand();
      case DSLPackage.IF_STATEMENT__VAL_S:
        return getVal_s();
      case DSLPackage.IF_STATEMENT__VAL_I:
        return getVal_i();
      case DSLPackage.IF_STATEMENT__IFOPERATIONS:
        return getIfoperations();
      case DSLPackage.IF_STATEMENT__ELSEOPERATIONS:
        return getElseoperations();
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
      case DSLPackage.IF_STATEMENT__LEFTHAND:
        setLefthand((EObject)newValue);
        return;
      case DSLPackage.IF_STATEMENT__OPERATOR:
        setOperator((String)newValue);
        return;
      case DSLPackage.IF_STATEMENT__RIGHTHAND:
        setRighthand((EObject)newValue);
        return;
      case DSLPackage.IF_STATEMENT__VAL_S:
        setVal_s((String)newValue);
        return;
      case DSLPackage.IF_STATEMENT__VAL_I:
        setVal_i((Integer)newValue);
        return;
      case DSLPackage.IF_STATEMENT__IFOPERATIONS:
        getIfoperations().clear();
        getIfoperations().addAll((Collection<? extends Operation>)newValue);
        return;
      case DSLPackage.IF_STATEMENT__ELSEOPERATIONS:
        getElseoperations().clear();
        getElseoperations().addAll((Collection<? extends Operation>)newValue);
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
      case DSLPackage.IF_STATEMENT__LEFTHAND:
        setLefthand((EObject)null);
        return;
      case DSLPackage.IF_STATEMENT__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case DSLPackage.IF_STATEMENT__RIGHTHAND:
        setRighthand((EObject)null);
        return;
      case DSLPackage.IF_STATEMENT__VAL_S:
        setVal_s(VAL_S_EDEFAULT);
        return;
      case DSLPackage.IF_STATEMENT__VAL_I:
        setVal_i(VAL_I_EDEFAULT);
        return;
      case DSLPackage.IF_STATEMENT__IFOPERATIONS:
        getIfoperations().clear();
        return;
      case DSLPackage.IF_STATEMENT__ELSEOPERATIONS:
        getElseoperations().clear();
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
      case DSLPackage.IF_STATEMENT__LEFTHAND:
        return lefthand != null;
      case DSLPackage.IF_STATEMENT__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case DSLPackage.IF_STATEMENT__RIGHTHAND:
        return righthand != null;
      case DSLPackage.IF_STATEMENT__VAL_S:
        return VAL_S_EDEFAULT == null ? val_s != null : !VAL_S_EDEFAULT.equals(val_s);
      case DSLPackage.IF_STATEMENT__VAL_I:
        return val_i != VAL_I_EDEFAULT;
      case DSLPackage.IF_STATEMENT__IFOPERATIONS:
        return ifoperations != null && !ifoperations.isEmpty();
      case DSLPackage.IF_STATEMENT__ELSEOPERATIONS:
        return elseoperations != null && !elseoperations.isEmpty();
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(", val_s: ");
    result.append(val_s);
    result.append(", val_i: ");
    result.append(val_i);
    result.append(')');
    return result.toString();
  }

} //IfStatementImpl
