/**
 */
package uml2context.tests;

import junit.textui.TestRunner;

import uml2context.Namespace;
import uml2context.Uml2contextFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespaceTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NamespaceTest.class);
	}

	/**
	 * Constructs a new Namespace test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Namespace test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Namespace getFixture() {
		return (Namespace)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Uml2contextFactory.eINSTANCE.createNamespace());
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

} //NamespaceTest
