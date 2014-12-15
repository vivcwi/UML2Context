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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2context.ActionClass;
import uml2context.AgentRoleClass;
import uml2context.Belief;
import uml2context.Classifier;
import uml2context.Control;
import uml2context.Element;
import uml2context.Ownership;
import uml2context.Play;
import uml2context.Property;
import uml2context.ProtocolClass;
import uml2context.Uml2contextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent Role Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getOwnedGoal <em>Owned Goal</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getOwnedDuty <em>Owned Duty</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getOwnedRight <em>Owned Right</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getPlay <em>Play</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getOwnership <em>Ownership</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getControl <em>Control</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getOwnedBelief <em>Owned Belief</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getPerformative <em>Performative</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getReply_to <em>Reply to</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getElement <em>Element</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getOntology <em>Ontology</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getConversation_id <em>Conversation id</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getReply_with <em>Reply with</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getIn_reply_to <em>In reply to</em>}</li>
 *   <li>{@link uml2context.impl.AgentRoleClassImpl#getReply_by <em>Reply by</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentRoleClassImpl extends ClassifierImpl implements AgentRoleClass {
	/**
	 * The cached value of the '{@link #getOwnedGoal() <em>Owned Goal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedGoal;

	/**
	 * The cached value of the '{@link #getOwnedDuty() <em>Owned Duty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDuty()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionClass> ownedDuty;

	/**
	 * The cached value of the '{@link #getOwnedRight() <em>Owned Right</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRight()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionClass> ownedRight;

	/**
	 * The cached value of the '{@link #getPlay() <em>Play</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlay()
	 * @generated
	 * @ordered
	 */
	protected Play play;

	/**
	 * The cached value of the '{@link #getOwnership() <em>Ownership</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnership()
	 * @generated
	 * @ordered
	 */
	protected Ownership ownership;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> control;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EList<AgentRoleClass> superClass;

	/**
	 * The cached value of the '{@link #getOwnedBelief() <em>Owned Belief</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBelief()
	 * @generated
	 * @ordered
	 */
	protected EList<Belief> ownedBelief;

	/**
	 * The default value of the '{@link #getPerformative() <em>Performative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformative()
	 * @generated
	 * @ordered
	 */
	protected static final String PERFORMATIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerformative() <em>Performative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformative()
	 * @generated
	 * @ordered
	 */
	protected String performative = PERFORMATIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReply_to() <em>Reply to</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReply_to()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> reply_to;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected Element element;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

	/**
	 * The default value of the '{@link #getOntology() <em>Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntology()
	 * @generated
	 * @ordered
	 */
	protected static final String ONTOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOntology() <em>Ontology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOntology()
	 * @generated
	 * @ordered
	 */
	protected String ontology = ONTOLOGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolClass> protocol;

	/**
	 * The default value of the '{@link #getConversation_id() <em>Conversation id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversation_id()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERSATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConversation_id() <em>Conversation id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversation_id()
	 * @generated
	 * @ordered
	 */
	protected String conversation_id = CONVERSATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReply_with() <em>Reply with</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReply_with()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLY_WITH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReply_with() <em>Reply with</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReply_with()
	 * @generated
	 * @ordered
	 */
	protected String reply_with = REPLY_WITH_EDEFAULT;

	/**
	 * The default value of the '{@link #getIn_reply_to() <em>In reply to</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn_reply_to()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_REPLY_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIn_reply_to() <em>In reply to</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn_reply_to()
	 * @generated
	 * @ordered
	 */
	protected String in_reply_to = IN_REPLY_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getReply_by() <em>Reply by</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReply_by()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLY_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReply_by() <em>Reply by</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReply_by()
	 * @generated
	 * @ordered
	 */
	protected String reply_by = REPLY_BY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentRoleClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2contextPackage.Literals.AGENT_ROLE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedGoal() {
		if (ownedGoal == null) {
			ownedGoal = new EObjectContainmentEList<Property>(Property.class, this, Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_GOAL);
		}
		return ownedGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionClass> getOwnedDuty() {
		if (ownedDuty == null) {
			ownedDuty = new EObjectContainmentEList<ActionClass>(ActionClass.class, this, Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_DUTY);
		}
		return ownedDuty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionClass> getOwnedRight() {
		if (ownedRight == null) {
			ownedRight = new EObjectContainmentEList<ActionClass>(ActionClass.class, this, Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_RIGHT);
		}
		return ownedRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Play getPlay() {
		if (play != null && play.eIsProxy()) {
			InternalEObject oldPlay = (InternalEObject)play;
			play = (Play)eResolveProxy(oldPlay);
			if (play != oldPlay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.AGENT_ROLE_CLASS__PLAY, oldPlay, play));
			}
		}
		return play;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Play basicGetPlay() {
		return play;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlay(Play newPlay, NotificationChain msgs) {
		Play oldPlay = play;
		play = newPlay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__PLAY, oldPlay, newPlay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlay(Play newPlay) {
		if (newPlay != play) {
			NotificationChain msgs = null;
			if (play != null)
				msgs = ((InternalEObject)play).eInverseRemove(this, Uml2contextPackage.PLAY__AGENT_ROLE, Play.class, msgs);
			if (newPlay != null)
				msgs = ((InternalEObject)newPlay).eInverseAdd(this, Uml2contextPackage.PLAY__AGENT_ROLE, Play.class, msgs);
			msgs = basicSetPlay(newPlay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__PLAY, newPlay, newPlay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ownership getOwnership() {
		if (ownership != null && ownership.eIsProxy()) {
			InternalEObject oldOwnership = (InternalEObject)ownership;
			ownership = (Ownership)eResolveProxy(oldOwnership);
			if (ownership != oldOwnership) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP, oldOwnership, ownership));
			}
		}
		return ownership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ownership basicGetOwnership() {
		return ownership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnership(Ownership newOwnership, NotificationChain msgs) {
		Ownership oldOwnership = ownership;
		ownership = newOwnership;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP, oldOwnership, newOwnership);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnership(Ownership newOwnership) {
		if (newOwnership != ownership) {
			NotificationChain msgs = null;
			if (ownership != null)
				msgs = ((InternalEObject)ownership).eInverseRemove(this, Uml2contextPackage.OWNERSHIP__AGENT_ROLE, Ownership.class, msgs);
			if (newOwnership != null)
				msgs = ((InternalEObject)newOwnership).eInverseAdd(this, Uml2contextPackage.OWNERSHIP__AGENT_ROLE, Ownership.class, msgs);
			msgs = basicSetOwnership(newOwnership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP, newOwnership, newOwnership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Control> getControl() {
		if (control == null) {
			control = new EObjectWithInverseResolvingEList<Control>(Control.class, this, Uml2contextPackage.AGENT_ROLE_CLASS__CONTROL, Uml2contextPackage.CONTROL__CONTROLLED);
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AgentRoleClass> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectResolvingEList<AgentRoleClass>(AgentRoleClass.class, this, Uml2contextPackage.AGENT_ROLE_CLASS__SUPER_CLASS);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Belief> getOwnedBelief() {
		if (ownedBelief == null) {
			ownedBelief = new EObjectContainmentEList<Belief>(Belief.class, this, Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_BELIEF);
		}
		return ownedBelief;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerformative() {
		return performative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformative(String newPerformative) {
		String oldPerformative = performative;
		performative = newPerformative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__PERFORMATIVE, oldPerformative, performative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getReply_to() {
		if (reply_to == null) {
			reply_to = new EObjectContainmentEList<Classifier>(Classifier.class, this, Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_TO);
		}
		return reply_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (Element)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2contextPackage.AGENT_ROLE_CLASS__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(Element newElement) {
		Element oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__ENCODING, oldEncoding, encoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOntology() {
		return ontology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOntology(String newOntology) {
		String oldOntology = ontology;
		ontology = newOntology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__ONTOLOGY, oldOntology, ontology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolClass> getProtocol() {
		if (protocol == null) {
			protocol = new EObjectContainmentEList<ProtocolClass>(ProtocolClass.class, this, Uml2contextPackage.AGENT_ROLE_CLASS__PROTOCOL);
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConversation_id() {
		return conversation_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversation_id(String newConversation_id) {
		String oldConversation_id = conversation_id;
		conversation_id = newConversation_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__CONVERSATION_ID, oldConversation_id, conversation_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReply_with() {
		return reply_with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReply_with(String newReply_with) {
		String oldReply_with = reply_with;
		reply_with = newReply_with;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_WITH, oldReply_with, reply_with));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIn_reply_to() {
		return in_reply_to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn_reply_to(String newIn_reply_to) {
		String oldIn_reply_to = in_reply_to;
		in_reply_to = newIn_reply_to;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__IN_REPLY_TO, oldIn_reply_to, in_reply_to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReply_by() {
		return reply_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReply_by(String newReply_by) {
		String oldReply_by = reply_by;
		reply_by = newReply_by;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_BY, oldReply_by, reply_by));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.AGENT_ROLE_CLASS__PLAY:
				if (play != null)
					msgs = ((InternalEObject)play).eInverseRemove(this, Uml2contextPackage.PLAY__AGENT_ROLE, Play.class, msgs);
				return basicSetPlay((Play)otherEnd, msgs);
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP:
				if (ownership != null)
					msgs = ((InternalEObject)ownership).eInverseRemove(this, Uml2contextPackage.OWNERSHIP__AGENT_ROLE, Ownership.class, msgs);
				return basicSetOwnership((Ownership)otherEnd, msgs);
			case Uml2contextPackage.AGENT_ROLE_CLASS__CONTROL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControl()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_GOAL:
				return ((InternalEList<?>)getOwnedGoal()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_DUTY:
				return ((InternalEList<?>)getOwnedDuty()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_RIGHT:
				return ((InternalEList<?>)getOwnedRight()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_ROLE_CLASS__PLAY:
				return basicSetPlay(null, msgs);
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP:
				return basicSetOwnership(null, msgs);
			case Uml2contextPackage.AGENT_ROLE_CLASS__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_BELIEF:
				return ((InternalEList<?>)getOwnedBelief()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_TO:
				return ((InternalEList<?>)getReply_to()).basicRemove(otherEnd, msgs);
			case Uml2contextPackage.AGENT_ROLE_CLASS__PROTOCOL:
				return ((InternalEList<?>)getProtocol()).basicRemove(otherEnd, msgs);
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
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_GOAL:
				return getOwnedGoal();
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_DUTY:
				return getOwnedDuty();
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_RIGHT:
				return getOwnedRight();
			case Uml2contextPackage.AGENT_ROLE_CLASS__PLAY:
				if (resolve) return getPlay();
				return basicGetPlay();
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP:
				if (resolve) return getOwnership();
				return basicGetOwnership();
			case Uml2contextPackage.AGENT_ROLE_CLASS__CONTROL:
				return getControl();
			case Uml2contextPackage.AGENT_ROLE_CLASS__SUPER_CLASS:
				return getSuperClass();
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_BELIEF:
				return getOwnedBelief();
			case Uml2contextPackage.AGENT_ROLE_CLASS__PERFORMATIVE:
				return getPerformative();
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_TO:
				return getReply_to();
			case Uml2contextPackage.AGENT_ROLE_CLASS__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
			case Uml2contextPackage.AGENT_ROLE_CLASS__LANGUAGE:
				return getLanguage();
			case Uml2contextPackage.AGENT_ROLE_CLASS__ENCODING:
				return getEncoding();
			case Uml2contextPackage.AGENT_ROLE_CLASS__ONTOLOGY:
				return getOntology();
			case Uml2contextPackage.AGENT_ROLE_CLASS__PROTOCOL:
				return getProtocol();
			case Uml2contextPackage.AGENT_ROLE_CLASS__CONVERSATION_ID:
				return getConversation_id();
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_WITH:
				return getReply_with();
			case Uml2contextPackage.AGENT_ROLE_CLASS__IN_REPLY_TO:
				return getIn_reply_to();
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_BY:
				return getReply_by();
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
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_GOAL:
				getOwnedGoal().clear();
				getOwnedGoal().addAll((Collection<? extends Property>)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_DUTY:
				getOwnedDuty().clear();
				getOwnedDuty().addAll((Collection<? extends ActionClass>)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_RIGHT:
				getOwnedRight().clear();
				getOwnedRight().addAll((Collection<? extends ActionClass>)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__PLAY:
				setPlay((Play)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP:
				setOwnership((Ownership)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends Control>)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends AgentRoleClass>)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_BELIEF:
				getOwnedBelief().clear();
				getOwnedBelief().addAll((Collection<? extends Belief>)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__PERFORMATIVE:
				setPerformative((String)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_TO:
				getReply_to().clear();
				getReply_to().addAll((Collection<? extends Classifier>)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__ELEMENT:
				setElement((Element)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__ENCODING:
				setEncoding((String)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__ONTOLOGY:
				setOntology((String)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__PROTOCOL:
				getProtocol().clear();
				getProtocol().addAll((Collection<? extends ProtocolClass>)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__CONVERSATION_ID:
				setConversation_id((String)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_WITH:
				setReply_with((String)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__IN_REPLY_TO:
				setIn_reply_to((String)newValue);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_BY:
				setReply_by((String)newValue);
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
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_GOAL:
				getOwnedGoal().clear();
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_DUTY:
				getOwnedDuty().clear();
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_RIGHT:
				getOwnedRight().clear();
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__PLAY:
				setPlay((Play)null);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP:
				setOwnership((Ownership)null);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__CONTROL:
				getControl().clear();
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__SUPER_CLASS:
				getSuperClass().clear();
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_BELIEF:
				getOwnedBelief().clear();
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__PERFORMATIVE:
				setPerformative(PERFORMATIVE_EDEFAULT);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_TO:
				getReply_to().clear();
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__ELEMENT:
				setElement((Element)null);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__ONTOLOGY:
				setOntology(ONTOLOGY_EDEFAULT);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__PROTOCOL:
				getProtocol().clear();
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__CONVERSATION_ID:
				setConversation_id(CONVERSATION_ID_EDEFAULT);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_WITH:
				setReply_with(REPLY_WITH_EDEFAULT);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__IN_REPLY_TO:
				setIn_reply_to(IN_REPLY_TO_EDEFAULT);
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_BY:
				setReply_by(REPLY_BY_EDEFAULT);
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
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_GOAL:
				return ownedGoal != null && !ownedGoal.isEmpty();
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_DUTY:
				return ownedDuty != null && !ownedDuty.isEmpty();
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_RIGHT:
				return ownedRight != null && !ownedRight.isEmpty();
			case Uml2contextPackage.AGENT_ROLE_CLASS__PLAY:
				return play != null;
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNERSHIP:
				return ownership != null;
			case Uml2contextPackage.AGENT_ROLE_CLASS__CONTROL:
				return control != null && !control.isEmpty();
			case Uml2contextPackage.AGENT_ROLE_CLASS__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_BELIEF:
				return ownedBelief != null && !ownedBelief.isEmpty();
			case Uml2contextPackage.AGENT_ROLE_CLASS__PERFORMATIVE:
				return PERFORMATIVE_EDEFAULT == null ? performative != null : !PERFORMATIVE_EDEFAULT.equals(performative);
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_TO:
				return reply_to != null && !reply_to.isEmpty();
			case Uml2contextPackage.AGENT_ROLE_CLASS__ELEMENT:
				return element != null;
			case Uml2contextPackage.AGENT_ROLE_CLASS__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case Uml2contextPackage.AGENT_ROLE_CLASS__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case Uml2contextPackage.AGENT_ROLE_CLASS__ONTOLOGY:
				return ONTOLOGY_EDEFAULT == null ? ontology != null : !ONTOLOGY_EDEFAULT.equals(ontology);
			case Uml2contextPackage.AGENT_ROLE_CLASS__PROTOCOL:
				return protocol != null && !protocol.isEmpty();
			case Uml2contextPackage.AGENT_ROLE_CLASS__CONVERSATION_ID:
				return CONVERSATION_ID_EDEFAULT == null ? conversation_id != null : !CONVERSATION_ID_EDEFAULT.equals(conversation_id);
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_WITH:
				return REPLY_WITH_EDEFAULT == null ? reply_with != null : !REPLY_WITH_EDEFAULT.equals(reply_with);
			case Uml2contextPackage.AGENT_ROLE_CLASS__IN_REPLY_TO:
				return IN_REPLY_TO_EDEFAULT == null ? in_reply_to != null : !IN_REPLY_TO_EDEFAULT.equals(in_reply_to);
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_BY:
				return REPLY_BY_EDEFAULT == null ? reply_by != null : !REPLY_BY_EDEFAULT.equals(reply_by);
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
		result.append(" (performative: ");
		result.append(performative);
		result.append(", language: ");
		result.append(language);
		result.append(", encoding: ");
		result.append(encoding);
		result.append(", ontology: ");
		result.append(ontology);
		result.append(", conversation_id: ");
		result.append(conversation_id);
		result.append(", reply_with: ");
		result.append(reply_with);
		result.append(", in_reply_to: ");
		result.append(in_reply_to);
		result.append(", reply_by: ");
		result.append(reply_by);
		result.append(')');
		return result.toString();
	}

} //AgentRoleClassImpl
