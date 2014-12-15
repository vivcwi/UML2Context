/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Masml Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedOrganizationClass <em>Owned Organization Class</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedEnvironmentClass <em>Owned Environment Class</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedAgentClass <em>Owned Agent Class</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedClass <em>Owned Class</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedPlay <em>Owned Play</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedDependency <em>Owned Dependency</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedAssociation <em>Owned Association</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedAggregation <em>Owned Aggregation</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedComposite <em>Owned Composite</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedInhabit <em>Owned Inhabit</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedOwnership <em>Owned Ownership</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedObjectRoleClass <em>Owned Object Role Class</em>}</li>
 *   <li>{@link uml2context.MasmlClassDiagram#getOwnedAgentRoleClass <em>Owned Agent Role Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram()
 * @model
 * @generated
 */
public interface MasmlClassDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Organization Class</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.OrganizationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Organization Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Organization Class</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedOrganizationClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrganizationClass> getOwnedOrganizationClass();

	/**
	 * Returns the value of the '<em><b>Owned Environment Class</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.EnvironmentClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Environment Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Environment Class</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedEnvironmentClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentClass> getOwnedEnvironmentClass();

	/**
	 * Returns the value of the '<em><b>Owned Agent Class</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.AgentClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Agent Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Agent Class</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedAgentClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<AgentClass> getOwnedAgentClass();

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
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<uml2context.Class> getOwnedClass();

	/**
	 * Returns the value of the '<em><b>Owned Play</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Play}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Play</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Play</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedPlay()
	 * @model containment="true"
	 * @generated
	 */
	EList<Play> getOwnedPlay();

	/**
	 * Returns the value of the '<em><b>Owned Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Generalization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Generalization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Generalization</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedGeneralization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Generalization> getOwnedGeneralization();

	/**
	 * Returns the value of the '<em><b>Owned Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Dependency</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedDependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getOwnedDependency();

	/**
	 * Returns the value of the '<em><b>Owned Association</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Association</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedAssociation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Association> getOwnedAssociation();

	/**
	 * Returns the value of the '<em><b>Owned Aggregation</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Aggregation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Aggregation</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedAggregation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aggregation> getOwnedAggregation();

	/**
	 * Returns the value of the '<em><b>Owned Composite</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Composite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Composite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Composite</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedComposite()
	 * @model containment="true"
	 * @generated
	 */
	EList<Composite> getOwnedComposite();

	/**
	 * Returns the value of the '<em><b>Owned Inhabit</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Inhabit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Inhabit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Inhabit</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedInhabit()
	 * @model containment="true"
	 * @generated
	 */
	EList<Inhabit> getOwnedInhabit();

	/**
	 * Returns the value of the '<em><b>Owned Ownership</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Ownership}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Ownership</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Ownership</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedOwnership()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ownership> getOwnedOwnership();

	/**
	 * Returns the value of the '<em><b>Owned Object Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.ObjectRoleClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Object Role Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Object Role Class</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedObjectRoleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObjectRoleClass> getOwnedObjectRoleClass();

	/**
	 * Returns the value of the '<em><b>Owned Agent Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.AgentRoleClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Agent Role Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Agent Role Class</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getMasmlClassDiagram_OwnedAgentRoleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<AgentRoleClass> getOwnedAgentRoleClass();

} // MasmlClassDiagram
