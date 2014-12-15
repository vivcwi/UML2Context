/**
 */
package uml2context;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uml2context.Uml2contextFactory
 * @model kind="package"
 * @generated
 */
public interface Uml2contextPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uml2context";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uml2context";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml2context";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Uml2contextPackage eINSTANCE = uml2context.impl.Uml2contextPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml2context.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.ElementImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COMMENTS = 1;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__USE_CASE = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uml2context.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.NamedElementImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__COMMENTS = ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__USE_CASE = ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__VISIBILITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml2context.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.RedefinableElementImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getRedefinableElement()
	 * @generated
	 */
	int REDEFINABLE_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__USE_CASE = NAMED_ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Redefinable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDEFINABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2context.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.FeatureImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = REDEFINABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COMMENTS = REDEFINABLE_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__USE_CASE = REDEFINABLE_ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VISIBILITY = REDEFINABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURING_CLASSIFIER = REDEFINABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = REDEFINABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml2context.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.PackageableElementImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getPackageableElement()
	 * @generated
	 */
	int PACKAGEABLE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__USE_CASE = NAMED_ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGEABLE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2context.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.TypeImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__COMMENTS = PACKAGEABLE_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__USE_CASE = PACKAGEABLE_ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__VISIBILITY = PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2context.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.ClassifierImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__COMMENTS = TYPE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__USE_CASE = TYPE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__VISIBILITY = TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER__OWNED_RULE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml2context.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.StructuralFeatureImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getStructuralFeature()
	 * @generated
	 */
	int STRUCTURAL_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__COMMENTS = FEATURE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__USE_CASE = FEATURE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__VISIBILITY = FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__FEATURING_CLASSIFIER = FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__TYPE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__LOWER = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__UPPER = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__IS_ORDERED = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE__IS_UNIQUE = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link uml2context.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.BehavioralFeatureImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getBehavioralFeature()
	 * @generated
	 */
	int BEHAVIORAL_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__COMMENTS = FEATURE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__USE_CASE = FEATURE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__VISIBILITY = FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER = FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Paramenter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__OWNED_PARAMENTER = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE__RAISED_EXCEPTION = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Behavioral Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml2context.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.ClassImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENTS = CLASSIFIER__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__USE_CASE = CLASSIFIER__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_RULE = CLASSIFIER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OPERATIONS = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_PROPERTY = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_ABSTRACT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASS = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml2context.impl.AgentClassImpl <em>Agent Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.AgentClassImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getAgentClass()
	 * @generated
	 */
	int AGENT_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__COMMENTS = CLASSIFIER__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__USE_CASE = CLASSIFIER__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__OWNED_RULE = CLASSIFIER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Owend Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__OWEND_ACTION = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__OWNED_GOAL = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Belief</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__OWNED_BELIEF = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__OWNED_PLAN = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sent Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__SENT_MESSAGE = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receive Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__RECEIVE_MESSAGE = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inhabit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__INHABIT = CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Play</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__PLAY = CLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__SUPER_CLASS = CLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Perception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__OWNED_PERCEPTION = CLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Planning</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS__OWNED_PLANNING = CLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Agent Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link uml2context.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.PropertyImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = STRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__COMMENTS = STRUCTURAL_FEATURE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__USE_CASE = STRUCTURAL_FEATURE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VISIBILITY = STRUCTURAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FEATURING_CLASSIFIER = STRUCTURAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = STRUCTURAL_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER = STRUCTURAL_FEATURE__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER = STRUCTURAL_FEATURE__UPPER;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_ORDERED = STRUCTURAL_FEATURE__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_UNIQUE = STRUCTURAL_FEATURE__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEFAULT = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_COMPOSITE = STRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_READ_ONLY = STRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ASSOCIATION = STRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owning Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__OWNING_ASSOCIATION = STRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Redefined Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REDEFINED_PROPERTY = STRUCTURAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subsetted Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SUBSETTED_PROPERTY = STRUCTURAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__AGGREGATION = STRUCTURAL_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link uml2context.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.OperationImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = BEHAVIORAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__COMMENTS = BEHAVIORAL_FEATURE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__USE_CASE = BEHAVIORAL_FEATURE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VISIBILITY = BEHAVIORAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FEATURING_CLASSIFIER = BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Paramenter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OWNED_PARAMENTER = BEHAVIORAL_FEATURE__OWNED_PARAMENTER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RAISED_EXCEPTION = BEHAVIORAL_FEATURE__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CLASS = BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ABSTRACT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_LEAF = BEHAVIORAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_ORDERED = BEHAVIORAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_QUERY = BEHAVIORAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_STATIC = BEHAVIORAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__IS_UNIQUE = BEHAVIORAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__POSTCONDITION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PRECONDITION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Redefined Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__REDEFINED_OPERATION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Body Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY_CONDITION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_VALUE = BEHAVIORAL_FEATURE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETER = BEHAVIORAL_FEATURE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link uml2context.impl.ActionClassImpl <em>Action Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.ActionClassImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getActionClass()
	 * @generated
	 */
	int ACTION_CLASS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS__NAME = BEHAVIORAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS__COMMENTS = BEHAVIORAL_FEATURE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS__USE_CASE = BEHAVIORAL_FEATURE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS__VISIBILITY = BEHAVIORAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS__FEATURING_CLASSIFIER = BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Paramenter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS__OWNED_PARAMENTER = BEHAVIORAL_FEATURE__OWNED_PARAMENTER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS__RAISED_EXCEPTION = BEHAVIORAL_FEATURE__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS__PRECONDITION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS__POSTCONDITION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS__OWNED_PARAMETER = BEHAVIORAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS__ACTION_SEMANTICS = BEHAVIORAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CLASS_FEATURE_COUNT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml2context.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.NamespaceImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__USE_CASE = NAMED_ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_RULE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml2context.impl.OrganizationClassImpl <em>Organization Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.OrganizationClassImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getOrganizationClass()
	 * @generated
	 */
	int ORGANIZATION_CLASS = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__COMMENTS = CLASSIFIER__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__USE_CASE = CLASSIFIER__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__OWNED_RULE = CLASSIFIER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Owned Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__OWNED_GOAL = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Belief</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__OWNED_BELIEF = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__OWNED_PLAN = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__OWNED_ACTION = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sent Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__SENT_MESSAGE = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receive Message</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__RECEIVE_MESSAGE = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inhabit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__INHABIT = CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Play</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__PLAY = CLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__SUPER_CLASS = CLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__OWNED_ATTRIBUTE = CLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ownership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__OWNERSHIP = CLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Play in</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__PLAY_IN = CLASSIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Owned Agent Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__OWNED_AGENT_ROLE = CLASSIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Owened Object Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS__OWENED_OBJECT_ROLE = CLASSIFIER_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Organization Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link uml2context.impl.AgentRoleClassImpl <em>Agent Role Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.AgentRoleClassImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getAgentRoleClass()
	 * @generated
	 */
	int AGENT_ROLE_CLASS = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__COMMENTS = CLASSIFIER__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__USE_CASE = CLASSIFIER__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__OWNED_RULE = CLASSIFIER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Owned Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__OWNED_GOAL = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Duty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__OWNED_DUTY = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__OWNED_RIGHT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Play</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__PLAY = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ownership</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__OWNERSHIP = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Control</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__CONTROL = CLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__SUPER_CLASS = CLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Belief</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__OWNED_BELIEF = CLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Performative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__PERFORMATIVE = CLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reply to</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__REPLY_TO = CLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__ELEMENT = CLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__LANGUAGE = CLASSIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__ENCODING = CLASSIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Ontology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__ONTOLOGY = CLASSIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__PROTOCOL = CLASSIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Conversation id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__CONVERSATION_ID = CLASSIFIER_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Reply with</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__REPLY_WITH = CLASSIFIER_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>In reply to</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__IN_REPLY_TO = CLASSIFIER_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Reply by</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS__REPLY_BY = CLASSIFIER_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Agent Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_ROLE_CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link uml2context.impl.ObjectRoleClassImpl <em>Object Role Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.ObjectRoleClassImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getObjectRoleClass()
	 * @generated
	 */
	int OBJECT_ROLE_CLASS = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ROLE_CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ROLE_CLASS__COMMENTS = CLASSIFIER__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ROLE_CLASS__USE_CASE = CLASSIFIER__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ROLE_CLASS__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ROLE_CLASS__OWNED_RULE = CLASSIFIER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ROLE_CLASS__OWNED_ATTRIBUTE = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ROLE_CLASS__OWNED_OPERATION = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Play</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ROLE_CLASS__PLAY = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ownership</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ROLE_CLASS__OWNERSHIP = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Role Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_ROLE_CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml2context.impl.EnvironmentClassImpl <em>Environment Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.EnvironmentClassImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getEnvironmentClass()
	 * @generated
	 */
	int ENVIRONMENT_CLASS = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_CLASS__NAME = CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_CLASS__COMMENTS = CLASSIFIER__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_CLASS__USE_CASE = CLASSIFIER__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_CLASS__VISIBILITY = CLASSIFIER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_CLASS__OWNED_RULE = CLASSIFIER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_CLASS__OWNED_OPERATION = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_CLASS__OWNED_PROPERTY = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inhabit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_CLASS__INHABIT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_CLASS__OWNED_CLASS = CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Environment Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml2context.impl.AgentMessageClassImpl <em>Agent Message Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.AgentMessageClassImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getAgentMessageClass()
	 * @generated
	 */
	int AGENT_MESSAGE_CLASS = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MESSAGE_CLASS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MESSAGE_CLASS__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MESSAGE_CLASS__USE_CASE = NAMED_ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MESSAGE_CLASS__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MESSAGE_CLASS__SENDER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MESSAGE_CLASS__ROLE_SENDER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MESSAGE_CLASS__RECEIVER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MESSAGE_CLASS__ROLE_RECEIVER = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Agent Message Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_MESSAGE_CLASS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml2context.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.MultiplicityElementImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getMultiplicityElement()
	 * @generated
	 */
	int MULTIPLICITY_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__COMMENTS = ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__USE_CASE = ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__LOWER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__UPPER = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__IS_ORDERED = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__IS_UNIQUE = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml2context.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.TypedElementImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__COMMENTS = NAMED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__USE_CASE = NAMED_ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml2context.impl.PlanClassImpl <em>Plan Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.PlanClassImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getPlanClass()
	 * @generated
	 */
	int PLAN_CLASS = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CLASS__NAME = BEHAVIORAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CLASS__COMMENTS = BEHAVIORAL_FEATURE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CLASS__USE_CASE = BEHAVIORAL_FEATURE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CLASS__VISIBILITY = BEHAVIORAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CLASS__FEATURING_CLASSIFIER = BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Paramenter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CLASS__OWNED_PARAMENTER = BEHAVIORAL_FEATURE__OWNED_PARAMENTER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CLASS__RAISED_EXCEPTION = BEHAVIORAL_FEATURE__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Owend Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CLASS__OWEND_GOAL = BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CLASS__OWNED_ACTION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plan Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_CLASS_FEATURE_COUNT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml2context.impl.DutyImpl <em>Duty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.DutyImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getDuty()
	 * @generated
	 */
	int DUTY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY__NAME = ACTION_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY__COMMENTS = ACTION_CLASS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY__USE_CASE = ACTION_CLASS__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY__VISIBILITY = ACTION_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY__FEATURING_CLASSIFIER = ACTION_CLASS__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Paramenter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY__OWNED_PARAMENTER = ACTION_CLASS__OWNED_PARAMENTER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY__RAISED_EXCEPTION = ACTION_CLASS__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY__PRECONDITION = ACTION_CLASS__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY__POSTCONDITION = ACTION_CLASS__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY__OWNED_PARAMETER = ACTION_CLASS__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Action Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY__ACTION_SEMANTICS = ACTION_CLASS__ACTION_SEMANTICS;

	/**
	 * The number of structural features of the '<em>Duty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUTY_FEATURE_COUNT = ACTION_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2context.impl.RightImpl <em>Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.RightImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getRight()
	 * @generated
	 */
	int RIGHT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__NAME = ACTION_CLASS__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__COMMENTS = ACTION_CLASS__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__USE_CASE = ACTION_CLASS__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__VISIBILITY = ACTION_CLASS__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__FEATURING_CLASSIFIER = ACTION_CLASS__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Paramenter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__OWNED_PARAMENTER = ACTION_CLASS__OWNED_PARAMENTER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__RAISED_EXCEPTION = ACTION_CLASS__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__PRECONDITION = ACTION_CLASS__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__POSTCONDITION = ACTION_CLASS__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__OWNED_PARAMETER = ACTION_CLASS__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Action Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT__ACTION_SEMANTICS = ACTION_CLASS__ACTION_SEMANTICS;

	/**
	 * The number of structural features of the '<em>Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_FEATURE_COUNT = ACTION_CLASS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2context.impl.ProtocolClassImpl <em>Protocol Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.ProtocolClassImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getProtocolClass()
	 * @generated
	 */
	int PROTOCOL_CLASS = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CLASS__NAME = BEHAVIORAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CLASS__COMMENTS = BEHAVIORAL_FEATURE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CLASS__USE_CASE = BEHAVIORAL_FEATURE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CLASS__VISIBILITY = BEHAVIORAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CLASS__FEATURING_CLASSIFIER = BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Paramenter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CLASS__OWNED_PARAMENTER = BEHAVIORAL_FEATURE__OWNED_PARAMENTER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CLASS__RAISED_EXCEPTION = BEHAVIORAL_FEATURE__RAISED_EXCEPTION;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CLASS__MESSAGES = BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Protocol Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_CLASS_FEATURE_COUNT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml2context.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.RelationshipImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__COMMENTS = ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__USE_CASE = ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATED_ELEMENT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uml2context.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.DirectedRelationshipImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getDirectedRelationship()
	 * @generated
	 */
	int DIRECTED_RELATIONSHIP = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__COMMENTS = RELATIONSHIP__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__USE_CASE = RELATIONSHIP__USE_CASE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2context.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.AssociationImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COMMENTS = RELATIONSHIP__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__USE_CASE = RELATIONSHIP__USE_CASE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__VISIBILITY = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_RULE = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_DERIVED = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_END = RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Member End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__MEMBER_END = RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__END_TYPE = RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Navigable Owned End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAVIGABLE_OWNED_END = RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_LEAF = RELATIONSHIP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_ABSTRACT = RELATIONSHIP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Source Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_MULTIPLICITY = RELATIONSHIP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Target Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_MULTIPLICITY = RELATIONSHIP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__REPRESENTATION = RELATIONSHIP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE_NAME = RELATIONSHIP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_NAME = RELATIONSHIP_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link uml2context.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.DependencyImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = DIRECTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__COMMENTS = DIRECTED_RELATIONSHIP__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__USE_CASE = DIRECTED_RELATIONSHIP__USE_CASE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SUPPLIER = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__CLIENT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml2context.impl.OwnershipImpl <em>Ownership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.OwnershipImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getOwnership()
	 * @generated
	 */
	int OWNERSHIP = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__NAME = DIRECTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__COMMENTS = DIRECTED_RELATIONSHIP__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__USE_CASE = DIRECTED_RELATIONSHIP__USE_CASE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Agent Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__AGENT_ROLE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__OBJECT_ROLE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__OWNER = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ownership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uml2context.impl.InhabitImpl <em>Inhabit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.InhabitImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getInhabit()
	 * @generated
	 */
	int INHABIT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT__NAME = DIRECTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT__COMMENTS = DIRECTED_RELATIONSHIP__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT__USE_CASE = DIRECTED_RELATIONSHIP__USE_CASE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Org</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT__SUB_ORG = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT__CLASS = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Agent Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT__AGENT_CLASS = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Org</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT__ORG = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT__ENV = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Inhabit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHABIT_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link uml2context.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.ControlImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = DIRECTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__COMMENTS = DIRECTED_RELATIONSHIP__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__USE_CASE = DIRECTED_RELATIONSHIP__USE_CASE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTROLLER = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controlled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CONTROLLED = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml2context.impl.PlayImpl <em>Play</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.PlayImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getPlay()
	 * @generated
	 */
	int PLAY = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY__NAME = DIRECTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY__COMMENTS = DIRECTED_RELATIONSHIP__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY__USE_CASE = DIRECTED_RELATIONSHIP__USE_CASE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY__AGENT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agent Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY__AGENT_ROLE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY__OBJECT_ROLE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Org</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY__ORG = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Play</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uml2context.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.GeneralizationImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = DIRECTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__COMMENTS = DIRECTED_RELATIONSHIP__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__USE_CASE = DIRECTED_RELATIONSHIP__USE_CASE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specific</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SPECIFIC = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uml2context.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.GoalImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__COMMENTS = PROPERTY__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__USE_CASE = PROPERTY__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__VISIBILITY = PROPERTY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__FEATURING_CLASSIFIER = PROPERTY__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TYPE = PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__LOWER = PROPERTY__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__UPPER = PROPERTY__UPPER;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_ORDERED = PROPERTY__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_UNIQUE = PROPERTY__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DEFAULT = PROPERTY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_COMPOSITE = PROPERTY__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_READ_ONLY = PROPERTY__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSOCIATION = PROPERTY__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Owning Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__OWNING_ASSOCIATION = PROPERTY__OWNING_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Redefined Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__REDEFINED_PROPERTY = PROPERTY__REDEFINED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Subsetted Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SUBSETTED_PROPERTY = PROPERTY__SUBSETTED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__AGGREGATION = PROPERTY__AGGREGATION;

	/**
	 * The feature id for the '<em><b>Owned Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__OWNED_PLAN = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uml2context.impl.BeliefImpl <em>Belief</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.BeliefImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getBelief()
	 * @generated
	 */
	int BELIEF = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__COMMENTS = PROPERTY__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__USE_CASE = PROPERTY__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__VISIBILITY = PROPERTY__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__FEATURING_CLASSIFIER = PROPERTY__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__TYPE = PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__LOWER = PROPERTY__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__UPPER = PROPERTY__UPPER;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__IS_ORDERED = PROPERTY__IS_ORDERED;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__IS_UNIQUE = PROPERTY__IS_UNIQUE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__DEFAULT = PROPERTY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__IS_COMPOSITE = PROPERTY__IS_COMPOSITE;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__IS_READ_ONLY = PROPERTY__IS_READ_ONLY;

	/**
	 * The feature id for the '<em><b>Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__ASSOCIATION = PROPERTY__ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Owning Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__OWNING_ASSOCIATION = PROPERTY__OWNING_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Redefined Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__REDEFINED_PROPERTY = PROPERTY__REDEFINED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Subsetted Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__SUBSETTED_PROPERTY = PROPERTY__SUBSETTED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__AGGREGATION = PROPERTY__AGGREGATION;

	/**
	 * The number of structural features of the '<em>Belief</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2context.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.ConstraintImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = PACKAGEABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__COMMENTS = PACKAGEABLE_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__USE_CASE = PACKAGEABLE_ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__VISIBILITY = PACKAGEABLE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Constrained Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINED_ELEMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONTEXT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraint Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONSTRAINT_SPECIFICATION = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uml2context.impl.MasmlClassDiagramImpl <em>Masml Class Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.MasmlClassDiagramImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getMasmlClassDiagram()
	 * @generated
	 */
	int MASML_CLASS_DIAGRAM = 38;

	/**
	 * The feature id for the '<em><b>Owned Organization Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_ORGANIZATION_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Owned Environment Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_ENVIRONMENT_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Owned Agent Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_AGENT_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Owned Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Owned Play</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_PLAY = 4;

	/**
	 * The feature id for the '<em><b>Owned Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_GENERALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Owned Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_DEPENDENCY = 6;

	/**
	 * The feature id for the '<em><b>Owned Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION = 7;

	/**
	 * The feature id for the '<em><b>Owned Aggregation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_AGGREGATION = 8;

	/**
	 * The feature id for the '<em><b>Owned Composite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_COMPOSITE = 9;

	/**
	 * The feature id for the '<em><b>Owned Inhabit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_INHABIT = 10;

	/**
	 * The feature id for the '<em><b>Owned Ownership</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_OWNERSHIP = 11;

	/**
	 * The feature id for the '<em><b>Owned Object Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_OBJECT_ROLE_CLASS = 12;

	/**
	 * The feature id for the '<em><b>Owned Agent Role Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM__OWNED_AGENT_ROLE_CLASS = 13;

	/**
	 * The number of structural features of the '<em>Masml Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASML_CLASS_DIAGRAM_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link uml2context.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.ParameterImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COMMENTS = TYPED_ELEMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__USE_CASE = TYPED_ELEMENT__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VISIBILITY = TYPED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LOWER = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UPPER = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_ORDERED = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_UNIQUE = TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DIRECTION = TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPERATION = TYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link uml2context.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.AggregationImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__COMMENTS = ASSOCIATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__USE_CASE = ASSOCIATION__USE_CASE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SOURCE = ASSOCIATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET = ASSOCIATION__TARGET;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__RELATED_ELEMENT = ASSOCIATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__VISIBILITY = ASSOCIATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__OWNED_RULE = ASSOCIATION__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__IS_DERIVED = ASSOCIATION__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__OWNED_END = ASSOCIATION__OWNED_END;

	/**
	 * The feature id for the '<em><b>Member End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__MEMBER_END = ASSOCIATION__MEMBER_END;

	/**
	 * The feature id for the '<em><b>End Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__END_TYPE = ASSOCIATION__END_TYPE;

	/**
	 * The feature id for the '<em><b>Navigable Owned End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__NAVIGABLE_OWNED_END = ASSOCIATION__NAVIGABLE_OWNED_END;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__IS_LEAF = ASSOCIATION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__IS_ABSTRACT = ASSOCIATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Source Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SOURCE_MULTIPLICITY = ASSOCIATION__SOURCE_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Target Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET_MULTIPLICITY = ASSOCIATION__TARGET_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__REPRESENTATION = ASSOCIATION__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SOURCE_NAME = ASSOCIATION__SOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET_NAME = ASSOCIATION__TARGET_NAME;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2context.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.CompositeImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAME = ASSOCIATION__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__COMMENTS = ASSOCIATION__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__USE_CASE = ASSOCIATION__USE_CASE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SOURCE = ASSOCIATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__TARGET = ASSOCIATION__TARGET;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__RELATED_ELEMENT = ASSOCIATION__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__VISIBILITY = ASSOCIATION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__OWNED_RULE = ASSOCIATION__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__IS_DERIVED = ASSOCIATION__IS_DERIVED;

	/**
	 * The feature id for the '<em><b>Owned End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__OWNED_END = ASSOCIATION__OWNED_END;

	/**
	 * The feature id for the '<em><b>Member End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__MEMBER_END = ASSOCIATION__MEMBER_END;

	/**
	 * The feature id for the '<em><b>End Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__END_TYPE = ASSOCIATION__END_TYPE;

	/**
	 * The feature id for the '<em><b>Navigable Owned End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__NAVIGABLE_OWNED_END = ASSOCIATION__NAVIGABLE_OWNED_END;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__IS_LEAF = ASSOCIATION__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__IS_ABSTRACT = ASSOCIATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Source Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SOURCE_MULTIPLICITY = ASSOCIATION__SOURCE_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Target Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__TARGET_MULTIPLICITY = ASSOCIATION__TARGET_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__REPRESENTATION = ASSOCIATION__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SOURCE_NAME = ASSOCIATION__SOURCE_NAME;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__TARGET_NAME = ASSOCIATION__TARGET_NAME;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2context.impl.PerceptionImpl <em>Perception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.PerceptionImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getPerception()
	 * @generated
	 */
	int PERCEPTION = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION__NAME = BEHAVIORAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION__COMMENTS = BEHAVIORAL_FEATURE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION__USE_CASE = BEHAVIORAL_FEATURE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION__VISIBILITY = BEHAVIORAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION__FEATURING_CLASSIFIER = BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Paramenter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION__OWNED_PARAMENTER = BEHAVIORAL_FEATURE__OWNED_PARAMENTER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION__RAISED_EXCEPTION = BEHAVIORAL_FEATURE__RAISED_EXCEPTION;

	/**
	 * The number of structural features of the '<em>Perception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCEPTION_FEATURE_COUNT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2context.impl.PlanningImpl <em>Planning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.impl.PlanningImpl
	 * @see uml2context.impl.Uml2contextPackageImpl#getPlanning()
	 * @generated
	 */
	int PLANNING = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING__NAME = BEHAVIORAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING__COMMENTS = BEHAVIORAL_FEATURE__COMMENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING__USE_CASE = BEHAVIORAL_FEATURE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING__VISIBILITY = BEHAVIORAL_FEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Featuring Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING__FEATURING_CLASSIFIER = BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Owned Paramenter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING__OWNED_PARAMENTER = BEHAVIORAL_FEATURE__OWNED_PARAMENTER;

	/**
	 * The feature id for the '<em><b>Raised Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING__RAISED_EXCEPTION = BEHAVIORAL_FEATURE__RAISED_EXCEPTION;

	/**
	 * The number of structural features of the '<em>Planning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANNING_FEATURE_COUNT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uml2context.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.VisibilityKind
	 * @see uml2context.impl.Uml2contextPackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 44;

	/**
	 * The meta object id for the '{@link uml2context.ParameterDirectionKind <em>Parameter Direction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.ParameterDirectionKind
	 * @see uml2context.impl.Uml2contextPackageImpl#getParameterDirectionKind()
	 * @generated
	 */
	int PARAMETER_DIRECTION_KIND = 45;

	/**
	 * The meta object id for the '{@link uml2context.AggregationType <em>Aggregation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.AggregationType
	 * @see uml2context.impl.Uml2contextPackageImpl#getAggregationType()
	 * @generated
	 */
	int AGGREGATION_TYPE = 46;

	/**
	 * The meta object id for the '{@link uml2context.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.DataType
	 * @see uml2context.impl.Uml2contextPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 47;

	/**
	 * The meta object id for the '{@link uml2context.MultiplicityKind <em>Multiplicity Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.MultiplicityKind
	 * @see uml2context.impl.Uml2contextPackageImpl#getMultiplicityKind()
	 * @generated
	 */
	int MULTIPLICITY_KIND = 48;

	/**
	 * The meta object id for the '{@link uml2context.ActionSemantics <em>Action Semantics</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml2context.ActionSemantics
	 * @see uml2context.impl.Uml2contextPackageImpl#getActionSemantics()
	 * @generated
	 */
	int ACTION_SEMANTICS = 49;


	/**
	 * Returns the meta object for class '{@link uml2context.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see uml2context.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml2context.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute list '{@link uml2context.Element#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments</em>'.
	 * @see uml2context.Element#getComments()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Comments();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Element#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Case</em>'.
	 * @see uml2context.Element#getUseCase()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_UseCase();

	/**
	 * Returns the meta object for class '{@link uml2context.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see uml2context.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Featuring Classifier</em>'.
	 * @see uml2context.Feature#getFeaturingClassifier()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeaturingClassifier();

	/**
	 * Returns the meta object for class '{@link uml2context.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see uml2context.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link uml2context.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see uml2context.StructuralFeature
	 * @generated
	 */
	EClass getStructuralFeature();

	/**
	 * Returns the meta object for class '{@link uml2context.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Feature</em>'.
	 * @see uml2context.BehavioralFeature
	 * @generated
	 */
	EClass getBehavioralFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.BehavioralFeature#getOwnedParamenter <em>Owned Paramenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Paramenter</em>'.
	 * @see uml2context.BehavioralFeature#getOwnedParamenter()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EReference getBehavioralFeature_OwnedParamenter();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.BehavioralFeature#getRaisedException <em>Raised Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raised Exception</em>'.
	 * @see uml2context.BehavioralFeature#getRaisedException()
	 * @see #getBehavioralFeature()
	 * @generated
	 */
	EReference getBehavioralFeature_RaisedException();

	/**
	 * Returns the meta object for class '{@link uml2context.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see uml2context.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.Class#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see uml2context.Class#getOperations()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.Class#getOwnedProperty <em>Owned Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property</em>'.
	 * @see uml2context.Class#getOwnedProperty()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedProperty();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Class#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see uml2context.Class#isIsAbstract()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsAbstract();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.Class#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see uml2context.Class#getSuperClass()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SuperClass();

	/**
	 * Returns the meta object for class '{@link uml2context.AgentClass <em>Agent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Class</em>'.
	 * @see uml2context.AgentClass
	 * @generated
	 */
	EClass getAgentClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentClass#getOwendAction <em>Owend Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owend Action</em>'.
	 * @see uml2context.AgentClass#getOwendAction()
	 * @see #getAgentClass()
	 * @generated
	 */
	EReference getAgentClass_OwendAction();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentClass#getOwnedGoal <em>Owned Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Goal</em>'.
	 * @see uml2context.AgentClass#getOwnedGoal()
	 * @see #getAgentClass()
	 * @generated
	 */
	EReference getAgentClass_OwnedGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentClass#getOwnedBelief <em>Owned Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Belief</em>'.
	 * @see uml2context.AgentClass#getOwnedBelief()
	 * @see #getAgentClass()
	 * @generated
	 */
	EReference getAgentClass_OwnedBelief();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentClass#getOwnedPlan <em>Owned Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Plan</em>'.
	 * @see uml2context.AgentClass#getOwnedPlan()
	 * @see #getAgentClass()
	 * @generated
	 */
	EReference getAgentClass_OwnedPlan();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.AgentClass#getSentMessage <em>Sent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sent Message</em>'.
	 * @see uml2context.AgentClass#getSentMessage()
	 * @see #getAgentClass()
	 * @generated
	 */
	EReference getAgentClass_SentMessage();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.AgentClass#getReceiveMessage <em>Receive Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receive Message</em>'.
	 * @see uml2context.AgentClass#getReceiveMessage()
	 * @see #getAgentClass()
	 * @generated
	 */
	EReference getAgentClass_ReceiveMessage();

	/**
	 * Returns the meta object for the reference '{@link uml2context.AgentClass#getInhabit <em>Inhabit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inhabit</em>'.
	 * @see uml2context.AgentClass#getInhabit()
	 * @see #getAgentClass()
	 * @generated
	 */
	EReference getAgentClass_Inhabit();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.AgentClass#getPlay <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Play</em>'.
	 * @see uml2context.AgentClass#getPlay()
	 * @see #getAgentClass()
	 * @generated
	 */
	EReference getAgentClass_Play();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.AgentClass#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see uml2context.AgentClass#getSuperClass()
	 * @see #getAgentClass()
	 * @generated
	 */
	EReference getAgentClass_SuperClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentClass#getOwnedPerception <em>Owned Perception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Perception</em>'.
	 * @see uml2context.AgentClass#getOwnedPerception()
	 * @see #getAgentClass()
	 * @generated
	 */
	EReference getAgentClass_OwnedPerception();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentClass#getOwnedPlanning <em>Owned Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Planning</em>'.
	 * @see uml2context.AgentClass#getOwnedPlanning()
	 * @see #getAgentClass()
	 * @generated
	 */
	EReference getAgentClass_OwnedPlanning();

	/**
	 * Returns the meta object for class '{@link uml2context.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see uml2context.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Property#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see uml2context.Property#getDefault()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Default();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Property#isIsComposite <em>Is Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composite</em>'.
	 * @see uml2context.Property#isIsComposite()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsComposite();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Property#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see uml2context.Property#isIsReadOnly()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsReadOnly();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Property#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Association</em>'.
	 * @see uml2context.Property#getAssociation()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Association();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Property#getOwningAssociation <em>Owning Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Association</em>'.
	 * @see uml2context.Property#getOwningAssociation()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_OwningAssociation();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.Property#getRedefinedProperty <em>Redefined Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Redefined Property</em>'.
	 * @see uml2context.Property#getRedefinedProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_RedefinedProperty();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.Property#getSubsettedProperty <em>Subsetted Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsetted Property</em>'.
	 * @see uml2context.Property#getSubsettedProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_SubsettedProperty();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Property#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see uml2context.Property#getAggregation()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Aggregation();

	/**
	 * Returns the meta object for class '{@link uml2context.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see uml2context.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Operation#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see uml2context.Operation#getClass_()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Class();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Operation#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see uml2context.Operation#isIsAbstract()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Operation#isIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see uml2context.Operation#isIsLeaf()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Operation#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see uml2context.Operation#isIsOrdered()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Operation#isIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see uml2context.Operation#isIsQuery()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsQuery();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Operation#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see uml2context.Operation#isIsStatic()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Operation#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see uml2context.Operation#isIsUnique()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Operation#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcondition</em>'.
	 * @see uml2context.Operation#getPostcondition()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Postcondition();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Operation#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see uml2context.Operation#getPrecondition()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Operation#getRedefinedOperation <em>Redefined Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redefined Operation</em>'.
	 * @see uml2context.Operation#getRedefinedOperation()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_RedefinedOperation();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Operation#getBodyCondition <em>Body Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body Condition</em>'.
	 * @see uml2context.Operation#getBodyCondition()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_BodyCondition();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Operation#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Value</em>'.
	 * @see uml2context.Operation#getReturnValue()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ReturnValue();

	/**
	 * Returns the meta object for the attribute list '{@link uml2context.Operation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter</em>'.
	 * @see uml2context.Operation#getParameter()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Parameter();

	/**
	 * Returns the meta object for class '{@link uml2context.ActionClass <em>Action Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Class</em>'.
	 * @see uml2context.ActionClass
	 * @generated
	 */
	EClass getActionClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.ActionClass#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Precondition</em>'.
	 * @see uml2context.ActionClass#getPrecondition()
	 * @see #getActionClass()
	 * @generated
	 */
	EReference getActionClass_Precondition();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.ActionClass#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Postcondition</em>'.
	 * @see uml2context.ActionClass#getPostcondition()
	 * @see #getActionClass()
	 * @generated
	 */
	EReference getActionClass_Postcondition();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.ActionClass#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see uml2context.ActionClass#getOwnedParameter()
	 * @see #getActionClass()
	 * @generated
	 */
	EReference getActionClass_OwnedParameter();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.ActionClass#getActionSemantics <em>Action Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Semantics</em>'.
	 * @see uml2context.ActionClass#getActionSemantics()
	 * @see #getActionClass()
	 * @generated
	 */
	EAttribute getActionClass_ActionSemantics();

	/**
	 * Returns the meta object for class '{@link uml2context.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see uml2context.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.NamedElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see uml2context.NamedElement#getVisibility()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Visibility();

	/**
	 * Returns the meta object for class '{@link uml2context.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packageable Element</em>'.
	 * @see uml2context.PackageableElement
	 * @generated
	 */
	EClass getPackageableElement();

	/**
	 * Returns the meta object for class '{@link uml2context.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see uml2context.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link uml2context.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see uml2context.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.Namespace#getOwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Rule</em>'.
	 * @see uml2context.Namespace#getOwnedRule()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_OwnedRule();

	/**
	 * Returns the meta object for class '{@link uml2context.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redefinable Element</em>'.
	 * @see uml2context.RedefinableElement
	 * @generated
	 */
	EClass getRedefinableElement();

	/**
	 * Returns the meta object for class '{@link uml2context.OrganizationClass <em>Organization Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Class</em>'.
	 * @see uml2context.OrganizationClass
	 * @generated
	 */
	EClass getOrganizationClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.OrganizationClass#getOwnedGoal <em>Owned Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Goal</em>'.
	 * @see uml2context.OrganizationClass#getOwnedGoal()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_OwnedGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.OrganizationClass#getOwnedBelief <em>Owned Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Belief</em>'.
	 * @see uml2context.OrganizationClass#getOwnedBelief()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_OwnedBelief();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.OrganizationClass#getOwnedPlan <em>Owned Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Plan</em>'.
	 * @see uml2context.OrganizationClass#getOwnedPlan()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_OwnedPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.OrganizationClass#getOwnedAction <em>Owned Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Action</em>'.
	 * @see uml2context.OrganizationClass#getOwnedAction()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_OwnedAction();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.OrganizationClass#getSentMessage <em>Sent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sent Message</em>'.
	 * @see uml2context.OrganizationClass#getSentMessage()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_SentMessage();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.OrganizationClass#getReceiveMessage <em>Receive Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receive Message</em>'.
	 * @see uml2context.OrganizationClass#getReceiveMessage()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_ReceiveMessage();

	/**
	 * Returns the meta object for the reference '{@link uml2context.OrganizationClass#getInhabit <em>Inhabit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inhabit</em>'.
	 * @see uml2context.OrganizationClass#getInhabit()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_Inhabit();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.OrganizationClass#getPlay <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Play</em>'.
	 * @see uml2context.OrganizationClass#getPlay()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_Play();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.OrganizationClass#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see uml2context.OrganizationClass#getSuperClass()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_SuperClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.OrganizationClass#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see uml2context.OrganizationClass#getOwnedAttribute()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_OwnedAttribute();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.OrganizationClass#getOwnership <em>Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ownership</em>'.
	 * @see uml2context.OrganizationClass#getOwnership()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_Ownership();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.OrganizationClass#getPlay_in <em>Play in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Play in</em>'.
	 * @see uml2context.OrganizationClass#getPlay_in()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_Play_in();

	/**
	 * Returns the meta object for the containment reference '{@link uml2context.OrganizationClass#getOwnedAgentRole <em>Owned Agent Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Agent Role</em>'.
	 * @see uml2context.OrganizationClass#getOwnedAgentRole()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_OwnedAgentRole();

	/**
	 * Returns the meta object for the containment reference '{@link uml2context.OrganizationClass#getOwenedObjectRole <em>Owened Object Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owened Object Role</em>'.
	 * @see uml2context.OrganizationClass#getOwenedObjectRole()
	 * @see #getOrganizationClass()
	 * @generated
	 */
	EReference getOrganizationClass_OwenedObjectRole();

	/**
	 * Returns the meta object for class '{@link uml2context.AgentRoleClass <em>Agent Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Role Class</em>'.
	 * @see uml2context.AgentRoleClass
	 * @generated
	 */
	EClass getAgentRoleClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentRoleClass#getOwnedGoal <em>Owned Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Goal</em>'.
	 * @see uml2context.AgentRoleClass#getOwnedGoal()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EReference getAgentRoleClass_OwnedGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentRoleClass#getOwnedDuty <em>Owned Duty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Duty</em>'.
	 * @see uml2context.AgentRoleClass#getOwnedDuty()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EReference getAgentRoleClass_OwnedDuty();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentRoleClass#getOwnedRight <em>Owned Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Right</em>'.
	 * @see uml2context.AgentRoleClass#getOwnedRight()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EReference getAgentRoleClass_OwnedRight();

	/**
	 * Returns the meta object for the reference '{@link uml2context.AgentRoleClass#getPlay <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Play</em>'.
	 * @see uml2context.AgentRoleClass#getPlay()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EReference getAgentRoleClass_Play();

	/**
	 * Returns the meta object for the reference '{@link uml2context.AgentRoleClass#getOwnership <em>Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ownership</em>'.
	 * @see uml2context.AgentRoleClass#getOwnership()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EReference getAgentRoleClass_Ownership();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.AgentRoleClass#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control</em>'.
	 * @see uml2context.AgentRoleClass#getControl()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EReference getAgentRoleClass_Control();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.AgentRoleClass#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class</em>'.
	 * @see uml2context.AgentRoleClass#getSuperClass()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EReference getAgentRoleClass_SuperClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentRoleClass#getOwnedBelief <em>Owned Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Belief</em>'.
	 * @see uml2context.AgentRoleClass#getOwnedBelief()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EReference getAgentRoleClass_OwnedBelief();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.AgentRoleClass#getPerformative <em>Performative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performative</em>'.
	 * @see uml2context.AgentRoleClass#getPerformative()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EAttribute getAgentRoleClass_Performative();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentRoleClass#getReply_to <em>Reply to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reply to</em>'.
	 * @see uml2context.AgentRoleClass#getReply_to()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EReference getAgentRoleClass_Reply_to();

	/**
	 * Returns the meta object for the reference '{@link uml2context.AgentRoleClass#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see uml2context.AgentRoleClass#getElement()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EReference getAgentRoleClass_Element();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.AgentRoleClass#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see uml2context.AgentRoleClass#getLanguage()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EAttribute getAgentRoleClass_Language();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.AgentRoleClass#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see uml2context.AgentRoleClass#getEncoding()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EAttribute getAgentRoleClass_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.AgentRoleClass#getOntology <em>Ontology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ontology</em>'.
	 * @see uml2context.AgentRoleClass#getOntology()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EAttribute getAgentRoleClass_Ontology();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.AgentRoleClass#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol</em>'.
	 * @see uml2context.AgentRoleClass#getProtocol()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EReference getAgentRoleClass_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.AgentRoleClass#getConversation_id <em>Conversation id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversation id</em>'.
	 * @see uml2context.AgentRoleClass#getConversation_id()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EAttribute getAgentRoleClass_Conversation_id();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.AgentRoleClass#getReply_with <em>Reply with</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reply with</em>'.
	 * @see uml2context.AgentRoleClass#getReply_with()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EAttribute getAgentRoleClass_Reply_with();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.AgentRoleClass#getIn_reply_to <em>In reply to</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In reply to</em>'.
	 * @see uml2context.AgentRoleClass#getIn_reply_to()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EAttribute getAgentRoleClass_In_reply_to();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.AgentRoleClass#getReply_by <em>Reply by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reply by</em>'.
	 * @see uml2context.AgentRoleClass#getReply_by()
	 * @see #getAgentRoleClass()
	 * @generated
	 */
	EAttribute getAgentRoleClass_Reply_by();

	/**
	 * Returns the meta object for class '{@link uml2context.ObjectRoleClass <em>Object Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Role Class</em>'.
	 * @see uml2context.ObjectRoleClass
	 * @generated
	 */
	EClass getObjectRoleClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.ObjectRoleClass#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see uml2context.ObjectRoleClass#getOwnedAttribute()
	 * @see #getObjectRoleClass()
	 * @generated
	 */
	EReference getObjectRoleClass_OwnedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.ObjectRoleClass#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
	 * @see uml2context.ObjectRoleClass#getOwnedOperation()
	 * @see #getObjectRoleClass()
	 * @generated
	 */
	EReference getObjectRoleClass_OwnedOperation();

	/**
	 * Returns the meta object for the reference '{@link uml2context.ObjectRoleClass#getPlay <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Play</em>'.
	 * @see uml2context.ObjectRoleClass#getPlay()
	 * @see #getObjectRoleClass()
	 * @generated
	 */
	EReference getObjectRoleClass_Play();

	/**
	 * Returns the meta object for the reference '{@link uml2context.ObjectRoleClass#getOwnership <em>Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ownership</em>'.
	 * @see uml2context.ObjectRoleClass#getOwnership()
	 * @see #getObjectRoleClass()
	 * @generated
	 */
	EReference getObjectRoleClass_Ownership();

	/**
	 * Returns the meta object for class '{@link uml2context.EnvironmentClass <em>Environment Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Class</em>'.
	 * @see uml2context.EnvironmentClass
	 * @generated
	 */
	EClass getEnvironmentClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.EnvironmentClass#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
	 * @see uml2context.EnvironmentClass#getOwnedOperation()
	 * @see #getEnvironmentClass()
	 * @generated
	 */
	EReference getEnvironmentClass_OwnedOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.EnvironmentClass#getOwnedProperty <em>Owned Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property</em>'.
	 * @see uml2context.EnvironmentClass#getOwnedProperty()
	 * @see #getEnvironmentClass()
	 * @generated
	 */
	EReference getEnvironmentClass_OwnedProperty();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.EnvironmentClass#getInhabit <em>Inhabit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inhabit</em>'.
	 * @see uml2context.EnvironmentClass#getInhabit()
	 * @see #getEnvironmentClass()
	 * @generated
	 */
	EReference getEnvironmentClass_Inhabit();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.EnvironmentClass#getOwnedClass <em>Owned Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Class</em>'.
	 * @see uml2context.EnvironmentClass#getOwnedClass()
	 * @see #getEnvironmentClass()
	 * @generated
	 */
	EReference getEnvironmentClass_OwnedClass();

	/**
	 * Returns the meta object for class '{@link uml2context.AgentMessageClass <em>Agent Message Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent Message Class</em>'.
	 * @see uml2context.AgentMessageClass
	 * @generated
	 */
	EClass getAgentMessageClass();

	/**
	 * Returns the meta object for the reference '{@link uml2context.AgentMessageClass#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sender</em>'.
	 * @see uml2context.AgentMessageClass#getSender()
	 * @see #getAgentMessageClass()
	 * @generated
	 */
	EReference getAgentMessageClass_Sender();

	/**
	 * Returns the meta object for the reference '{@link uml2context.AgentMessageClass#getRoleSender <em>Role Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Sender</em>'.
	 * @see uml2context.AgentMessageClass#getRoleSender()
	 * @see #getAgentMessageClass()
	 * @generated
	 */
	EReference getAgentMessageClass_RoleSender();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.AgentMessageClass#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receiver</em>'.
	 * @see uml2context.AgentMessageClass#getReceiver()
	 * @see #getAgentMessageClass()
	 * @generated
	 */
	EReference getAgentMessageClass_Receiver();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.AgentMessageClass#getRoleReceiver <em>Role Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role Receiver</em>'.
	 * @see uml2context.AgentMessageClass#getRoleReceiver()
	 * @see #getAgentMessageClass()
	 * @generated
	 */
	EReference getAgentMessageClass_RoleReceiver();

	/**
	 * Returns the meta object for class '{@link uml2context.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Element</em>'.
	 * @see uml2context.MultiplicityElement
	 * @generated
	 */
	EClass getMultiplicityElement();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.MultiplicityElement#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see uml2context.MultiplicityElement#getLower()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Lower();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.MultiplicityElement#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see uml2context.MultiplicityElement#getUpper()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_Upper();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.MultiplicityElement#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see uml2context.MultiplicityElement#isIsOrdered()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.MultiplicityElement#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see uml2context.MultiplicityElement#isIsUnique()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_IsUnique();

	/**
	 * Returns the meta object for class '{@link uml2context.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see uml2context.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see uml2context.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link uml2context.PlanClass <em>Plan Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Class</em>'.
	 * @see uml2context.PlanClass
	 * @generated
	 */
	EClass getPlanClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.PlanClass#getOwendGoal <em>Owend Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owend Goal</em>'.
	 * @see uml2context.PlanClass#getOwendGoal()
	 * @see #getPlanClass()
	 * @generated
	 */
	EReference getPlanClass_OwendGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.PlanClass#getOwnedAction <em>Owned Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Action</em>'.
	 * @see uml2context.PlanClass#getOwnedAction()
	 * @see #getPlanClass()
	 * @generated
	 */
	EReference getPlanClass_OwnedAction();

	/**
	 * Returns the meta object for class '{@link uml2context.Duty <em>Duty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duty</em>'.
	 * @see uml2context.Duty
	 * @generated
	 */
	EClass getDuty();

	/**
	 * Returns the meta object for class '{@link uml2context.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right</em>'.
	 * @see uml2context.Right
	 * @generated
	 */
	EClass getRight();

	/**
	 * Returns the meta object for class '{@link uml2context.ProtocolClass <em>Protocol Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Class</em>'.
	 * @see uml2context.ProtocolClass
	 * @generated
	 */
	EClass getProtocolClass();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.ProtocolClass#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Messages</em>'.
	 * @see uml2context.ProtocolClass#getMessages()
	 * @see #getProtocolClass()
	 * @generated
	 */
	EReference getProtocolClass_Messages();

	/**
	 * Returns the meta object for class '{@link uml2context.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see uml2context.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see uml2context.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see uml2context.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.Relationship#getRelatedElement <em>Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Element</em>'.
	 * @see uml2context.Relationship#getRelatedElement()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RelatedElement();

	/**
	 * Returns the meta object for class '{@link uml2context.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Relationship</em>'.
	 * @see uml2context.DirectedRelationship
	 * @generated
	 */
	EClass getDirectedRelationship();

	/**
	 * Returns the meta object for class '{@link uml2context.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see uml2context.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Association#isIsDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see uml2context.Association#isIsDerived()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_IsDerived();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.Association#getOwnedEnd <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned End</em>'.
	 * @see uml2context.Association#getOwnedEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_OwnedEnd();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.Association#getMemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member End</em>'.
	 * @see uml2context.Association#getMemberEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_MemberEnd();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.Association#getEndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Type</em>'.
	 * @see uml2context.Association#getEndType()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_EndType();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.Association#getNavigableOwnedEnd <em>Navigable Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Navigable Owned End</em>'.
	 * @see uml2context.Association#getNavigableOwnedEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_NavigableOwnedEnd();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Association#isIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see uml2context.Association#isIsLeaf()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Association#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see uml2context.Association#isIsAbstract()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Association#getSourceMultiplicity <em>Source Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Multiplicity</em>'.
	 * @see uml2context.Association#getSourceMultiplicity()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_SourceMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Association#getTargetMultiplicity <em>Target Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Multiplicity</em>'.
	 * @see uml2context.Association#getTargetMultiplicity()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Association#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see uml2context.Association#getRepresentation()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Representation();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Association#getSourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Name</em>'.
	 * @see uml2context.Association#getSourceName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_SourceName();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Association#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Name</em>'.
	 * @see uml2context.Association#getTargetName()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_TargetName();

	/**
	 * Returns the meta object for class '{@link uml2context.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see uml2context.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.Dependency#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supplier</em>'.
	 * @see uml2context.Dependency#getSupplier()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Supplier();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.Dependency#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Client</em>'.
	 * @see uml2context.Dependency#getClient()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Client();

	/**
	 * Returns the meta object for class '{@link uml2context.Ownership <em>Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ownership</em>'.
	 * @see uml2context.Ownership
	 * @generated
	 */
	EClass getOwnership();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Ownership#getAgentRole <em>Agent Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent Role</em>'.
	 * @see uml2context.Ownership#getAgentRole()
	 * @see #getOwnership()
	 * @generated
	 */
	EReference getOwnership_AgentRole();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Ownership#getObjectRole <em>Object Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Role</em>'.
	 * @see uml2context.Ownership#getObjectRole()
	 * @see #getOwnership()
	 * @generated
	 */
	EReference getOwnership_ObjectRole();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Ownership#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see uml2context.Ownership#getOwner()
	 * @see #getOwnership()
	 * @generated
	 */
	EReference getOwnership_Owner();

	/**
	 * Returns the meta object for class '{@link uml2context.Inhabit <em>Inhabit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inhabit</em>'.
	 * @see uml2context.Inhabit
	 * @generated
	 */
	EClass getInhabit();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Inhabit#getSubOrg <em>Sub Org</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Org</em>'.
	 * @see uml2context.Inhabit#getSubOrg()
	 * @see #getInhabit()
	 * @generated
	 */
	EReference getInhabit_SubOrg();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Inhabit#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class</em>'.
	 * @see uml2context.Inhabit#getClass_()
	 * @see #getInhabit()
	 * @generated
	 */
	EReference getInhabit_Class();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Inhabit#getAgentClass <em>Agent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent Class</em>'.
	 * @see uml2context.Inhabit#getAgentClass()
	 * @see #getInhabit()
	 * @generated
	 */
	EReference getInhabit_AgentClass();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Inhabit#getOrg <em>Org</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Org</em>'.
	 * @see uml2context.Inhabit#getOrg()
	 * @see #getInhabit()
	 * @generated
	 */
	EReference getInhabit_Org();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Inhabit#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Env</em>'.
	 * @see uml2context.Inhabit#getEnv()
	 * @see #getInhabit()
	 * @generated
	 */
	EReference getInhabit_Env();

	/**
	 * Returns the meta object for class '{@link uml2context.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see uml2context.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Control#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see uml2context.Control#getController()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Controller();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Control#getControlled <em>Controlled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlled</em>'.
	 * @see uml2context.Control#getControlled()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Controlled();

	/**
	 * Returns the meta object for class '{@link uml2context.Play <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play</em>'.
	 * @see uml2context.Play
	 * @generated
	 */
	EClass getPlay();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Play#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see uml2context.Play#getAgent()
	 * @see #getPlay()
	 * @generated
	 */
	EReference getPlay_Agent();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Play#getAgentRole <em>Agent Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent Role</em>'.
	 * @see uml2context.Play#getAgentRole()
	 * @see #getPlay()
	 * @generated
	 */
	EReference getPlay_AgentRole();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Play#getObjectRole <em>Object Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Role</em>'.
	 * @see uml2context.Play#getObjectRole()
	 * @see #getPlay()
	 * @generated
	 */
	EReference getPlay_ObjectRole();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Play#getOrg <em>Org</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Org</em>'.
	 * @see uml2context.Play#getOrg()
	 * @see #getPlay()
	 * @generated
	 */
	EReference getPlay_Org();

	/**
	 * Returns the meta object for class '{@link uml2context.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see uml2context.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>General</em>'.
	 * @see uml2context.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_General();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specific</em>'.
	 * @see uml2context.Generalization#getSpecific()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Specific();

	/**
	 * Returns the meta object for class '{@link uml2context.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see uml2context.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the containment reference '{@link uml2context.Goal#getOwnedPlan <em>Owned Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Plan</em>'.
	 * @see uml2context.Goal#getOwnedPlan()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_OwnedPlan();

	/**
	 * Returns the meta object for class '{@link uml2context.Belief <em>Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belief</em>'.
	 * @see uml2context.Belief
	 * @generated
	 */
	EClass getBelief();

	/**
	 * Returns the meta object for class '{@link uml2context.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see uml2context.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference list '{@link uml2context.Constraint#getConstrainedElement <em>Constrained Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constrained Element</em>'.
	 * @see uml2context.Constraint#getConstrainedElement()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstrainedElement();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Constraint#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see uml2context.Constraint#getContext()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Context();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Constraint#getConstraintSpecification <em>Constraint Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Specification</em>'.
	 * @see uml2context.Constraint#getConstraintSpecification()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_ConstraintSpecification();

	/**
	 * Returns the meta object for class '{@link uml2context.MasmlClassDiagram <em>Masml Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Masml Class Diagram</em>'.
	 * @see uml2context.MasmlClassDiagram
	 * @generated
	 */
	EClass getMasmlClassDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedOrganizationClass <em>Owned Organization Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Organization Class</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedOrganizationClass()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedOrganizationClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedEnvironmentClass <em>Owned Environment Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Environment Class</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedEnvironmentClass()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedEnvironmentClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedAgentClass <em>Owned Agent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Agent Class</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedAgentClass()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedAgentClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedClass <em>Owned Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Class</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedClass()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedPlay <em>Owned Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Play</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedPlay()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedPlay();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedGeneralization <em>Owned Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Generalization</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedGeneralization()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedGeneralization();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedDependency <em>Owned Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Dependency</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedDependency()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedDependency();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedAssociation <em>Owned Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Association</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedAssociation()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedAggregation <em>Owned Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Aggregation</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedAggregation()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedAggregation();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedComposite <em>Owned Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Composite</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedComposite()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedInhabit <em>Owned Inhabit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Inhabit</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedInhabit()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedInhabit();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedOwnership <em>Owned Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Ownership</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedOwnership()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedOwnership();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedObjectRoleClass <em>Owned Object Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Object Role Class</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedObjectRoleClass()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedObjectRoleClass();

	/**
	 * Returns the meta object for the containment reference list '{@link uml2context.MasmlClassDiagram#getOwnedAgentRoleClass <em>Owned Agent Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Agent Role Class</em>'.
	 * @see uml2context.MasmlClassDiagram#getOwnedAgentRoleClass()
	 * @see #getMasmlClassDiagram()
	 * @generated
	 */
	EReference getMasmlClassDiagram_OwnedAgentRoleClass();

	/**
	 * Returns the meta object for class '{@link uml2context.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see uml2context.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see uml2context.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Default();

	/**
	 * Returns the meta object for the attribute '{@link uml2context.Parameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see uml2context.Parameter#getDirection()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Direction();

	/**
	 * Returns the meta object for the reference '{@link uml2context.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see uml2context.Parameter#getOperation()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Operation();

	/**
	 * Returns the meta object for class '{@link uml2context.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see uml2context.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for class '{@link uml2context.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see uml2context.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for class '{@link uml2context.Perception <em>Perception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perception</em>'.
	 * @see uml2context.Perception
	 * @generated
	 */
	EClass getPerception();

	/**
	 * Returns the meta object for class '{@link uml2context.Planning <em>Planning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planning</em>'.
	 * @see uml2context.Planning
	 * @generated
	 */
	EClass getPlanning();

	/**
	 * Returns the meta object for enum '{@link uml2context.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see uml2context.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the meta object for enum '{@link uml2context.ParameterDirectionKind <em>Parameter Direction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Direction Kind</em>'.
	 * @see uml2context.ParameterDirectionKind
	 * @generated
	 */
	EEnum getParameterDirectionKind();

	/**
	 * Returns the meta object for enum '{@link uml2context.AggregationType <em>Aggregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Type</em>'.
	 * @see uml2context.AggregationType
	 * @generated
	 */
	EEnum getAggregationType();

	/**
	 * Returns the meta object for enum '{@link uml2context.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see uml2context.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link uml2context.MultiplicityKind <em>Multiplicity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity Kind</em>'.
	 * @see uml2context.MultiplicityKind
	 * @generated
	 */
	EEnum getMultiplicityKind();

	/**
	 * Returns the meta object for enum '{@link uml2context.ActionSemantics <em>Action Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Semantics</em>'.
	 * @see uml2context.ActionSemantics
	 * @generated
	 */
	EEnum getActionSemantics();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Uml2contextFactory getUml2contextFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uml2context.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.ElementImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COMMENTS = eINSTANCE.getElement_Comments();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__USE_CASE = eINSTANCE.getElement_UseCase();

		/**
		 * The meta object literal for the '{@link uml2context.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.FeatureImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Featuring Classifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURING_CLASSIFIER = eINSTANCE.getFeature_FeaturingClassifier();

		/**
		 * The meta object literal for the '{@link uml2context.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.ClassifierImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link uml2context.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.StructuralFeatureImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getStructuralFeature()
		 * @generated
		 */
		EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

		/**
		 * The meta object literal for the '{@link uml2context.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.BehavioralFeatureImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getBehavioralFeature()
		 * @generated
		 */
		EClass BEHAVIORAL_FEATURE = eINSTANCE.getBehavioralFeature();

		/**
		 * The meta object literal for the '<em><b>Owned Paramenter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE__OWNED_PARAMENTER = eINSTANCE.getBehavioralFeature_OwnedParamenter();

		/**
		 * The meta object literal for the '<em><b>Raised Exception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_FEATURE__RAISED_EXCEPTION = eINSTANCE.getBehavioralFeature_RaisedException();

		/**
		 * The meta object literal for the '{@link uml2context.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.ClassImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OPERATIONS = eINSTANCE.getClass_Operations();

		/**
		 * The meta object literal for the '<em><b>Owned Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_PROPERTY = eINSTANCE.getClass_OwnedProperty();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPER_CLASS = eINSTANCE.getClass_SuperClass();

		/**
		 * The meta object literal for the '{@link uml2context.impl.AgentClassImpl <em>Agent Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.AgentClassImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getAgentClass()
		 * @generated
		 */
		EClass AGENT_CLASS = eINSTANCE.getAgentClass();

		/**
		 * The meta object literal for the '<em><b>Owend Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CLASS__OWEND_ACTION = eINSTANCE.getAgentClass_OwendAction();

		/**
		 * The meta object literal for the '<em><b>Owned Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CLASS__OWNED_GOAL = eINSTANCE.getAgentClass_OwnedGoal();

		/**
		 * The meta object literal for the '<em><b>Owned Belief</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CLASS__OWNED_BELIEF = eINSTANCE.getAgentClass_OwnedBelief();

		/**
		 * The meta object literal for the '<em><b>Owned Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CLASS__OWNED_PLAN = eINSTANCE.getAgentClass_OwnedPlan();

		/**
		 * The meta object literal for the '<em><b>Sent Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CLASS__SENT_MESSAGE = eINSTANCE.getAgentClass_SentMessage();

		/**
		 * The meta object literal for the '<em><b>Receive Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CLASS__RECEIVE_MESSAGE = eINSTANCE.getAgentClass_ReceiveMessage();

		/**
		 * The meta object literal for the '<em><b>Inhabit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CLASS__INHABIT = eINSTANCE.getAgentClass_Inhabit();

		/**
		 * The meta object literal for the '<em><b>Play</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CLASS__PLAY = eINSTANCE.getAgentClass_Play();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CLASS__SUPER_CLASS = eINSTANCE.getAgentClass_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Owned Perception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CLASS__OWNED_PERCEPTION = eINSTANCE.getAgentClass_OwnedPerception();

		/**
		 * The meta object literal for the '<em><b>Owned Planning</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_CLASS__OWNED_PLANNING = eINSTANCE.getAgentClass_OwnedPlanning();

		/**
		 * The meta object literal for the '{@link uml2context.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.PropertyImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DEFAULT = eINSTANCE.getProperty_Default();

		/**
		 * The meta object literal for the '<em><b>Is Composite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_COMPOSITE = eINSTANCE.getProperty_IsComposite();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_READ_ONLY = eINSTANCE.getProperty_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ASSOCIATION = eINSTANCE.getProperty_Association();

		/**
		 * The meta object literal for the '<em><b>Owning Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__OWNING_ASSOCIATION = eINSTANCE.getProperty_OwningAssociation();

		/**
		 * The meta object literal for the '<em><b>Redefined Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__REDEFINED_PROPERTY = eINSTANCE.getProperty_RedefinedProperty();

		/**
		 * The meta object literal for the '<em><b>Subsetted Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SUBSETTED_PROPERTY = eINSTANCE.getProperty_SubsettedProperty();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__AGGREGATION = eINSTANCE.getProperty_Aggregation();

		/**
		 * The meta object literal for the '{@link uml2context.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.OperationImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__CLASS = eINSTANCE.getOperation_Class();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_ABSTRACT = eINSTANCE.getOperation_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_LEAF = eINSTANCE.getOperation_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_ORDERED = eINSTANCE.getOperation_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_QUERY = eINSTANCE.getOperation_IsQuery();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_STATIC = eINSTANCE.getOperation_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__IS_UNIQUE = eINSTANCE.getOperation_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__POSTCONDITION = eINSTANCE.getOperation_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__PRECONDITION = eINSTANCE.getOperation_Precondition();

		/**
		 * The meta object literal for the '<em><b>Redefined Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__REDEFINED_OPERATION = eINSTANCE.getOperation_RedefinedOperation();

		/**
		 * The meta object literal for the '<em><b>Body Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__BODY_CONDITION = eINSTANCE.getOperation_BodyCondition();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURN_VALUE = eINSTANCE.getOperation_ReturnValue();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__PARAMETER = eINSTANCE.getOperation_Parameter();

		/**
		 * The meta object literal for the '{@link uml2context.impl.ActionClassImpl <em>Action Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.ActionClassImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getActionClass()
		 * @generated
		 */
		EClass ACTION_CLASS = eINSTANCE.getActionClass();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CLASS__PRECONDITION = eINSTANCE.getActionClass_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CLASS__POSTCONDITION = eINSTANCE.getActionClass_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_CLASS__OWNED_PARAMETER = eINSTANCE.getActionClass_OwnedParameter();

		/**
		 * The meta object literal for the '<em><b>Action Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_CLASS__ACTION_SEMANTICS = eINSTANCE.getActionClass_ActionSemantics();

		/**
		 * The meta object literal for the '{@link uml2context.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.NamedElementImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__VISIBILITY = eINSTANCE.getNamedElement_Visibility();

		/**
		 * The meta object literal for the '{@link uml2context.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.PackageableElementImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getPackageableElement()
		 * @generated
		 */
		EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

		/**
		 * The meta object literal for the '{@link uml2context.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.TypeImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link uml2context.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.NamespaceImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Owned Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__OWNED_RULE = eINSTANCE.getNamespace_OwnedRule();

		/**
		 * The meta object literal for the '{@link uml2context.impl.RedefinableElementImpl <em>Redefinable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.RedefinableElementImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getRedefinableElement()
		 * @generated
		 */
		EClass REDEFINABLE_ELEMENT = eINSTANCE.getRedefinableElement();

		/**
		 * The meta object literal for the '{@link uml2context.impl.OrganizationClassImpl <em>Organization Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.OrganizationClassImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getOrganizationClass()
		 * @generated
		 */
		EClass ORGANIZATION_CLASS = eINSTANCE.getOrganizationClass();

		/**
		 * The meta object literal for the '<em><b>Owned Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__OWNED_GOAL = eINSTANCE.getOrganizationClass_OwnedGoal();

		/**
		 * The meta object literal for the '<em><b>Owned Belief</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__OWNED_BELIEF = eINSTANCE.getOrganizationClass_OwnedBelief();

		/**
		 * The meta object literal for the '<em><b>Owned Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__OWNED_PLAN = eINSTANCE.getOrganizationClass_OwnedPlan();

		/**
		 * The meta object literal for the '<em><b>Owned Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__OWNED_ACTION = eINSTANCE.getOrganizationClass_OwnedAction();

		/**
		 * The meta object literal for the '<em><b>Sent Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__SENT_MESSAGE = eINSTANCE.getOrganizationClass_SentMessage();

		/**
		 * The meta object literal for the '<em><b>Receive Message</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__RECEIVE_MESSAGE = eINSTANCE.getOrganizationClass_ReceiveMessage();

		/**
		 * The meta object literal for the '<em><b>Inhabit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__INHABIT = eINSTANCE.getOrganizationClass_Inhabit();

		/**
		 * The meta object literal for the '<em><b>Play</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__PLAY = eINSTANCE.getOrganizationClass_Play();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__SUPER_CLASS = eINSTANCE.getOrganizationClass_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__OWNED_ATTRIBUTE = eINSTANCE.getOrganizationClass_OwnedAttribute();

		/**
		 * The meta object literal for the '<em><b>Ownership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__OWNERSHIP = eINSTANCE.getOrganizationClass_Ownership();

		/**
		 * The meta object literal for the '<em><b>Play in</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__PLAY_IN = eINSTANCE.getOrganizationClass_Play_in();

		/**
		 * The meta object literal for the '<em><b>Owned Agent Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__OWNED_AGENT_ROLE = eINSTANCE.getOrganizationClass_OwnedAgentRole();

		/**
		 * The meta object literal for the '<em><b>Owened Object Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_CLASS__OWENED_OBJECT_ROLE = eINSTANCE.getOrganizationClass_OwenedObjectRole();

		/**
		 * The meta object literal for the '{@link uml2context.impl.AgentRoleClassImpl <em>Agent Role Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.AgentRoleClassImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getAgentRoleClass()
		 * @generated
		 */
		EClass AGENT_ROLE_CLASS = eINSTANCE.getAgentRoleClass();

		/**
		 * The meta object literal for the '<em><b>Owned Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ROLE_CLASS__OWNED_GOAL = eINSTANCE.getAgentRoleClass_OwnedGoal();

		/**
		 * The meta object literal for the '<em><b>Owned Duty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ROLE_CLASS__OWNED_DUTY = eINSTANCE.getAgentRoleClass_OwnedDuty();

		/**
		 * The meta object literal for the '<em><b>Owned Right</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ROLE_CLASS__OWNED_RIGHT = eINSTANCE.getAgentRoleClass_OwnedRight();

		/**
		 * The meta object literal for the '<em><b>Play</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ROLE_CLASS__PLAY = eINSTANCE.getAgentRoleClass_Play();

		/**
		 * The meta object literal for the '<em><b>Ownership</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ROLE_CLASS__OWNERSHIP = eINSTANCE.getAgentRoleClass_Ownership();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ROLE_CLASS__CONTROL = eINSTANCE.getAgentRoleClass_Control();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ROLE_CLASS__SUPER_CLASS = eINSTANCE.getAgentRoleClass_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Owned Belief</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ROLE_CLASS__OWNED_BELIEF = eINSTANCE.getAgentRoleClass_OwnedBelief();

		/**
		 * The meta object literal for the '<em><b>Performative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_ROLE_CLASS__PERFORMATIVE = eINSTANCE.getAgentRoleClass_Performative();

		/**
		 * The meta object literal for the '<em><b>Reply to</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ROLE_CLASS__REPLY_TO = eINSTANCE.getAgentRoleClass_Reply_to();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ROLE_CLASS__ELEMENT = eINSTANCE.getAgentRoleClass_Element();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_ROLE_CLASS__LANGUAGE = eINSTANCE.getAgentRoleClass_Language();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_ROLE_CLASS__ENCODING = eINSTANCE.getAgentRoleClass_Encoding();

		/**
		 * The meta object literal for the '<em><b>Ontology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_ROLE_CLASS__ONTOLOGY = eINSTANCE.getAgentRoleClass_Ontology();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_ROLE_CLASS__PROTOCOL = eINSTANCE.getAgentRoleClass_Protocol();

		/**
		 * The meta object literal for the '<em><b>Conversation id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_ROLE_CLASS__CONVERSATION_ID = eINSTANCE.getAgentRoleClass_Conversation_id();

		/**
		 * The meta object literal for the '<em><b>Reply with</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_ROLE_CLASS__REPLY_WITH = eINSTANCE.getAgentRoleClass_Reply_with();

		/**
		 * The meta object literal for the '<em><b>In reply to</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_ROLE_CLASS__IN_REPLY_TO = eINSTANCE.getAgentRoleClass_In_reply_to();

		/**
		 * The meta object literal for the '<em><b>Reply by</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT_ROLE_CLASS__REPLY_BY = eINSTANCE.getAgentRoleClass_Reply_by();

		/**
		 * The meta object literal for the '{@link uml2context.impl.ObjectRoleClassImpl <em>Object Role Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.ObjectRoleClassImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getObjectRoleClass()
		 * @generated
		 */
		EClass OBJECT_ROLE_CLASS = eINSTANCE.getObjectRoleClass();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ROLE_CLASS__OWNED_ATTRIBUTE = eINSTANCE.getObjectRoleClass_OwnedAttribute();

		/**
		 * The meta object literal for the '<em><b>Owned Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ROLE_CLASS__OWNED_OPERATION = eINSTANCE.getObjectRoleClass_OwnedOperation();

		/**
		 * The meta object literal for the '<em><b>Play</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ROLE_CLASS__PLAY = eINSTANCE.getObjectRoleClass_Play();

		/**
		 * The meta object literal for the '<em><b>Ownership</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_ROLE_CLASS__OWNERSHIP = eINSTANCE.getObjectRoleClass_Ownership();

		/**
		 * The meta object literal for the '{@link uml2context.impl.EnvironmentClassImpl <em>Environment Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.EnvironmentClassImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getEnvironmentClass()
		 * @generated
		 */
		EClass ENVIRONMENT_CLASS = eINSTANCE.getEnvironmentClass();

		/**
		 * The meta object literal for the '<em><b>Owned Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_CLASS__OWNED_OPERATION = eINSTANCE.getEnvironmentClass_OwnedOperation();

		/**
		 * The meta object literal for the '<em><b>Owned Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_CLASS__OWNED_PROPERTY = eINSTANCE.getEnvironmentClass_OwnedProperty();

		/**
		 * The meta object literal for the '<em><b>Inhabit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_CLASS__INHABIT = eINSTANCE.getEnvironmentClass_Inhabit();

		/**
		 * The meta object literal for the '<em><b>Owned Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_CLASS__OWNED_CLASS = eINSTANCE.getEnvironmentClass_OwnedClass();

		/**
		 * The meta object literal for the '{@link uml2context.impl.AgentMessageClassImpl <em>Agent Message Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.AgentMessageClassImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getAgentMessageClass()
		 * @generated
		 */
		EClass AGENT_MESSAGE_CLASS = eINSTANCE.getAgentMessageClass();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_MESSAGE_CLASS__SENDER = eINSTANCE.getAgentMessageClass_Sender();

		/**
		 * The meta object literal for the '<em><b>Role Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_MESSAGE_CLASS__ROLE_SENDER = eINSTANCE.getAgentMessageClass_RoleSender();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_MESSAGE_CLASS__RECEIVER = eINSTANCE.getAgentMessageClass_Receiver();

		/**
		 * The meta object literal for the '<em><b>Role Receiver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_MESSAGE_CLASS__ROLE_RECEIVER = eINSTANCE.getAgentMessageClass_RoleReceiver();

		/**
		 * The meta object literal for the '{@link uml2context.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.MultiplicityElementImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getMultiplicityElement()
		 * @generated
		 */
		EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__LOWER = eINSTANCE.getMultiplicityElement_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__UPPER = eINSTANCE.getMultiplicityElement_Upper();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__IS_ORDERED = eINSTANCE.getMultiplicityElement_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__IS_UNIQUE = eINSTANCE.getMultiplicityElement_IsUnique();

		/**
		 * The meta object literal for the '{@link uml2context.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.TypedElementImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link uml2context.impl.PlanClassImpl <em>Plan Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.PlanClassImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getPlanClass()
		 * @generated
		 */
		EClass PLAN_CLASS = eINSTANCE.getPlanClass();

		/**
		 * The meta object literal for the '<em><b>Owend Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_CLASS__OWEND_GOAL = eINSTANCE.getPlanClass_OwendGoal();

		/**
		 * The meta object literal for the '<em><b>Owned Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN_CLASS__OWNED_ACTION = eINSTANCE.getPlanClass_OwnedAction();

		/**
		 * The meta object literal for the '{@link uml2context.impl.DutyImpl <em>Duty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.DutyImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getDuty()
		 * @generated
		 */
		EClass DUTY = eINSTANCE.getDuty();

		/**
		 * The meta object literal for the '{@link uml2context.impl.RightImpl <em>Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.RightImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getRight()
		 * @generated
		 */
		EClass RIGHT = eINSTANCE.getRight();

		/**
		 * The meta object literal for the '{@link uml2context.impl.ProtocolClassImpl <em>Protocol Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.ProtocolClassImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getProtocolClass()
		 * @generated
		 */
		EClass PROTOCOL_CLASS = eINSTANCE.getProtocolClass();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_CLASS__MESSAGES = eINSTANCE.getProtocolClass_Messages();

		/**
		 * The meta object literal for the '{@link uml2context.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.RelationshipImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Related Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATED_ELEMENT = eINSTANCE.getRelationship_RelatedElement();

		/**
		 * The meta object literal for the '{@link uml2context.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.DirectedRelationshipImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getDirectedRelationship()
		 * @generated
		 */
		EClass DIRECTED_RELATIONSHIP = eINSTANCE.getDirectedRelationship();

		/**
		 * The meta object literal for the '{@link uml2context.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.AssociationImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__IS_DERIVED = eINSTANCE.getAssociation_IsDerived();

		/**
		 * The meta object literal for the '<em><b>Owned End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__OWNED_END = eINSTANCE.getAssociation_OwnedEnd();

		/**
		 * The meta object literal for the '<em><b>Member End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__MEMBER_END = eINSTANCE.getAssociation_MemberEnd();

		/**
		 * The meta object literal for the '<em><b>End Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__END_TYPE = eINSTANCE.getAssociation_EndType();

		/**
		 * The meta object literal for the '<em><b>Navigable Owned End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__NAVIGABLE_OWNED_END = eINSTANCE.getAssociation_NavigableOwnedEnd();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__IS_LEAF = eINSTANCE.getAssociation_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__IS_ABSTRACT = eINSTANCE.getAssociation_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Source Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SOURCE_MULTIPLICITY = eINSTANCE.getAssociation_SourceMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Target Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_MULTIPLICITY = eINSTANCE.getAssociation_TargetMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__REPRESENTATION = eINSTANCE.getAssociation_Representation();

		/**
		 * The meta object literal for the '<em><b>Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SOURCE_NAME = eINSTANCE.getAssociation_SourceName();

		/**
		 * The meta object literal for the '<em><b>Target Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TARGET_NAME = eINSTANCE.getAssociation_TargetName();

		/**
		 * The meta object literal for the '{@link uml2context.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.DependencyImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__SUPPLIER = eINSTANCE.getDependency_Supplier();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__CLIENT = eINSTANCE.getDependency_Client();

		/**
		 * The meta object literal for the '{@link uml2context.impl.OwnershipImpl <em>Ownership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.OwnershipImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getOwnership()
		 * @generated
		 */
		EClass OWNERSHIP = eINSTANCE.getOwnership();

		/**
		 * The meta object literal for the '<em><b>Agent Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNERSHIP__AGENT_ROLE = eINSTANCE.getOwnership_AgentRole();

		/**
		 * The meta object literal for the '<em><b>Object Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNERSHIP__OBJECT_ROLE = eINSTANCE.getOwnership_ObjectRole();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNERSHIP__OWNER = eINSTANCE.getOwnership_Owner();

		/**
		 * The meta object literal for the '{@link uml2context.impl.InhabitImpl <em>Inhabit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.InhabitImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getInhabit()
		 * @generated
		 */
		EClass INHABIT = eINSTANCE.getInhabit();

		/**
		 * The meta object literal for the '<em><b>Sub Org</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHABIT__SUB_ORG = eINSTANCE.getInhabit_SubOrg();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHABIT__CLASS = eINSTANCE.getInhabit_Class();

		/**
		 * The meta object literal for the '<em><b>Agent Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHABIT__AGENT_CLASS = eINSTANCE.getInhabit_AgentClass();

		/**
		 * The meta object literal for the '<em><b>Org</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHABIT__ORG = eINSTANCE.getInhabit_Org();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHABIT__ENV = eINSTANCE.getInhabit_Env();

		/**
		 * The meta object literal for the '{@link uml2context.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.ControlImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__CONTROLLER = eINSTANCE.getControl_Controller();

		/**
		 * The meta object literal for the '<em><b>Controlled</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__CONTROLLED = eINSTANCE.getControl_Controlled();

		/**
		 * The meta object literal for the '{@link uml2context.impl.PlayImpl <em>Play</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.PlayImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getPlay()
		 * @generated
		 */
		EClass PLAY = eINSTANCE.getPlay();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAY__AGENT = eINSTANCE.getPlay_Agent();

		/**
		 * The meta object literal for the '<em><b>Agent Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAY__AGENT_ROLE = eINSTANCE.getPlay_AgentRole();

		/**
		 * The meta object literal for the '<em><b>Object Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAY__OBJECT_ROLE = eINSTANCE.getPlay_ObjectRole();

		/**
		 * The meta object literal for the '<em><b>Org</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAY__ORG = eINSTANCE.getPlay_Org();

		/**
		 * The meta object literal for the '{@link uml2context.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.GeneralizationImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

		/**
		 * The meta object literal for the '<em><b>Specific</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

		/**
		 * The meta object literal for the '{@link uml2context.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.GoalImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Owned Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__OWNED_PLAN = eINSTANCE.getGoal_OwnedPlan();

		/**
		 * The meta object literal for the '{@link uml2context.impl.BeliefImpl <em>Belief</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.BeliefImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getBelief()
		 * @generated
		 */
		EClass BELIEF = eINSTANCE.getBelief();

		/**
		 * The meta object literal for the '{@link uml2context.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.ConstraintImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Constrained Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONSTRAINED_ELEMENT = eINSTANCE.getConstraint_ConstrainedElement();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONTEXT = eINSTANCE.getConstraint_Context();

		/**
		 * The meta object literal for the '<em><b>Constraint Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__CONSTRAINT_SPECIFICATION = eINSTANCE.getConstraint_ConstraintSpecification();

		/**
		 * The meta object literal for the '{@link uml2context.impl.MasmlClassDiagramImpl <em>Masml Class Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.MasmlClassDiagramImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getMasmlClassDiagram()
		 * @generated
		 */
		EClass MASML_CLASS_DIAGRAM = eINSTANCE.getMasmlClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Owned Organization Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_ORGANIZATION_CLASS = eINSTANCE.getMasmlClassDiagram_OwnedOrganizationClass();

		/**
		 * The meta object literal for the '<em><b>Owned Environment Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_ENVIRONMENT_CLASS = eINSTANCE.getMasmlClassDiagram_OwnedEnvironmentClass();

		/**
		 * The meta object literal for the '<em><b>Owned Agent Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_AGENT_CLASS = eINSTANCE.getMasmlClassDiagram_OwnedAgentClass();

		/**
		 * The meta object literal for the '<em><b>Owned Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_CLASS = eINSTANCE.getMasmlClassDiagram_OwnedClass();

		/**
		 * The meta object literal for the '<em><b>Owned Play</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_PLAY = eINSTANCE.getMasmlClassDiagram_OwnedPlay();

		/**
		 * The meta object literal for the '<em><b>Owned Generalization</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_GENERALIZATION = eINSTANCE.getMasmlClassDiagram_OwnedGeneralization();

		/**
		 * The meta object literal for the '<em><b>Owned Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_DEPENDENCY = eINSTANCE.getMasmlClassDiagram_OwnedDependency();

		/**
		 * The meta object literal for the '<em><b>Owned Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION = eINSTANCE.getMasmlClassDiagram_OwnedAssociation();

		/**
		 * The meta object literal for the '<em><b>Owned Aggregation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_AGGREGATION = eINSTANCE.getMasmlClassDiagram_OwnedAggregation();

		/**
		 * The meta object literal for the '<em><b>Owned Composite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_COMPOSITE = eINSTANCE.getMasmlClassDiagram_OwnedComposite();

		/**
		 * The meta object literal for the '<em><b>Owned Inhabit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_INHABIT = eINSTANCE.getMasmlClassDiagram_OwnedInhabit();

		/**
		 * The meta object literal for the '<em><b>Owned Ownership</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_OWNERSHIP = eINSTANCE.getMasmlClassDiagram_OwnedOwnership();

		/**
		 * The meta object literal for the '<em><b>Owned Object Role Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_OBJECT_ROLE_CLASS = eINSTANCE.getMasmlClassDiagram_OwnedObjectRoleClass();

		/**
		 * The meta object literal for the '<em><b>Owned Agent Role Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASML_CLASS_DIAGRAM__OWNED_AGENT_ROLE_CLASS = eINSTANCE.getMasmlClassDiagram_OwnedAgentRoleClass();

		/**
		 * The meta object literal for the '{@link uml2context.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.ParameterImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DIRECTION = eINSTANCE.getParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OPERATION = eINSTANCE.getParameter_Operation();

		/**
		 * The meta object literal for the '{@link uml2context.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.AggregationImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link uml2context.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.CompositeImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '{@link uml2context.impl.PerceptionImpl <em>Perception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.PerceptionImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getPerception()
		 * @generated
		 */
		EClass PERCEPTION = eINSTANCE.getPerception();

		/**
		 * The meta object literal for the '{@link uml2context.impl.PlanningImpl <em>Planning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.impl.PlanningImpl
		 * @see uml2context.impl.Uml2contextPackageImpl#getPlanning()
		 * @generated
		 */
		EClass PLANNING = eINSTANCE.getPlanning();

		/**
		 * The meta object literal for the '{@link uml2context.VisibilityKind <em>Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.VisibilityKind
		 * @see uml2context.impl.Uml2contextPackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

		/**
		 * The meta object literal for the '{@link uml2context.ParameterDirectionKind <em>Parameter Direction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.ParameterDirectionKind
		 * @see uml2context.impl.Uml2contextPackageImpl#getParameterDirectionKind()
		 * @generated
		 */
		EEnum PARAMETER_DIRECTION_KIND = eINSTANCE.getParameterDirectionKind();

		/**
		 * The meta object literal for the '{@link uml2context.AggregationType <em>Aggregation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.AggregationType
		 * @see uml2context.impl.Uml2contextPackageImpl#getAggregationType()
		 * @generated
		 */
		EEnum AGGREGATION_TYPE = eINSTANCE.getAggregationType();

		/**
		 * The meta object literal for the '{@link uml2context.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.DataType
		 * @see uml2context.impl.Uml2contextPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link uml2context.MultiplicityKind <em>Multiplicity Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.MultiplicityKind
		 * @see uml2context.impl.Uml2contextPackageImpl#getMultiplicityKind()
		 * @generated
		 */
		EEnum MULTIPLICITY_KIND = eINSTANCE.getMultiplicityKind();

		/**
		 * The meta object literal for the '{@link uml2context.ActionSemantics <em>Action Semantics</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml2context.ActionSemantics
		 * @see uml2context.impl.Uml2contextPackageImpl#getActionSemantics()
		 * @generated
		 */
		EEnum ACTION_SEMANTICS = eINSTANCE.getActionSemantics();

	}

} //Uml2contextPackage
