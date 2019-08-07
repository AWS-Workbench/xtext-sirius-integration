/*
 * generated by Xtext 2.18.0.M3
 */
package com.example.ui;

import com.example.classes.ui.internal.ClassesActivator;
import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ClassesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ClassesActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ClassesActivator activator = ClassesActivator.getInstance();
		return activator != null ? activator.getInjector(ClassesActivator.COM_EXAMPLE_CLASSES) : null;
	}

}
