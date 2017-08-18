package com.altran.general.integration.xtextsirius.editpart.internal;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.altran.general.integration.xtextsirius.editpart.internal.model.EditPartDescriptorModel;
import com.altran.general.integration.xtextsirius.editpart.internal.value.EditPartDescriptorValue;

public class XtextSiriusEditPartProvider extends AbstractEditPartProvider {
	private static final String EXTENSION_POINT_ID = "com.altran.general.integration.xtextsirius.xtextDirectEdit";
	private static final String CONFIG_CLASS_ATTRIBUTE = "configClass";
	private static final String SINGLE_LINE_ATTRIBUTE = "singleLine";
	private static final String IDENTIFIER_ATTRIBUTE = "attributeName";
	private static final String XTEXT_DIRECT_EDIT_MODEL_ELEMENT = "xtextDirectEditModel";
	private static final String SEMANTIC_TYPE_ATTRIBUTE = "semanticType";
	private static final String XTEXT_DIRECT_EDIT_VALUE_ELEMENT = "xtextDirectEditValue";
	
	@Override
	public @NonNull IGraphicalEditPart createGraphicEditPart(final View view) {
		final String identifier = extractIdentifier(view);
		if (identifier != null) {
			return collectXtextDirectEditConfigurations()
					.filter(providesFilter(identifier))
					.findAny()
					.map(d -> d.createEditPart(view))
					.orElseThrow(
							() -> new IllegalStateException(
									"Cannot find IXtextDirectEditConfiguration for semanticType "
											+ identifier));
		}


		return super.createGraphicEditPart(view);
	}

	private @Nullable String extractIdentifier(final @NonNull View view) {
		final EObject viewElement = view.getElement();
		if (viewElement instanceof DRepresentationElement) {
			final DRepresentationElement representationElement = (DRepresentationElement) viewElement;
			return representationElement.getMapping().getName();
		}

		return null;
	}


	@Override
	public boolean provides(final IOperation operation) {
		if (operation instanceof CreateGraphicEditPartOperation) {
			final View view = ((IEditPartOperation) operation).getView();
			final String targetIdentifier = extractIdentifier(view);
			if (targetIdentifier != null) {
				return collectXtextDirectEditConfigurations()
						.anyMatch(providesFilter(targetIdentifier));
			}
		}
		
		return super.provides(operation);
	}

	private @NonNull Predicate<? super AEditPartDescriptor> providesFilter(
			final @NonNull String identifier) {
		return d -> identifier.equals(d.getIdentifier());
	}
	
	private @NonNull Stream<@NonNull AEditPartDescriptor> collectXtextDirectEditConfigurations() {
		return Stream.of(Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID))
				.filter(e -> e.isValid())
				.filter(e -> XTEXT_DIRECT_EDIT_MODEL_ELEMENT.equals(e.getName())
						|| XTEXT_DIRECT_EDIT_VALUE_ELEMENT.equals(e.getName()))
				.map(e -> {
					IXtextDirectEditConfiguration configuration = null;
					try {
						configuration = (IXtextDirectEditConfiguration) e
								.createExecutableExtension(CONFIG_CLASS_ATTRIBUTE);
					} catch (final CoreException | ClassCastException ex) {
						// fail silently, will be handled in filter below
					}
					final String identifier = e.getAttribute(IDENTIFIER_ATTRIBUTE);
					final boolean singleLine = Boolean.parseBoolean(e.getAttribute(SINGLE_LINE_ATTRIBUTE));
					switch (e.getName()) {
						case XTEXT_DIRECT_EDIT_MODEL_ELEMENT:
							return new EditPartDescriptorModel(identifier, singleLine, configuration,
									e.getAttribute(SEMANTIC_TYPE_ATTRIBUTE));
						case XTEXT_DIRECT_EDIT_VALUE_ELEMENT:
							return new EditPartDescriptorValue(identifier, singleLine, configuration);
						default:
							return null;
					}
				})
				.filter(Objects::nonNull)
				.filter(d -> d.isValid());
	}
	
}
