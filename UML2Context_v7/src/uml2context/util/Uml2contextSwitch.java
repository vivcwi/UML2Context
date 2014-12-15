/**
 */
package uml2context.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uml2context.ActionClass;
import uml2context.AgentClass;
import uml2context.AgentMessageClass;
import uml2context.AgentRoleClass;
import uml2context.Aggregation;
import uml2context.Association;
import uml2context.BehavioralFeature;
import uml2context.Belief;
import uml2context.Classifier;
import uml2context.Composite;
import uml2context.Constraint;
import uml2context.Control;
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
import uml2context.NamedElement;
import uml2context.Namespace;
import uml2context.ObjectRoleClass;
import uml2context.Operation;
import uml2context.OrganizationClass;
import uml2context.Ownership;
import uml2context.PackageableElement;
import uml2context.Parameter;
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
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uml2context.Uml2contextPackage
 * @generated
 */
public class Uml2contextSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Uml2contextPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uml2contextSwitch() {
		if (modelPackage == null) {
			modelPackage = Uml2contextPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Uml2contextPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseRedefinableElement(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = caseElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.CLASSIFIER: {
				Classifier classifier = (Classifier)theEObject;
				T result = caseClassifier(classifier);
				if (result == null) result = caseType(classifier);
				if (result == null) result = caseNamespace(classifier);
				if (result == null) result = caseRedefinableElement(classifier);
				if (result == null) result = casePackageableElement(classifier);
				if (result == null) result = caseNamedElement(classifier);
				if (result == null) result = caseElement(classifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.STRUCTURAL_FEATURE: {
				StructuralFeature structuralFeature = (StructuralFeature)theEObject;
				T result = caseStructuralFeature(structuralFeature);
				if (result == null) result = caseFeature(structuralFeature);
				if (result == null) result = caseTypedElement(structuralFeature);
				if (result == null) result = caseMultiplicityElement(structuralFeature);
				if (result == null) result = caseRedefinableElement(structuralFeature);
				if (result == null) result = caseNamedElement(structuralFeature);
				if (result == null) result = caseElement(structuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.BEHAVIORAL_FEATURE: {
				BehavioralFeature behavioralFeature = (BehavioralFeature)theEObject;
				T result = caseBehavioralFeature(behavioralFeature);
				if (result == null) result = caseFeature(behavioralFeature);
				if (result == null) result = caseRedefinableElement(behavioralFeature);
				if (result == null) result = caseNamedElement(behavioralFeature);
				if (result == null) result = caseElement(behavioralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.CLASS: {
				uml2context.Class class_ = (uml2context.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseClassifier(class_);
				if (result == null) result = caseType(class_);
				if (result == null) result = caseNamespace(class_);
				if (result == null) result = caseRedefinableElement(class_);
				if (result == null) result = casePackageableElement(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = caseElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.AGENT_CLASS: {
				AgentClass agentClass = (AgentClass)theEObject;
				T result = caseAgentClass(agentClass);
				if (result == null) result = caseClassifier(agentClass);
				if (result == null) result = caseType(agentClass);
				if (result == null) result = caseNamespace(agentClass);
				if (result == null) result = caseRedefinableElement(agentClass);
				if (result == null) result = casePackageableElement(agentClass);
				if (result == null) result = caseNamedElement(agentClass);
				if (result == null) result = caseElement(agentClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseStructuralFeature(property);
				if (result == null) result = caseFeature(property);
				if (result == null) result = caseTypedElement(property);
				if (result == null) result = caseMultiplicityElement(property);
				if (result == null) result = caseRedefinableElement(property);
				if (result == null) result = caseNamedElement(property);
				if (result == null) result = caseElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseBehavioralFeature(operation);
				if (result == null) result = caseFeature(operation);
				if (result == null) result = caseRedefinableElement(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = caseElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.ACTION_CLASS: {
				ActionClass actionClass = (ActionClass)theEObject;
				T result = caseActionClass(actionClass);
				if (result == null) result = caseBehavioralFeature(actionClass);
				if (result == null) result = caseFeature(actionClass);
				if (result == null) result = caseRedefinableElement(actionClass);
				if (result == null) result = caseNamedElement(actionClass);
				if (result == null) result = caseElement(actionClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.PACKAGEABLE_ELEMENT: {
				PackageableElement packageableElement = (PackageableElement)theEObject;
				T result = casePackageableElement(packageableElement);
				if (result == null) result = caseNamedElement(packageableElement);
				if (result == null) result = caseElement(packageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = casePackageableElement(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = caseElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.NAMESPACE: {
				Namespace namespace = (Namespace)theEObject;
				T result = caseNamespace(namespace);
				if (result == null) result = caseNamedElement(namespace);
				if (result == null) result = caseElement(namespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.REDEFINABLE_ELEMENT: {
				RedefinableElement redefinableElement = (RedefinableElement)theEObject;
				T result = caseRedefinableElement(redefinableElement);
				if (result == null) result = caseNamedElement(redefinableElement);
				if (result == null) result = caseElement(redefinableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.ORGANIZATION_CLASS: {
				OrganizationClass organizationClass = (OrganizationClass)theEObject;
				T result = caseOrganizationClass(organizationClass);
				if (result == null) result = caseClassifier(organizationClass);
				if (result == null) result = caseType(organizationClass);
				if (result == null) result = caseNamespace(organizationClass);
				if (result == null) result = caseRedefinableElement(organizationClass);
				if (result == null) result = casePackageableElement(organizationClass);
				if (result == null) result = caseNamedElement(organizationClass);
				if (result == null) result = caseElement(organizationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.AGENT_ROLE_CLASS: {
				AgentRoleClass agentRoleClass = (AgentRoleClass)theEObject;
				T result = caseAgentRoleClass(agentRoleClass);
				if (result == null) result = caseClassifier(agentRoleClass);
				if (result == null) result = caseType(agentRoleClass);
				if (result == null) result = caseNamespace(agentRoleClass);
				if (result == null) result = caseRedefinableElement(agentRoleClass);
				if (result == null) result = casePackageableElement(agentRoleClass);
				if (result == null) result = caseNamedElement(agentRoleClass);
				if (result == null) result = caseElement(agentRoleClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.OBJECT_ROLE_CLASS: {
				ObjectRoleClass objectRoleClass = (ObjectRoleClass)theEObject;
				T result = caseObjectRoleClass(objectRoleClass);
				if (result == null) result = caseClassifier(objectRoleClass);
				if (result == null) result = caseType(objectRoleClass);
				if (result == null) result = caseNamespace(objectRoleClass);
				if (result == null) result = caseRedefinableElement(objectRoleClass);
				if (result == null) result = casePackageableElement(objectRoleClass);
				if (result == null) result = caseNamedElement(objectRoleClass);
				if (result == null) result = caseElement(objectRoleClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.ENVIRONMENT_CLASS: {
				EnvironmentClass environmentClass = (EnvironmentClass)theEObject;
				T result = caseEnvironmentClass(environmentClass);
				if (result == null) result = caseClassifier(environmentClass);
				if (result == null) result = caseType(environmentClass);
				if (result == null) result = caseNamespace(environmentClass);
				if (result == null) result = caseRedefinableElement(environmentClass);
				if (result == null) result = casePackageableElement(environmentClass);
				if (result == null) result = caseNamedElement(environmentClass);
				if (result == null) result = caseElement(environmentClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.AGENT_MESSAGE_CLASS: {
				AgentMessageClass agentMessageClass = (AgentMessageClass)theEObject;
				T result = caseAgentMessageClass(agentMessageClass);
				if (result == null) result = caseNamedElement(agentMessageClass);
				if (result == null) result = caseElement(agentMessageClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.MULTIPLICITY_ELEMENT: {
				MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
				T result = caseMultiplicityElement(multiplicityElement);
				if (result == null) result = caseElement(multiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = caseNamedElement(typedElement);
				if (result == null) result = caseElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.PLAN_CLASS: {
				PlanClass planClass = (PlanClass)theEObject;
				T result = casePlanClass(planClass);
				if (result == null) result = caseBehavioralFeature(planClass);
				if (result == null) result = caseFeature(planClass);
				if (result == null) result = caseRedefinableElement(planClass);
				if (result == null) result = caseNamedElement(planClass);
				if (result == null) result = caseElement(planClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.DUTY: {
				Duty duty = (Duty)theEObject;
				T result = caseDuty(duty);
				if (result == null) result = caseActionClass(duty);
				if (result == null) result = caseBehavioralFeature(duty);
				if (result == null) result = caseFeature(duty);
				if (result == null) result = caseRedefinableElement(duty);
				if (result == null) result = caseNamedElement(duty);
				if (result == null) result = caseElement(duty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.RIGHT: {
				Right right = (Right)theEObject;
				T result = caseRight(right);
				if (result == null) result = caseActionClass(right);
				if (result == null) result = caseBehavioralFeature(right);
				if (result == null) result = caseFeature(right);
				if (result == null) result = caseRedefinableElement(right);
				if (result == null) result = caseNamedElement(right);
				if (result == null) result = caseElement(right);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.PROTOCOL_CLASS: {
				ProtocolClass protocolClass = (ProtocolClass)theEObject;
				T result = caseProtocolClass(protocolClass);
				if (result == null) result = caseBehavioralFeature(protocolClass);
				if (result == null) result = caseFeature(protocolClass);
				if (result == null) result = caseRedefinableElement(protocolClass);
				if (result == null) result = caseNamedElement(protocolClass);
				if (result == null) result = caseElement(protocolClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseElement(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.DIRECTED_RELATIONSHIP: {
				DirectedRelationship directedRelationship = (DirectedRelationship)theEObject;
				T result = caseDirectedRelationship(directedRelationship);
				if (result == null) result = caseRelationship(directedRelationship);
				if (result == null) result = caseElement(directedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseRelationship(association);
				if (result == null) result = caseClassifier(association);
				if (result == null) result = caseType(association);
				if (result == null) result = caseNamespace(association);
				if (result == null) result = caseRedefinableElement(association);
				if (result == null) result = casePackageableElement(association);
				if (result == null) result = caseNamedElement(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = caseDirectedRelationship(dependency);
				if (result == null) result = caseRelationship(dependency);
				if (result == null) result = caseElement(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.OWNERSHIP: {
				Ownership ownership = (Ownership)theEObject;
				T result = caseOwnership(ownership);
				if (result == null) result = caseDirectedRelationship(ownership);
				if (result == null) result = caseRelationship(ownership);
				if (result == null) result = caseElement(ownership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.INHABIT: {
				Inhabit inhabit = (Inhabit)theEObject;
				T result = caseInhabit(inhabit);
				if (result == null) result = caseDirectedRelationship(inhabit);
				if (result == null) result = caseRelationship(inhabit);
				if (result == null) result = caseElement(inhabit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = caseDirectedRelationship(control);
				if (result == null) result = caseRelationship(control);
				if (result == null) result = caseElement(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.PLAY: {
				Play play = (Play)theEObject;
				T result = casePlay(play);
				if (result == null) result = caseDirectedRelationship(play);
				if (result == null) result = caseRelationship(play);
				if (result == null) result = caseElement(play);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.GENERALIZATION: {
				Generalization generalization = (Generalization)theEObject;
				T result = caseGeneralization(generalization);
				if (result == null) result = caseDirectedRelationship(generalization);
				if (result == null) result = caseRelationship(generalization);
				if (result == null) result = caseElement(generalization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseProperty(goal);
				if (result == null) result = caseStructuralFeature(goal);
				if (result == null) result = caseFeature(goal);
				if (result == null) result = caseTypedElement(goal);
				if (result == null) result = caseMultiplicityElement(goal);
				if (result == null) result = caseRedefinableElement(goal);
				if (result == null) result = caseNamedElement(goal);
				if (result == null) result = caseElement(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.BELIEF: {
				Belief belief = (Belief)theEObject;
				T result = caseBelief(belief);
				if (result == null) result = caseProperty(belief);
				if (result == null) result = caseStructuralFeature(belief);
				if (result == null) result = caseFeature(belief);
				if (result == null) result = caseTypedElement(belief);
				if (result == null) result = caseMultiplicityElement(belief);
				if (result == null) result = caseRedefinableElement(belief);
				if (result == null) result = caseNamedElement(belief);
				if (result == null) result = caseElement(belief);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = casePackageableElement(constraint);
				if (result == null) result = caseNamedElement(constraint);
				if (result == null) result = caseElement(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.MASML_CLASS_DIAGRAM: {
				MasmlClassDiagram masmlClassDiagram = (MasmlClassDiagram)theEObject;
				T result = caseMasmlClassDiagram(masmlClassDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseTypedElement(parameter);
				if (result == null) result = caseMultiplicityElement(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = caseElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.AGGREGATION: {
				Aggregation aggregation = (Aggregation)theEObject;
				T result = caseAggregation(aggregation);
				if (result == null) result = caseAssociation(aggregation);
				if (result == null) result = caseRelationship(aggregation);
				if (result == null) result = caseClassifier(aggregation);
				if (result == null) result = caseType(aggregation);
				if (result == null) result = caseNamespace(aggregation);
				if (result == null) result = caseRedefinableElement(aggregation);
				if (result == null) result = casePackageableElement(aggregation);
				if (result == null) result = caseNamedElement(aggregation);
				if (result == null) result = caseElement(aggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseAssociation(composite);
				if (result == null) result = caseRelationship(composite);
				if (result == null) result = caseClassifier(composite);
				if (result == null) result = caseType(composite);
				if (result == null) result = caseNamespace(composite);
				if (result == null) result = caseRedefinableElement(composite);
				if (result == null) result = casePackageableElement(composite);
				if (result == null) result = caseNamedElement(composite);
				if (result == null) result = caseElement(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.PERCEPTION: {
				Perception perception = (Perception)theEObject;
				T result = casePerception(perception);
				if (result == null) result = caseBehavioralFeature(perception);
				if (result == null) result = caseFeature(perception);
				if (result == null) result = caseRedefinableElement(perception);
				if (result == null) result = caseNamedElement(perception);
				if (result == null) result = caseElement(perception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Uml2contextPackage.PLANNING: {
				Planning planning = (Planning)theEObject;
				T result = casePlanning(planning);
				if (result == null) result = caseBehavioralFeature(planning);
				if (result == null) result = caseFeature(planning);
				if (result == null) result = caseRedefinableElement(planning);
				if (result == null) result = caseNamedElement(planning);
				if (result == null) result = caseElement(planning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralFeature(BehavioralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(uml2context.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentClass(AgentClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionClass(ActionClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableElement(RedefinableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationClass(OrganizationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Role Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentRoleClass(AgentRoleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Role Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectRoleClass(ObjectRoleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentClass(EnvironmentClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent Message Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent Message Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentMessageClass(AgentMessageClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanClass(PlanClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuty(Duty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRight(Right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolClass(ProtocolClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedRelationship(DirectedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ownership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ownership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnership(Ownership object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inhabit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inhabit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInhabit(Inhabit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Play</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Play</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlay(Play object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Belief</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Belief</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBelief(Belief object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Masml Class Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Masml Class Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasmlClassDiagram(MasmlClassDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregation(Aggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerception(Perception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanning(Planning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Uml2contextSwitch
