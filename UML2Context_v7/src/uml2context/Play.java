/**
 */
package uml2context;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Play</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.Play#getAgent <em>Agent</em>}</li>
 *   <li>{@link uml2context.Play#getAgentRole <em>Agent Role</em>}</li>
 *   <li>{@link uml2context.Play#getObjectRole <em>Object Role</em>}</li>
 *   <li>{@link uml2context.Play#getOrg <em>Org</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getPlay()
 * @model
 * @generated
 */
public interface Play extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.AgentClass#getPlay <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(AgentClass)
	 * @see uml2context.Uml2contextPackage#getPlay_Agent()
	 * @see uml2context.AgentClass#getPlay
	 * @model opposite="play"
	 * @generated
	 */
	AgentClass getAgent();

	/**
	 * Sets the value of the '{@link uml2context.Play#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(AgentClass value);

	/**
	 * Returns the value of the '<em><b>Agent Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.AgentRoleClass#getPlay <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Role</em>' reference.
	 * @see #setAgentRole(AgentRoleClass)
	 * @see uml2context.Uml2contextPackage#getPlay_AgentRole()
	 * @see uml2context.AgentRoleClass#getPlay
	 * @model opposite="play"
	 * @generated
	 */
	AgentRoleClass getAgentRole();

	/**
	 * Sets the value of the '{@link uml2context.Play#getAgentRole <em>Agent Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Role</em>' reference.
	 * @see #getAgentRole()
	 * @generated
	 */
	void setAgentRole(AgentRoleClass value);

	/**
	 * Returns the value of the '<em><b>Object Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.ObjectRoleClass#getPlay <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Role</em>' reference.
	 * @see #setObjectRole(ObjectRoleClass)
	 * @see uml2context.Uml2contextPackage#getPlay_ObjectRole()
	 * @see uml2context.ObjectRoleClass#getPlay
	 * @model opposite="play"
	 * @generated
	 */
	ObjectRoleClass getObjectRole();

	/**
	 * Sets the value of the '{@link uml2context.Play#getObjectRole <em>Object Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Role</em>' reference.
	 * @see #getObjectRole()
	 * @generated
	 */
	void setObjectRole(ObjectRoleClass value);

	/**
	 * Returns the value of the '<em><b>Org</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.OrganizationClass#getPlay_in <em>Play in</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Org</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Org</em>' reference.
	 * @see #setOrg(OrganizationClass)
	 * @see uml2context.Uml2contextPackage#getPlay_Org()
	 * @see uml2context.OrganizationClass#getPlay_in
	 * @model opposite="play_in"
	 * @generated
	 */
	OrganizationClass getOrg();

	/**
	 * Sets the value of the '{@link uml2context.Play#getOrg <em>Org</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Org</em>' reference.
	 * @see #getOrg()
	 * @generated
	 */
	void setOrg(OrganizationClass value);

} // Play
