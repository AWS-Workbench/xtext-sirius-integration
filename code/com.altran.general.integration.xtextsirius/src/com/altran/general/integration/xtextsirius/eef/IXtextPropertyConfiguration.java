package com.altran.general.integration.xtextsirius.eef;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.layout.GridData;

import com.google.inject.Injector;

public interface IXtextPropertyConfiguration {
	public @NonNull Injector getInjector();
	
	int getSwtWidgetStyle();
	
	public @NonNull GridData getLayoutData();
}
