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
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2context.OrganizationClass;
import uml2context.Uml2contextFactory;
import uml2context.Uml2contextPackage;

/**
 * This is the item provider adapter for a {@link uml2context.OrganizationClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganizationClassItemProvider
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
	public OrganizationClassItemProvider(AdapterFactory adapterFactory) {
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

			addSentMessagePropertyDescriptor(object);
			addReceiveMessagePropertyDescriptor(object);
			addInhabitPropertyDescriptor(object);
			addPlayPropertyDescriptor(object);
			addSuperClassPropertyDescriptor(object);
			addOwnershipPropertyDescriptor(object);
			addPlay_inPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sent Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSentMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationClass_sentMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationClass_sentMessage_feature", "_UI_OrganizationClass_type"),
				 Uml2contextPackage.Literals.ORGANIZATION_CLASS__SENT_MESSAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Receive Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReceiveMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationClass_receiveMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationClass_receiveMessage_feature", "_UI_OrganizationClass_type"),
				 Uml2contextPackage.Literals.ORGANIZATION_CLASS__RECEIVE_MESSAGE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inhabit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInhabitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationClass_inhabit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationClass_inhabit_feature", "_UI_OrganizationClass_type"),
				 Uml2contextPackage.Literals.ORGANIZATION_CLASS__INHABIT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_OrganizationClass_play_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationClass_play_feature", "_UI_OrganizationClass_type"),
				 Uml2contextPackage.Literals.ORGANIZATION_CLASS__PLAY,
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
				 getString("_UI_OrganizationClass_superClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationClass_superClass_feature", "_UI_OrganizationClass_type"),
				 Uml2contextPackage.Literals.ORGANIZATION_CLASS__SUPER_CLASS,
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
				 getString("_UI_OrganizationClass_ownership_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationClass_ownership_feature", "_UI_OrganizationClass_type"),
				 Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNERSHIP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Play in feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlay_inPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OrganizationClass_play_in_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OrganizationClass_play_in_feature", "_UI_OrganizationClass_type"),
				 Uml2contextPackage.Literals.ORGANIZATION_CLASS__PLAY_IN,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_GOAL);
			childrenFeatures.add(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_BELIEF);
			childrenFeatures.add(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_PLAN);
			childrenFeatures.add(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_ACTION);
			childrenFeatures.add(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_ATTRIBUTE);
			childrenFeatures.add(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_AGENT_ROLE);
			childrenFeatures.add(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE);
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
	 * This returns OrganizationClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OrganizationClass"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OrganizationClass)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OrganizationClass_type") :
			getString("_UI_OrganizationClass_type") + " " + label;
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

		switch (notification.getFeatureID(OrganizationClass.class)) {
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_GOAL:
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_BELIEF:
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_PLAN:
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ACTION:
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_ATTRIBUTE:
			case Uml2contextPackage.ORGANIZATION_CLASS__OWNED_AGENT_ROLE:
			case Uml2contextPackage.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE:
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
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_GOAL,
				 Uml2contextFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_GOAL,
				 Uml2contextFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_GOAL,
				 Uml2contextFactory.eINSTANCE.createBelief()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_BELIEF,
				 Uml2contextFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_BELIEF,
				 Uml2contextFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_BELIEF,
				 Uml2contextFactory.eINSTANCE.createBelief()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_PLAN,
				 Uml2contextFactory.eINSTANCE.createPlanClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_ACTION,
				 Uml2contextFactory.eINSTANCE.createActionClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_ACTION,
				 Uml2contextFactory.eINSTANCE.createDuty()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_ACTION,
				 Uml2contextFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_ATTRIBUTE,
				 Uml2contextFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_ATTRIBUTE,
				 Uml2contextFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_ATTRIBUTE,
				 Uml2contextFactory.eINSTANCE.createBelief()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_AGENT_ROLE,
				 Uml2contextFactory.eINSTANCE.createAgentRoleClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWENED_OBJECT_ROLE,
				 Uml2contextFactory.eINSTANCE.createObjectRoleClass()));
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
			childFeature == Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_GOAL ||
			childFeature == Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_BELIEF ||
			childFeature == Uml2contextPackage.Literals.ORGANIZATION_CLASS__OWNED_ATTRIBUTE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
