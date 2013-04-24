/**
 */
package androidintentsdsl.impl;

import androidintentsdsl.Action;
import androidintentsdsl.AndroidintentsdslPackage;
import androidintentsdsl.Extra;
import androidintentsdsl.Intent;

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
 * An implementation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link androidintentsdsl.impl.IntentImpl#getAction <em>Action</em>}</li>
 *   <li>{@link androidintentsdsl.impl.IntentImpl#getName <em>Name</em>}</li>
 *   <li>{@link androidintentsdsl.impl.IntentImpl#getExceptionThrown <em>Exception Thrown</em>}</li>
 *   <li>{@link androidintentsdsl.impl.IntentImpl#getAvailableExtras <em>Available Extras</em>}</li>
 *   <li>{@link androidintentsdsl.impl.IntentImpl#getSelectedExtras <em>Selected Extras</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentImpl extends EObjectImpl implements Intent {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

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
	 * The cached value of the '{@link #getExceptionThrown() <em>Exception Thrown</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionThrown()
	 * @generated
	 * @ordered
	 */
	protected EList<androidintentsdsl.Exception> exceptionThrown;

	/**
	 * The cached value of the '{@link #getAvailableExtras() <em>Available Extras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableExtras()
	 * @generated
	 * @ordered
	 */
	protected EList<Extra> availableExtras;

	/**
	 * The cached value of the '{@link #getSelectedExtras() <em>Selected Extras</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedExtras()
	 * @generated
	 * @ordered
	 */
	protected EList<Extra> selectedExtras;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidintentsdslPackage.Literals.INTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AndroidintentsdslPackage.INTENT__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AndroidintentsdslPackage.INTENT__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AndroidintentsdslPackage.INTENT__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidintentsdslPackage.INTENT__ACTION, newAction, newAction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidintentsdslPackage.INTENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<androidintentsdsl.Exception> getExceptionThrown() {
		if (exceptionThrown == null) {
			exceptionThrown = new EObjectContainmentEList<androidintentsdsl.Exception>(androidintentsdsl.Exception.class, this, AndroidintentsdslPackage.INTENT__EXCEPTION_THROWN);
		}
		return exceptionThrown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extra> getAvailableExtras() {
		if (availableExtras == null) {
			availableExtras = new EObjectContainmentEList<Extra>(Extra.class, this, AndroidintentsdslPackage.INTENT__AVAILABLE_EXTRAS);
		}
		return availableExtras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extra> getSelectedExtras() {
		if (selectedExtras == null) {
			selectedExtras = new EObjectContainmentEList<Extra>(Extra.class, this, AndroidintentsdslPackage.INTENT__SELECTED_EXTRAS);
		}
		return selectedExtras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidintentsdslPackage.INTENT__ACTION:
				return basicSetAction(null, msgs);
			case AndroidintentsdslPackage.INTENT__EXCEPTION_THROWN:
				return ((InternalEList<?>)getExceptionThrown()).basicRemove(otherEnd, msgs);
			case AndroidintentsdslPackage.INTENT__AVAILABLE_EXTRAS:
				return ((InternalEList<?>)getAvailableExtras()).basicRemove(otherEnd, msgs);
			case AndroidintentsdslPackage.INTENT__SELECTED_EXTRAS:
				return ((InternalEList<?>)getSelectedExtras()).basicRemove(otherEnd, msgs);
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
			case AndroidintentsdslPackage.INTENT__ACTION:
				return getAction();
			case AndroidintentsdslPackage.INTENT__NAME:
				return getName();
			case AndroidintentsdslPackage.INTENT__EXCEPTION_THROWN:
				return getExceptionThrown();
			case AndroidintentsdslPackage.INTENT__AVAILABLE_EXTRAS:
				return getAvailableExtras();
			case AndroidintentsdslPackage.INTENT__SELECTED_EXTRAS:
				return getSelectedExtras();
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
			case AndroidintentsdslPackage.INTENT__ACTION:
				setAction((Action)newValue);
				return;
			case AndroidintentsdslPackage.INTENT__NAME:
				setName((String)newValue);
				return;
			case AndroidintentsdslPackage.INTENT__EXCEPTION_THROWN:
				getExceptionThrown().clear();
				getExceptionThrown().addAll((Collection<? extends androidintentsdsl.Exception>)newValue);
				return;
			case AndroidintentsdslPackage.INTENT__AVAILABLE_EXTRAS:
				getAvailableExtras().clear();
				getAvailableExtras().addAll((Collection<? extends Extra>)newValue);
				return;
			case AndroidintentsdslPackage.INTENT__SELECTED_EXTRAS:
				getSelectedExtras().clear();
				getSelectedExtras().addAll((Collection<? extends Extra>)newValue);
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
			case AndroidintentsdslPackage.INTENT__ACTION:
				setAction((Action)null);
				return;
			case AndroidintentsdslPackage.INTENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AndroidintentsdslPackage.INTENT__EXCEPTION_THROWN:
				getExceptionThrown().clear();
				return;
			case AndroidintentsdslPackage.INTENT__AVAILABLE_EXTRAS:
				getAvailableExtras().clear();
				return;
			case AndroidintentsdslPackage.INTENT__SELECTED_EXTRAS:
				getSelectedExtras().clear();
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
			case AndroidintentsdslPackage.INTENT__ACTION:
				return action != null;
			case AndroidintentsdslPackage.INTENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AndroidintentsdslPackage.INTENT__EXCEPTION_THROWN:
				return exceptionThrown != null && !exceptionThrown.isEmpty();
			case AndroidintentsdslPackage.INTENT__AVAILABLE_EXTRAS:
				return availableExtras != null && !availableExtras.isEmpty();
			case AndroidintentsdslPackage.INTENT__SELECTED_EXTRAS:
				return selectedExtras != null && !selectedExtras.isEmpty();
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

} //IntentImpl
