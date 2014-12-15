/**
 */
package uml2context.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml2context.AgentRoleClass;
import uml2context.Control;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.ControlImpl#getController <em>Controller</em>}</li>
 *   <li>{@link uml2context.impl.ControlImpl#getControlled <em>Controlled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlImpl extends DirectedRelationshipImpl implements Control {
	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected AgentRoleClass controller;

	/**
	 * The cached value of the '{@link #getControlled() <em>Controlled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlled()
	 * @generated
	 * @ordered
	 */
	protected AgentRoleClass controlled;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentRoleClass getController() {
		if (controller != null && controller.eIsProxy()) {
			InternalEObject oldController = (InternalEObject)controller;
			controller = (AgentRoleClass)eResolveProxy(oldController);
			if (controller != oldController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.CONTROL__CONTROLLER, oldController, controller));
			}
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentRoleClass basicGetController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(AgentRoleClass newController) {
		AgentRoleClass oldController = controller;
		controller = newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.CONTROL__CONTROLLER, oldController, controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentRoleClass getControlled() {
		if (controlled != null && controlled.eIsProxy()) {
			InternalEObject oldControlled = (InternalEObject)controlled;
			controlled = (AgentRoleClass)eResolveProxy(oldControlled);
			if (controlled != oldControlled) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.CONTROL__CONTROLLED, oldControlled, controlled));
			}
		}
		return controlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentRoleClass basicGetControlled() {
		return controlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlled(AgentRoleClass newControlled, NotificationChain msgs) {
		AgentRoleClass oldControlled = controlled;
		controlled = newControlled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.CONTROL__CONTROLLED, oldControlled, newControlled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlled(AgentRoleClass newControlled) {
		if (newControlled != controlled) {
			NotificationChain msgs = null;
			if (controlled != null)
				msgs = ((InternalEObject)controlled).eInverseRemove(this, Uml2contextPackage.AGENT_ROLE_CLASS__CONTROL, AgentRoleClass.class, msgs);
			if (newControlled != null)
				msgs = ((InternalEObject)newControlled).eInverseAdd(this, Uml2contextPackage.AGENT_ROLE_CLASS__CONTROL, AgentRoleClass.class, msgs);
			msgs = basicSetControlled(newControlled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.CONTROL__CONTROLLED, newControlled, newControlled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.CONTROL__CONTROLLED:
				if (controlled != null)
					msgs = ((InternalEObject)controlled).eInverseRemove(this, Uml2contextPackage.AGENT_ROLE_CLASS__CONTROL, AgentRoleClass.class, msgs);
				return basicSetControlled((AgentRoleClass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.CONTROL__CONTROLLED:
				return basicSetControlled(null, msgs);
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
			case Uml2contextPackage.CONTROL__CONTROLLER:
				if (resolve) return getController();
				return basicGetController();
			case Uml2contextPackage.CONTROL__CONTROLLED:
				if (resolve) return getControlled();
				return basicGetControlled();
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
			case Uml2contextPackage.CONTROL__CONTROLLER:
				setController((AgentRoleClass)newValue);
				return;
			case Uml2contextPackage.CONTROL__CONTROLLED:
				setControlled((AgentRoleClass)newValue);
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
			case Uml2contextPackage.CONTROL__CONTROLLER:
				setController((AgentRoleClass)null);
				return;
			case Uml2contextPackage.CONTROL__CONTROLLED:
				setControlled((AgentRoleClass)null);
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
			case Uml2contextPackage.CONTROL__CONTROLLER:
				return controller != null;
			case Uml2contextPackage.CONTROL__CONTROLLED:
				return controlled != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlImpl
