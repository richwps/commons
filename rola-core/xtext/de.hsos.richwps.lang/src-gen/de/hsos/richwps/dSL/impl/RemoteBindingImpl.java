/**
 */
package de.hsos.richwps.dSL.impl;

import de.hsos.richwps.dSL.DSLPackage;
import de.hsos.richwps.dSL.RemoteBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.impl.RemoteBindingImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.RemoteBindingImpl#getHost <em>Host</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.RemoteBindingImpl#getPort <em>Port</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.RemoteBindingImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.RemoteBindingImpl#getProcessid <em>Processid</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.RemoteBindingImpl#getHandle <em>Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteBindingImpl extends OperationImpl implements RemoteBinding
{
  /**
   * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected static final String PROTOCOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected String protocol = PROTOCOL_EDEFAULT;

  /**
   * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHost()
   * @generated
   * @ordered
   */
  protected static final String HOST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHost()
   * @generated
   * @ordered
   */
  protected String host = HOST_EDEFAULT;

  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final int PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected int port = PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

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
  protected RemoteBindingImpl()
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
    return DSLPackage.Literals.REMOTE_BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProtocol()
  {
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProtocol(String newProtocol)
  {
    String oldProtocol = protocol;
    protocol = newProtocol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.REMOTE_BINDING__PROTOCOL, oldProtocol, protocol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHost()
  {
    return host;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHost(String newHost)
  {
    String oldHost = host;
    host = newHost;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.REMOTE_BINDING__HOST, oldHost, host));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(int newPort)
  {
    int oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.REMOTE_BINDING__PORT, oldPort, port));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.REMOTE_BINDING__PATH, oldPath, path));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.REMOTE_BINDING__PROCESSID, oldProcessid, processid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.REMOTE_BINDING__HANDLE, oldHandle, handle));
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
      case DSLPackage.REMOTE_BINDING__PROTOCOL:
        return getProtocol();
      case DSLPackage.REMOTE_BINDING__HOST:
        return getHost();
      case DSLPackage.REMOTE_BINDING__PORT:
        return getPort();
      case DSLPackage.REMOTE_BINDING__PATH:
        return getPath();
      case DSLPackage.REMOTE_BINDING__PROCESSID:
        return getProcessid();
      case DSLPackage.REMOTE_BINDING__HANDLE:
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
      case DSLPackage.REMOTE_BINDING__PROTOCOL:
        setProtocol((String)newValue);
        return;
      case DSLPackage.REMOTE_BINDING__HOST:
        setHost((String)newValue);
        return;
      case DSLPackage.REMOTE_BINDING__PORT:
        setPort((Integer)newValue);
        return;
      case DSLPackage.REMOTE_BINDING__PATH:
        setPath((String)newValue);
        return;
      case DSLPackage.REMOTE_BINDING__PROCESSID:
        setProcessid((String)newValue);
        return;
      case DSLPackage.REMOTE_BINDING__HANDLE:
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
      case DSLPackage.REMOTE_BINDING__PROTOCOL:
        setProtocol(PROTOCOL_EDEFAULT);
        return;
      case DSLPackage.REMOTE_BINDING__HOST:
        setHost(HOST_EDEFAULT);
        return;
      case DSLPackage.REMOTE_BINDING__PORT:
        setPort(PORT_EDEFAULT);
        return;
      case DSLPackage.REMOTE_BINDING__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case DSLPackage.REMOTE_BINDING__PROCESSID:
        setProcessid(PROCESSID_EDEFAULT);
        return;
      case DSLPackage.REMOTE_BINDING__HANDLE:
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
      case DSLPackage.REMOTE_BINDING__PROTOCOL:
        return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
      case DSLPackage.REMOTE_BINDING__HOST:
        return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
      case DSLPackage.REMOTE_BINDING__PORT:
        return port != PORT_EDEFAULT;
      case DSLPackage.REMOTE_BINDING__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case DSLPackage.REMOTE_BINDING__PROCESSID:
        return PROCESSID_EDEFAULT == null ? processid != null : !PROCESSID_EDEFAULT.equals(processid);
      case DSLPackage.REMOTE_BINDING__HANDLE:
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
    result.append(" (protocol: ");
    result.append(protocol);
    result.append(", host: ");
    result.append(host);
    result.append(", port: ");
    result.append(port);
    result.append(", path: ");
    result.append(path);
    result.append(", processid: ");
    result.append(processid);
    result.append(", handle: ");
    result.append(handle);
    result.append(')');
    return result.toString();
  }

} //RemoteBindingImpl
