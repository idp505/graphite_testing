/**
 */
package structurizr.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import structurizr.CompositeCondition;
import structurizr.ConditionLogicalOperation;
import structurizr.StructurizrFactory;
import structurizr.StructurizrPackage;

/**
 * This is the item provider adapter for a {@link structurizr.CompositeCondition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeConditionItemProvider extends FilterConditionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConditionItemProvider(AdapterFactory adapterFactory) {
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

			addLogicalOperationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Logical Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLogicalOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeCondition_logicalOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeCondition_logicalOperation_feature", "_UI_CompositeCondition_type"),
				 StructurizrPackage.Literals.COMPOSITE_CONDITION__LOGICAL_OPERATION,
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
			childrenFeatures.add(StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT);
			childrenFeatures.add(StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT);
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
	 * This returns CompositeCondition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeCondition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ConditionLogicalOperation labelValue = ((CompositeCondition)object).getLogicalOperation();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeCondition_type") :
			getString("_UI_CompositeCondition_type") + " " + label;
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

		switch (notification.getFeatureID(CompositeCondition.class)) {
			case StructurizrPackage.COMPOSITE_CONDITION__LOGICAL_OPERATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StructurizrPackage.COMPOSITE_CONDITION__LEFT:
			case StructurizrPackage.COMPOSITE_CONDITION__RIGHT:
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
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT,
				 StructurizrFactory.eINSTANCE.createCompositeCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT,
				 StructurizrFactory.eINSTANCE.createElementTagCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT,
				 StructurizrFactory.eINSTANCE.createElementTechnologyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT,
				 StructurizrFactory.eINSTANCE.createElementTypeCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT,
				 StructurizrFactory.eINSTANCE.createElementPropertyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT,
				 StructurizrFactory.eINSTANCE.createElementParentCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT,
				 StructurizrFactory.eINSTANCE.createRelationshipTagCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT,
				 StructurizrFactory.eINSTANCE.createRelationshipPropertyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT,
				 StructurizrFactory.eINSTANCE.createRelationshipSourceCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT,
				 StructurizrFactory.eINSTANCE.createRelationshipDestinationCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT,
				 StructurizrFactory.eINSTANCE.createCompositeCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT,
				 StructurizrFactory.eINSTANCE.createElementTagCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT,
				 StructurizrFactory.eINSTANCE.createElementTechnologyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT,
				 StructurizrFactory.eINSTANCE.createElementTypeCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT,
				 StructurizrFactory.eINSTANCE.createElementPropertyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT,
				 StructurizrFactory.eINSTANCE.createElementParentCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT,
				 StructurizrFactory.eINSTANCE.createRelationshipTagCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT,
				 StructurizrFactory.eINSTANCE.createRelationshipPropertyCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT,
				 StructurizrFactory.eINSTANCE.createRelationshipSourceCondition()));

		newChildDescriptors.add
			(createChildParameter
				(StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT,
				 StructurizrFactory.eINSTANCE.createRelationshipDestinationCondition()));
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
			childFeature == StructurizrPackage.Literals.COMPOSITE_CONDITION__LEFT ||
			childFeature == StructurizrPackage.Literals.COMPOSITE_CONDITION__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
