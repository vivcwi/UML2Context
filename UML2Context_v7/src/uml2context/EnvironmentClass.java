/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.EnvironmentClass#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml2context.EnvironmentClass#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link uml2context.EnvironmentClass#getInhabit <em>Inhabit</em>}</li>
 *   <li>{@link uml2context.EnvironmentClass#getOwnedClass <em>Owned Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getEnvironmentClass()
 * @model
 * @generated
 */
public interface EnvironmentClass extends Classifier {
	/**
	 * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getEnvironmentClass_OwnedOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Owned Property</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getEnvironmentClass_OwnedProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnedProperty();

	/**
	 * Returns the value of the '<em><b>Inhabit</b></em>' reference list.
	 * The list contents are of type {@link uml2context.Inhabit}.
	 * It is bidirectional and its opposite is '{@link uml2context.Inhabit#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inhabit</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhabit</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getEnvironmentClass_Inhabit()
	 * @see uml2context.Inhabit#getEnv
	 * @model opposite="env"
	 * @generated
	 */
	EList<Inhabit> getInhabit();

	/**
	 * Returns the value of the '<em><b>Owned Class</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Class</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getEnvironmentClass_OwnedClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<uml2context.Class> getOwnedClass();

} // EnvironmentClass
