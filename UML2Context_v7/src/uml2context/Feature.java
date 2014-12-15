/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link uml2context.Classifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featuring Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuring Classifier</em>' containment reference list.
	 * @see uml2context.Uml2contextPackage#getFeature_FeaturingClassifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classifier> getFeaturingClassifier();

} // Feature
