package com.altran.general.integration.xtextsirius.internal;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.business.api.helper.task.AbstractCommandTask;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.FeatureNotFoundException;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.MetaClassNotFoundException;

import com.altran.general.integration.xtextsirius.util.ECollectionUtil;

public class ReplaceValueTask extends AbstractCommandTask {
	private final @NonNull ReplaceValueParameter parameter;

	public ReplaceValueTask(final @NonNull ReplaceValueParameter parameter) {
		this.parameter = parameter;
	}

	@Override
	public String getLabel() {
		return "Replace value";
	}

	@SuppressWarnings("unchecked")
	@Override
	public void execute() throws MetaClassNotFoundException, FeatureNotFoundException {
		final EObject elementToEdit = this.parameter.getElementToEdit();
		final EStructuralFeature feature = this.parameter.getFeature();
		final Object value = this.parameter.getValue();
		
		final EObject representationTarget = this.parameter.getRepresentationElement().getTarget();

		final @Nullable Object oldValue = elementToEdit.eGet(feature);
		Object updateRepresentation = value;

		final boolean many = FeatureMapUtil.isMany(elementToEdit, feature);
		if (many && oldValue instanceof Collection) {
			@SuppressWarnings("rawtypes")
			final Collection collection = ((Collection) oldValue);
			if (value instanceof List) {
				if (collection.contains(representationTarget)) {
					updateRepresentation = oldValue;
				}

				final List<?> values = (List<?>) value;
				collection.clear();
				collection.addAll(values);

			} else if (value instanceof EObject) {
				updateRepresentation = ECollectionUtil.updateOrAddLocal(collection, (EObject) value);
			} else {
				collection.add(value);
			}
		} else {
			elementToEdit.eSet(feature, value);
		}

		if (updateRepresentation instanceof EObject && updateRepresentation != representationTarget) {
			this.parameter.getRepresentationElement().setTarget((EObject) updateRepresentation);
		}
	}
}