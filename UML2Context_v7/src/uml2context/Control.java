/**
 */
package uml2context;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.Control#getController <em>Controller</em>}</li>
 *   <li>{@link uml2context.Control#getControlled <em>Controlled</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(AgentRoleClass)
	 * @see uml2context.Uml2contextPackage#getControl_Controller()
	 * @model required="true"
	 * @generated
	 */
	AgentRoleClass getController();

	/**
	 * Sets the value of the '{@link uml2context.Control#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(AgentRoleClass value);

	/**
	 * Returns the value of the '<em><b>Controlled</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.AgentRoleClass#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled</em>' reference.
	 * @see #setControlled(AgentRoleClass)
	 * @see uml2context.Uml2contextPackage#getControl_Controlled()
	 * @see uml2context.AgentRoleClass#getControl
	 * @model opposite="control" required="true"
	 * @generated
	 */
	AgentRoleClass getControlled();

	/**
	 * Sets the value of the '{@link uml2context.Control#getControlled <em>Controlled</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled</em>' reference.
	 * @see #getControlled()
	 * @generated
	 */
	void setControlled(AgentRoleClass value);

} // Control
