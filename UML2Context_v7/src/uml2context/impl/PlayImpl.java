/**
 */
package uml2context.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml2context.AgentClass;
import uml2context.AgentRoleClass;
import uml2context.ObjectRoleClass;
import uml2context.OrganizationClass;
import uml2context.Play;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Play</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.PlayImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link uml2context.impl.PlayImpl#getAgentRole <em>Agent Role</em>}</li>
 *   <li>{@link uml2context.impl.PlayImpl#getObjectRole <em>Object Role</em>}</li>
 *   <li>{@link uml2context.impl.PlayImpl#getOrg <em>Org</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayImpl extends DirectedRelationshipImpl implements Play {
	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected AgentClass agent;

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
	 * The cached value of the '{@link #getOrg() <em>Org</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrg()
	 * @generated
	 * @ordered
	 */
	protected OrganizationClass org;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.PLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentClass getAgent() {
		if (agent != null && agent.eIsProxy()) {
			InternalEObject oldAgent = (InternalEObject)agent;
			agent = (AgentClass)eResolveProxy(oldAgent);
			if (agent != oldAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.PLAY__AGENT, oldAgent, agent));
			}
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentClass basicGetAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(AgentClass newAgent, NotificationChain msgs) {
		AgentClass oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.PLAY__AGENT, oldAgent, newAgent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(AgentClass newAgent) {
		if (newAgent != agent) {
			NotificationChain msgs = null;
			if (agent != null)
				msgs = ((InternalEObject)agent).eInverseRemove(this, Uml2contextPackage.AGENT_CLASS__PLAY, AgentClass.class, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject)newAgent).eInverseAdd(this, Uml2contextPackage.AGENT_CLASS__PLAY, AgentClass.class, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.PLAY__AGENT, newAgent, newAgent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.PLAY__AGENT_ROLE, oldAgentRole, agentRole));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.PLAY__AGENT_ROLE, oldAgentRole, newAgentRole);
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
				msgs = ((InternalEObject)agentRole).eInverseRemove(this, Uml2contextPackage.AGENT_ROLE_CLASS__PLAY, AgentRoleClass.class, msgs);
			if (newAgentRole != null)
				msgs = ((InternalEObject)newAgentRole).eInverseAdd(this, Uml2contextPackage.AGENT_ROLE_CLASS__PLAY, AgentRoleClass.class, msgs);
			msgs = basicSetAgentRole(newAgentRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.PLAY__AGENT_ROLE, newAgentRole, newAgentRole));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.PLAY__OBJECT_ROLE, oldObjectRole, objectRole));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.PLAY__OBJECT_ROLE, oldObjectRole, newObjectRole);
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
				msgs = ((InternalEObject)objectRole).eInverseRemove(this, Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY, ObjectRoleClass.class, msgs);
			if (newObjectRole != null)
				msgs = ((InternalEObject)newObjectRole).eInverseAdd(this, Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY, ObjectRoleClass.class, msgs);
			msgs = basicSetObjectRole(newObjectRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.PLAY__OBJECT_ROLE, newObjectRole, newObjectRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationClass getOrg() {
		if (org != null && org.eIsProxy()) {
			InternalEObject oldOrg = (InternalEObject)org;
			org = (OrganizationClass)eResolveProxy(oldOrg);
			if (org != oldOrg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.PLAY__ORG, oldOrg, org));
			}
		}
		return org;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationClass basicGetOrg() {
		return org;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrg(OrganizationClass newOrg, NotificationChain msgs) {
		OrganizationClass oldOrg = org;
		org = newOrg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.PLAY__ORG, oldOrg, newOrg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrg(OrganizationClass newOrg) {
		if (newOrg != org) {
			NotificationChain msgs = null;
			if (org != null)
				msgs = ((InternalEObject)org).eInverseRemove(this, Uml2contextPackage.ORGANIZATION_CLASS__PLAY_IN, OrganizationClass.class, msgs);
			if (newOrg != null)
				msgs = ((InternalEObject)newOrg).eInverseAdd(this, Uml2contextPackage.ORGANIZATION_CLASS__PLAY_IN, OrganizationClass.class, msgs);
			msgs = basicSetOrg(newOrg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.PLAY__ORG, newOrg, newOrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.PLAY__AGENT:
				if (agent != null)
					msgs = ((InternalEObject)agent).eInverseRemove(this, Uml2contextPackage.AGENT_CLASS__PLAY, AgentClass.class, msgs);
				return basicSetAgent((AgentClass)otherEnd, msgs);
			case Uml2contextPackage.PLAY__AGENT_ROLE:
				if (agentRole != null)
					msgs = ((InternalEObject)agentRole).eInverseRemove(this, Uml2contextPackage.AGENT_ROLE_CLASS__PLAY, AgentRoleClass.class, msgs);
				return basicSetAgentRole((AgentRoleClass)otherEnd, msgs);
			case Uml2contextPackage.PLAY__OBJECT_ROLE:
				if (objectRole != null)
					msgs = ((InternalEObject)objectRole).eInverseRemove(this, Uml2contextPackage.OBJECT_ROLE_CLASS__PLAY, ObjectRoleClass.class, msgs);
				return basicSetObjectRole((ObjectRoleClass)otherEnd, msgs);
			case Uml2contextPackage.PLAY__ORG:
				if (org != null)
					msgs = ((InternalEObject)org).eInverseRemove(this, Uml2contextPackage.ORGANIZATION_CLASS__PLAY_IN, OrganizationClass.class, msgs);
				return basicSetOrg((OrganizationClass)otherEnd, msgs);
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
			case Uml2contextPackage.PLAY__AGENT:
				return basicSetAgent(null, msgs);
			case Uml2contextPackage.PLAY__AGENT_ROLE:
				return basicSetAgentRole(null, msgs);
			case Uml2contextPackage.PLAY__OBJECT_ROLE:
				return basicSetObjectRole(null, msgs);
			case Uml2contextPackage.PLAY__ORG:
				return basicSetOrg(null, msgs);
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
			case Uml2contextPackage.PLAY__AGENT:
				if (resolve) return getAgent();
				return basicGetAgent();
			case Uml2contextPackage.PLAY__AGENT_ROLE:
				if (resolve) return getAgentRole();
				return basicGetAgentRole();
			case Uml2contextPackage.PLAY__OBJECT_ROLE:
				if (resolve) return getObjectRole();
				return basicGetObjectRole();
			case Uml2contextPackage.PLAY__ORG:
				if (resolve) return getOrg();
				return basicGetOrg();
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
			case Uml2contextPackage.PLAY__AGENT:
				setAgent((AgentClass)newValue);
				return;
			case Uml2contextPackage.PLAY__AGENT_ROLE:
				setAgentRole((AgentRoleClass)newValue);
				return;
			case Uml2contextPackage.PLAY__OBJECT_ROLE:
				setObjectRole((ObjectRoleClass)newValue);
				return;
			case Uml2contextPackage.PLAY__ORG:
				setOrg((OrganizationClass)newValue);
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
			case Uml2contextPackage.PLAY__AGENT:
				setAgent((AgentClass)null);
				return;
			case Uml2contextPackage.PLAY__AGENT_ROLE:
				setAgentRole((AgentRoleClass)null);
				return;
			case Uml2contextPackage.PLAY__OBJECT_ROLE:
				setObjectRole((ObjectRoleClass)null);
				return;
			case Uml2contextPackage.PLAY__ORG:
				setOrg((OrganizationClass)null);
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
			case Uml2contextPackage.PLAY__AGENT:
				return agent != null;
			case Uml2contextPackage.PLAY__AGENT_ROLE:
				return agentRole != null;
			case Uml2contextPackage.PLAY__OBJECT_ROLE:
				return objectRole != null;
			case Uml2contextPackage.PLAY__ORG:
				return org != null;
		}
		return super.eIsSet(featureID);
	}

} //PlayImpl
