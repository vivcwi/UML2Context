/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.OrganizationClass#getOwnedGoal <em>Owned Goal</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getOwnedBelief <em>Owned Belief</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getOwnedPlan <em>Owned Plan</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getSentMessage <em>Sent Message</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getReceiveMessage <em>Receive Message</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getInhabit <em>Inhabit</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getPlay <em>Play</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getOwnership <em>Ownership</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getPlay_in <em>Play in</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getOwnedAgentRole <em>Owned Agent Role</em>}</li>
 *   <li>{@link uml2context.OrganizationClass#getOwenedObjectRole <em>Owened Object Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getOrganizationClass()
 * @model
 * @generated
 */
public interface OrganizationClass extends Classifier {
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
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_OwnedGoal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Property> getOwnedGoal();

	/**
	 * Returns the value of the '<em><b>Owned Belief</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Belief</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Belief</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_OwnedBelief()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnedBelief();

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
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_OwnedPlan()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PlanClass> getOwnedPlan();

	/**
	 * Returns the value of the '<em><b>Owned Action</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.ActionClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Action</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_OwnedAction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActionClass> getOwnedAction();

	/**
	 * Returns the value of the '<em><b>Sent Message</b></em>' reference list.
	 * The list contents are of type {@link uml2context.AgentMessageClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sent Message</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sent Message</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_SentMessage()
	 * @model
	 * @generated
	 */
	EList<AgentMessageClass> getSentMessage();

	/**
	 * Returns the value of the '<em><b>Receive Message</b></em>' reference list.
	 * The list contents are of type {@link uml2context.AgentMessageClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Message</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Message</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_ReceiveMessage()
	 * @model
	 * @generated
	 */
	EList<AgentMessageClass> getReceiveMessage();

	/**
	 * Returns the value of the '<em><b>Inhabit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.Inhabit#getOrg <em>Org</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inhabit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhabit</em>' reference.
	 * @see #setInhabit(Inhabit)
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_Inhabit()
	 * @see uml2context.Inhabit#getOrg
	 * @model opposite="org" required="true"
	 * @generated
	 */
	Inhabit getInhabit();

	/**
	 * Sets the value of the '{@link uml2context.OrganizationClass#getInhabit <em>Inhabit</em>}' reference.
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_Play()
	 * @model required="true"
	 * @generated
	 */
	EList<Play> getPlay();

	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference list.
	 * The list contents are of type {@link uml2context.OrganizationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_SuperClass()
	 * @model derived="true"
	 * @generated
	 */
	EList<OrganizationClass> getSuperClass();

	/**
	 * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Attribute</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_OwnedAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

	/**
	 * Returns the value of the '<em><b>Ownership</b></em>' reference list.
	 * The list contents are of type {@link uml2context.Ownership}.
	 * It is bidirectional and its opposite is '{@link uml2context.Ownership#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownership</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownership</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_Ownership()
	 * @see uml2context.Ownership#getOwner
	 * @model opposite="owner"
	 * @generated
	 */
	EList<Ownership> getOwnership();

	/**
	 * Returns the value of the '<em><b>Play in</b></em>' reference list.
	 * The list contents are of type {@link uml2context.Play}.
	 * It is bidirectional and its opposite is '{@link uml2context.Play#getOrg <em>Org</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play in</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play in</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_Play_in()
	 * @see uml2context.Play#getOrg
	 * @model opposite="org"
	 * @generated
	 */
	EList<Play> getPlay_in();

	/**
	 * Returns the value of the '<em><b>Owned Agent Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Agent Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Agent Role</em>' containment reference.
	 * @see #setOwnedAgentRole(AgentRoleClass)
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_OwnedAgentRole()
	 * @model containment="true"
	 * @generated
	 */
	AgentRoleClass getOwnedAgentRole();

	/**
	 * Sets the value of the '{@link uml2context.OrganizationClass#getOwnedAgentRole <em>Owned Agent Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Agent Role</em>' containment reference.
	 * @see #getOwnedAgentRole()
	 * @generated
	 */
	void setOwnedAgentRole(AgentRoleClass value);

	/**
	 * Returns the value of the '<em><b>Owened Object Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owened Object Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owened Object Role</em>' containment reference.
	 * @see #setOwenedObjectRole(ObjectRoleClass)
	 * @see uml2context.Uml2contextPackage#getOrganizationClass_OwenedObjectRole()
	 * @model containment="true"
	 * @generated
	 */
	ObjectRoleClass getOwenedObjectRole();

	/**
	 * Sets the value of the '{@link uml2context.OrganizationClass#getOwenedObjectRole <em>Owened Object Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owened Object Role</em>' containment reference.
	 * @see #getOwenedObjectRole()
	 * @generated
	 */
	void setOwenedObjectRole(ObjectRoleClass value);

} // OrganizationClass
