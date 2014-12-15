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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2context.ActionClass;
import uml2context.AgentMessageClass;
import uml2context.AgentRoleClass;
import uml2context.Inhabit;
import uml2context.ObjectRoleClass;
import uml2context.OrganizationClass;
import uml2context.Ownership;
import uml2context.PlanClass;
import uml2context.Play;
import uml2context.Property;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getOwnedGoal <em>Owned Goal</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getOwnedBelief <em>Owned Belief</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getOwnedPlan <em>Owned Plan</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getSentMessage <em>Sent Message</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getInhabit <em>Inhabit</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getPlay <em>Play</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getOwnership <em>Ownership</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getPlay_in <em>Play in</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getOwnedAgentRole <em>Owned Agent Role</em>}</li>
 *   <li>{@link uml2context.impl.OrganizationClassImpl#getOwenedObjectRole <em>Owened Object Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationClassImpl extends ClassifierImpl implements OrganizationClass {
	/**
	 * The cached value of the '{@link #getOwnedGoal() <em>Owned Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedGoal;

	/**
	 * The cached value of the '{@link #getOwnedBelief() <em>Owned Belief</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBelief()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedBelief;

	/**
	 * The cached value of the '{@link #getOwnedPlan() <em>Owned Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPlan()
	 * @generated
	 * @ordered
	 */
	protected EList<PlanClass> ownedPlan;

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
	 * The cached value of the '{@link #getSentMessage() <em>Sent Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<AgentMessageClass> sentMessage;

	/**
	 * The cached value of the '{@link #getReceiveMessage() <em>Receive Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<AgentMessageClass> receiveMessage;

	/**
	 * The cached value of the '{@link #getInhabit() <em>Inhabit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhabit()
	 * @generated
	 * @ordered
	 */
	protected Inhabit inhabit;

	/**
	 * The cached value of the '{@link #getPlay() <em>Play</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlay()
	 * @generated
	 * @ordered
	 */
	protected EList<Play> play;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationClass> superClass;

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
	 * The cached value of the '{@link #getOwnership() <em>Ownership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnership()
	 * @generated
	 * @ordered
	 */
	protected EList<Ownership> ownership;

	/**
	 * The cached value of the '{@link #getPlay_in() <em>Play in</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlay_in()
	 * @generated
	 * @ordered
	 */
	protected EList<Play> play_in;

	/**
	 * The cached value of the '{@link #getOwnedAgentRole() <em>Owned Agent Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAgentRole()
	 * @generated
	 * @ordered
	 */
	protected AgentRoleClass ownedAgentRole;

	/**
	 * The cached value of the '{@link #getOwenedObjectRole() <em>Owened Object Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwenedObjectRole()
	 * @generated
	 * @ordered
	 */
	protected ObjectRoleClass owenedObjectRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.ORGANIZATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedGoal() {
		if (ownedGoal == null) {
			ownedGoal = new EObjectContainmentEList<Property>(Property.class, this, Uml2contextPackage.ORGANIZATION_CLASS__OWNED_GOAL);
		}
		return ownedGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedBelief() {
		if (ownedBelief == null) {
			ownedBelief = new EObjectContainmentEList<Property>(Property.class, this, Uml2contextPackage.ORGANIZATION_CLASS__OWNED_BELIEF);
		}
		return ownedBelief;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlanClass> getOwnedPlan() {
		if (ownedPlan == null) {
			ownedPlan = new EObjectContainmentEList<PlanClass>(PlanClass.class, this, Uml2contextPackage.ORGANIZATION_CLASS__OWNED_PLAN);
		}
		return ownedPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionClass> getOwnedAction() {
		if (ownedAction == null) {
			ownedAction = new EObjectContainmentEList<ActionClass>(ActionClass.class, this, Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ACTION);
		}
		return ownedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentMessageClass> getSentMessage() {
		if (sentMessage == null) {
			sentMessage = new EObjectResolvingEList<AgentMessageClass>(AgentMessageClass.class, this, Uml2contextPackage.ORGANIZATION_CLASS__SENT_MESSAGE);
		}
		return sentMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentMessageClass> getReceiveMessage() {
		if (receiveMessage == null) {
			receiveMessage = new EObjectResolvingEList<AgentMessageClass>(AgentMessageClass.class, this, Uml2contextPackage.ORGANIZATION_CLASS__RECEIVE_MESSAGE);
		}
		return receiveMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inhabit getInhabit() {
		if (inhabit != null && inhabit.eIsProxy()) {
			InternalEObject oldInhabit = (InternalEObject)inhabit;
			inhabit = (Inhabit)eResolveProxy(oldInhabit);
			if (inhabit != oldInhabit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.ORGANIZATION_CLASS__INHABIT, oldInhabit, inhabit));
			}
		}
		return inhabit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inhabit basicGetInhabit() {
		return inhabit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInhabit(Inhabit newInhabit, NotificationChain msgs) {
		Inhabit oldInhabit = inhabit;
		inhabit = newInhabit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ORGANIZATION_CLASS__INHABIT, oldInhabit, newInhabit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInhabit(Inhabit newInhabit) {
		if (newInhabit != inhabit) {
			NotificationChain msgs = null;
			if (inhabit != null)
				msgs = ((InternalEObject)inhabit).eInverseRemove(this, Uml2contextPackage.INHABIT__ORG, Inhabit.class, msgs);
			if (newInhabit != null)
				msgs = ((InternalEObject)newInhabit).eInverseAdd(this, Uml2contextPackage.INHABIT__ORG, Inhabit.class, msgs);
			msgs = basicSetInhabit(newInhabit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ORGANIZATION_CLASS__INHABIT, newInhabit, newInhabit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Play> getPlay() {
		if (play == null) {
			play = new EObjectResolvingEList<Play>(Play.class, this, Uml2contextPackage.ORGANIZATION_CLASS__PLAY);
		}
		return play;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationClass> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectResolvingEList<OrganizationClass>(OrganizationClass.class, this, Uml2contextPackage.ORGANIZATION_CLASS__SUPER_CLASS);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ownership> getOwnership() {
		if (ownership == null) {
			ownership = new EObjectWithInverseResolvingEList<Ownership>(Ownership.class, this, Uml2contextPackage.ORGANIZATION_CLASS__OWNERSHIP, Uml2contextPackage.OWNERSHIP__OWNER);
		}
		return ownership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Play> getPlay_in() {
		if (play_in == null) {
			play_in = new EObjectWithInverseResolvingEList<Play>(Play.class, this, Uml2contextPackage.ORGANIZATION_CLASS__PLAY_IN, Uml2contextPackage.PLAY__ORG);
		}
		return play_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentRoleClass getOwnedAgentRole() {
		return ownedAgentRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedAgentRole(AgentRoleClass newOwnedAgentRole, NotificationChain msgs) {
		AgentRoleClass oldOwnedAgentRole = ownedAgentRole;
		ownedAgentRole = newOwnedAgentRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ORGANIZATION_CLASS__OWNED_AGENT_ROLE, oldOwnedAgentRole, newOwnedAgentRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedAgentRole(AgentRoleClass newOwnedAgentRole) {
		if (newOwnedAgentRole != ownedAgentRole) {
			NotificationChain msgs = null;
			if (ownedAgentRole != null)
				msgs = ((InternalEObject)ownedAgentRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2contextPackage.ORGANIZATION_CLASS__OWNED_AGENT_ROLE, null, msgs);
			if (newOwnedAgentRole != null)
				msgs = ((InternalEObject)newOwnedAgentRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Uml2contextPackage.ORGANIZATION_CLASS__OWNED_AGENT_ROLE, null, msgs);
			msgs = basicSetOwnedAgentRole(newOwnedAgentRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ORGANIZATION_CLASS__OWNED_AGENT_ROLE, newOwnedAgentRole, newOwnedAgentRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRoleClass getOwenedObjectRole() {
		return owenedObjectRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwenedObjectRole(ObjectRoleClass newOwenedObjectRole, NotificationChain msgs) {
		ObjectRoleClass oldOwenedObjectRole = owenedObjectRole;
		owenedObjectRole = newOwenedObjectRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE, oldOwenedObjectRole, newOwenedObjectRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwenedObjectRole(ObjectRoleClass newOwenedObjectRole) {
		if (newOwenedObjectRole != owenedObjectRole) {
			NotificationChain msgs = null;
			if (owenedObjectRole != null)
				msgs = ((InternalEObject)owenedObjectRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2contextPackage.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE, null, msgs);
			if (newOwenedObjectRole != null)
				msgs = ((InternalEObject)newOwenedObjectRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Uml2contextPackage.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE, null, msgs);
			msgs = basicSetOwenedObjectRole(newOwenedObjectRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE, newOwenedObjectRole, newOwenedObjectRole));
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
			case Uml2contextPackage.ORGANIZATION_CLASS__INHABIT:
				if (inhabit != null)
					msgs = ((InternalEObject)inhabit).eInverseRemove(this, Uml2contextPackage.INHABIT__ORG, Inhabit.class, msgs);
				return basicSetInhabit((Inhabit)otherEnd, msgs);
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnership()).basicAdd(otherEnd, msgs);
			case Uml2contextPackage.ORGANIZATION_CLASS__PLAY_IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlay_in()).basicAdd(otherEnd, msgs);
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
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_GOAL:
				return ((InternalEList<?>)getOwnedGoal()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_BELIEF:
				return ((InternalEList<?>)getOwnedBelief()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_PLAN:
				return ((InternalEList<?>)getOwnedPlan()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ACTION:
				return ((InternalEList<?>)getOwnedAction()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ORGANIZATION_CLASS__INHABIT:
				return basicSetInhabit(null, msgs);
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNERSHIP:
				return ((InternalEList<?>)getOwnership()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ORGANIZATION_CLASS__PLAY_IN:
				return ((InternalEList<?>)getPlay_in()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_AGENT_ROLE:
				return basicSetOwnedAgentRole(null, msgs);
			case Uml2contextPackage.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE:
				return basicSetOwenedObjectRole(null, msgs);
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
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_GOAL:
				return getOwnedGoal();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_BELIEF:
				return getOwnedBelief();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_PLAN:
				return getOwnedPlan();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ACTION:
				return getOwnedAction();
			case Uml2contextPackage.ORGANIZATION_CLASS__SENT_MESSAGE:
				return getSentMessage();
			case Uml2contextPackage.ORGANIZATION_CLASS__RECEIVE_MESSAGE:
				return getReceiveMessage();
			case Uml2contextPackage.ORGANIZATION_CLASS__INHABIT:
				if (resolve) return getInhabit();
				return basicGetInhabit();
			case Uml2contextPackage.ORGANIZATION_CLASS__PLAY:
				return getPlay();
			case Uml2contextPackage.ORGANIZATION_CLASS__SUPER_CLASS:
				return getSuperClass();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNERSHIP:
				return getOwnership();
			case Uml2contextPackage.ORGANIZATION_CLASS__PLAY_IN:
				return getPlay_in();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_AGENT_ROLE:
				return getOwnedAgentRole();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE:
				return getOwenedObjectRole();
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
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_GOAL:
				getOwnedGoal().clear();
				getOwnedGoal().addAll((Collection<? extends Property>)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_BELIEF:
				getOwnedBelief().clear();
				getOwnedBelief().addAll((Collection<? extends Property>)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_PLAN:
				getOwnedPlan().clear();
				getOwnedPlan().addAll((Collection<? extends PlanClass>)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ACTION:
				getOwnedAction().clear();
				getOwnedAction().addAll((Collection<? extends ActionClass>)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__SENT_MESSAGE:
				getSentMessage().clear();
				getSentMessage().addAll((Collection<? extends AgentMessageClass>)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__RECEIVE_MESSAGE:
				getReceiveMessage().clear();
				getReceiveMessage().addAll((Collection<? extends AgentMessageClass>)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__INHABIT:
				setInhabit((Inhabit)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__PLAY:
				getPlay().clear();
				getPlay().addAll((Collection<? extends Play>)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends OrganizationClass>)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNERSHIP:
				getOwnership().clear();
				getOwnership().addAll((Collection<? extends Ownership>)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__PLAY_IN:
				getPlay_in().clear();
				getPlay_in().addAll((Collection<? extends Play>)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_AGENT_ROLE:
				setOwnedAgentRole((AgentRoleClass)newValue);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE:
				setOwenedObjectRole((ObjectRoleClass)newValue);
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
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_GOAL:
				getOwnedGoal().clear();
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_BELIEF:
				getOwnedBelief().clear();
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_PLAN:
				getOwnedPlan().clear();
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ACTION:
				getOwnedAction().clear();
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__SENT_MESSAGE:
				getSentMessage().clear();
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__RECEIVE_MESSAGE:
				getReceiveMessage().clear();
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__INHABIT:
				setInhabit((Inhabit)null);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__PLAY:
				getPlay().clear();
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__SUPER_CLASS:
				getSuperClass().clear();
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNERSHIP:
				getOwnership().clear();
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__PLAY_IN:
				getPlay_in().clear();
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_AGENT_ROLE:
				setOwnedAgentRole((AgentRoleClass)null);
				return;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE:
				setOwenedObjectRole((ObjectRoleClass)null);
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
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_GOAL:
				return ownedGoal != null && !ownedGoal.isEmpty();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_BELIEF:
				return ownedBelief != null && !ownedBelief.isEmpty();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_PLAN:
				return ownedPlan != null && !ownedPlan.isEmpty();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ACTION:
				return ownedAction != null && !ownedAction.isEmpty();
			case Uml2contextPackage.ORGANIZATION_CLASS__SENT_MESSAGE:
				return sentMessage != null && !sentMessage.isEmpty();
			case Uml2contextPackage.ORGANIZATION_CLASS__RECEIVE_MESSAGE:
				return receiveMessage != null && !receiveMessage.isEmpty();
			case Uml2contextPackage.ORGANIZATION_CLASS__INHABIT:
				return inhabit != null;
			case Uml2contextPackage.ORGANIZATION_CLASS__PLAY:
				return play != null && !play.isEmpty();
			case Uml2contextPackage.ORGANIZATION_CLASS__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNERSHIP:
				return ownership != null && !ownership.isEmpty();
			case Uml2contextPackage.ORGANIZATION_CLASS__PLAY_IN:
				return play_in != null && !play_in.isEmpty();
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_AGENT_ROLE:
				return ownedAgentRole != null;
			case Uml2contextPackage.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE:
				return owenedObjectRole != null;
		}
		return super.eIsSet(featureID);
	}

} //OrganizationClassImpl
