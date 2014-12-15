/**
 */
package uml2context;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.Goal#getOwnedPlan <em>Owned Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Property {
	/**
	 * Returns the value of the '<em><b>Owned Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Plan</em>' containment reference.
	 * @see #setOwnedPlan(PlanClass)
	 * @see uml2context.Uml2contextPackage#getGoal_OwnedPlan()
	 * @model containment="true"
	 * @generated
	 */
	PlanClass getOwnedPlan();

	/**
	 * Sets the value of the '{@link uml2context.Goal#getOwnedPlan <em>Owned Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Plan</em>' containment reference.
	 * @see #getOwnedPlan()
	 * @generated
	 */
	void setOwnedPlan(PlanClass value);

} // Goal
