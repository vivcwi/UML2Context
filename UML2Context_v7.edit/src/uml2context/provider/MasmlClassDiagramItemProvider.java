/**
 */
package uml2context.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uml2context.MasmlClassDiagram;
import uml2context.Uml2contextFactory;
import uml2context.Uml2contextPackage;

/**
 * This is the item provider adapter for a {@link uml2context.MasmlClassDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MasmlClassDiagramItemProvider
	extends ItemProviderAdapter
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
	public MasmlClassDiagramItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_ORGANIZATION_CLASS);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_ENVIRONMENT_CLASS);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_AGENT_CLASS);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_CLASS);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_PLAY);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_GENERALIZATION);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_DEPENDENCY);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_AGGREGATION);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_COMPOSITE);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_INHABIT);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_OWNERSHIP);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_OBJECT_ROLE_CLASS);
			childrenFeatures.add(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_AGENT_ROLE_CLASS);
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
	 * This returns MasmlClassDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MasmlClassDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_MasmlClassDiagram_type");
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

		switch (notification.getFeatureID(MasmlClassDiagram.class)) {
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ORGANIZATION_CLASS:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ENVIRONMENT_CLASS:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_CLASS:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_CLASS:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_PLAY:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_GENERALIZATION:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_DEPENDENCY:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGGREGATION:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_COMPOSITE:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_INHABIT:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OWNERSHIP:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_OBJECT_ROLE_CLASS:
			case Uml2contextPackage.MASML_CLASS_DIAGRAM__OWNED_AGENT_ROLE_CLASS:
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
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_ORGANIZATION_CLASS,
				 Uml2contextFactory.eINSTANCE.createOrganizationClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_ENVIRONMENT_CLASS,
				 Uml2contextFactory.eINSTANCE.createEnvironmentClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_AGENT_CLASS,
				 Uml2contextFactory.eINSTANCE.createAgentClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_CLASS,
				 Uml2contextFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_PLAY,
				 Uml2contextFactory.eINSTANCE.createPlay()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_GENERALIZATION,
				 Uml2contextFactory.eINSTANCE.createGeneralization()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_DEPENDENCY,
				 Uml2contextFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION,
				 Uml2contextFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION,
				 Uml2contextFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION,
				 Uml2contextFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_AGGREGATION,
				 Uml2contextFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_COMPOSITE,
				 Uml2contextFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_INHABIT,
				 Uml2contextFactory.eINSTANCE.createInhabit()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_OWNERSHIP,
				 Uml2contextFactory.eINSTANCE.createOwnership()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_OBJECT_ROLE_CLASS,
				 Uml2contextFactory.eINSTANCE.createObjectRoleClass()));

		newChildDescriptors.add
			(createChildParameter
				(Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_AGENT_ROLE_CLASS,
				 Uml2contextFactory.eINSTANCE.createAgentRoleClass()));
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
			childFeature == Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_ASSOCIATION ||
			childFeature == Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_AGGREGATION ||
			childFeature == Uml2contextPackage.Literals.MASML_CLASS_DIAGRAM__OWNED_COMPOSITE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Uml2contextEditPlugin.INSTANCE;
	}

}
