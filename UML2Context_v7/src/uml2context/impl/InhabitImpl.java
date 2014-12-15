/**
 */
package uml2context.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml2context.AgentClass;
import uml2context.EnvironmentClass;
import uml2context.Inhabit;
import uml2context.OrganizationClass;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inhabit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.InhabitImpl#getSubOrg <em>Sub Org</em>}</li>
 *   <li>{@link uml2context.impl.InhabitImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml2context.impl.InhabitImpl#getAgentClass <em>Agent Class</em>}</li>
 *   <li>{@link uml2context.impl.InhabitImpl#getOrg <em>Org</em>}</li>
 *   <li>{@link uml2context.impl.InhabitImpl#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InhabitImpl extends DirectedRelationshipImpl implements Inhabit {
	/**
	 * The cached value of the '{@link #getSubOrg() <em>Sub Org</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubOrg()
	 * @generated
	 * @ordered
	 */
	protected OrganizationClass subOrg;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected uml2context.Class class_;

	/**
	 * The cached value of the '{@link #getAgentClass() <em>Agent Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentClass()
	 * @generated
	 * @ordered
	 */
	protected AgentClass agentClass;

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
	 * The cached value of the '{@link #getEnv() <em>Env</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentClass env;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InhabitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.INHABIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationClass getSubOrg() {
		if (subOrg != null && subOrg.eIsProxy()) {
			InternalEObject oldSubOrg = (InternalEObject)subOrg;
			subOrg = (OrganizationClass)eResolveProxy(oldSubOrg);
			if (subOrg != oldSubOrg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.INHABIT__SUB_ORG, oldSubOrg, subOrg));
			}
		}
		return subOrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationClass basicGetSubOrg() {
		return subOrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubOrg(OrganizationClass newSubOrg) {
		OrganizationClass oldSubOrg = subOrg;
		subOrg = newSubOrg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.INHABIT__SUB_ORG, oldSubOrg, subOrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2context.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (uml2context.Class)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.INHABIT__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2context.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(uml2context.Class newClass) {
		uml2context.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.INHABIT__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentClass getAgentClass() {
		if (agentClass != null && agentClass.eIsProxy()) {
			InternalEObject oldAgentClass = (InternalEObject)agentClass;
			agentClass = (AgentClass)eResolveProxy(oldAgentClass);
			if (agentClass != oldAgentClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.INHABIT__AGENT_CLASS, oldAgentClass, agentClass));
			}
		}
		return agentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentClass basicGetAgentClass() {
		return agentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgentClass(AgentClass newAgentClass, NotificationChain msgs) {
		AgentClass oldAgentClass = agentClass;
		agentClass = newAgentClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.INHABIT__AGENT_CLASS, oldAgentClass, newAgentClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentClass(AgentClass newAgentClass) {
		if (newAgentClass != agentClass) {
			NotificationChain msgs = null;
			if (agentClass != null)
				msgs = ((InternalEObject)agentClass).eInverseRemove(this, Uml2contextPackage.AGENT_CLASS__INHABIT, AgentClass.class, msgs);
			if (newAgentClass != null)
				msgs = ((InternalEObject)newAgentClass).eInverseAdd(this, Uml2contextPackage.AGENT_CLASS__INHABIT, AgentClass.class, msgs);
			msgs = basicSetAgentClass(newAgentClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.INHABIT__AGENT_CLASS, newAgentClass, newAgentClass));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.INHABIT__ORG, oldOrg, org));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.INHABIT__ORG, oldOrg, newOrg);
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
				msgs = ((InternalEObject)org).eInverseRemove(this, Uml2contextPackage.ORGANIZATION_CLASS__INHABIT, OrganizationClass.class, msgs);
			if (newOrg != null)
				msgs = ((InternalEObject)newOrg).eInverseAdd(this, Uml2contextPackage.ORGANIZATION_CLASS__INHABIT, OrganizationClass.class, msgs);
			msgs = basicSetOrg(newOrg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.INHABIT__ORG, newOrg, newOrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentClass getEnv() {
		if (env != null && env.eIsProxy()) {
			InternalEObject oldEnv = (InternalEObject)env;
			env = (EnvironmentClass)eResolveProxy(oldEnv);
			if (env != oldEnv) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.INHABIT__ENV, oldEnv, env));
			}
		}
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentClass basicGetEnv() {
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnv(EnvironmentClass newEnv, NotificationChain msgs) {
		EnvironmentClass oldEnv = env;
		env = newEnv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.INHABIT__ENV, oldEnv, newEnv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnv(EnvironmentClass newEnv) {
		if (newEnv != env) {
			NotificationChain msgs = null;
			if (env != null)
				msgs = ((InternalEObject)env).eInverseRemove(this, Uml2contextPackage.ENVIRONMENT_CLASS__INHABIT, EnvironmentClass.class, msgs);
			if (newEnv != null)
				msgs = ((InternalEObject)newEnv).eInverseAdd(this, Uml2contextPackage.ENVIRONMENT_CLASS__INHABIT, EnvironmentClass.class, msgs);
			msgs = basicSetEnv(newEnv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.INHABIT__ENV, newEnv, newEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.INHABIT__AGENT_CLASS:
				if (agentClass != null)
					msgs = ((InternalEObject)agentClass).eInverseRemove(this, Uml2contextPackage.AGENT_CLASS__INHABIT, AgentClass.class, msgs);
				return basicSetAgentClass((AgentClass)otherEnd, msgs);
			case Uml2contextPackage.INHABIT__ORG:
				if (org != null)
					msgs = ((InternalEObject)org).eInverseRemove(this, Uml2contextPackage.ORGANIZATION_CLASS__INHABIT, OrganizationClass.class, msgs);
				return basicSetOrg((OrganizationClass)otherEnd, msgs);
			case Uml2contextPackage.INHABIT__ENV:
				if (env != null)
					msgs = ((InternalEObject)env).eInverseRemove(this, Uml2contextPackage.ENVIRONMENT_CLASS__INHABIT, EnvironmentClass.class, msgs);
				return basicSetEnv((EnvironmentClass)otherEnd, msgs);
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
			case Uml2contextPackage.INHABIT__AGENT_CLASS:
				return basicSetAgentClass(null, msgs);
			case Uml2contextPackage.INHABIT__ORG:
				return basicSetOrg(null, msgs);
			case Uml2contextPackage.INHABIT__ENV:
				return basicSetEnv(null, msgs);
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
			case Uml2contextPackage.INHABIT__SUB_ORG:
				if (resolve) return getSubOrg();
				return basicGetSubOrg();
			case Uml2contextPackage.INHABIT__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case Uml2contextPackage.INHABIT__AGENT_CLASS:
				if (resolve) return getAgentClass();
				return basicGetAgentClass();
			case Uml2contextPackage.INHABIT__ORG:
				if (resolve) return getOrg();
				return basicGetOrg();
			case Uml2contextPackage.INHABIT__ENV:
				if (resolve) return getEnv();
				return basicGetEnv();
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
			case Uml2contextPackage.INHABIT__SUB_ORG:
				setSubOrg((OrganizationClass)newValue);
				return;
			case Uml2contextPackage.INHABIT__CLASS:
				setClass((uml2context.Class)newValue);
				return;
			case Uml2contextPackage.INHABIT__AGENT_CLASS:
				setAgentClass((AgentClass)newValue);
				return;
			case Uml2contextPackage.INHABIT__ORG:
				setOrg((OrganizationClass)newValue);
				return;
			case Uml2contextPackage.INHABIT__ENV:
				setEnv((EnvironmentClass)newValue);
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
			case Uml2contextPackage.INHABIT__SUB_ORG:
				setSubOrg((OrganizationClass)null);
				return;
			case Uml2contextPackage.INHABIT__CLASS:
				setClass((uml2context.Class)null);
				return;
			case Uml2contextPackage.INHABIT__AGENT_CLASS:
				setAgentClass((AgentClass)null);
				return;
			case Uml2contextPackage.INHABIT__ORG:
				setOrg((OrganizationClass)null);
				return;
			case Uml2contextPackage.INHABIT__ENV:
				setEnv((EnvironmentClass)null);
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
			case Uml2contextPackage.INHABIT__SUB_ORG:
				return subOrg != null;
			case Uml2contextPackage.INHABIT__CLASS:
				return class_ != null;
			case Uml2contextPackage.INHABIT__AGENT_CLASS:
				return agentClass != null;
			case Uml2contextPackage.INHABIT__ORG:
				return org != null;
			case Uml2contextPackage.INHABIT__ENV:
				return env != null;
		}
		return super.eIsSet(featureID);
	}

} //InhabitImpl
