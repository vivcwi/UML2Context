/**
 */
package uml2context.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2context.ActionClass;
import uml2context.Goal;
import uml2context.PlanClass;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.PlanClassImpl#getOwendGoal <em>Owend Goal</em>}</li>
 *   <li>{@link uml2context.impl.PlanClassImpl#getOwnedAction <em>Owned Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlanClassImpl extends BehavioralFeatureImpl implements PlanClass {
	/**
	 * The cached value of the '{@link #getOwendGoal() <em>Owend Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwendGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> owendGoal;

	/**
	 * The cached value of the '{@link #getOwnedAction() <em>Owned Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionClass> ownedAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.PLAN_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getOwendGoal() {
		if (owendGoal == null) {
			owendGoal = new EObjectContainmentEList<Goal>(Goal.class, this, Uml2contextPackage.PLAN_CLASS__OWEND_GOAL);
		}
		return owendGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionClass> getOwnedAction() {
		if (ownedAction == null) {
			ownedAction = new EObjectContainmentEList<ActionClass>(ActionClass.class, this, Uml2contextPackage.PLAN_CLASS__OWNED_ACTION);
		}
		return ownedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.PLAN_CLASS__OWEND_GOAL:
				return ((InternalEList<?>)getOwendGoal()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.PLAN_CLASS__OWNED_ACTION:
				return ((InternalEList<?>)getOwnedAction()).basicRemove(otherEnd, msgs);
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
			case Uml2contextPackage.PLAN_CLASS__OWEND_GOAL:
				return getOwendGoal();
			case Uml2contextPackage.PLAN_CLASS__OWNED_ACTION:
				return getOwnedAction();
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
			case Uml2contextPackage.PLAN_CLASS__OWEND_GOAL:
				getOwendGoal().clear();
				getOwendGoal().addAll((Collection<? extends Goal>)newValue);
				return;
			case Uml2contextPackage.PLAN_CLASS__OWNED_ACTION:
				getOwnedAction().clear();
				getOwnedAction().addAll((Collection<? extends ActionClass>)newValue);
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
			case Uml2contextPackage.PLAN_CLASS__OWEND_GOAL:
				getOwendGoal().clear();
				return;
			case Uml2contextPackage.PLAN_CLASS__OWNED_ACTION:
				getOwnedAction().clear();
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
			case Uml2contextPackage.PLAN_CLASS__OWEND_GOAL:
				return owendGoal != null && !owendGoal.isEmpty();
			case Uml2contextPackage.PLAN_CLASS__OWNED_ACTION:
				return ownedAction != null && !ownedAction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlanClassImpl
