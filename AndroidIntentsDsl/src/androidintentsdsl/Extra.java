/**
 */
package androidintentsdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extra</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link androidintentsdsl.Extra#getKey <em>Key</em>}</li>
 *   <li>{@link androidintentsdsl.Extra#getValue <em>Value</em>}</li>
 *   <li>{@link androidintentsdsl.Extra#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see androidintentsdsl.AndroidintentsdslPackage#getExtra()
 * @model
 * @generated
 */
public interface Extra extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see androidintentsdsl.AndroidintentsdslPackage#getExtra_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link androidintentsdsl.Extra#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see androidintentsdsl.AndroidintentsdslPackage#getExtra_Value()
	 * @model required="true"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link androidintentsdsl.Extra#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see #setValueType(String)
	 * @see androidintentsdsl.AndroidintentsdslPackage#getExtra_ValueType()
	 * @model required="true"
	 * @generated
	 */
	String getValueType();

	/**
	 * Sets the value of the '{@link androidintentsdsl.Extra#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(String value);

} // Extra
