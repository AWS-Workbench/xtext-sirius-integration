package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.util.Set;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestPrepare extends AModelRegionEditorPreparer {
  @Test
  public void prepareOnlyOnce() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    EReference _event_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(null, event, _injector, true, _emptySet, _emptySet_1, _event_Guard);
    Assert.assertFalse(preparer.isPrepared());
    preparer.prepare();
    Assert.assertTrue(preparer.isPrepared());
  }
}
