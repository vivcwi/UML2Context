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

import uml2context.ObjectRoleClass;
import uml2context.Operation;
import uml2context.Ownership;
import uml2context.Play;
import uml2context.Property;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Role Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.ObjectRoleClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml2context.impl.ObjectRoleClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml2context.impl.ObjectRoleClassImpl#getPlay <em>Play</em>}</li>
 *   <li>{@link uml2context.impl.ObjectRoleClassImpl#getOwnership <em>Ownership</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectRoleClassImpl extends ClassifierImpl implements ObjectRoleClass {
	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

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
	 * The cached value of the '{@link #getPlay() <em>Play</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlay()
	 * @generated
	 * @ordered
	 */
	protected Play play;

	/**
	 * The cached value of the '{@link #getOwnership() <em>Ownership</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnership()
	 * @generated
	 * @ordered
	 */
	protected Ownership ownership;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectRoleClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.OBJECT_ROLE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentEList<Operation>(Operation.class, this, Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_OPERATION);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Play getPlay() {
		if (play != null && play.eIsProxy()) {
			InternalEObject oldPlay = (InternalEObject)play;
			play = (Play)eResolveProxy(oldPlay);
			if (play != oldPlay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY, oldPlay, play));
			}
		}
		return play;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Play basicGetPlay() {
		return play;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlay(Play newPlay, NotificationChain msgs) {
		Play oldPlay = play;
		play = newPlay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY, oldPlay, newPlay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlay(Play newPlay) {
		if (newPlay != play) {
			NotificationChain msgs = null;
			if (play != null)
				msgs = ((InternalEObject)play).eInverseRemove(this, Uml2contextPackage.PLAY__OBJECT_ROLE, Play.class, msgs);
			if (newPlay != null)
				msgs = ((InternalEObject)newPlay).eInverseAdd(this, Uml2contextPackage.PLAY__OBJECT_ROLE, Play.class, msgs);
			msgs = basicSetPlay(newPlay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY, newPlay, newPlay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ownership getOwnership() {
		if (ownership != null && ownership.eIsProxy()) {
			InternalEObject oldOwnership = (InternalEObject)ownership;
			ownership = (Ownership)eResolveProxy(oldOwnership);
			if (ownership != oldOwnership) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP, oldOwnership, ownership));
			}
		}
		return ownership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ownership basicGetOwnership() {
		return ownership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnership(Ownership newOwnership, NotificationChain msgs) {
		Ownership oldOwnership = ownership;
		ownership = newOwnership;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP, oldOwnership, newOwnership);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnership(Ownership newOwnership) {
		if (newOwnership != ownership) {
			NotificationChain msgs = null;
			if (ownership != null)
				msgs = ((InternalEObject)ownership).eInverseRemove(this, Uml2contextPackage.OWNERSHIP__OBJECT_ROLE, Ownership.class, msgs);
			if (newOwnership != null)
				msgs = ((InternalEObject)newOwnership).eInverseAdd(this, Uml2contextPackage.OWNERSHIP__OBJECT_ROLE, Ownership.class, msgs);
			msgs = basicSetOwnership(newOwnership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP, newOwnership, newOwnership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY:
				if (play != null)
					msgs = ((InternalEObject)play).eInverseRemove(this, Uml2contextPackage.PLAY__OBJECT_ROLE, Play.class, msgs);
				return basicSetPlay((Play)otherEnd, msgs);
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP:
				if (ownership != null)
					msgs = ((InternalEObject)ownership).eInverseRemove(this, Uml2contextPackage.OWNERSHIP__OBJECT_ROLE, Ownership.class, msgs);
				return basicSetOwnership((Ownership)otherEnd, msgs);
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
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY:
				return basicSetPlay(null, msgs);
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP:
				return basicSetOwnership(null, msgs);
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
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_OPERATION:
				return getOwnedOperation();
			case Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY:
				if (resolve) return getPlay();
				return basicGetPlay();
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP:
				if (resolve) return getOwnership();
				return basicGetOwnership();
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
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY:
				setPlay((Play)newValue);
				return;
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP:
				setOwnership((Ownership)newValue);
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
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY:
				setPlay((Play)null);
				return;
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP:
				setOwnership((Ownership)null);
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
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY:
				return play != null;
			case Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP:
				return ownership != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectRoleClassImpl
