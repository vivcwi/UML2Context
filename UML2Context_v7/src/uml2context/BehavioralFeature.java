/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.BehavioralFeature#getOwnedParamenter <em>Owned Paramenter</em>}</li>
 *   <li>{@link uml2context.BehavioralFeature#getRaisedException <em>Raised Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getBehavioralFeature()
 * @model
 * @generated
 */
public interface BehavioralFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Owned Paramenter</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Paramenter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Paramenter</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getBehavioralFeature_OwnedParamenter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getOwnedParamenter();

	/**
	 * Returns the value of the '<em><b>Raised Exception</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Exception</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getBehavioralFeature_RaisedException()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getRaisedException();

} // BehavioralFeature
