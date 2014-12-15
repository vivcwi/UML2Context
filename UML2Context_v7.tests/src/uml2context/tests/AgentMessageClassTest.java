/**
 */
package uml2context.tests;

import junit.textui.TestRunner;

import uml2context.AgentMessageClass;
import uml2context.Uml2contextFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Agent Message Class</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgentMessageClassTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AgentMessageClassTest.class);
	}

	/**
	 * Constructs a new Agent Message Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentMessageClassTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Agent Message Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AgentMessageClass getFixture() {
		return (AgentMessageClass)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Uml2contextFactory.eINSTANCE.createAgentMessageClass());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AgentMessageClassTest
