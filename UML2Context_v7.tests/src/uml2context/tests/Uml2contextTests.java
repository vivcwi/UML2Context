/**
 */
package uml2context.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>uml2context</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Uml2contextTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Uml2contextTests("uml2context Tests");
		suite.addTestSuite(AgentClassTest.class);
		suite.addTestSuite(OrganizationClassTest.class);
		suite.addTestSuite(AgentRoleClassTest.class);
		suite.addTestSuite(AssociationTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(AggregationTest.class);
		suite.addTestSuite(CompositeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uml2contextTests(String name) {
		super(name);
	}

} //Uml2contextTests
