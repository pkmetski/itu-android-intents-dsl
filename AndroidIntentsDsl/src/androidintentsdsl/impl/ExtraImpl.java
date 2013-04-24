/**
 */
package androidintentsdsl.impl;

import androidintentsdsl.AndroidintentsdslPackage;
import androidintentsdsl.Extra;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extra</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link androidintentsdsl.impl.ExtraImpl#getKey <em>Key</em>}</li>
 *   <li>{@link androidintentsdsl.impl.ExtraImpl#getValue <em>Value</em>}</li>
 *   <li>{@link androidintentsdsl.impl.ExtraImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtraImpl extends EObjectImpl implements Extra {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected String valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidintentsdslPackage.Literals.EXTRA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidintentsdslPackage.EXTRA__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidintentsdslPackage.EXTRA__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueType(String newValueType) {
		String oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AndroidintentsdslPackage.EXTRA__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AndroidintentsdslPackage.EXTRA__KEY:
				return getKey();
			case AndroidintentsdslPackage.EXTRA__VALUE:
				return getValue();
			case AndroidintentsdslPackage.EXTRA__VALUE_TYPE:
				return getValueType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AndroidintentsdslPackage.EXTRA__KEY:
				setKey((String)newValue);
				return;
			case AndroidintentsdslPackage.EXTRA__VALUE:
				setValue(newValue);
				return;
			case AndroidintentsdslPackage.EXTRA__VALUE_TYPE:
				setValueType((String)newValue);
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
			case AndroidintentsdslPackage.EXTRA__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case AndroidintentsdslPackage.EXTRA__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AndroidintentsdslPackage.EXTRA__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
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
			case AndroidintentsdslPackage.EXTRA__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case AndroidintentsdslPackage.EXTRA__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case AndroidintentsdslPackage.EXTRA__VALUE_TYPE:
				return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
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
		result.append(" (key: ");
		result.append(key);
		result.append(", value: ");
		result.append(value);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(')');
		return result.toString();
	}

} //ExtraImpl
