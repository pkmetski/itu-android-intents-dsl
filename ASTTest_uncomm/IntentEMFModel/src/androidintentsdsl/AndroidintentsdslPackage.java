/**
 */
package androidintentsdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see androidintentsdsl.AndroidintentsdslFactory
 * @model kind="package"
 * @generated
 */
public interface AndroidintentsdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "androidintentsdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/IntentEMFModel/model/AndroidIntentsDsl.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "androidintentsdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AndroidintentsdslPackage eINSTANCE = androidintentsdsl.impl.AndroidintentsdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link androidintentsdsl.impl.ExtraImpl <em>Extra</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see androidintentsdsl.impl.ExtraImpl
	 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getExtra()
	 * @generated
	 */
	int EXTRA = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA__VALUE_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Extra</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link androidintentsdsl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see androidintentsdsl.impl.ActionImpl
	 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Available Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__AVAILABLE_PROTOCOLS = 1;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PERMISSIONS = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DATA = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link androidintentsdsl.impl.IntentImpl <em>Intent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see androidintentsdsl.impl.IntentImpl
	 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getIntent()
	 * @generated
	 */
	int INTENT = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Available Extras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__AVAILABLE_EXTRAS = 2;

	/**
	 * The feature id for the '<em><b>Selected Extras</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__SELECTED_EXTRAS = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Exceptions Thrown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT__EXCEPTIONS_THROWN = 5;

	/**
	 * The number of structural features of the '<em>Intent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link androidintentsdsl.impl.IntentsCollectionImpl <em>Intents Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see androidintentsdsl.impl.IntentsCollectionImpl
	 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getIntentsCollection()
	 * @generated
	 */
	int INTENTS_COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Available Intents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTS_COLLECTION__AVAILABLE_INTENTS = 0;

	/**
	 * The number of structural features of the '<em>Intents Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTENTS_COLLECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link androidintentsdsl.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see androidintentsdsl.impl.ExceptionImpl
	 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 4;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link androidintentsdsl.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see androidintentsdsl.impl.ProtocolImpl
	 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link androidintentsdsl.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see androidintentsdsl.impl.DataImpl
	 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getData()
	 * @generated
	 */
	int DATA = 6;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MIME_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link androidintentsdsl.impl.UsesPermissionImpl <em>Uses Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see androidintentsdsl.impl.UsesPermissionImpl
	 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getUsesPermission()
	 * @generated
	 */
	int USES_PERMISSION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PERMISSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PERMISSION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Uses Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USES_PERMISSION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link androidintentsdsl.Extra <em>Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra</em>'.
	 * @see androidintentsdsl.Extra
	 * @generated
	 */
	EClass getExtra();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.Extra#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see androidintentsdsl.Extra#getKey()
	 * @see #getExtra()
	 * @generated
	 */
	EAttribute getExtra_Key();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.Extra#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see androidintentsdsl.Extra#getValue()
	 * @see #getExtra()
	 * @generated
	 */
	EAttribute getExtra_Value();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.Extra#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see androidintentsdsl.Extra#getValueType()
	 * @see #getExtra()
	 * @generated
	 */
	EAttribute getExtra_ValueType();

	/**
	 * Returns the meta object for class '{@link androidintentsdsl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see androidintentsdsl.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see androidintentsdsl.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link androidintentsdsl.Action#getAvailableProtocols <em>Available Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Protocols</em>'.
	 * @see androidintentsdsl.Action#getAvailableProtocols()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_AvailableProtocols();

	/**
	 * Returns the meta object for the containment reference list '{@link androidintentsdsl.Action#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see androidintentsdsl.Action#getPermissions()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Permissions();

	/**
	 * Returns the meta object for the reference '{@link androidintentsdsl.Action#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see androidintentsdsl.Action#getData()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Data();

	/**
	 * Returns the meta object for class '{@link androidintentsdsl.Intent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intent</em>'.
	 * @see androidintentsdsl.Intent
	 * @generated
	 */
	EClass getIntent();

	/**
	 * Returns the meta object for the containment reference '{@link androidintentsdsl.Intent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see androidintentsdsl.Intent#getAction()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_Action();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.Intent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see androidintentsdsl.Intent#getName()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link androidintentsdsl.Intent#getAvailableExtras <em>Available Extras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Extras</em>'.
	 * @see androidintentsdsl.Intent#getAvailableExtras()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_AvailableExtras();

	/**
	 * Returns the meta object for the containment reference list '{@link androidintentsdsl.Intent#getSelectedExtras <em>Selected Extras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selected Extras</em>'.
	 * @see androidintentsdsl.Intent#getSelectedExtras()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_SelectedExtras();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.Intent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see androidintentsdsl.Intent#getDescription()
	 * @see #getIntent()
	 * @generated
	 */
	EAttribute getIntent_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link androidintentsdsl.Intent#getExceptionsThrown <em>Exceptions Thrown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions Thrown</em>'.
	 * @see androidintentsdsl.Intent#getExceptionsThrown()
	 * @see #getIntent()
	 * @generated
	 */
	EReference getIntent_ExceptionsThrown();

	/**
	 * Returns the meta object for class '{@link androidintentsdsl.IntentsCollection <em>Intents Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intents Collection</em>'.
	 * @see androidintentsdsl.IntentsCollection
	 * @generated
	 */
	EClass getIntentsCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link androidintentsdsl.IntentsCollection#getAvailableIntents <em>Available Intents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Intents</em>'.
	 * @see androidintentsdsl.IntentsCollection#getAvailableIntents()
	 * @see #getIntentsCollection()
	 * @generated
	 */
	EReference getIntentsCollection_AvailableIntents();

	/**
	 * Returns the meta object for class '{@link androidintentsdsl.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see androidintentsdsl.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for class '{@link androidintentsdsl.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see androidintentsdsl.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.Protocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see androidintentsdsl.Protocol#getName()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Name();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.Protocol#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see androidintentsdsl.Protocol#getValue()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Value();

	/**
	 * Returns the meta object for class '{@link androidintentsdsl.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see androidintentsdsl.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.Data#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see androidintentsdsl.Data#getParameter()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Parameter();

	/**
	 * Returns the meta object for the reference '{@link androidintentsdsl.Data#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see androidintentsdsl.Data#getProtocol()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.Data#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see androidintentsdsl.Data#getMimeType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_MimeType();

	/**
	 * Returns the meta object for class '{@link androidintentsdsl.UsesPermission <em>Uses Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uses Permission</em>'.
	 * @see androidintentsdsl.UsesPermission
	 * @generated
	 */
	EClass getUsesPermission();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.UsesPermission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see androidintentsdsl.UsesPermission#getName()
	 * @see #getUsesPermission()
	 * @generated
	 */
	EAttribute getUsesPermission_Name();

	/**
	 * Returns the meta object for the attribute '{@link androidintentsdsl.UsesPermission#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see androidintentsdsl.UsesPermission#getValue()
	 * @see #getUsesPermission()
	 * @generated
	 */
	EAttribute getUsesPermission_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AndroidintentsdslFactory getAndroidintentsdslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link androidintentsdsl.impl.ExtraImpl <em>Extra</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see androidintentsdsl.impl.ExtraImpl
		 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getExtra()
		 * @generated
		 */
		EClass EXTRA = eINSTANCE.getExtra();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA__KEY = eINSTANCE.getExtra_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA__VALUE = eINSTANCE.getExtra_Value();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRA__VALUE_TYPE = eINSTANCE.getExtra_ValueType();

		/**
		 * The meta object literal for the '{@link androidintentsdsl.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see androidintentsdsl.impl.ActionImpl
		 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Available Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__AVAILABLE_PROTOCOLS = eINSTANCE.getAction_AvailableProtocols();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PERMISSIONS = eINSTANCE.getAction_Permissions();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__DATA = eINSTANCE.getAction_Data();

		/**
		 * The meta object literal for the '{@link androidintentsdsl.impl.IntentImpl <em>Intent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see androidintentsdsl.impl.IntentImpl
		 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getIntent()
		 * @generated
		 */
		EClass INTENT = eINSTANCE.getIntent();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__ACTION = eINSTANCE.getIntent_Action();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__NAME = eINSTANCE.getIntent_Name();

		/**
		 * The meta object literal for the '<em><b>Available Extras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__AVAILABLE_EXTRAS = eINSTANCE.getIntent_AvailableExtras();

		/**
		 * The meta object literal for the '<em><b>Selected Extras</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__SELECTED_EXTRAS = eINSTANCE.getIntent_SelectedExtras();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTENT__DESCRIPTION = eINSTANCE.getIntent_Description();

		/**
		 * The meta object literal for the '<em><b>Exceptions Thrown</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENT__EXCEPTIONS_THROWN = eINSTANCE.getIntent_ExceptionsThrown();

		/**
		 * The meta object literal for the '{@link androidintentsdsl.impl.IntentsCollectionImpl <em>Intents Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see androidintentsdsl.impl.IntentsCollectionImpl
		 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getIntentsCollection()
		 * @generated
		 */
		EClass INTENTS_COLLECTION = eINSTANCE.getIntentsCollection();

		/**
		 * The meta object literal for the '<em><b>Available Intents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTENTS_COLLECTION__AVAILABLE_INTENTS = eINSTANCE.getIntentsCollection_AvailableIntents();

		/**
		 * The meta object literal for the '{@link androidintentsdsl.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see androidintentsdsl.impl.ExceptionImpl
		 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '{@link androidintentsdsl.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see androidintentsdsl.impl.ProtocolImpl
		 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__VALUE = eINSTANCE.getProtocol_Value();

		/**
		 * The meta object literal for the '{@link androidintentsdsl.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see androidintentsdsl.impl.DataImpl
		 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__PARAMETER = eINSTANCE.getData_Parameter();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__PROTOCOL = eINSTANCE.getData_Protocol();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__MIME_TYPE = eINSTANCE.getData_MimeType();

		/**
		 * The meta object literal for the '{@link androidintentsdsl.impl.UsesPermissionImpl <em>Uses Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see androidintentsdsl.impl.UsesPermissionImpl
		 * @see androidintentsdsl.impl.AndroidintentsdslPackageImpl#getUsesPermission()
		 * @generated
		 */
		EClass USES_PERMISSION = eINSTANCE.getUsesPermission();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES_PERMISSION__NAME = eINSTANCE.getUsesPermission_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USES_PERMISSION__VALUE = eINSTANCE.getUsesPermission_Value();

	}

} //AndroidintentsdslPackage
