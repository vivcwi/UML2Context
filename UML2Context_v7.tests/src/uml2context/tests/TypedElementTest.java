/**
 */
package uml2context.tests;

import junit.textui.TestRunner;

import uml2context.TypedElement;
import uml2context.Uml2contextFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypedElementTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypedElementTest.class);
	}

	/**
	 * Constructs a new Typed Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Typed Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypedElement getFixture() {
		return (TypedElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Uml2contextFactory.eINSTANCE.createTypedElement());
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

} //TypedElementTest
