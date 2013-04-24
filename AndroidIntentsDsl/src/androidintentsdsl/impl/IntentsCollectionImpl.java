/**
 */
package androidintentsdsl.impl;

import androidintentsdsl.AndroidintentsdslPackage;
import androidintentsdsl.Intent;
import androidintentsdsl.IntentsCollection;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intents Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link androidintentsdsl.impl.IntentsCollectionImpl#getAvailableIntents <em>Available Intents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentsCollectionImpl extends EObjectImpl implements IntentsCollection {
	/**
	 * The cached value of the '{@link #getAvailableIntents() <em>Available Intents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableIntents()
	 * @generated
	 * @ordered
	 */
	protected EList<Intent> availableIntents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntentsCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AndroidintentsdslPackage.Literals.INTENTS_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intent> getAvailableIntents() {
		if (availableIntents == null) {
			availableIntents = new EObjectContainmentEList<Intent>(Intent.class, this, AndroidintentsdslPackage.INTENTS_COLLECTION__AVAILABLE_INTENTS);
		}
		return availableIntents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AndroidintentsdslPackage.INTENTS_COLLECTION__AVAILABLE_INTENTS:
				return ((InternalEList<?>)getAvailableIntents()).basicRemove(otherEnd, msgs);
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
			case AndroidintentsdslPackage.INTENTS_COLLECTION__AVAILABLE_INTENTS:
				return getAvailableIntents();
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
			case AndroidintentsdslPackage.INTENTS_COLLECTION__AVAILABLE_INTENTS:
				getAvailableIntents().clear();
				getAvailableIntents().addAll((Collection<? extends Intent>)newValue);
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
			case AndroidintentsdslPackage.INTENTS_COLLECTION__AVAILABLE_INTENTS:
				getAvailableIntents().clear();
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
			case AndroidintentsdslPackage.INTENTS_COLLECTION__AVAILABLE_INTENTS:
				return availableIntents != null && !availableIntents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntentsCollectionImpl
