/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.Dependency#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link uml2context.Dependency#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference list.
	 * The list contents are of type {@link uml2context.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getDependency_Supplier()
	 * @model required="true"
	 * @generated
	 */
	EList<NamedElement> getSupplier();

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference list.
	 * The list contents are of type {@link uml2context.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getDependency_Client()
	 * @model required="true"
	 * @generated
	 */
	EList<NamedElement> getClient();

} // Dependency
