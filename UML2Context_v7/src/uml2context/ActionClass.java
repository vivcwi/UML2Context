/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.ActionClass#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uml2context.ActionClass#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uml2context.ActionClass#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml2context.ActionClass#getActionSemantics <em>Action Semantics</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getActionClass()
 * @model
 * @generated
 */
public interface ActionClass extends BehavioralFeature {
	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getActionClass_Precondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getPrecondition();

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getActionClass_Postcondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getPostcondition();

	/**
	 * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameter</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getActionClass_OwnedParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParameter();

	/**
	 * Returns the value of the '<em><b>Action Semantics</b></em>' attribute.
	 * The literals are from the enumeration {@link uml2context.ActionSemantics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Semantics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Semantics</em>' attribute.
	 * @see uml2context.ActionSemantics
	 * @see #setActionSemantics(ActionSemantics)
	 * @see uml2context.Uml2contextPackage#getActionClass_ActionSemantics()
	 * @model
	 * @generated
	 */
	ActionSemantics getActionSemantics();

	/**
	 * Sets the value of the '{@link uml2context.ActionClass#getActionSemantics <em>Action Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Semantics</em>' attribute.
	 * @see uml2context.ActionSemantics
	 * @see #getActionSemantics()
	 * @generated
	 */
	void setActionSemantics(ActionSemantics value);

} // ActionClass
