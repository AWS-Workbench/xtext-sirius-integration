package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.Set;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestResolveEditableFeatures extends AModelRegionEditorPreparer {
  @Test
  public void emptyFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, _emptySet, _emptySet_1);
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(0, resolved.size());
  }
  
  @Test
  public void invalidFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("some", "feature")), _emptySet);
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(0, resolved.size());
  }
  
  @Test
  public void someInvalidFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "some", "guard", "cond")), _emptySet);
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(resolved.toString(), 2, resolved.size());
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "name"));
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "guard"));
  }
  
  @Test
  public void validFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = this.getInjector();
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(event, _injector, false, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("name", "guard")), _emptySet);
    final Set<EStructuralFeature> resolved = preparer.resolveEditableFeatures(event);
    Assert.assertEquals(resolved.toString(), 2, resolved.size());
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "name"));
    Assert.assertNotNull(this.<EStructuralFeature>findFirstByName(resolved, "guard"));
  }
}
