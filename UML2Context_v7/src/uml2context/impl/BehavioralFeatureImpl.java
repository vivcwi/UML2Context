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

import uml2context.BehavioralFeature;
import uml2context.Parameter;
import uml2context.Type;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.BehavioralFeatureImpl#getOwnedParamenter <em>Owned Paramenter</em>}</li>
 *   <li>{@link uml2context.impl.BehavioralFeatureImpl#getRaisedException <em>Raised Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehavioralFeatureImpl extends FeatureImpl implements BehavioralFeature {
	/**
	 * The cached value of the '{@link #getOwnedParamenter() <em>Owned Paramenter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParamenter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParamenter;

	/**
	 * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> raisedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.BEHAVIORAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParamenter() {
		if (ownedParamenter == null) {
			ownedParamenter = new EObjectContainmentEList<Parameter>(Parameter.class, this, Uml2contextPackage.BEHAVIORAL_FEATURE__OWNED_PARAMENTER);
		}
		return ownedParamenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRaisedException() {
		if (raisedException == null) {
			raisedException = new EObjectContainmentEList<Type>(Type.class, this, Uml2contextPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
		}
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.BEHAVIORAL_FEATURE__OWNED_PARAMENTER:
				return ((InternalEList<?>)getOwnedParamenter()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return ((InternalEList<?>)getRaisedException()).basicRemove(otherEnd, msgs);
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
			case Uml2contextPackage.BEHAVIORAL_FEATURE__OWNED_PARAMENTER:
				return getOwnedParamenter();
			case Uml2contextPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return getRaisedException();
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
			case Uml2contextPackage.BEHAVIORAL_FEATURE__OWNED_PARAMENTER:
				getOwnedParamenter().clear();
				getOwnedParamenter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case Uml2contextPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				getRaisedException().clear();
				getRaisedException().addAll((Collection<? extends Type>)newValue);
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
			case Uml2contextPackage.BEHAVIORAL_FEATURE__OWNED_PARAMENTER:
				getOwnedParamenter().clear();
				return;
			case Uml2contextPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				getRaisedException().clear();
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
			case Uml2contextPackage.BEHAVIORAL_FEATURE__OWNED_PARAMENTER:
				return ownedParamenter != null && !ownedParamenter.isEmpty();
			case Uml2contextPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
				return raisedException != null && !raisedException.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehavioralFeatureImpl
