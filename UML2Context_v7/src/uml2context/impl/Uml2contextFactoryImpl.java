/**
 */
package uml2context.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml2context.ActionClass;
import uml2context.ActionSemantics;
import uml2context.AgentClass;
import uml2context.AgentMessageClass;
import uml2context.AgentRoleClass;
import uml2context.Aggregation;
import uml2context.AggregationType;
import uml2context.Association;
import uml2context.BehavioralFeature;
import uml2context.Belief;
import uml2context.Classifier;
import uml2context.Composite;
import uml2context.Constraint;
import uml2context.Control;
import uml2context.DataType;
import uml2context.Dependency;
import uml2context.DirectedRelationship;
import uml2context.Duty;
import uml2context.Element;
import uml2context.EnvironmentClass;
import uml2context.Feature;
import uml2context.Generalization;
import uml2context.Goal;
import uml2context.Inhabit;
import uml2context.MasmlClassDiagram;
import uml2context.MultiplicityElement;
import uml2context.MultiplicityKind;
import uml2context.NamedElement;
import uml2context.Namespace;
import uml2context.ObjectRoleClass;
import uml2context.Operation;
import uml2context.OrganizationClass;
import uml2context.Ownership;
import uml2context.PackageableElement;
import uml2context.Parameter;
import uml2context.ParameterDirectionKind;
import uml2context.Perception;
import uml2context.PlanClass;
import uml2context.Planning;
import uml2context.Play;
import uml2context.Property;
import uml2context.ProtocolClass;
import uml2context.RedefinableElement;
import uml2context.Relationship;
import uml2context.Right;
import uml2context.StructuralFeature;
import uml2context.Type;
import uml2context.TypedElement;
import uml2context.Uml2contextFactory;
import uml2context.Uml2contextPackage;
import uml2context.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Uml2contextFactoryImpl extends EFactoryImpl implements Uml2contextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Uml2contextFactory init() {
		try {
			Uml2contextFactory theUml2contextFactory = (Uml2contextFactory)EPackage.Registry.INSTANCE.getEFactory("uml2context"); 
			if (theUml2contextFactory != null) {
				return theUml2contextFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Uml2contextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uml2contextFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Uml2contextPackage.ELEMENT: return createElement();
			case Uml2contextPackage.FEATURE: return createFeature();
			case Uml2contextPackage.CLASSIFIER: return createClassifier();
			case Uml2contextPackage.STRUCTURAL_FEATURE: return createStructuralFeature();
			case Uml2contextPackage.BEHAVIORAL_FEATURE: return createBehavioralFeature();
			case Uml2contextPackage.CLASS: return createClass();
			case Uml2contextPackage.AGENT_CLASS: return createAgentClass();
			case Uml2contextPackage.PROPERTY: return createProperty();
			case Uml2contextPackage.OPERATION: return createOperation();
			case Uml2contextPackage.ACTION_CLASS: return createActionClass();
			case Uml2contextPackage.NAMED_ELEMENT: return createNamedElement();
			case Uml2contextPackage.PACKAGEABLE_ELEMENT: return createPackageableElement();
			case Uml2contextPackage.TYPE: return createType();
			case Uml2contextPackage.NAMESPACE: return createNamespace();
			case Uml2contextPackage.REDEFINABLE_ELEMENT: return createRedefinableElement();
			case Uml2contextPackage.ORGANIZATION_CLASS: return createOrganizationClass();
			case Uml2contextPackage.AGENT_ROLE_CLASS: return createAgentRoleClass();
			case Uml2contextPackage.OBJECT_ROLE_CLASS: return createObjectRoleClass();
			case Uml2contextPackage.ENVIRONMENT_CLASS: return createEnvironmentClass();
			case Uml2contextPackage.AGENT_MESSAGE_CLASS: return createAgentMessageClass();
			case Uml2contextPackage.MULTIPLICITY_ELEMENT: return createMultiplicityElement();
			case Uml2contextPackage.TYPED_ELEMENT: return createTypedElement();
			case Uml2contextPackage.PLAN_CLASS: return createPlanClass();
			case Uml2contextPackage.DUTY: return createDuty();
			case Uml2contextPackage.RIGHT: return createRight();
			case Uml2contextPackage.PROTOCOL_CLASS: return createProtocolClass();
			case Uml2contextPackage.RELATIONSHIP: return createRelationship();
			case Uml2contextPackage.DIRECTED_RELATIONSHIP: return createDirectedRelationship();
			case Uml2contextPackage.ASSOCIATION: return createAssociation();
			case Uml2contextPackage.DEPENDENCY: return createDependency();
			case Uml2contextPackage.OWNERSHIP: return createOwnership();
			case Uml2contextPackage.INHABIT: return createInhabit();
			case Uml2contextPackage.CONTROL: return createControl();
			case Uml2contextPackage.PLAY: return createPlay();
			case Uml2contextPackage.GENERALIZATION: return createGeneralization();
			case Uml2contextPackage.GOAL: return createGoal();
			case Uml2contextPackage.BELIEF: return createBelief();
			case Uml2contextPackage.CONSTRAINT: return createConstraint();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM: return createMasmlClassDiagram();
			case Uml2contextPackage.PARAMETER: return createParameter();
			case Uml2contextPackage.AGGREGATION: return createAggregation();
			case Uml2contextPackage.COMPOSITE: return createComposite();
			case Uml2contextPackage.PERCEPTION: return createPerception();
			case Uml2contextPackage.PLANNING: return createPlanning();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Uml2contextPackage.VISIBILITY_KIND:
				return createVisibilityKindFromString(eDataType, initialValue);
			case Uml2contextPackage.PARAMETER_DIRECTION_KIND:
				return createParameterDirectionKindFromString(eDataType, initialValue);
			case Uml2contextPackage.AGGREGATION_TYPE:
				return createAggregationTypeFromString(eDataType, initialValue);
			case Uml2contextPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			case Uml2contextPackage.MULTIPLICITY_KIND:
				return createMultiplicityKindFromString(eDataType, initialValue);
			case Uml2contextPackage.ACTION_SEMANTICS:
				return createActionSemanticsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Uml2contextPackage.VISIBILITY_KIND:
				return convertVisibilityKindToString(eDataType, instanceValue);
			case Uml2contextPackage.PARAMETER_DIRECTION_KIND:
				return convertParameterDirectionKindToString(eDataType, instanceValue);
			case Uml2contextPackage.AGGREGATION_TYPE:
				return convertAggregationTypeToString(eDataType, instanceValue);
			case Uml2contextPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			case Uml2contextPackage.MULTIPLICITY_KIND:
				return convertMultiplicityKindToString(eDataType, instanceValue);
			case Uml2contextPackage.ACTION_SEMANTICS:
				return convertActionSemanticsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier createClassifier() {
		ClassifierImpl classifier = new ClassifierImpl();
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeature createStructuralFeature() {
		StructuralFeatureImpl structuralFeature = new StructuralFeatureImpl();
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature createBehavioralFeature() {
		BehavioralFeatureImpl behavioralFeature = new BehavioralFeatureImpl();
		return behavioralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2context.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentClass createAgentClass() {
		AgentClassImpl agentClass = new AgentClassImpl();
		return agentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionClass createActionClass() {
		ActionClassImpl actionClass = new ActionClassImpl();
		return actionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement createPackageableElement() {
		PackageableElementImpl packageableElement = new PackageableElementImpl();
		return packageableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace createNamespace() {
		NamespaceImpl namespace = new NamespaceImpl();
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableElement createRedefinableElement() {
		RedefinableElementImpl redefinableElement = new RedefinableElementImpl();
		return redefinableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationClass createOrganizationClass() {
		OrganizationClassImpl organizationClass = new OrganizationClassImpl();
		return organizationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentRoleClass createAgentRoleClass() {
		AgentRoleClassImpl agentRoleClass = new AgentRoleClassImpl();
		return agentRoleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectRoleClass createObjectRoleClass() {
		ObjectRoleClassImpl objectRoleClass = new ObjectRoleClassImpl();
		return objectRoleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentClass createEnvironmentClass() {
		EnvironmentClassImpl environmentClass = new EnvironmentClassImpl();
		return environmentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentMessageClass createAgentMessageClass() {
		AgentMessageClassImpl agentMessageClass = new AgentMessageClassImpl();
		return agentMessageClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement createMultiplicityElement() {
		MultiplicityElementImpl multiplicityElement = new MultiplicityElementImpl();
		return multiplicityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement createTypedElement() {
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanClass createPlanClass() {
		PlanClassImpl planClass = new PlanClassImpl();
		return planClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duty createDuty() {
		DutyImpl duty = new DutyImpl();
		return duty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Right createRight() {
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolClass createProtocolClass() {
		ProtocolClassImpl protocolClass = new ProtocolClassImpl();
		return protocolClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectedRelationship createDirectedRelationship() {
		DirectedRelationshipImpl directedRelationship = new DirectedRelationshipImpl();
		return directedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ownership createOwnership() {
		OwnershipImpl ownership = new OwnershipImpl();
		return ownership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inhabit createInhabit() {
		InhabitImpl inhabit = new InhabitImpl();
		return inhabit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Play createPlay() {
		PlayImpl play = new PlayImpl();
		return play;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Belief createBelief() {
		BeliefImpl belief = new BeliefImpl();
		return belief;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasmlClassDiagram createMasmlClassDiagram() {
		MasmlClassDiagramImpl masmlClassDiagram = new MasmlClassDiagramImpl();
		return masmlClassDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Perception createPerception() {
		PerceptionImpl perception = new PerceptionImpl();
		return perception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planning createPlanning() {
		PlanningImpl planning = new PlanningImpl();
		return planning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
		VisibilityKind result = VisibilityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind createParameterDirectionKindFromString(EDataType eDataType, String initialValue) {
		ParameterDirectionKind result = ParameterDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationType createAggregationTypeFromString(EDataType eDataType, String initialValue) {
		AggregationType result = AggregationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityKind createMultiplicityKindFromString(EDataType eDataType, String initialValue) {
		MultiplicityKind result = MultiplicityKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSemantics createActionSemanticsFromString(EDataType eDataType, String initialValue) {
		ActionSemantics result = ActionSemantics.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionSemanticsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uml2contextPackage getUml2contextPackage() {
		return (Uml2contextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Uml2contextPackage getPackage() {
		return Uml2contextPackage.eINSTANCE;
	}

} //Uml2contextFactoryImpl
