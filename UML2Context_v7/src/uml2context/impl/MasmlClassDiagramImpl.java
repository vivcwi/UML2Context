/**
 */
package uml2context.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2context.AgentClass;
import uml2context.AgentRoleClass;
import uml2context.Aggregation;
import uml2context.Association;
import uml2context.Composite;
import uml2context.Dependency;
import uml2context.EnvironmentClass;
import uml2context.Generalization;
import uml2context.Inhabit;
import uml2context.MasmlClassDiagram;
import uml2context.ObjectRoleClass;
import uml2context.OrganizationClass;
import uml2context.Ownership;
import uml2context.Play;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Masml Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedOrganizationClass <em>Owned Organization Class</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedEnvironmentClass <em>Owned Environment Class</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedAgentClass <em>Owned Agent Class</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedClass <em>Owned Class</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedPlay <em>Owned Play</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedDependency <em>Owned Dependency</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedAssociation <em>Owned Association</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedAggregation <em>Owned Aggregation</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedComposite <em>Owned Composite</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedInhabit <em>Owned Inhabit</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedOwnership <em>Owned Ownership</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedObjectRoleClass <em>Owned Object Role Class</em>}</li>
 *   <li>{@link uml2context.impl.MasmlClassDiagramImpl#getOwnedAgentRoleClass <em>Owned Agent Role Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasmlClassDiagramImpl extends EObjectImpl implements MasmlClassDiagram {
	/**
	 * The cached value of the '{@link #getOwnedOrganizationClass() <em>Owned Organization Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOrganizationClass()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganizationClass> ownedOrganizationClass;

	/**
	 * The cached value of the '{@link #getOwnedEnvironmentClass() <em>Owned Environment Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnvironmentClass()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvironmentClass> ownedEnvironmentClass;

	/**
	 * The cached value of the '{@link #getOwnedAgentClass() <em>Owned Agent Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAgentClass()
	 * @generated
	 * @ordered
	 */
	protected EList<AgentClass> ownedAgentClass;

	/**
	 * The cached value of the '{@link #getOwnedClass() <em>Owned Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedClass()
	 * @generated
	 * @ordered
	 */
	protected EList<uml2context.Class> ownedClass;

	/**
	 * The cached value of the '{@link #getOwnedPlay() <em>Owned Play</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPlay()
	 * @generated
	 * @ordered
	 */
	protected EList<Play> ownedPlay;

	/**
	 * The cached value of the '{@link #getOwnedGeneralization() <em>Owned Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> ownedGeneralization;

	/**
	 * The cached value of the '{@link #getOwnedDependency() <em>Owned Dependency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> ownedDependency;

	/**
	 * The cached value of the '{@link #getOwnedAssociation() <em>Owned Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> ownedAssociation;

	/**
	 * The cached value of the '{@link #getOwnedAggregation() <em>Owned Aggregation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAggregation()
	 * @generated
	 * @ordered
	 */
	protected EList<Aggregation> ownedAggregation;

	/**
	 * The cached value of the '{@link #getOwnedComposite() <em>Owned Composite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComposite()
	 * @generated
	 * @ordered
	 */
	protected EList<Composite> ownedComposite;

	/**
	 * The cached value of the '{@link #getOwnedInhabit() <em>Owned Inhabit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInhabit()
	 * @generated
	 * @ordered
	 */
	protected EList<Inhabit> ownedInhabit;

	/**
	 * The cached value of the '{@link #getOwnedOwnership() <em>Owned Ownership</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOwnership()
	 * @generated
	 * @ordered
	 */
	protected EList<Ownership> ownedOwnership;

	/**
	 * The cached value of the '{@link #getOwnedObjectRoleClass() <em>Owned Object Role Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedObjectRoleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectRoleClass> ownedObjectRoleClass;

	/**
	 * The cached value of the '{@link #getOwnedAgentRoleClass() <em>Owned Agent Role Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAgentRoleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<AgentRoleClass> ownedAgentRoleClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasmlClassDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganizationClass> getOwnedOrganizationClass() {
		if (ownedOrganizationClass == null) {
			ownedOrganizationClass = new EObjectContainmentEList<OrganizationClass>(OrganizationClass.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ORGANIZATION_CLASS);
		}
		return ownedOrganizationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvironmentClass> getOwnedEnvironmentClass() {
		if (ownedEnvironmentClass == null) {
			ownedEnvironmentClass = new EObjectContainmentEList<EnvironmentClass>(EnvironmentClass.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ENVIRONMENT_CLASS);
		}
		return ownedEnvironmentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentClass> getOwnedAgentClass() {
		if (ownedAgentClass == null) {
			ownedAgentClass = new EObjectContainmentEList<AgentClass>(AgentClass.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_CLASS);
		}
		return ownedAgentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uml2context.Class> getOwnedClass() {
		if (ownedClass == null) {
			ownedClass = new EObjectContainmentEList<uml2context.Class>(uml2context.Class.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_CLASS);
		}
		return ownedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Play> getOwnedPlay() {
		if (ownedPlay == null) {
			ownedPlay = new EObjectContainmentEList<Play>(Play.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_PLAY);
		}
		return ownedPlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getOwnedGeneralization() {
		if (ownedGeneralization == null) {
			ownedGeneralization = new EObjectContainmentEList<Generalization>(Generalization.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_GENERALIZATION);
		}
		return ownedGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getOwnedDependency() {
		if (ownedDependency == null) {
			ownedDependency = new EObjectContainmentEList<Dependency>(Dependency.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_DEPENDENCY);
		}
		return ownedDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getOwnedAssociation() {
		if (ownedAssociation == null) {
			ownedAssociation = new EObjectContainmentEList<Association>(Association.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION);
		}
		return ownedAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Aggregation> getOwnedAggregation() {
		if (ownedAggregation == null) {
			ownedAggregation = new EObjectContainmentEList<Aggregation>(Aggregation.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGGREGATION);
		}
		return ownedAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composite> getOwnedComposite() {
		if (ownedComposite == null) {
			ownedComposite = new EObjectContainmentEList<Composite>(Composite.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_COMPOSITE);
		}
		return ownedComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inhabit> getOwnedInhabit() {
		if (ownedInhabit == null) {
			ownedInhabit = new EObjectContainmentEList<Inhabit>(Inhabit.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_INHABIT);
		}
		return ownedInhabit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ownership> getOwnedOwnership() {
		if (ownedOwnership == null) {
			ownedOwnership = new EObjectContainmentEList<Ownership>(Ownership.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OWNERSHIP);
		}
		return ownedOwnership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectRoleClass> getOwnedObjectRoleClass() {
		if (ownedObjectRoleClass == null) {
			ownedObjectRoleClass = new EObjectContainmentEList<ObjectRoleClass>(ObjectRoleClass.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OBJECT_ROLE_CLASS);
		}
		return ownedObjectRoleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentRoleClass> getOwnedAgentRoleClass() {
		if (ownedAgentRoleClass == null) {
			ownedAgentRoleClass = new EObjectContainmentEList<AgentRoleClass>(AgentRoleClass.class, this, Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_ROLE_CLASS);
		}
		return ownedAgentRoleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ORGANIZATION_CLASS:
				return ((InternalEList<?>)getOwnedOrganizationClass()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ENVIRONMENT_CLASS:
				return ((InternalEList<?>)getOwnedEnvironmentClass()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_CLASS:
				return ((InternalEList<?>)getOwnedAgentClass()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_CLASS:
				return ((InternalEList<?>)getOwnedClass()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_PLAY:
				return ((InternalEList<?>)getOwnedPlay()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_GENERALIZATION:
				return ((InternalEList<?>)getOwnedGeneralization()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_DEPENDENCY:
				return ((InternalEList<?>)getOwnedDependency()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION:
				return ((InternalEList<?>)getOwnedAssociation()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGGREGATION:
				return ((InternalEList<?>)getOwnedAggregation()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_COMPOSITE:
				return ((InternalEList<?>)getOwnedComposite()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_INHABIT:
				return ((InternalEList<?>)getOwnedInhabit()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OWNERSHIP:
				return ((InternalEList<?>)getOwnedOwnership()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OBJECT_ROLE_CLASS:
				return ((InternalEList<?>)getOwnedObjectRoleClass()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_ROLE_CLASS:
				return ((InternalEList<?>)getOwnedAgentRoleClass()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ORGANIZATION_CLASS:
				return getOwnedOrganizationClass();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ENVIRONMENT_CLASS:
				return getOwnedEnvironmentClass();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_CLASS:
				return getOwnedAgentClass();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_CLASS:
				return getOwnedClass();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_PLAY:
				return getOwnedPlay();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_GENERALIZATION:
				return getOwnedGeneralization();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_DEPENDENCY:
				return getOwnedDependency();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION:
				return getOwnedAssociation();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGGREGATION:
				return getOwnedAggregation();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_COMPOSITE:
				return getOwnedComposite();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_INHABIT:
				return getOwnedInhabit();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OWNERSHIP:
				return getOwnedOwnership();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OBJECT_ROLE_CLASS:
				return getOwnedObjectRoleClass();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_ROLE_CLASS:
				return getOwnedAgentRoleClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ORGANIZATION_CLASS:
				getOwnedOrganizationClass().clear();
				getOwnedOrganizationClass().addAll((Collection<? extends OrganizationClass>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ENVIRONMENT_CLASS:
				getOwnedEnvironmentClass().clear();
				getOwnedEnvironmentClass().addAll((Collection<? extends EnvironmentClass>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_CLASS:
				getOwnedAgentClass().clear();
				getOwnedAgentClass().addAll((Collection<? extends AgentClass>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_CLASS:
				getOwnedClass().clear();
				getOwnedClass().addAll((Collection<? extends uml2context.Class>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_PLAY:
				getOwnedPlay().clear();
				getOwnedPlay().addAll((Collection<? extends Play>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				getOwnedGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_DEPENDENCY:
				getOwnedDependency().clear();
				getOwnedDependency().addAll((Collection<? extends Dependency>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION:
				getOwnedAssociation().clear();
				getOwnedAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGGREGATION:
				getOwnedAggregation().clear();
				getOwnedAggregation().addAll((Collection<? extends Aggregation>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_COMPOSITE:
				getOwnedComposite().clear();
				getOwnedComposite().addAll((Collection<? extends Composite>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_INHABIT:
				getOwnedInhabit().clear();
				getOwnedInhabit().addAll((Collection<? extends Inhabit>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OWNERSHIP:
				getOwnedOwnership().clear();
				getOwnedOwnership().addAll((Collection<? extends Ownership>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OBJECT_ROLE_CLASS:
				getOwnedObjectRoleClass().clear();
				getOwnedObjectRoleClass().addAll((Collection<? extends ObjectRoleClass>)newValue);
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_ROLE_CLASS:
				getOwnedAgentRoleClass().clear();
				getOwnedAgentRoleClass().addAll((Collection<? extends AgentRoleClass>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ORGANIZATION_CLASS:
				getOwnedOrganizationClass().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ENVIRONMENT_CLASS:
				getOwnedEnvironmentClass().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_CLASS:
				getOwnedAgentClass().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_CLASS:
				getOwnedClass().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_PLAY:
				getOwnedPlay().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_DEPENDENCY:
				getOwnedDependency().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION:
				getOwnedAssociation().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGGREGATION:
				getOwnedAggregation().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_COMPOSITE:
				getOwnedComposite().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_INHABIT:
				getOwnedInhabit().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OWNERSHIP:
				getOwnedOwnership().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OBJECT_ROLE_CLASS:
				getOwnedObjectRoleClass().clear();
				return;
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_ROLE_CLASS:
				getOwnedAgentRoleClass().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ORGANIZATION_CLASS:
				return ownedOrganizationClass != null && !ownedOrganizationClass.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ENVIRONMENT_CLASS:
				return ownedEnvironmentClass != null && !ownedEnvironmentClass.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_CLASS:
				return ownedAgentClass != null && !ownedAgentClass.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_CLASS:
				return ownedClass != null && !ownedClass.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_PLAY:
				return ownedPlay != null && !ownedPlay.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_GENERALIZATION:
				return ownedGeneralization != null && !ownedGeneralization.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_DEPENDENCY:
				return ownedDependency != null && !ownedDependency.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION:
				return ownedAssociation != null && !ownedAssociation.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGGREGATION:
				return ownedAggregation != null && !ownedAggregation.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_COMPOSITE:
				return ownedComposite != null && !ownedComposite.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_INHABIT:
				return ownedInhabit != null && !ownedInhabit.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OWNERSHIP:
				return ownedOwnership != null && !ownedOwnership.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OBJECT_ROLE_CLASS:
				return ownedObjectRoleClass != null && !ownedObjectRoleClass.isEmpty();
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_ROLE_CLASS:
				return ownedAgentRoleClass != null && !ownedAgentRoleClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MasmlClassDiagramImpl
