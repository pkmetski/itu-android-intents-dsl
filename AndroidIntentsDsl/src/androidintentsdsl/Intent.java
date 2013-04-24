/**
 */
package androidintentsdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link androidintentsdsl.Intent#getAction <em>Action</em>}</li>
 *   <li>{@link androidintentsdsl.Intent#getName <em>Name</em>}</li>
 *   <li>{@link androidintentsdsl.Intent#getExceptionThrown <em>Exception Thrown</em>}</li>
 *   <li>{@link androidintentsdsl.Intent#getAvailableExtras <em>Available Extras</em>}</li>
 *   <li>{@link androidintentsdsl.Intent#getSelectedExtras <em>Selected Extras</em>}</li>
 * </ul>
 * </p>
 *
 * @see androidintentsdsl.AndroidintentsdslPackage#getIntent()
 * @model
 * @generated
 */
public interface Intent extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see androidintentsdsl.AndroidintentsdslPackage#getIntent_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link androidintentsdsl.Intent#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see androidintentsdsl.AndroidintentsdslPackage#getIntent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link androidintentsdsl.Intent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Exception Thrown</b></em>' containment reference list.
	 * The list contents are of type {@link androidintentsdsl.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Thrown</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Thrown</em>' containment reference list.
	 * @see androidintentsdsl.AndroidintentsdslPackage#getIntent_ExceptionThrown()
	 * @model containment="true"
	 * @generated
	 */
	EList<androidintentsdsl.Exception> getExceptionThrown();

	/**
	 * Returns the value of the '<em><b>Available Extras</b></em>' containment reference list.
	 * The list contents are of type {@link androidintentsdsl.Extra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Extras</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Extras</em>' containment reference list.
	 * @see androidintentsdsl.AndroidintentsdslPackage#getIntent_AvailableExtras()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extra> getAvailableExtras();

	/**
	 * Returns the value of the '<em><b>Selected Extras</b></em>' containment reference list.
	 * The list contents are of type {@link androidintentsdsl.Extra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Extras</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Extras</em>' containment reference list.
	 * @see androidintentsdsl.AndroidintentsdslPackage#getIntent_SelectedExtras()
	 * @model containment="true"
	 * @generated
	 */
	EList<Extra> getSelectedExtras();

} // Intent
