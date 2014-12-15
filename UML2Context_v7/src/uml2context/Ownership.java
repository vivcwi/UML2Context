/**
 */
package uml2context;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ownership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.Ownership#getAgentRole <em>Agent Role</em>}</li>
 *   <li>{@link uml2context.Ownership#getObjectRole <em>Object Role</em>}</li>
 *   <li>{@link uml2context.Ownership#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getOwnership()
 * @model
 * @generated
 */
public interface Ownership extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Agent Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.AgentRoleClass#getOwnership <em>Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Role</em>' reference.
	 * @see #setAgentRole(AgentRoleClass)
	 * @see uml2context.Uml2contextPackage#getOwnership_AgentRole()
	 * @see uml2context.AgentRoleClass#getOwnership
	 * @model opposite="ownership"
	 * @generated
	 */
	AgentRoleClass getAgentRole();

	/**
	 * Sets the value of the '{@link uml2context.Ownership#getAgentRole <em>Agent Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Role</em>' reference.
	 * @see #getAgentRole()
	 * @generated
	 */
	void setAgentRole(AgentRoleClass value);

	/**
	 * Returns the value of the '<em><b>Object Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.ObjectRoleClass#getOwnership <em>Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Role</em>' reference.
	 * @see #setObjectRole(ObjectRoleClass)
	 * @see uml2context.Uml2contextPackage#getOwnership_ObjectRole()
	 * @see uml2context.ObjectRoleClass#getOwnership
	 * @model opposite="ownership"
	 * @generated
	 */
	ObjectRoleClass getObjectRole();

	/**
	 * Sets the value of the '{@link uml2context.Ownership#getObjectRole <em>Object Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Role</em>' reference.
	 * @see #getObjectRole()
	 * @generated
	 */
	void setObjectRole(ObjectRoleClass value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.OrganizationClass#getOwnership <em>Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(OrganizationClass)
	 * @see uml2context.Uml2contextPackage#getOwnership_Owner()
	 * @see uml2context.OrganizationClass#getOwnership
	 * @model opposite="ownership"
	 * @generated
	 */
	OrganizationClass getOwner();

	/**
	 * Sets the value of the '{@link uml2context.Ownership#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(OrganizationClass value);

} // Ownership
