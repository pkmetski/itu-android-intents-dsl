/**
 */
package androidintentsdsl.impl;

import androidintentsdsl.Action;
import androidintentsdsl.AndroidintentsdslPackage;
import androidintentsdsl.Data;
import androidintentsdsl.Protocol;
import androidintentsdsl.UsesPermission;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link androidintentsdsl.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link androidintentsdsl.impl.ActionImpl#getAvailableProtocols <em>Available Protocols</em>}</li>
 *   <li>{@link androidintentsdsl.impl.ActionImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link androidintentsdsl.impl.ActionImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends EObjectImpl implements Action {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvailableProtocols() <em>Available Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> availableProtocols;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<UsesPermission> permissions;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidintentsdslPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidintentsdslPackage.ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Protocol> getAvailableProtocols() {
		if (availableProtocols == null) {
			availableProtocols = new EObjectContainmentEList<Protocol>(Protocol.class, this, AndroidintentsdslPackage.ACTION__AVAILABLE_PROTOCOLS);
		}
		return availableProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UsesPermission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectContainmentEList<UsesPermission>(UsesPermission.class, this, AndroidintentsdslPackage.ACTION__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject)data;
			data = (Data)eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AndroidintentsdslPackage.ACTION__DATA, oldData, data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidintentsdslPackage.ACTION__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidintentsdslPackage.ACTION__AVAILABLE_PROTOCOLS:
				return ((InternalEList<?>)getAvailableProtocols()).basicRemove(otherEnd, msgs);
			case AndroidintentsdslPackage.ACTION__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AndroidintentsdslPackage.ACTION__NAME:
				return getName();
			case AndroidintentsdslPackage.ACTION__AVAILABLE_PROTOCOLS:
				return getAvailableProtocols();
			case AndroidintentsdslPackage.ACTION__PERMISSIONS:
				return getPermissions();
			case AndroidintentsdslPackage.ACTION__DATA:
				if (resolve) return getData();
				return basicGetData();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AndroidintentsdslPackage.ACTION__NAME:
				setName((String)newValue);
				return;
			case AndroidintentsdslPackage.ACTION__AVAILABLE_PROTOCOLS:
				getAvailableProtocols().clear();
				getAvailableProtocols().addAll((Collection<? extends Protocol>)newValue);
				return;
			case AndroidintentsdslPackage.ACTION__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends UsesPermission>)newValue);
				return;
			case AndroidintentsdslPackage.ACTION__DATA:
				setData((Data)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AndroidintentsdslPackage.ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AndroidintentsdslPackage.ACTION__AVAILABLE_PROTOCOLS:
				getAvailableProtocols().clear();
				return;
			case AndroidintentsdslPackage.ACTION__PERMISSIONS:
				getPermissions().clear();
				return;
			case AndroidintentsdslPackage.ACTION__DATA:
				setData((Data)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AndroidintentsdslPackage.ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AndroidintentsdslPackage.ACTION__AVAILABLE_PROTOCOLS:
				return availableProtocols != null && !availableProtocols.isEmpty();
			case AndroidintentsdslPackage.ACTION__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
			case AndroidintentsdslPackage.ACTION__DATA:
				return data != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
