package com.altran.general.integration.xtextsirius.runtime.eef.ui.internal;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription;
import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.altran.general.integration.xtextsirius.runtime.XtextLanguageInjectorManager;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.model.XtextSiriusEefLifecycleManagerModel;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.value.XtextSiriusEefLifecycleManagerValue;

public class XtextSiriusEefLifecycleManagerProvider implements IEEFLifecycleManagerProvider {

	@Override
	public boolean canHandle(final EEFControlDescription controlDescription) {
		return controlDescription instanceof IEefXtextDescription;
	}

	@Override
	public IEEFLifecycleManager getLifecycleManager(final EEFControlDescription controlDescription,
			final IVariableManager variableManager, final IInterpreter interpreter,
			final EditingContextAdapter contextAdapter) {
		if (controlDescription instanceof IEefXtextDescription) {
			final IXtextLanguageInjector languageInjector = resolveLanguageInjector(
					(IEefXtextDescription) controlDescription);
			if (controlDescription instanceof IEefXtextModelDescription) {
				return new XtextSiriusEefLifecycleManagerModel(
						languageInjector.getInjector(),
						languageInjector.useSpecializedInjectorForProperties(),
						(IEefXtextModelDescription) controlDescription, variableManager, interpreter,
						contextAdapter);
			} else if (controlDescription instanceof IEefXtextValueDescription) {
				return new XtextSiriusEefLifecycleManagerValue(
						languageInjector.getInjector(),
						languageInjector.useSpecializedInjectorForProperties(),
						(IEefXtextValueDescription) controlDescription, variableManager, interpreter,
						contextAdapter);
			}
		}

		return null;
	}

	protected @NonNull IXtextLanguageInjector resolveLanguageInjector(final IEefXtextDescription description) {
		final IXtextLanguageInjector result = XtextLanguageInjectorManager.getInstance()
				.resolveLanguageInjector(description.getInjectorId());

		if (result == null) {
			throw new IllegalArgumentException("Cannot find Xtext Language Injector id=" + description.getInjectorId());
		}

		return result;
	}

}
