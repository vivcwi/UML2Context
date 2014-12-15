/**
 */
package uml2context;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inhabit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.Inhabit#getSubOrg <em>Sub Org</em>}</li>
 *   <li>{@link uml2context.Inhabit#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml2context.Inhabit#getAgentClass <em>Agent Class</em>}</li>
 *   <li>{@link uml2context.Inhabit#getOrg <em>Org</em>}</li>
 *   <li>{@link uml2context.Inhabit#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getInhabit()
 * @model
 * @generated
 */
public interface Inhabit extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Sub Org</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Org</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Org</em>' reference.
	 * @see #setSubOrg(OrganizationClass)
	 * @see uml2context.Uml2contextPackage#getInhabit_SubOrg()
	 * @model
	 * @generated
	 */
	OrganizationClass getSubOrg();

	/**
	 * Sets the value of the '{@link uml2context.Inhabit#getSubOrg <em>Sub Org</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Org</em>' reference.
	 * @see #getSubOrg()
	 * @generated
	 */
	void setSubOrg(OrganizationClass value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(uml2context.Class)
	 * @see uml2context.Uml2contextPackage#getInhabit_Class()
	 * @model
	 * @generated
	 */
	uml2context.Class getClass_();

	/**
	 * Sets the value of the '{@link uml2context.Inhabit#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(uml2context.Class value);

	/**
	 * Returns the value of the '<em><b>Agent Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.AgentClass#getInhabit <em>Inhabit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Class</em>' reference.
	 * @see #setAgentClass(AgentClass)
	 * @see uml2context.Uml2contextPackage#getInhabit_AgentClass()
	 * @see uml2context.AgentClass#getInhabit
	 * @model opposite="inhabit"
	 * @generated
	 */
	AgentClass getAgentClass();

	/**
	 * Sets the value of the '{@link uml2context.Inhabit#getAgentClass <em>Agent Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Class</em>' reference.
	 * @see #getAgentClass()
	 * @generated
	 */
	void setAgentClass(AgentClass value);

	/**
	 * Returns the value of the '<em><b>Org</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.OrganizationClass#getInhabit <em>Inhabit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Org</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Org</em>' reference.
	 * @see #setOrg(OrganizationClass)
	 * @see uml2context.Uml2contextPackage#getInhabit_Org()
	 * @see uml2context.OrganizationClass#getInhabit
	 * @model opposite="inhabit"
	 * @generated
	 */
	OrganizationClass getOrg();

	/**
	 * Sets the value of the '{@link uml2context.Inhabit#getOrg <em>Org</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Org</em>' reference.
	 * @see #getOrg()
	 * @generated
	 */
	void setOrg(OrganizationClass value);

	/**
	 * Returns the value of the '<em><b>Env</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.EnvironmentClass#getInhabit <em>Inhabit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' reference.
	 * @see #setEnv(EnvironmentClass)
	 * @see uml2context.Uml2contextPackage#getInhabit_Env()
	 * @see uml2context.EnvironmentClass#getInhabit
	 * @model opposite="inhabit" required="true"
	 * @generated
	 */
	EnvironmentClass getEnv();

	/**
	 * Sets the value of the '{@link uml2context.Inhabit#getEnv <em>Env</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(EnvironmentClass value);

} // Inhabit
