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
import uml2context.AgentClass;
import uml2context.AgentMessageClass;
import uml2context.Belief;
import uml2context.Goal;
import uml2context.Inhabit;
import uml2context.Perception;
import uml2context.PlanClass;
import uml2context.Planning;
import uml2context.Play;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.AgentClassImpl#getOwendAction <em>Owend Action</em>}</li>
 *   <li>{@link uml2context.impl.AgentClassImpl#getOwnedGoal <em>Owned Goal</em>}</li>
 *   <li>{@link uml2context.impl.AgentClassImpl#getOwnedBelief <em>Owned Belief</em>}</li>
 *   <li>{@link uml2context.impl.AgentClassImpl#getOwnedPlan <em>Owned Plan</em>}</li>
 *   <li>{@link uml2context.impl.AgentClassImpl#getSentMessage <em>Sent Message</em>}</li>
 *   <li>{@link uml2context.impl.AgentClassImpl#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link uml2context.impl.AgentClassImpl#getInhabit <em>Inhabit</em>}</li>
 *   <li>{@link uml2context.impl.AgentClassImpl#getPlay <em>Play</em>}</li>
 *   <li>{@link uml2context.impl.AgentClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link uml2context.impl.AgentClassImpl#getOwnedPerception <em>Owned Perception</em>}</li>
 *   <li>{@link uml2context.impl.AgentClassImpl#getOwnedPlanning <em>Owned Planning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentClassImpl extends ClassifierImpl implements AgentClass {
	/**
	 * The cached value of the '{@link #getOwendAction() <em>Owend Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwendAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionClass> owendAction;

	/**
	 * The cached value of the '{@link #getOwnedGoal() <em>Owned Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> ownedGoal;

	/**
	 * The cached value of the '{@link #getOwnedBelief() <em>Owned Belief</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBelief()
	 * @generated
	 * @ordered
	 */
	protected EList<Belief> ownedBelief;

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
	protected EList<AgentClass> superClass;

	/**
	 * The cached value of the '{@link #getOwnedPerception() <em>Owned Perception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPerception()
	 * @generated
	 * @ordered
	 */
	protected EList<Perception> ownedPerception;

	/**
	 * The cached value of the '{@link #getOwnedPlanning() <em>Owned Planning</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPlanning()
	 * @generated
	 * @ordered
	 */
	protected EList<Planning> ownedPlanning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.AGENT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionClass> getOwendAction() {
		if (owendAction == null) {
			owendAction = new EObjectContainmentEList<ActionClass>(ActionClass.class, this, Uml2contextPackage.AGENT_CLASS__OWEND_ACTION);
		}
		return owendAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getOwnedGoal() {
		if (ownedGoal == null) {
			ownedGoal = new EObjectContainmentEList<Goal>(Goal.class, this, Uml2contextPackage.AGENT_CLASS__OWNED_GOAL);
		}
		return ownedGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Belief> getOwnedBelief() {
		if (ownedBelief == null) {
			ownedBelief = new EObjectContainmentEList<Belief>(Belief.class, this, Uml2contextPackage.AGENT_CLASS__OWNED_BELIEF);
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
			ownedPlan = new EObjectContainmentEList<PlanClass>(PlanClass.class, this, Uml2contextPackage.AGENT_CLASS__OWNED_PLAN);
		}
		return ownedPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentMessageClass> getSentMessage() {
		if (sentMessage == null) {
			sentMessage = new EObjectWithInverseResolvingEList<AgentMessageClass>(AgentMessageClass.class, this, Uml2contextPackage.AGENT_CLASS__SENT_MESSAGE, Uml2contextPackage.AGENT_MESSAGE_CLASS__SENDER);
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
			receiveMessage = new EObjectWithInverseResolvingEList.ManyInverse<AgentMessageClass>(AgentMessageClass.class, this, Uml2contextPackage.AGENT_CLASS__RECEIVE_MESSAGE, Uml2contextPackage.AGENT_MESSAGE_CLASS__RECEIVER);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.AGENT_CLASS__INHABIT, oldInhabit, inhabit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_CLASS__INHABIT, oldInhabit, newInhabit);
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
				msgs = ((InternalEObject)inhabit).eInverseRemove(this, Uml2contextPackage.INHABIT__AGENT_CLASS, Inhabit.class, msgs);
			if (newInhabit != null)
				msgs = ((InternalEObject)newInhabit).eInverseAdd(this, Uml2contextPackage.INHABIT__AGENT_CLASS, Inhabit.class, msgs);
			msgs = basicSetInhabit(newInhabit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_CLASS__INHABIT, newInhabit, newInhabit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Play> getPlay() {
		if (play == null) {
			play = new EObjectWithInverseResolvingEList<Play>(Play.class, this, Uml2contextPackage.AGENT_CLASS__PLAY, Uml2contextPackage.PLAY__AGENT);
		}
		return play;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentClass> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectResolvingEList<AgentClass>(AgentClass.class, this, Uml2contextPackage.AGENT_CLASS__SUPER_CLASS);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Perception> getOwnedPerception() {
		if (ownedPerception == null) {
			ownedPerception = new EObjectContainmentEList<Perception>(Perception.class, this, Uml2contextPackage.AGENT_CLASS__OWNED_PERCEPTION);
		}
		return ownedPerception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Planning> getOwnedPlanning() {
		if (ownedPlanning == null) {
			ownedPlanning = new EObjectContainmentEList<Planning>(Planning.class, this, Uml2contextPackage.AGENT_CLASS__OWNED_PLANNING);
		}
		return ownedPlanning;
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
			case Uml2contextPackage.AGENT_CLASS__SENT_MESSAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSentMessage()).basicAdd(otherEnd, msgs);
			case Uml2contextPackage.AGENT_CLASS__RECEIVE_MESSAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReceiveMessage()).basicAdd(otherEnd, msgs);
			case Uml2contextPackage.AGENT_CLASS__INHABIT:
				if (inhabit != null)
					msgs = ((InternalEObject)inhabit).eInverseRemove(this, Uml2contextPackage.INHABIT__AGENT_CLASS, Inhabit.class, msgs);
				return basicSetInhabit((Inhabit)otherEnd, msgs);
			case Uml2contextPackage.AGENT_CLASS__PLAY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlay()).basicAdd(otherEnd, msgs);
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
			case Uml2contextPackage.AGENT_CLASS__OWEND_ACTION:
				return ((InternalEList<?>)getOwendAction()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_CLASS__OWNED_GOAL:
				return ((InternalEList<?>)getOwnedGoal()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_CLASS__OWNED_BELIEF:
				return ((InternalEList<?>)getOwnedBelief()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_CLASS__OWNED_PLAN:
				return ((InternalEList<?>)getOwnedPlan()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_CLASS__SENT_MESSAGE:
				return ((InternalEList<?>)getSentMessage()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_CLASS__RECEIVE_MESSAGE:
				return ((InternalEList<?>)getReceiveMessage()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_CLASS__INHABIT:
				return basicSetInhabit(null, msgs);
			case Uml2contextPackage.AGENT_CLASS__PLAY:
				return ((InternalEList<?>)getPlay()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_CLASS__OWNED_PERCEPTION:
				return ((InternalEList<?>)getOwnedPerception()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_CLASS__OWNED_PLANNING:
				return ((InternalEList<?>)getOwnedPlanning()).basicRemove(otherEnd, msgs);
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
			case Uml2contextPackage.AGENT_CLASS__OWEND_ACTION:
				return getOwendAction();
			case Uml2contextPackage.AGENT_CLASS__OWNED_GOAL:
				return getOwnedGoal();
			case Uml2contextPackage.AGENT_CLASS__OWNED_BELIEF:
				return getOwnedBelief();
			case Uml2contextPackage.AGENT_CLASS__OWNED_PLAN:
				return getOwnedPlan();
			case Uml2contextPackage.AGENT_CLASS__SENT_MESSAGE:
				return getSentMessage();
			case Uml2contextPackage.AGENT_CLASS__RECEIVE_MESSAGE:
				return getReceiveMessage();
			case Uml2contextPackage.AGENT_CLASS__INHABIT:
				if (resolve) return getInhabit();
				return basicGetInhabit();
			case Uml2contextPackage.AGENT_CLASS__PLAY:
				return getPlay();
			case Uml2contextPackage.AGENT_CLASS__SUPER_CLASS:
				return getSuperClass();
			case Uml2contextPackage.AGENT_CLASS__OWNED_PERCEPTION:
				return getOwnedPerception();
			case Uml2contextPackage.AGENT_CLASS__OWNED_PLANNING:
				return getOwnedPlanning();
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
			case Uml2contextPackage.AGENT_CLASS__OWEND_ACTION:
				getOwendAction().clear();
				getOwendAction().addAll((Collection<? extends ActionClass>)newValue);
				return;
			case Uml2contextPackage.AGENT_CLASS__OWNED_GOAL:
				getOwnedGoal().clear();
				getOwnedGoal().addAll((Collection<? extends Goal>)newValue);
				return;
			case Uml2contextPackage.AGENT_CLASS__OWNED_BELIEF:
				getOwnedBelief().clear();
				getOwnedBelief().addAll((Collection<? extends Belief>)newValue);
				return;
			case Uml2contextPackage.AGENT_CLASS__OWNED_PLAN:
				getOwnedPlan().clear();
				getOwnedPlan().addAll((Collection<? extends PlanClass>)newValue);
				return;
			case Uml2contextPackage.AGENT_CLASS__SENT_MESSAGE:
				getSentMessage().clear();
				getSentMessage().addAll((Collection<? extends AgentMessageClass>)newValue);
				return;
			case Uml2contextPackage.AGENT_CLASS__RECEIVE_MESSAGE:
				getReceiveMessage().clear();
				getReceiveMessage().addAll((Collection<? extends AgentMessageClass>)newValue);
				return;
			case Uml2contextPackage.AGENT_CLASS__INHABIT:
				setInhabit((Inhabit)newValue);
				return;
			case Uml2contextPackage.AGENT_CLASS__PLAY:
				getPlay().clear();
				getPlay().addAll((Collection<? extends Play>)newValue);
				return;
			case Uml2contextPackage.AGENT_CLASS__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends AgentClass>)newValue);
				return;
			case Uml2contextPackage.AGENT_CLASS__OWNED_PERCEPTION:
				getOwnedPerception().clear();
				getOwnedPerception().addAll((Collection<? extends Perception>)newValue);
				return;
			case Uml2contextPackage.AGENT_CLASS__OWNED_PLANNING:
				getOwnedPlanning().clear();
				getOwnedPlanning().addAll((Collection<? extends Planning>)newValue);
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
			case Uml2contextPackage.AGENT_CLASS__OWEND_ACTION:
				getOwendAction().clear();
				return;
			case Uml2contextPackage.AGENT_CLASS__OWNED_GOAL:
				getOwnedGoal().clear();
				return;
			case Uml2contextPackage.AGENT_CLASS__OWNED_BELIEF:
				getOwnedBelief().clear();
				return;
			case Uml2contextPackage.AGENT_CLASS__OWNED_PLAN:
				getOwnedPlan().clear();
				return;
			case Uml2contextPackage.AGENT_CLASS__SENT_MESSAGE:
				getSentMessage().clear();
				return;
			case Uml2contextPackage.AGENT_CLASS__RECEIVE_MESSAGE:
				getReceiveMessage().clear();
				return;
			case Uml2contextPackage.AGENT_CLASS__INHABIT:
				setInhabit((Inhabit)null);
				return;
			case Uml2contextPackage.AGENT_CLASS__PLAY:
				getPlay().clear();
				return;
			case Uml2contextPackage.AGENT_CLASS__SUPER_CLASS:
				getSuperClass().clear();
				return;
			case Uml2contextPackage.AGENT_CLASS__OWNED_PERCEPTION:
				getOwnedPerception().clear();
				return;
			case Uml2contextPackage.AGENT_CLASS__OWNED_PLANNING:
				getOwnedPlanning().clear();
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
			case Uml2contextPackage.AGENT_CLASS__OWEND_ACTION:
				return owendAction != null && !owendAction.isEmpty();
			case Uml2contextPackage.AGENT_CLASS__OWNED_GOAL:
				return ownedGoal != null && !ownedGoal.isEmpty();
			case Uml2contextPackage.AGENT_CLASS__OWNED_BELIEF:
				return ownedBelief != null && !ownedBelief.isEmpty();
			case Uml2contextPackage.AGENT_CLASS__OWNED_PLAN:
				return ownedPlan != null && !ownedPlan.isEmpty();
			case Uml2contextPackage.AGENT_CLASS__SENT_MESSAGE:
				return sentMessage != null && !sentMessage.isEmpty();
			case Uml2contextPackage.AGENT_CLASS__RECEIVE_MESSAGE:
				return receiveMessage != null && !receiveMessage.isEmpty();
			case Uml2contextPackage.AGENT_CLASS__INHABIT:
				return inhabit != null;
			case Uml2contextPackage.AGENT_CLASS__PLAY:
				return play != null && !play.isEmpty();
			case Uml2contextPackage.AGENT_CLASS__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case Uml2contextPackage.AGENT_CLASS__OWNED_PERCEPTION:
				return ownedPerception != null && !ownedPerception.isEmpty();
			case Uml2contextPackage.AGENT_CLASS__OWNED_PLANNING:
				return ownedPlanning != null && !ownedPlanning.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentClassImpl
