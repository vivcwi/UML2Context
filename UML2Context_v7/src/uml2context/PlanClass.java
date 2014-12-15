/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.PlanClass#getOwendGoal <em>Owend Goal</em>}</li>
 *   <li>{@link uml2context.PlanClass#getOwnedAction <em>Owned Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getPlanClass()
 * @model
 * @generated
 */
public interface PlanClass extends BehavioralFeature {
	/**
	 * Returns the value of the '<em><b>Owend Goal</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owend Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owend Goal</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getPlanClass_OwendGoal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Goal> getOwendGoal();

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
	 * @see uml2context.Uml2contextPackage#getPlanClass_OwnedAction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ActionClass> getOwnedAction();

} // PlanClass
