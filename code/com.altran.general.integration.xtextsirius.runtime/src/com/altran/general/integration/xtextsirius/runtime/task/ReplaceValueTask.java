package com.altran.general.integration.xtextsirius.runtime.task;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.business.api.helper.task.AbstractCommandTask;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.FeatureNotFoundException;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.MetaClassNotFoundException;

import com.altran.general.integration.xtextsirius.util.EMerger;

public class ReplaceValueTask extends AbstractCommandTask {
	private final @NonNull ReplaceValueParameter parameter;

	public ReplaceValueTask(final @NonNull ReplaceValueParameter parameter) {
		this.parameter = parameter;
	}

	@Override
	public String getLabel() {
		return "Replace value";
	}

	@Override
	public void execute() throws MetaClassNotFoundException, FeatureNotFoundException {
		final EObject elementToEdit = this.parameter.getElementToEdit();
		final EStructuralFeature feature = this.parameter.getFeature();
		final Object newValue = this.parameter.getValue();

		final EObject representationTarget = this.parameter.getRepresentationElement().getTarget();

		final EMerger<EObject> merger = new EMerger<>(elementToEdit, this.parameter.getFeaturesToReplace(),
				this.parameter.getIgnoredNestedFeatures(), this.parameter.getOriginalUri());
		
		final Object updateRepresentation = merger.merge(newValue, feature);

		if (updateRepresentation instanceof EObject && updateRepresentation != representationTarget) {
			this.parameter.getRepresentationElement().setTarget((EObject) updateRepresentation);
		}
	}
}