/**
 */
package androidintentsdsl.impl;

import androidintentsdsl.Action;
import androidintentsdsl.AndroidintentsdslFactory;
import androidintentsdsl.AndroidintentsdslPackage;
import androidintentsdsl.Data;
import androidintentsdsl.Extra;
import androidintentsdsl.Intent;
import androidintentsdsl.IntentsCollection;
import androidintentsdsl.Protocol;
import androidintentsdsl.UsesPermission;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidintentsdslFactoryImpl extends EFactoryImpl implements AndroidintentsdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AndroidintentsdslFactory init() {
		try {
			AndroidintentsdslFactory theAndroidintentsdslFactory = (AndroidintentsdslFactory)EPackage.Registry.INSTANCE.getEFactory("http://androidintentsdsl/1.0"); 
			if (theAndroidintentsdslFactory != null) {
				return theAndroidintentsdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AndroidintentsdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidintentsdslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AndroidintentsdslPackage.EXTRA: return createExtra();
			case AndroidintentsdslPackage.ACTION: return createAction();
			case AndroidintentsdslPackage.INTENT: return createIntent();
			case AndroidintentsdslPackage.INTENTS_COLLECTION: return createIntentsCollection();
			case AndroidintentsdslPackage.EXCEPTION: return createException();
			case AndroidintentsdslPackage.PROTOCOL: return createProtocol();
			case AndroidintentsdslPackage.DATA: return createData();
			case AndroidintentsdslPackage.USES_PERMISSION: return createUsesPermission();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extra createExtra() {
		ExtraImpl extra = new ExtraImpl();
		return extra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intent createIntent() {
		IntentImpl intent = new IntentImpl();
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntentsCollection createIntentsCollection() {
		IntentsCollectionImpl intentsCollection = new IntentsCollectionImpl();
		return intentsCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public androidintentsdsl.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocol() {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsesPermission createUsesPermission() {
		UsesPermissionImpl usesPermission = new UsesPermissionImpl();
		return usesPermission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndroidintentsdslPackage getAndroidintentsdslPackage() {
		return (AndroidintentsdslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AndroidintentsdslPackage getPackage() {
		return AndroidintentsdslPackage.eINSTANCE;
	}

} //AndroidintentsdslFactoryImpl
