package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.model.XtextSiriusDirectEditManagerModel;
import com.google.inject.Injector;

public class XtextSiriusModelDescriptor extends AXtextSiriusDescriptor {

	private final @NonNull Set<@NonNull String> editableFeatures;
	private final @NonNull Set<@NonNull String> selectedFeatures;

	public XtextSiriusModelDescriptor(
			final @NonNull Injector injector,
			final boolean multiLine,
			final @NonNull Set<@NonNull String> editableFeatures,
			final @NonNull Set<@NonNull String> selectedFeatures) {
		super(injector, multiLine);
		this.editableFeatures = editableFeatures;
		this.selectedFeatures = selectedFeatures;
	}

	public XtextSiriusModelDescriptor(final @NonNull Injector injector,
			final @NonNull IXtextDirectEditModelDescription description) {
		super(injector, description);
		this.editableFeatures = convertFeatureNames(description.getEditableFeatures());
		this.selectedFeatures = convertFeatureNames(description.getSelectedFeatures());
	}
	
	protected Set<@NonNull String> convertFeatureNames(final Collection<String> featureNames) {
		return featureNames.stream()
				.filter(StringUtils::isNotBlank)
				.map(f -> StringUtils.substringAfterLast(f, "."))
				.collect(Collectors.toSet());
	}

	public @NonNull Set<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}

	public @NonNull Set<@NonNull String> getSelectedFeatures() {
		return this.selectedFeatures;
	}

	@Override
	public @NonNull XtextSiriusDirectEditManager createDirectEditManager(
			final @NonNull IXtextSiriusAwareLabelEditPart editPart) {
		return new XtextSiriusDirectEditManagerModel(editPart, this);
	}
}
