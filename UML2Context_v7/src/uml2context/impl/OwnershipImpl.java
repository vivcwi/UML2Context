/**
 */
package uml2context.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml2context.AgentRoleClass;
import uml2context.ObjectRoleClass;
import uml2context.OrganizationClass;
import uml2context.Ownership;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ownership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.OwnershipImpl#getAgentRole <em>Agent Role</em>}</li>
 *   <li>{@link uml2context.impl.OwnershipImpl#getObjectRole <em>Object Role</em>}</li>
 *   <li>{@link uml2context.impl.OwnershipImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnershipImpl extends DirectedRelationshipImpl implements Ownership {
	/**
	 * The cached value of the '{@link #getAgentRole() <em>Agent Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentRole()
	 * @generated
	 * @ordered
	 */
	protected AgentRoleClass agentRole;

	/**
	 * The cached value of the '{@link #getObjectRole() <em>Object Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRole()
	 * @generated
	 * @ordered
	 */
	protected ObjectRoleClass objectRole;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected OrganizationClass owner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.OWNERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentRoleClass getAgentRole() {
		if (agentRole != null && agentRole.eIsProxy()) {
			InternalEObject oldAgentRole = (InternalEObject)agentRole;
			agentRole = (AgentRoleClass)eResolveProxy(oldAgentRole);
			if (agentRole != oldAgentRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.OWNERSHIP__AGENT_ROLE, oldAgentRole, agentRole));
			}
		}
		return agentRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentRoleClass basicGetAgentRole() {
		return agentRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgentRole(AgentRoleClass newAgentRole, NotificationChain msgs) {
		AgentRoleClass oldAgentRole = agentRole;
		agentRole = newAgentRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OWNERSHIP__AGENT_ROLE, oldAgentRole, newAgentRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentRole(AgentRoleClass newAgentRole) {
		if (newAgentRole != agentRole) {
			NotificationChain msgs = null;
			if (agentRole != null)
				msgs = ((InternalEObject)agentRole).eInverseRemove(this, Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP, AgentRoleClass.class, msgs);
			if (newAgentRole != null)
				msgs = ((InternalEObject)newAgentRole).eInverseAdd(this, Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP, AgentRoleClass.class, msgs);
			msgs = basicSetAgentRole(newAgentRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OWNERSHIP__AGENT_ROLE, newAgentRole, newAgentRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRoleClass getObjectRole() {
		if (objectRole != null && objectRole.eIsProxy()) {
			InternalEObject oldObjectRole = (InternalEObject)objectRole;
			objectRole = (ObjectRoleClass)eResolveProxy(oldObjectRole);
			if (objectRole != oldObjectRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.OWNERSHIP__OBJECT_ROLE, oldObjectRole, objectRole));
			}
		}
		return objectRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRoleClass basicGetObjectRole() {
		return objectRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectRole(ObjectRoleClass newObjectRole, NotificationChain msgs) {
		ObjectRoleClass oldObjectRole = objectRole;
		objectRole = newObjectRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OWNERSHIP__OBJECT_ROLE, oldObjectRole, newObjectRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectRole(ObjectRoleClass newObjectRole) {
		if (newObjectRole != objectRole) {
			NotificationChain msgs = null;
			if (objectRole != null)
				msgs = ((InternalEObject)objectRole).eInverseRemove(this, Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP, ObjectRoleClass.class, msgs);
			if (newObjectRole != null)
				msgs = ((InternalEObject)newObjectRole).eInverseAdd(this, Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP, ObjectRoleClass.class, msgs);
			msgs = basicSetObjectRole(newObjectRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OWNERSHIP__OBJECT_ROLE, newObjectRole, newObjectRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationClass getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (OrganizationClass)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.OWNERSHIP__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationClass basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(OrganizationClass newOwner, NotificationChain msgs) {
		OrganizationClass oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OWNERSHIP__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(OrganizationClass newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, Uml2contextPackage.ORGANIZATION_CLASS__OWNERSHIP, OrganizationClass.class, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, Uml2contextPackage.ORGANIZATION_CLASS__OWNERSHIP, OrganizationClass.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OWNERSHIP__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.OWNERSHIP__AGENT_ROLE:
				if (agentRole != null)
					msgs = ((InternalEObject)agentRole).eInverseRemove(this, Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP, AgentRoleClass.class, msgs);
				return basicSetAgentRole((AgentRoleClass)otherEnd, msgs);
			case Uml2contextPackage.OWNERSHIP__OBJECT_ROLE:
				if (objectRole != null)
					msgs = ((InternalEObject)objectRole).eInverseRemove(this, Uml2contextPackage.OBJECT_ROLE_CLASS__OWNERSHIP, ObjectRoleClass.class, msgs);
				return basicSetObjectRole((ObjectRoleClass)otherEnd, msgs);
			case Uml2contextPackage.OWNERSHIP__OWNER:
				if (owner != null)
					msgs = ((InternalEObject)owner).eInverseRemove(this, Uml2contextPackage.ORGANIZATION_CLASS__OWNERSHIP, OrganizationClass.class, msgs);
				return basicSetOwner((OrganizationClass)otherEnd, msgs);
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
			case Uml2contextPackage.OWNERSHIP__AGENT_ROLE:
				return basicSetAgentRole(null, msgs);
			case Uml2contextPackage.OWNERSHIP__OBJECT_ROLE:
				return basicSetObjectRole(null, msgs);
			case Uml2contextPackage.OWNERSHIP__OWNER:
				return basicSetOwner(null, msgs);
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
			case Uml2contextPackage.OWNERSHIP__AGENT_ROLE:
				if (resolve) return getAgentRole();
				return basicGetAgentRole();
			case Uml2contextPackage.OWNERSHIP__OBJECT_ROLE:
				if (resolve) return getObjectRole();
				return basicGetObjectRole();
			case Uml2contextPackage.OWNERSHIP__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
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
			case Uml2contextPackage.OWNERSHIP__AGENT_ROLE:
				setAgentRole((AgentRoleClass)newValue);
				return;
			case Uml2contextPackage.OWNERSHIP__OBJECT_ROLE:
				setObjectRole((ObjectRoleClass)newValue);
				return;
			case Uml2contextPackage.OWNERSHIP__OWNER:
				setOwner((OrganizationClass)newValue);
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
			case Uml2contextPackage.OWNERSHIP__AGENT_ROLE:
				setAgentRole((AgentRoleClass)null);
				return;
			case Uml2contextPackage.OWNERSHIP__OBJECT_ROLE:
				setObjectRole((ObjectRoleClass)null);
				return;
			case Uml2contextPackage.OWNERSHIP__OWNER:
				setOwner((OrganizationClass)null);
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
			case Uml2contextPackage.OWNERSHIP__AGENT_ROLE:
				return agentRole != null;
			case Uml2contextPackage.OWNERSHIP__OBJECT_ROLE:
				return objectRole != null;
			case Uml2contextPackage.OWNERSHIP__OWNER:
				return owner != null;
		}
		return super.eIsSet(featureID);
	}

} //OwnershipImpl
