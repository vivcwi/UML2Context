/**
 */
package uml2context.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2context.ActionClass;
import uml2context.ActionSemantics;
import uml2context.Constraint;
import uml2context.Parameter;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.ActionClassImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uml2context.impl.ActionClassImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uml2context.impl.ActionClassImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml2context.impl.ActionClassImpl#getActionSemantics <em>Action Semantics</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionClassImpl extends BehavioralFeatureImpl implements ActionClass {
	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> precondition;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> postcondition;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameter;

	/**
	 * The default value of the '{@link #getActionSemantics() <em>Action Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final ActionSemantics ACTION_SEMANTICS_EDEFAULT = ActionSemantics.DEFAULT_SEMANTICS;

	/**
	 * The cached value of the '{@link #getActionSemantics() <em>Action Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionSemantics()
	 * @generated
	 * @ordered
	 */
	protected ActionSemantics actionSemantics = ACTION_SEMANTICS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.ACTION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, Uml2contextPackage.ACTION_CLASS__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPostcondition() {
		if (postcondition == null) {
			postcondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, Uml2contextPackage.ACTION_CLASS__POSTCONDITION);
		}
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, Uml2contextPackage.ACTION_CLASS__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSemantics getActionSemantics() {
		return actionSemantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionSemantics(ActionSemantics newActionSemantics) {
		ActionSemantics oldActionSemantics = actionSemantics;
		actionSemantics = newActionSemantics == null ? ACTION_SEMANTICS_EDEFAULT : newActionSemantics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ACTION_CLASS__ACTION_SEMANTICS, oldActionSemantics, actionSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.ACTION_CLASS__PRECONDITION:
				return ((InternalEList<?>)getPrecondition()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ACTION_CLASS__POSTCONDITION:
				return ((InternalEList<?>)getPostcondition()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ACTION_CLASS__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
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
			case Uml2contextPackage.ACTION_CLASS__PRECONDITION:
				return getPrecondition();
			case Uml2contextPackage.ACTION_CLASS__POSTCONDITION:
				return getPostcondition();
			case Uml2contextPackage.ACTION_CLASS__OWNED_PARAMETER:
				return getOwnedParameter();
			case Uml2contextPackage.ACTION_CLASS__ACTION_SEMANTICS:
				return getActionSemantics();
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
			case Uml2contextPackage.ACTION_CLASS__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Uml2contextPackage.ACTION_CLASS__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Uml2contextPackage.ACTION_CLASS__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case Uml2contextPackage.ACTION_CLASS__ACTION_SEMANTICS:
				setActionSemantics((ActionSemantics)newValue);
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
			case Uml2contextPackage.ACTION_CLASS__PRECONDITION:
				getPrecondition().clear();
				return;
			case Uml2contextPackage.ACTION_CLASS__POSTCONDITION:
				getPostcondition().clear();
				return;
			case Uml2contextPackage.ACTION_CLASS__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case Uml2contextPackage.ACTION_CLASS__ACTION_SEMANTICS:
				setActionSemantics(ACTION_SEMANTICS_EDEFAULT);
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
			case Uml2contextPackage.ACTION_CLASS__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case Uml2contextPackage.ACTION_CLASS__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case Uml2contextPackage.ACTION_CLASS__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case Uml2contextPackage.ACTION_CLASS__ACTION_SEMANTICS:
				return actionSemantics != ACTION_SEMANTICS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (actionSemantics: ");
		result.append(actionSemantics);
		result.append(')');
		return result.toString();
	}

} //ActionClassImpl
