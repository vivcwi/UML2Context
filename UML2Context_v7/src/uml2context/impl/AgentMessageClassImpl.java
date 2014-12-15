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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2context.AgentClass;
import uml2context.AgentMessageClass;
import uml2context.AgentRoleClass;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Message Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.AgentMessageClassImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link uml2context.impl.AgentMessageClassImpl#getRoleSender <em>Role Sender</em>}</li>
 *   <li>{@link uml2context.impl.AgentMessageClassImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link uml2context.impl.AgentMessageClassImpl#getRoleReceiver <em>Role Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentMessageClassImpl extends NamedElementImpl implements AgentMessageClass {
	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected AgentClass sender;

	/**
	 * The cached value of the '{@link #getRoleSender() <em>Role Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleSender()
	 * @generated
	 * @ordered
	 */
	protected AgentRoleClass roleSender;

	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<AgentClass> receiver;

	/**
	 * The cached value of the '{@link #getRoleReceiver() <em>Role Receiver</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleReceiver()
	 * @generated
	 * @ordered
	 */
	protected EList<AgentRoleClass> roleReceiver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentMessageClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.AGENT_MESSAGE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentClass getSender() {
		if (sender != null && sender.eIsProxy()) {
			InternalEObject oldSender = (InternalEObject)sender;
			sender = (AgentClass)eResolveProxy(oldSender);
			if (sender != oldSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.AGENT_MESSAGE_CLASS__SENDER, oldSender, sender));
			}
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentClass basicGetSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(AgentClass newSender, NotificationChain msgs) {
		AgentClass oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_MESSAGE_CLASS__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(AgentClass newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, Uml2contextPackage.AGENT_CLASS__SENT_MESSAGE, AgentClass.class, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, Uml2contextPackage.AGENT_CLASS__SENT_MESSAGE, AgentClass.class, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_MESSAGE_CLASS__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentRoleClass getRoleSender() {
		if (roleSender != null && roleSender.eIsProxy()) {
			InternalEObject oldRoleSender = (InternalEObject)roleSender;
			roleSender = (AgentRoleClass)eResolveProxy(oldRoleSender);
			if (roleSender != oldRoleSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.AGENT_MESSAGE_CLASS__ROLE_SENDER, oldRoleSender, roleSender));
			}
		}
		return roleSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentRoleClass basicGetRoleSender() {
		return roleSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleSender(AgentRoleClass newRoleSender) {
		AgentRoleClass oldRoleSender = roleSender;
		roleSender = newRoleSender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_MESSAGE_CLASS__ROLE_SENDER, oldRoleSender, roleSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentClass> getReceiver() {
		if (receiver == null) {
			receiver = new EObjectWithInverseResolvingEList.ManyInverse<AgentClass>(AgentClass.class, this, Uml2contextPackage.AGENT_MESSAGE_CLASS__RECEIVER, Uml2contextPackage.AGENT_CLASS__RECEIVE_MESSAGE);
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentRoleClass> getRoleReceiver() {
		if (roleReceiver == null) {
			roleReceiver = new EObjectResolvingEList<AgentRoleClass>(AgentRoleClass.class, this, Uml2contextPackage.AGENT_MESSAGE_CLASS__ROLE_RECEIVER);
		}
		return roleReceiver;
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
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__SENDER:
				if (sender != null)
					msgs = ((InternalEObject)sender).eInverseRemove(this, Uml2contextPackage.AGENT_CLASS__SENT_MESSAGE, AgentClass.class, msgs);
				return basicSetSender((AgentClass)otherEnd, msgs);
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__RECEIVER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceiver()).basicAdd(otherEnd, msgs);
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
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__SENDER:
				return basicSetSender(null, msgs);
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__RECEIVER:
				return ((InternalEList<?>)getReceiver()).basicRemove(otherEnd, msgs);
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
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__SENDER:
				if (resolve) return getSender();
				return basicGetSender();
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__ROLE_SENDER:
				if (resolve) return getRoleSender();
				return basicGetRoleSender();
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__RECEIVER:
				return getReceiver();
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__ROLE_RECEIVER:
				return getRoleReceiver();
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
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__SENDER:
				setSender((AgentClass)newValue);
				return;
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__ROLE_SENDER:
				setRoleSender((AgentRoleClass)newValue);
				return;
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__RECEIVER:
				getReceiver().clear();
				getReceiver().addAll((Collection<? extends AgentClass>)newValue);
				return;
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__ROLE_RECEIVER:
				getRoleReceiver().clear();
				getRoleReceiver().addAll((Collection<? extends AgentRoleClass>)newValue);
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
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__SENDER:
				setSender((AgentClass)null);
				return;
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__ROLE_SENDER:
				setRoleSender((AgentRoleClass)null);
				return;
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__RECEIVER:
				getReceiver().clear();
				return;
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__ROLE_RECEIVER:
				getRoleReceiver().clear();
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
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__SENDER:
				return sender != null;
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__ROLE_SENDER:
				return roleSender != null;
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__RECEIVER:
				return receiver != null && !receiver.isEmpty();
			case Uml2contextPackage.AGENT_MESSAGE_CLASS__ROLE_RECEIVER:
				return roleReceiver != null && !roleReceiver.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentMessageClassImpl
