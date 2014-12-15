/**
 */
package uml2context;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Semantics</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uml2context.Uml2contextPackage#getActionSemantics()
 * @model
 * @generated
 */
public enum ActionSemantics implements Enumerator {
	/**
	 * The '<em><b>Default Semantics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_SEMANTICS_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT_SEMANTICS(0, "DefaultSemantics", " "),

	/**
	 * The '<em><b>Next Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT_FUNCTION(1, "NextFunction", "<<Next-Function>>"),

	/**
	 * The '<em><b>Utility Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTILITY_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	UTILITY_FUNCTION(2, "UtilityFunction", "<<Utility-Function>>"),

	/**
	 * The '<em><b>Formulate Problem Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORMULATE_PROBLEM_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FORMULATE_PROBLEM_FUNCTION(3, "FormulateProblemFunction", "<<Formulate-Problem-Function>>"),

	/**
	 * The '<em><b>Formulate Goal Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORMULATE_GOAL_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FORMULATE_GOAL_FUNCTION(4, "FormulateGoalFunction", "<<Formulate-Goal-Function>>");

	/**
	 * The '<em><b>Default Semantics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default Semantics</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_SEMANTICS
	 * @model name="DefaultSemantics" literal=" "
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_SEMANTICS_VALUE = 0;

	/**
	 * The '<em><b>Next Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Next Function</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEXT_FUNCTION
	 * @model name="NextFunction" literal="<<Next-Function>>"
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_FUNCTION_VALUE = 1;

	/**
	 * The '<em><b>Utility Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Utility Function</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTILITY_FUNCTION
	 * @model name="UtilityFunction" literal="<<Utility-Function>>"
	 * @generated
	 * @ordered
	 */
	public static final int UTILITY_FUNCTION_VALUE = 2;

	/**
	 * The '<em><b>Formulate Problem Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Formulate Problem Function</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORMULATE_PROBLEM_FUNCTION
	 * @model name="FormulateProblemFunction" literal="<<Formulate-Problem-Function>>"
	 * @generated
	 * @ordered
	 */
	public static final int FORMULATE_PROBLEM_FUNCTION_VALUE = 3;

	/**
	 * The '<em><b>Formulate Goal Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Formulate Goal Function</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORMULATE_GOAL_FUNCTION
	 * @model name="FormulateGoalFunction" literal="<<Formulate-Goal-Function>>"
	 * @generated
	 * @ordered
	 */
	public static final int FORMULATE_GOAL_FUNCTION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Action Semantics</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionSemantics[] VALUES_ARRAY =
		new ActionSemantics[] {
			DEFAULT_SEMANTICS,
			NEXT_FUNCTION,
			UTILITY_FUNCTION,
			FORMULATE_PROBLEM_FUNCTION,
			FORMULATE_GOAL_FUNCTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Semantics</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionSemantics> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Semantics</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionSemantics get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionSemantics result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Semantics</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionSemantics getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionSemantics result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Semantics</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionSemantics get(int value) {
		switch (value) {
			case DEFAULT_SEMANTICS_VALUE: return DEFAULT_SEMANTICS;
			case NEXT_FUNCTION_VALUE: return NEXT_FUNCTION;
			case UTILITY_FUNCTION_VALUE: return UTILITY_FUNCTION;
			case FORMULATE_PROBLEM_FUNCTION_VALUE: return FORMULATE_PROBLEM_FUNCTION;
			case FORMULATE_GOAL_FUNCTION_VALUE: return FORMULATE_GOAL_FUNCTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActionSemantics(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ActionSemantics
