/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.runtime.modelregion.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import java.lang.reflect.Field;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Guard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore("Ignored during XtextSiriusModelEditor consolidation")
@SuppressWarnings("all")
public class TestConstructXtextFragmentSchemeBasedLocation extends AModelRegionEditorPreparer {
  @Test
  public void singleChild() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(2);
    final Guard guard = event.getGuard();
    final URI orgUri = EcoreUtil.getURI(guard);
    AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter _multilineDescriptor = this.multilineDescriptor();
    EReference _event_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_multilineDescriptor, null, event, _event_Guard);
    final SemanticElementLocation location = preparer.constructXtextFragmentSchemeBasedLocation();
    Assert.assertEquals(orgUri.fragment(), this.extractUriFragment(location));
  }
  
  @Test
  public void firstChild() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    final URI orgUri = EcoreUtil.getURI(event);
    AModelRegionEditorPreparer.XtextSiriusModelDescriptorAdapter _multilineDescriptor = this.multilineDescriptor();
    EReference _statemachine_Events = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getStatemachine_Events();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(_multilineDescriptor, null, model, _statemachine_Events);
    final SemanticElementLocation location = preparer.constructXtextFragmentSchemeBasedLocation();
    Assert.assertEquals(orgUri.fragment(), this.extractUriFragment(location));
  }
  
  protected String extractUriFragment(final SemanticElementLocation location) {
    try {
      final Field field = location.getClass().getDeclaredField("uriFragment");
      field.setAccessible(true);
      Object _get = field.get(location);
      return ((String) _get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
