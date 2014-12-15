/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Role Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.ObjectRoleClass#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml2context.ObjectRoleClass#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml2context.ObjectRoleClass#getPlay <em>Play</em>}</li>
 *   <li>{@link uml2context.ObjectRoleClass#getOwnership <em>Ownership</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getObjectRoleClass()
 * @model
 * @generated
 */
public interface ObjectRoleClass extends Classifier {
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
	 * @see uml2context.Uml2contextPackage#getObjectRoleClass_OwnedAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getOwnedAttribute();

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
	 * @see uml2context.Uml2contextPackage#getObjectRoleClass_OwnedOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOwnedOperation();

	/**
	 * Returns the value of the '<em><b>Play</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.Play#getObjectRole <em>Object Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play</em>' reference.
	 * @see #setPlay(Play)
	 * @see uml2context.Uml2contextPackage#getObjectRoleClass_Play()
	 * @see uml2context.Play#getObjectRole
	 * @model opposite="objectRole" required="true"
	 * @generated
	 */
	Play getPlay();

	/**
	 * Sets the value of the '{@link uml2context.ObjectRoleClass#getPlay <em>Play</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Play</em>' reference.
	 * @see #getPlay()
	 * @generated
	 */
	void setPlay(Play value);

	/**
	 * Returns the value of the '<em><b>Ownership</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2context.Ownership#getObjectRole <em>Object Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownership</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownership</em>' reference.
	 * @see #setOwnership(Ownership)
	 * @see uml2context.Uml2contextPackage#getObjectRoleClass_Ownership()
	 * @see uml2context.Ownership#getObjectRole
	 * @model opposite="objectRole" required="true"
	 * @generated
	 */
	Ownership getOwnership();

	/**
	 * Sets the value of the '{@link uml2context.ObjectRoleClass#getOwnership <em>Ownership</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ownership</em>' reference.
	 * @see #getOwnership()
	 * @generated
	 */
	void setOwnership(Ownership value);

} // ObjectRoleClass
