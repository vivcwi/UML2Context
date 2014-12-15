/**
 */
package uml2context.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml2context.Goal;
import uml2context.PlanClass;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.GoalImpl#getOwnedPlan <em>Owned Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends PropertyImpl implements Goal {
	/**
	 * The cached value of the '{@link #getOwnedPlan() <em>Owned Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPlan()
	 * @generated
	 * @ordered
	 */
	protected PlanClass ownedPlan;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanClass getOwnedPlan() {
		return ownedPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPlan(PlanClass newOwnedPlan, NotificationChain msgs) {
		PlanClass oldOwnedPlan = ownedPlan;
		ownedPlan = newOwnedPlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.GOAL__OWNED_PLAN, oldOwnedPlan, newOwnedPlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPlan(PlanClass newOwnedPlan) {
		if (newOwnedPlan != ownedPlan) {
			NotificationChain msgs = null;
			if (ownedPlan != null)
				msgs = ((InternalEObject)ownedPlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2contextPackage.GOAL__OWNED_PLAN, null, msgs);
			if (newOwnedPlan != null)
				msgs = ((InternalEObject)newOwnedPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Uml2contextPackage.GOAL__OWNED_PLAN, null, msgs);
			msgs = basicSetOwnedPlan(newOwnedPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.GOAL__OWNED_PLAN, newOwnedPlan, newOwnedPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.GOAL__OWNED_PLAN:
				return basicSetOwnedPlan(null, msgs);
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
			case Uml2contextPackage.GOAL__OWNED_PLAN:
				return getOwnedPlan();
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
			case Uml2contextPackage.GOAL__OWNED_PLAN:
				setOwnedPlan((PlanClass)newValue);
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
			case Uml2contextPackage.GOAL__OWNED_PLAN:
				setOwnedPlan((PlanClass)null);
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
			case Uml2contextPackage.GOAL__OWNED_PLAN:
				return ownedPlan != null;
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
