/**
 */
package structurizr.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structurizr.SoftwareSystem;
import structurizr.StructurizrPackage;
import structurizr.SystemContextView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Context View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.SystemContextViewImpl#getSoftwareSystem <em>Software System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemContextViewImpl extends ViewElementImpl implements SystemContextView {
	/**
	 * The cached value of the '{@link #getSoftwareSystem() <em>Software System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareSystem()
	 * @generated
	 * @ordered
	 */
	protected SoftwareSystem softwareSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemContextViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.SYSTEM_CONTEXT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystem getSoftwareSystem() {
		if (softwareSystem != null && softwareSystem.eIsProxy()) {
			InternalEObject oldSoftwareSystem = (InternalEObject)softwareSystem;
			softwareSystem = (SoftwareSystem)eResolveProxy(oldSoftwareSystem);
			if (softwareSystem != oldSoftwareSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurizrPackage.SYSTEM_CONTEXT_VIEW__SOFTWARE_SYSTEM, oldSoftwareSystem, softwareSystem));
			}
		}
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystem basicGetSoftwareSystem() {
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareSystem(SoftwareSystem newSoftwareSystem) {
		SoftwareSystem oldSoftwareSystem = softwareSystem;
		softwareSystem = newSoftwareSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.SYSTEM_CONTEXT_VIEW__SOFTWARE_SYSTEM, oldSoftwareSystem, softwareSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurizrPackage.SYSTEM_CONTEXT_VIEW__SOFTWARE_SYSTEM:
				if (resolve) return getSoftwareSystem();
				return basicGetSoftwareSystem();
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
			case StructurizrPackage.SYSTEM_CONTEXT_VIEW__SOFTWARE_SYSTEM:
				setSoftwareSystem((SoftwareSystem)newValue);
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
			case StructurizrPackage.SYSTEM_CONTEXT_VIEW__SOFTWARE_SYSTEM:
				setSoftwareSystem((SoftwareSystem)null);
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
			case StructurizrPackage.SYSTEM_CONTEXT_VIEW__SOFTWARE_SYSTEM:
				return softwareSystem != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemContextViewImpl
