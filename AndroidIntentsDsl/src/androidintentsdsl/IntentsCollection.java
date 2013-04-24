/**
 */
package androidintentsdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intents Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link androidintentsdsl.IntentsCollection#getAvailableIntents <em>Available Intents</em>}</li>
 * </ul>
 * </p>
 *
 * @see androidintentsdsl.AndroidintentsdslPackage#getIntentsCollection()
 * @model
 * @generated
 */
public interface IntentsCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Available Intents</b></em>' containment reference list.
	 * The list contents are of type {@link androidintentsdsl.Intent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Intents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Intents</em>' containment reference list.
	 * @see androidintentsdsl.AndroidintentsdslPackage#getIntentsCollection_AvailableIntents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Intent> getAvailableIntents();

} // IntentsCollection
