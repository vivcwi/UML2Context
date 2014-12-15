/**
 */
package uml2context.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2context.EnvironmentClass;
import uml2context.Inhabit;
import uml2context.Operation;
import uml2context.Property;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.EnvironmentClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml2context.impl.EnvironmentClassImpl#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link uml2context.impl.EnvironmentClassImpl#getInhabit <em>Inhabit</em>}</li>
 *   <li>{@link uml2context.impl.EnvironmentClassImpl#getOwnedClass <em>Owned Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentClassImpl extends ClassifierImpl implements EnvironmentClass {
	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The cached value of the '{@link #getOwnedProperty() <em>Owned Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedProperty;

	/**
	 * The cached value of the '{@link #getInhabit() <em>Inhabit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhabit()
	 * @generated
	 * @ordered
	 */
	protected EList<Inhabit> inhabit;

	/**
	 * The cached value of the '{@link #getOwnedClass() <em>Owned Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedClass()
	 * @generated
	 * @ordered
	 */
	protected EList<uml2context.Class> ownedClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.ENVIRONMENT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentEList<Operation>(Operation.class, this, Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_OPERATION);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedProperty() {
		if (ownedProperty == null) {
			ownedProperty = new EObjectContainmentEList<Property>(Property.class, this, Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_PROPERTY);
		}
		return ownedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inhabit> getInhabit() {
		if (inhabit == null) {
			inhabit = new EObjectWithInverseResolvingEList<Inhabit>(Inhabit.class, this, Uml2contextPackage.ENVIRONMENT_CLASS__INHABIT, Uml2contextPackage.INHABIT__ENV);
		}
		return inhabit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uml2context.Class> getOwnedClass() {
		if (ownedClass == null) {
			ownedClass = new EObjectContainmentEList<uml2context.Class>(uml2context.Class.class, this, Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_CLASS);
		}
		return ownedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.ENVIRONMENT_CLASS__INHABIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInhabit()).basicAdd(otherEnd, msgs);
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
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_PROPERTY:
				return ((InternalEList<?>)getOwnedProperty()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ENVIRONMENT_CLASS__INHABIT:
				return ((InternalEList<?>)getInhabit()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_CLASS:
				return ((InternalEList<?>)getOwnedClass()).basicRemove(otherEnd, msgs);
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
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_OPERATION:
				return getOwnedOperation();
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_PROPERTY:
				return getOwnedProperty();
			case Uml2contextPackage.ENVIRONMENT_CLASS__INHABIT:
				return getInhabit();
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_CLASS:
				return getOwnedClass();
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
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_PROPERTY:
				getOwnedProperty().clear();
				getOwnedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case Uml2contextPackage.ENVIRONMENT_CLASS__INHABIT:
				getInhabit().clear();
				getInhabit().addAll((Collection<? extends Inhabit>)newValue);
				return;
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_CLASS:
				getOwnedClass().clear();
				getOwnedClass().addAll((Collection<? extends uml2context.Class>)newValue);
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
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_PROPERTY:
				getOwnedProperty().clear();
				return;
			case Uml2contextPackage.ENVIRONMENT_CLASS__INHABIT:
				getInhabit().clear();
				return;
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_CLASS:
				getOwnedClass().clear();
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
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_PROPERTY:
				return ownedProperty != null && !ownedProperty.isEmpty();
			case Uml2contextPackage.ENVIRONMENT_CLASS__INHABIT:
				return inhabit != null && !inhabit.isEmpty();
			case Uml2contextPackage.ENVIRONMENT_CLASS__OWNED_CLASS:
				return ownedClass != null && !ownedClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentClassImpl
