/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.AgentClass#getOwendAction <em>Owend Action</em>}</li>
 *   <li>{@link uml2context.AgentClass#getOwnedGoal <em>Owned Goal</em>}</li>
 *   <li>{@link uml2context.AgentClass#getOwnedBelief <em>Owned Belief</em>}</li>
 *   <li>{@link uml2context.AgentClass#getOwnedPlan <em>Owned Plan</em>}</li>
 *   <li>{@link uml2context.AgentClass#getSentMessage <em>Sent Message</em>}</li>
 *   <li>{@link uml2context.AgentClass#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link uml2context.AgentClass#getInhabit <em>Inhabit</em>}</li>
 *   <li>{@link uml2context.AgentClass#getPlay <em>Play</em>}</li>
 *   <li>{@link uml2context.AgentClass#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link uml2context.AgentClass#getOwnedPerception <em>Owned Perception</em>}</li>
 *   <li>{@link uml2context.AgentClass#getOwnedPlanning <em>Owned Planning</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getAgentClass()
 * @model
 * @generated
 */
public interface AgentClass extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owend Action</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.ActionClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owend Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owend Action</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getAgentClass_OwendAction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActionClass> getOwendAction();

	/**
	 * Returns the value of the '<em><b>Owned Goal</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Goal</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getAgentClass_OwnedGoal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getOwnedGoal();

	/**
	 * Returns the value of the '<em><b>Owned Belief</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Belief}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Belief</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Belief</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getAgentClass_OwnedBelief()
	 * @model containment="true"
	 * @generated
	 */
	EList<Belief> getOwnedBelief();

	/**
	 * Returns the value of the '<em><b>Owned Plan</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.PlanClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Plan</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Plan</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getAgentClass_OwnedPlan()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlanClass> getOwnedPlan();

	/**
	 * Returns the value of the '<em><b>Sent Message</b></em>' reference list.
	 * The list contents are of type {@link uml2context.AgentMessageClass}.
	 * It is bidirectional and its opposite is '{@link uml2context.AgentMessageClass#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sent Message</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent Message</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getAgentClass_SentMessage()
	 * @see uml2context.AgentMessageClass#getSender
	 * @model opposite="sender"
	 * @generated
	 */
	EList<AgentMessageClass> getSentMessage();

	/**
	 * Returns the value of the '<em><b>Receive Message</b></em>' reference list.
	 * The list contents are of type {@link uml2context.AgentMessageClass}.
	 * It is bidirectional and its opposite is '{@link uml2context.AgentMessageClass#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Message</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Message</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getAgentClass_ReceiveMessage()
	 * @see uml2context.AgentMessageClass#getReceiver
	 * @model opposite="receiver"
	 * @generated
	 */
	EList<AgentMessageClass> getReceiveMessage();

	/**
	 * Returns the value of the '<em><b>Inhabit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.Inhabit#getAgentClass <em>Agent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inhabit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhabit</em>' reference.
	 * @see #setInhabit(Inhabit)
	 * @see uml2context.Uml2contextPackage#getAgentClass_Inhabit()
	 * @see uml2context.Inhabit#getAgentClass
	 * @model opposite="agentClass" required="true"
	 * @generated
	 */
	Inhabit getInhabit();

	/**
	 * Sets the value of the '{@link uml2context.AgentClass#getInhabit <em>Inhabit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhabit</em>' reference.
	 * @see #getInhabit()
	 * @generated
	 */
	void setInhabit(Inhabit value);

	/**
	 * Returns the value of the '<em><b>Play</b></em>' reference list.
	 * The list contents are of type {@link uml2context.Play}.
	 * It is bidirectional and its opposite is '{@link uml2context.Play#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getAgentClass_Play()
	 * @see uml2context.Play#getAgent
	 * @model opposite="agent" required="true"
	 * @generated
	 */
	EList<Play> getPlay();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link uml2context.AgentClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getAgentClass_SuperClass()
	 * @model derived="true"
	 * @generated
	 */
	EList<AgentClass> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Owned Perception</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Perception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Perception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Perception</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getAgentClass_OwnedPerception()
	 * @model containment="true"
	 * @generated
	 */
	EList<Perception> getOwnedPerception();

	/**
	 * Returns the value of the '<em><b>Owned Planning</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Planning}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Planning</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Planning</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getAgentClass_OwnedPlanning()
	 * @model containment="true"
	 * @generated
	 */
	EList<Planning> getOwnedPlanning();

} // AgentClass
