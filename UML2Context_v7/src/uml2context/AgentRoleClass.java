/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Role Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.AgentRoleClass#getOwnedGoal <em>Owned Goal</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getOwnedDuty <em>Owned Duty</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getOwnedRight <em>Owned Right</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getPlay <em>Play</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getOwnership <em>Ownership</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getControl <em>Control</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getOwnedBelief <em>Owned Belief</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getPerformative <em>Performative</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getReply_to <em>Reply to</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getElement <em>Element</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getLanguage <em>Language</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getOntology <em>Ontology</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getConversation_id <em>Conversation id</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getReply_with <em>Reply with</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getIn_reply_to <em>In reply to</em>}</li>
 *   <li>{@link uml2context.AgentRoleClass#getReply_by <em>Reply by</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getAgentRoleClass()
 * @model
 * @generated
 */
public interface AgentRoleClass extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Goal</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Goal</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_OwnedGoal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnedGoal();

	/**
	 * Returns the value of the '<em><b>Owned Duty</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.ActionClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Duty</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Duty</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_OwnedDuty()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionClass> getOwnedDuty();

	/**
	 * Returns the value of the '<em><b>Owned Right</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.ActionClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Right</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Right</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_OwnedRight()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionClass> getOwnedRight();

	/**
	 * Returns the value of the '<em><b>Play</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.Play#getAgentRole <em>Agent Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play</em>' reference.
	 * @see #setPlay(Play)
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Play()
	 * @see uml2context.Play#getAgentRole
	 * @model opposite="agentRole" required="true"
	 * @generated
	 */
	Play getPlay();

	/**
	 * Sets the value of the '{@link uml2context.AgentRoleClass#getPlay <em>Play</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Play</em>' reference.
	 * @see #getPlay()
	 * @generated
	 */
	void setPlay(Play value);

	/**
	 * Returns the value of the '<em><b>Ownership</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.Ownership#getAgentRole <em>Agent Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownership</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownership</em>' reference.
	 * @see #setOwnership(Ownership)
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Ownership()
	 * @see uml2context.Ownership#getAgentRole
	 * @model opposite="agentRole" required="true"
	 * @generated
	 */
	Ownership getOwnership();

	/**
	 * Sets the value of the '{@link uml2context.AgentRoleClass#getOwnership <em>Ownership</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ownership</em>' reference.
	 * @see #getOwnership()
	 * @generated
	 */
	void setOwnership(Ownership value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' reference list.
	 * The list contents are of type {@link uml2context.Control}.
	 * It is bidirectional and its opposite is '{@link uml2context.Control#getControlled <em>Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Control()
	 * @see uml2context.Control#getControlled
	 * @model opposite="controlled"
	 * @generated
	 */
	EList<Control> getControl();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link uml2context.AgentRoleClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_SuperClass()
	 * @model derived="true"
	 * @generated
	 */
	EList<AgentRoleClass> getSuperClass();

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
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_OwnedBelief()
	 * @model containment="true"
	 * @generated
	 */
	EList<Belief> getOwnedBelief();

	/**
	 * Returns the value of the '<em><b>Performative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performative</em>' attribute.
	 * @see #setPerformative(String)
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Performative()
	 * @model
	 * @generated
	 */
	String getPerformative();

	/**
	 * Sets the value of the '{@link uml2context.AgentRoleClass#getPerformative <em>Performative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performative</em>' attribute.
	 * @see #getPerformative()
	 * @generated
	 */
	void setPerformative(String value);

	/**
	 * Returns the value of the '<em><b>Reply to</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply to</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply to</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Reply_to()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getReply_to();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(Element)
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Element()
	 * @model required="true"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link uml2context.AgentRoleClass#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link uml2context.AgentRoleClass#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Encoding()
	 * @model
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link uml2context.AgentRoleClass#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ontology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ontology</em>' attribute.
	 * @see #setOntology(String)
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Ontology()
	 * @model
	 * @generated
	 */
	String getOntology();

	/**
	 * Sets the value of the '{@link uml2context.AgentRoleClass#getOntology <em>Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ontology</em>' attribute.
	 * @see #getOntology()
	 * @generated
	 */
	void setOntology(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.ProtocolClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Protocol()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProtocolClass> getProtocol();

	/**
	 * Returns the value of the '<em><b>Conversation id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversation id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation id</em>' attribute.
	 * @see #setConversation_id(String)
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Conversation_id()
	 * @model
	 * @generated
	 */
	String getConversation_id();

	/**
	 * Sets the value of the '{@link uml2context.AgentRoleClass#getConversation_id <em>Conversation id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversation id</em>' attribute.
	 * @see #getConversation_id()
	 * @generated
	 */
	void setConversation_id(String value);

	/**
	 * Returns the value of the '<em><b>Reply with</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply with</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply with</em>' attribute.
	 * @see #setReply_with(String)
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Reply_with()
	 * @model
	 * @generated
	 */
	String getReply_with();

	/**
	 * Sets the value of the '{@link uml2context.AgentRoleClass#getReply_with <em>Reply with</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply with</em>' attribute.
	 * @see #getReply_with()
	 * @generated
	 */
	void setReply_with(String value);

	/**
	 * Returns the value of the '<em><b>In reply to</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In reply to</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In reply to</em>' attribute.
	 * @see #setIn_reply_to(String)
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_In_reply_to()
	 * @model
	 * @generated
	 */
	String getIn_reply_to();

	/**
	 * Sets the value of the '{@link uml2context.AgentRoleClass#getIn_reply_to <em>In reply to</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In reply to</em>' attribute.
	 * @see #getIn_reply_to()
	 * @generated
	 */
	void setIn_reply_to(String value);

	/**
	 * Returns the value of the '<em><b>Reply by</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply by</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply by</em>' attribute.
	 * @see #setReply_by(String)
	 * @see uml2context.Uml2contextPackage#getAgentRoleClass_Reply_by()
	 * @model
	 * @generated
	 */
	String getReply_by();

	/**
	 * Sets the value of the '{@link uml2context.AgentRoleClass#getReply_by <em>Reply by</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply by</em>' attribute.
	 * @see #getReply_by()
	 * @generated
	 */
	void setReply_by(String value);

} // AgentRoleClass
