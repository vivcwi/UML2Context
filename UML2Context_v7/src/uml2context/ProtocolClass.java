/**
 */
package uml2context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2context.ProtocolClass#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2context.Uml2contextPackage#getProtocolClass()
 * @model
 * @generated
 */
public interface ProtocolClass extends BehavioralFeature {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' reference list.
	 * The list contents are of type {@link uml2context.AgentMessageClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' reference list.
	 * @see uml2context.Uml2contextPackage#getProtocolClass_Messages()
	 * @model required="true"
	 * @generated
	 */
	EList<AgentMessageClass> getMessages();

} // ProtocolClass
