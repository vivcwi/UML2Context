/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent Message Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.AgentMessageClass#getSender <em>Sender</em>}</li>
 *   <li>{@link uml2context.AgentMessageClass#getRoleSender <em>Role Sender</em>}</li>
 *   <li>{@link uml2context.AgentMessageClass#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link uml2context.AgentMessageClass#getRoleReceiver <em>Role Receiver</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getAgentMessageClass()
 * @model
 * @generated
 */
public interface AgentMessageClass extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.AgentClass#getSentMessage <em>Sent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' reference.
	 * @see #setSender(AgentClass)
	 * @see uml2context.Uml2contextPackage#getAgentMessageClass_Sender()
	 * @see uml2context.AgentClass#getSentMessage
	 * @model opposite="sentMessage"
	 * @generated
	 */
	AgentClass getSender();

	/**
	 * Sets the value of the '{@link uml2context.AgentMessageClass#getSender <em>Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(AgentClass value);

	/**
	 * Returns the value of the '<em><b>Role Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Sender</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Sender</em>' reference.
	 * @see #setRoleSender(AgentRoleClass)
	 * @see uml2context.Uml2contextPackage#getAgentMessageClass_RoleSender()
	 * @model
	 * @generated
	 */
	AgentRoleClass getRoleSender();

	/**
	 * Sets the value of the '{@link uml2context.AgentMessageClass#getRoleSender <em>Role Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Sender</em>' reference.
	 * @see #getRoleSender()
	 * @generated
	 */
	void setRoleSender(AgentRoleClass value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' reference list.
	 * The list contents are of type {@link uml2context.AgentClass}.
	 * It is bidirectional and its opposite is '{@link uml2context.AgentClass#getReceiveMessage <em>Receive Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiver</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiver</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getAgentMessageClass_Receiver()
	 * @see uml2context.AgentClass#getReceiveMessage
	 * @model opposite="receiveMessage"
	 * @generated
	 */
	EList<AgentClass> getReceiver();

	/**
	 * Returns the value of the '<em><b>Role Receiver</b></em>' reference list.
	 * The list contents are of type {@link uml2context.AgentRoleClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Receiver</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Receiver</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getAgentMessageClass_RoleReceiver()
	 * @model
	 * @generated
	 */
	EList<AgentRoleClass> getRoleReceiver();

} // AgentMessageClass
