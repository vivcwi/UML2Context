/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.Constraint#getConstrainedElement <em>Constrained Element</em>}</li>
 *   <li>{@link uml2context.Constraint#getContext <em>Context</em>}</li>
 *   <li>{@link uml2context.Constraint#getConstraintSpecification <em>Constraint Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Constrained Element</b></em>' reference list.
	 * The list contents are of type {@link uml2context.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrained Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrained Element</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getConstraint_ConstrainedElement()
	 * @model
	 * @generated
	 */
	EList<Element> getConstrainedElement();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Namespace)
	 * @see uml2context.Uml2contextPackage#getConstraint_Context()
	 * @model
	 * @generated
	 */
	Namespace getContext();

	/**
	 * Sets the value of the '{@link uml2context.Constraint#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Namespace value);

	/**
	 * Returns the value of the '<em><b>Constraint Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Specification</em>' attribute.
	 * @see #setConstraintSpecification(String)
	 * @see uml2context.Uml2contextPackage#getConstraint_ConstraintSpecification()
	 * @model
	 * @generated
	 */
	String getConstraintSpecification();

	/**
	 * Sets the value of the '{@link uml2context.Constraint#getConstraintSpecification <em>Constraint Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Specification</em>' attribute.
	 * @see #getConstraintSpecification()
	 * @generated
	 */
	void setConstraintSpecification(String value);

} // Constraint
