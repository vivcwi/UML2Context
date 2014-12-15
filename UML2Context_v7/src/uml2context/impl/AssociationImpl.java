/**
 */
package uml2context.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2context.Association;
import uml2context.Classifier;
import uml2context.Constraint;
import uml2context.MultiplicityKind;
import uml2context.NamedElement;
import uml2context.Namespace;
import uml2context.PackageableElement;
import uml2context.Property;
import uml2context.RedefinableElement;
import uml2context.Type;
import uml2context.Uml2contextPackage;
import uml2context.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.AssociationImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#getSourceMultiplicity <em>Source Multiplicity</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#getTargetMultiplicity <em>Target Multiplicity</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link uml2context.impl.AssociationImpl#getTargetName <em>Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends RelationshipImpl implements Association {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRule;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedEnd;

	/**
	 * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> memberEnd;

	/**
	 * The cached value of the '{@link #getEndType() <em>End Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> endType;

	/**
	 * The cached value of the '{@link #getNavigableOwnedEnd() <em>Navigable Owned End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> navigableOwnedEnd;

	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceMultiplicity() <em>Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final MultiplicityKind SOURCE_MULTIPLICITY_EDEFAULT = MultiplicityKind.ONE;

	/**
	 * The cached value of the '{@link #getSourceMultiplicity() <em>Source Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityKind sourceMultiplicity = SOURCE_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetMultiplicity() <em>Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final MultiplicityKind TARGET_MULTIPLICITY_EDEFAULT = MultiplicityKind.ONE;

	/**
	 * The cached value of the '{@link #getTargetMultiplicity() <em>Target Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityKind targetMultiplicity = TARGET_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected static final String REPRESENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected String representation = REPRESENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected String sourceName = SOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetName() <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetName() <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected String targetName = TARGET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ASSOCIATION__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRule() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentEList<Constraint>(Constraint.class, this, Uml2contextPackage.ASSOCIATION__OWNED_RULE);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ASSOCIATION__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEnd() {
		if (ownedEnd == null) {
			ownedEnd = new EObjectContainmentEList<Property>(Property.class, this, Uml2contextPackage.ASSOCIATION__OWNED_END);
		}
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getMemberEnd() {
		if (memberEnd == null) {
			memberEnd = new EObjectResolvingEList<Property>(Property.class, this, Uml2contextPackage.ASSOCIATION__MEMBER_END);
		}
		return memberEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getEndType() {
		if (endType == null) {
			endType = new EObjectResolvingEList<Type>(Type.class, this, Uml2contextPackage.ASSOCIATION__END_TYPE);
		}
		return endType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getNavigableOwnedEnd() {
		if (navigableOwnedEnd == null) {
			navigableOwnedEnd = new EObjectResolvingEList<Property>(Property.class, this, Uml2contextPackage.ASSOCIATION__NAVIGABLE_OWNED_END);
		}
		return navigableOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ASSOCIATION__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ASSOCIATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityKind getSourceMultiplicity() {
		return sourceMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMultiplicity(MultiplicityKind newSourceMultiplicity) {
		MultiplicityKind oldSourceMultiplicity = sourceMultiplicity;
		sourceMultiplicity = newSourceMultiplicity == null ? SOURCE_MULTIPLICITY_EDEFAULT : newSourceMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ASSOCIATION__SOURCE_MULTIPLICITY, oldSourceMultiplicity, sourceMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityKind getTargetMultiplicity() {
		return targetMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMultiplicity(MultiplicityKind newTargetMultiplicity) {
		MultiplicityKind oldTargetMultiplicity = targetMultiplicity;
		targetMultiplicity = newTargetMultiplicity == null ? TARGET_MULTIPLICITY_EDEFAULT : newTargetMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ASSOCIATION__TARGET_MULTIPLICITY, oldTargetMultiplicity, targetMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(String newRepresentation) {
		String oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ASSOCIATION__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceName(String newSourceName) {
		String oldSourceName = sourceName;
		sourceName = newSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ASSOCIATION__SOURCE_NAME, oldSourceName, sourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetName() {
		return targetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetName(String newTargetName) {
		String oldTargetName = targetName;
		targetName = newTargetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.ASSOCIATION__TARGET_NAME, oldTargetName, targetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.ASSOCIATION__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.ASSOCIATION__OWNED_END:
				return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
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
			case Uml2contextPackage.ASSOCIATION__VISIBILITY:
				return getVisibility();
			case Uml2contextPackage.ASSOCIATION__OWNED_RULE:
				return getOwnedRule();
			case Uml2contextPackage.ASSOCIATION__IS_DERIVED:
				return isIsDerived();
			case Uml2contextPackage.ASSOCIATION__OWNED_END:
				return getOwnedEnd();
			case Uml2contextPackage.ASSOCIATION__MEMBER_END:
				return getMemberEnd();
			case Uml2contextPackage.ASSOCIATION__END_TYPE:
				return getEndType();
			case Uml2contextPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				return getNavigableOwnedEnd();
			case Uml2contextPackage.ASSOCIATION__IS_LEAF:
				return isIsLeaf();
			case Uml2contextPackage.ASSOCIATION__IS_ABSTRACT:
				return isIsAbstract();
			case Uml2contextPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
				return getSourceMultiplicity();
			case Uml2contextPackage.ASSOCIATION__TARGET_MULTIPLICITY:
				return getTargetMultiplicity();
			case Uml2contextPackage.ASSOCIATION__REPRESENTATION:
				return getRepresentation();
			case Uml2contextPackage.ASSOCIATION__SOURCE_NAME:
				return getSourceName();
			case Uml2contextPackage.ASSOCIATION__TARGET_NAME:
				return getTargetName();
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
			case Uml2contextPackage.ASSOCIATION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__OWNED_END:
				getOwnedEnd().clear();
				getOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__END_TYPE:
				getEndType().clear();
				getEndType().addAll((Collection<? extends Type>)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				getNavigableOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
				setSourceMultiplicity((MultiplicityKind)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__TARGET_MULTIPLICITY:
				setTargetMultiplicity((MultiplicityKind)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__REPRESENTATION:
				setRepresentation((String)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__SOURCE_NAME:
				setSourceName((String)newValue);
				return;
			case Uml2contextPackage.ASSOCIATION__TARGET_NAME:
				setTargetName((String)newValue);
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
			case Uml2contextPackage.ASSOCIATION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case Uml2contextPackage.ASSOCIATION__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case Uml2contextPackage.ASSOCIATION__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case Uml2contextPackage.ASSOCIATION__OWNED_END:
				getOwnedEnd().clear();
				return;
			case Uml2contextPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				return;
			case Uml2contextPackage.ASSOCIATION__END_TYPE:
				getEndType().clear();
				return;
			case Uml2contextPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				return;
			case Uml2contextPackage.ASSOCIATION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case Uml2contextPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case Uml2contextPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
				setSourceMultiplicity(SOURCE_MULTIPLICITY_EDEFAULT);
				return;
			case Uml2contextPackage.ASSOCIATION__TARGET_MULTIPLICITY:
				setTargetMultiplicity(TARGET_MULTIPLICITY_EDEFAULT);
				return;
			case Uml2contextPackage.ASSOCIATION__REPRESENTATION:
				setRepresentation(REPRESENTATION_EDEFAULT);
				return;
			case Uml2contextPackage.ASSOCIATION__SOURCE_NAME:
				setSourceName(SOURCE_NAME_EDEFAULT);
				return;
			case Uml2contextPackage.ASSOCIATION__TARGET_NAME:
				setTargetName(TARGET_NAME_EDEFAULT);
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
			case Uml2contextPackage.ASSOCIATION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case Uml2contextPackage.ASSOCIATION__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case Uml2contextPackage.ASSOCIATION__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case Uml2contextPackage.ASSOCIATION__OWNED_END:
				return ownedEnd != null && !ownedEnd.isEmpty();
			case Uml2contextPackage.ASSOCIATION__MEMBER_END:
				return memberEnd != null && !memberEnd.isEmpty();
			case Uml2contextPackage.ASSOCIATION__END_TYPE:
				return endType != null && !endType.isEmpty();
			case Uml2contextPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				return navigableOwnedEnd != null && !navigableOwnedEnd.isEmpty();
			case Uml2contextPackage.ASSOCIATION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case Uml2contextPackage.ASSOCIATION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case Uml2contextPackage.ASSOCIATION__SOURCE_MULTIPLICITY:
				return sourceMultiplicity != SOURCE_MULTIPLICITY_EDEFAULT;
			case Uml2contextPackage.ASSOCIATION__TARGET_MULTIPLICITY:
				return targetMultiplicity != TARGET_MULTIPLICITY_EDEFAULT;
			case Uml2contextPackage.ASSOCIATION__REPRESENTATION:
				return REPRESENTATION_EDEFAULT == null ? representation != null : !REPRESENTATION_EDEFAULT.equals(representation);
			case Uml2contextPackage.ASSOCIATION__SOURCE_NAME:
				return SOURCE_NAME_EDEFAULT == null ? sourceName != null : !SOURCE_NAME_EDEFAULT.equals(sourceName);
			case Uml2contextPackage.ASSOCIATION__TARGET_NAME:
				return TARGET_NAME_EDEFAULT == null ? targetName != null : !TARGET_NAME_EDEFAULT.equals(targetName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case Uml2contextPackage.ASSOCIATION__VISIBILITY: return Uml2contextPackage.NAMED_ELEMENT__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case Uml2contextPackage.ASSOCIATION__OWNED_RULE: return Uml2contextPackage.NAMESPACE__OWNED_RULE;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case Uml2contextPackage.NAMED_ELEMENT__VISIBILITY: return Uml2contextPackage.ASSOCIATION__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case Uml2contextPackage.NAMESPACE__OWNED_RULE: return Uml2contextPackage.ASSOCIATION__OWNED_RULE;
				default: return -1;
			}
		}
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isLeaf: ");
		result.append(isLeaf);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", sourceMultiplicity: ");
		result.append(sourceMultiplicity);
		result.append(", targetMultiplicity: ");
		result.append(targetMultiplicity);
		result.append(", representation: ");
		result.append(representation);
		result.append(", sourceName: ");
		result.append(sourceName);
		result.append(", targetName: ");
		result.append(targetName);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
