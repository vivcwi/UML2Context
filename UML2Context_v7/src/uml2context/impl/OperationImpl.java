/**
 */
package uml2context.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import uml2context.DataType;
import uml2context.Operation;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.OperationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#getRedefinedOperation <em>Redefined Operation</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#getBodyCondition <em>Body Condition</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#getReturnValue <em>Return Value</em>}</li>
 *   <li>{@link uml2context.impl.OperationImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends BehavioralFeatureImpl implements Operation {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected uml2context.Class class_;

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
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsQuery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_QUERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsQuery()
	 * @generated
	 * @ordered
	 */
	protected boolean isQuery = IS_QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected String postcondition = POSTCONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String precondition = PRECONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedefinedOperation() <em>Redefined Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String REDEFINED_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedefinedOperation() <em>Redefined Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOperation()
	 * @generated
	 * @ordered
	 */
	protected String redefinedOperation = REDEFINED_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBodyCondition() <em>Body Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBodyCondition() <em>Body Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyCondition()
	 * @generated
	 * @ordered
	 */
	protected String bodyCondition = BODY_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnValue() <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected static final DataType RETURN_VALUE_EDEFAULT = DataType.STRING;

	/**
	 * The cached value of the '{@link #getReturnValue() <em>Return Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnValue()
	 * @generated
	 * @ordered
	 */
	protected DataType returnValue = RETURN_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2context.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (uml2context.Class)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.OPERATION__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2context.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(uml2context.Class newClass) {
		uml2context.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsQuery() {
		return isQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(boolean newIsQuery) {
		boolean oldIsQuery = isQuery;
		isQuery = newIsQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__IS_QUERY, oldIsQuery, isQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__IS_STATIC, oldIsStatic, isStatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition(String newPostcondition) {
		String oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__POSTCONDITION, oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(String newPrecondition) {
		String oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__PRECONDITION, oldPrecondition, precondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedefinedOperation() {
		return redefinedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedOperation(String newRedefinedOperation) {
		String oldRedefinedOperation = redefinedOperation;
		redefinedOperation = newRedefinedOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__REDEFINED_OPERATION, oldRedefinedOperation, redefinedOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBodyCondition() {
		return bodyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyCondition(String newBodyCondition) {
		String oldBodyCondition = bodyCondition;
		bodyCondition = newBodyCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__BODY_CONDITION, oldBodyCondition, bodyCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReturnValue() {
		return returnValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnValue(DataType newReturnValue) {
		DataType oldReturnValue = returnValue;
		returnValue = newReturnValue == null ? RETURN_VALUE_EDEFAULT : newReturnValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.OPERATION__RETURN_VALUE, oldReturnValue, returnValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameter() {
		if (parameter == null) {
			parameter = new EDataTypeUniqueEList<String>(String.class, this, Uml2contextPackage.OPERATION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2contextPackage.OPERATION__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case Uml2contextPackage.OPERATION__IS_ABSTRACT:
				return isIsAbstract();
			case Uml2contextPackage.OPERATION__IS_LEAF:
				return isIsLeaf();
			case Uml2contextPackage.OPERATION__IS_ORDERED:
				return isIsOrdered();
			case Uml2contextPackage.OPERATION__IS_QUERY:
				return isIsQuery();
			case Uml2contextPackage.OPERATION__IS_STATIC:
				return isIsStatic();
			case Uml2contextPackage.OPERATION__IS_UNIQUE:
				return isIsUnique();
			case Uml2contextPackage.OPERATION__POSTCONDITION:
				return getPostcondition();
			case Uml2contextPackage.OPERATION__PRECONDITION:
				return getPrecondition();
			case Uml2contextPackage.OPERATION__REDEFINED_OPERATION:
				return getRedefinedOperation();
			case Uml2contextPackage.OPERATION__BODY_CONDITION:
				return getBodyCondition();
			case Uml2contextPackage.OPERATION__RETURN_VALUE:
				return getReturnValue();
			case Uml2contextPackage.OPERATION__PARAMETER:
				return getParameter();
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
			case Uml2contextPackage.OPERATION__CLASS:
				setClass((uml2context.Class)newValue);
				return;
			case Uml2contextPackage.OPERATION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case Uml2contextPackage.OPERATION__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case Uml2contextPackage.OPERATION__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case Uml2contextPackage.OPERATION__IS_QUERY:
				setIsQuery((Boolean)newValue);
				return;
			case Uml2contextPackage.OPERATION__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case Uml2contextPackage.OPERATION__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case Uml2contextPackage.OPERATION__POSTCONDITION:
				setPostcondition((String)newValue);
				return;
			case Uml2contextPackage.OPERATION__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case Uml2contextPackage.OPERATION__REDEFINED_OPERATION:
				setRedefinedOperation((String)newValue);
				return;
			case Uml2contextPackage.OPERATION__BODY_CONDITION:
				setBodyCondition((String)newValue);
				return;
			case Uml2contextPackage.OPERATION__RETURN_VALUE:
				setReturnValue((DataType)newValue);
				return;
			case Uml2contextPackage.OPERATION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends String>)newValue);
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
			case Uml2contextPackage.OPERATION__CLASS:
				setClass((uml2context.Class)null);
				return;
			case Uml2contextPackage.OPERATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case Uml2contextPackage.OPERATION__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case Uml2contextPackage.OPERATION__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case Uml2contextPackage.OPERATION__IS_QUERY:
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case Uml2contextPackage.OPERATION__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case Uml2contextPackage.OPERATION__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case Uml2contextPackage.OPERATION__POSTCONDITION:
				setPostcondition(POSTCONDITION_EDEFAULT);
				return;
			case Uml2contextPackage.OPERATION__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
				return;
			case Uml2contextPackage.OPERATION__REDEFINED_OPERATION:
				setRedefinedOperation(REDEFINED_OPERATION_EDEFAULT);
				return;
			case Uml2contextPackage.OPERATION__BODY_CONDITION:
				setBodyCondition(BODY_CONDITION_EDEFAULT);
				return;
			case Uml2contextPackage.OPERATION__RETURN_VALUE:
				setReturnValue(RETURN_VALUE_EDEFAULT);
				return;
			case Uml2contextPackage.OPERATION__PARAMETER:
				getParameter().clear();
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
			case Uml2contextPackage.OPERATION__CLASS:
				return class_ != null;
			case Uml2contextPackage.OPERATION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case Uml2contextPackage.OPERATION__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case Uml2contextPackage.OPERATION__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case Uml2contextPackage.OPERATION__IS_QUERY:
				return isQuery != IS_QUERY_EDEFAULT;
			case Uml2contextPackage.OPERATION__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case Uml2contextPackage.OPERATION__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case Uml2contextPackage.OPERATION__POSTCONDITION:
				return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
			case Uml2contextPackage.OPERATION__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
			case Uml2contextPackage.OPERATION__REDEFINED_OPERATION:
				return REDEFINED_OPERATION_EDEFAULT == null ? redefinedOperation != null : !REDEFINED_OPERATION_EDEFAULT.equals(redefinedOperation);
			case Uml2contextPackage.OPERATION__BODY_CONDITION:
				return BODY_CONDITION_EDEFAULT == null ? bodyCondition != null : !BODY_CONDITION_EDEFAULT.equals(bodyCondition);
			case Uml2contextPackage.OPERATION__RETURN_VALUE:
				return returnValue != RETURN_VALUE_EDEFAULT;
			case Uml2contextPackage.OPERATION__PARAMETER:
				return parameter != null && !parameter.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isLeaf: ");
		result.append(isLeaf);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isQuery: ");
		result.append(isQuery);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", postcondition: ");
		result.append(postcondition);
		result.append(", precondition: ");
		result.append(precondition);
		result.append(", redefinedOperation: ");
		result.append(redefinedOperation);
		result.append(", bodyCondition: ");
		result.append(bodyCondition);
		result.append(", returnValue: ");
		result.append(returnValue);
		result.append(", parameter: ");
		result.append(parameter);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
