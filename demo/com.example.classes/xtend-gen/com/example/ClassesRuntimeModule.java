/**
 * generated by Xtext 2.13.0
 */
package com.example;

import com.example.AbstractClassesRuntimeModule;
import com.example.services.ClassesValueConverters;
import org.eclipse.xtext.conversion.IValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class ClassesRuntimeModule extends AbstractClassesRuntimeModule {
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return ClassesValueConverters.class;
  }
}
