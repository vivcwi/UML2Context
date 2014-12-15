/**
 */
package uml2context.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2context.AgentRoleClass;
import uml2context.Uml2contextFactory;
import uml2context.Uml2contextPackage;

/**
 * This is the item provider adapter for a {@link uml2context.AgentRoleClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AgentRoleClassItemProvider
	extends ClassifierItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentRoleClassItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPlayPropertyDescriptor(object);
			addOwnershipPropertyDescriptor(object);
			addControlPropertyDescriptor(object);
			addSuperClassPropertyDescriptor(object);
			addPerformativePropertyDescriptor(object);
			addElementPropertyDescriptor(object);
			addLanguagePropertyDescriptor(object);
			addEncodingPropertyDescriptor(object);
			addOntologyPropertyDescriptor(object);
			addConversation_idPropertyDescriptor(object);
			addReply_withPropertyDescriptor(object);
			addIn_reply_toPropertyDescriptor(object);
			addReply_byPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Play feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_play_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_play_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__PLAY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ownership feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnershipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_ownership_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_ownership_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNERSHIP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_control_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_control_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__CONTROL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_superClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_superClass_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__SUPER_CLASS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Performative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerformativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_performative_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_performative_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__PERFORMATIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_element_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_element_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Language feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLanguagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_language_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_language_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__LANGUAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encoding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncodingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_encoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_encoding_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__ENCODING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ontology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOntologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_ontology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_ontology_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__ONTOLOGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conversation id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConversation_idPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_conversation_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_conversation_id_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__CONVERSATION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reply with feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReply_withPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_reply_with_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_reply_with_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_WITH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the In reply to feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIn_reply_toPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_in_reply_to_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_in_reply_to_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__IN_REPLY_TO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reply by feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReply_byPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AgentRoleClass_reply_by_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AgentRoleClass_reply_by_feature", "_UI_AgentRoleClass_type"),
				 Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_BY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_GOAL);
			childrenFeatures.add(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_DUTY);
			childrenFeatures.add(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_RIGHT);
			childrenFeatures.add(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_BELIEF);
			childrenFeatures.add(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_TO);
			childrenFeatures.add(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__PROTOCOL);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AgentRoleClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AgentRoleClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AgentRoleClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AgentRoleClass_type") :
			getString("_UI_AgentRoleClass_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AgentRoleClass.class)) {
			case Uml2contextPackage.AGENT_ROLE_CLASS__PERFORMATIVE:
			case Uml2contextPackage.AGENT_ROLE_CLASS__LANGUAGE:
			case Uml2contextPackage.AGENT_ROLE_CLASS__ENCODING:
			case Uml2contextPackage.AGENT_ROLE_CLASS__ONTOLOGY:
			case Uml2contextPackage.AGENT_ROLE_CLASS__CONVERSATION_ID:
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_WITH:
			case Uml2contextPackage.AGENT_ROLE_CLASS__IN_REPLY_TO:
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_BY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_GOAL:
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_DUTY:
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_RIGHT:
			case Uml2contextPackage.AGENT_ROLE_CLASS__OWNED_BELIEF:
			case Uml2contextPackage.AGENT_ROLE_CLASS__REPLY_TO:
			case Uml2contextPackage.AGENT_ROLE_CLASS__PROTOCOL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_GOAL,
				 Uml2contextFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_GOAL,
				 Uml2contextFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_GOAL,
				 Uml2contextFactory.eINSTANCE.createBelief()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_DUTY,
				 Uml2contextFactory.eINSTANCE.createActionClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_DUTY,
				 Uml2contextFactory.eINSTANCE.createDuty()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_DUTY,
				 Uml2contextFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_RIGHT,
				 Uml2contextFactory.eINSTANCE.createActionClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_RIGHT,
				 Uml2contextFactory.eINSTANCE.createDuty()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_RIGHT,
				 Uml2contextFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_BELIEF,
				 Uml2contextFactory.eINSTANCE.createBelief()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_TO,
				 Uml2contextFactory.eINSTANCE.createClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_TO,
				 Uml2contextFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_TO,
				 Uml2contextFactory.eINSTANCE.createAgentClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_TO,
				 Uml2contextFactory.eINSTANCE.createOrganizationClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_TO,
				 Uml2contextFactory.eINSTANCE.createAgentRoleClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_TO,
				 Uml2contextFactory.eINSTANCE.createObjectRoleClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_TO,
				 Uml2contextFactory.eINSTANCE.createEnvironmentClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_TO,
				 Uml2contextFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_TO,
				 Uml2contextFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__REPLY_TO,
				 Uml2contextFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.AGENT_ROLE_CLASS__PROTOCOL,
				 Uml2contextFactory.eINSTANCE.createProtocolClass()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_GOAL ||
			childFeature == Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_BELIEF ||
			childFeature == Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_DUTY ||
			childFeature == Uml2contextPackage.Literals.AGENT_ROLE_CLASS__OWNED_RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
