package com.altran.general.integration.xtextsirius.eef.internal;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.function.Predicate;
import java.util.stream.Stream;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

import com.altran.general.integration.xtextsirius.eef.IXtextPropertyConfiguration;
import com.altran.general.integration.xtextsirius.util.MultimapCollectors;
import com.google.common.collect.Multimap;

public class XtextSiriusEefLifecycleManagerProvider implements IEEFLifecycleManagerProvider {
	
	private static final String GROUP_ID_ATTRIBUTE = "groupId";
	private static final String CONFIG_CLASS_ATTRIBUTE = "configClass";
	private static final String XTEXT_PROPERTY_ELEMENT = "xtextProperty";
	private static final String EXTENSION_POINT_ID = "com.altran.general.integration.xtextsirius.xtextProperty";
	
	@Inject
	private IExtensionRegistry registry;
	
	protected Multimap<String, IXtextPropertyConfiguration> getXtextPropertyConfigurations() {
		return collectXtextPropertyConfigurations()
				.collect(MultimapCollectors.fromEntries());
	}
	
	private Stream<SimpleImmutableEntry<String, IXtextPropertyConfiguration>> collectXtextPropertyConfigurations() {
		return Stream.of(this.registry.getConfigurationElementsFor(EXTENSION_POINT_ID))
				.filter(e -> e.isValid())
				.filter(e -> XTEXT_PROPERTY_ELEMENT.equals(e.getName()))
				.map(e -> {
					IXtextPropertyConfiguration executableExtension = null;
					try {
						executableExtension = (IXtextPropertyConfiguration) e
								.createExecutableExtension(CONFIG_CLASS_ATTRIBUTE);
					} catch (final CoreException | ClassCastException ex) {
						// fail silently, will be handled in filter below
					}
					return new SimpleImmutableEntry<>(e.getAttribute(GROUP_ID_ATTRIBUTE), executableExtension);
				})
				.filter(pair -> StringUtils.isNotBlank(pair.getKey())
						&& pair.getValue() instanceof IXtextPropertyConfiguration);
	}
	
	
	@Override
	public boolean canHandle(final EEFControlDescription controlDescription) {
		return collectXtextPropertyConfigurations()
				.anyMatch(createIdentifierFilter(controlDescription));
	}
	
	private Predicate<? super SimpleImmutableEntry<String, IXtextPropertyConfiguration>> createIdentifierFilter(
			final EEFControlDescription controlDescription) {
		return e -> StringUtils.equals(controlDescription.getIdentifier(), e.getKey());
	}
	
	@Override
	public IEEFLifecycleManager getLifecycleManager(final EEFControlDescription controlDescription,
			final IVariableManager variableManager, final IInterpreter interpreter,
			final EditingContextAdapter contextAdapter) {
		if (controlDescription instanceof EEFCustomWidgetDescription) {
			return collectXtextPropertyConfigurations()
					.filter(createIdentifierFilter(controlDescription))
					.findAny()
					.map(e -> new XtextSiriusEefLifecycleManager(e.getValue(),
							(EEFCustomWidgetDescription) controlDescription, variableManager, interpreter,
							contextAdapter))
					.orElseThrow(
							() -> new IllegalStateException("Cannot find IXtextPropertyConfiguration for identifier "
									+ controlDescription.getIdentifier()));
		}

		throw new IllegalArgumentException("controlDescription is not of type EEFCustomWidgetDescription");
	}
	
}
