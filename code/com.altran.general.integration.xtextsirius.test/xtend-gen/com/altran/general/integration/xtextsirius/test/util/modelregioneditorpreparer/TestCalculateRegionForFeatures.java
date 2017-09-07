package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.AFowlerdslTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCalculateRegionForFeatures extends AModelRegionEditorPreparer {
  @Test(expected = NoSuchElementException.class)
  public void emptyFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = AFowlerdslTest.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = new AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer(event, _injector, false, _emptyList);
    preparer.setDefinedFeatures(CollectionLiterals.<EStructuralFeature>emptySet());
    preparer.calculateRegionForFeatures(event);
  }
  
  @Test
  public void oneDefinedFeature() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = AFowlerdslTest.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = new AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer(event, _injector, false, _emptyList);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    preparer.setRootRegion(rootRegion);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    preparer.setSemanticRegion(eventRegion);
    EAttribute _event_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name();
    preparer.setDefinedFeatures(IterableExtensions.<EStructuralFeature>toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(((EStructuralFeature) _event_Name)))));
    final TextRegion region = preparer.calculateRegionForFeatures(event);
    Assert.assertEquals(26, region.getOffset());
    Assert.assertEquals(6, region.getLength());
    Assert.assertEquals("event1", this.resolveRegion(rootRegion, region));
  }
  
  @Test
  public void oneDefinedFeatureLong() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(2);
    Injector _injector = AFowlerdslTest.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = new AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer(event, _injector, false, _emptyList);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    preparer.setRootRegion(rootRegion);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    preparer.setSemanticRegion(eventRegion);
    EAttribute _event_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name();
    preparer.setDefinedFeatures(IterableExtensions.<EStructuralFeature>toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(((EStructuralFeature) _event_Name)))));
    final TextRegion region = preparer.calculateRegionForFeatures(event);
    Assert.assertEquals(58, region.getOffset());
    Assert.assertEquals(6, region.getLength());
    Assert.assertEquals("event3", this.resolveRegion(rootRegion, region));
  }
  
  @Test
  public void someDefinedFeatures() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(2);
    Injector _injector = AFowlerdslTest.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = new AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer(event, _injector, false, _emptyList);
    final ITextRegionAccess rootRegion = this.getRootRegion(event);
    preparer.setRootRegion(rootRegion);
    final IEObjectRegion eventRegion = rootRegion.regionForEObject(event);
    preparer.setSemanticRegion(eventRegion);
    EAttribute _event_Name = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Name();
    EReference _event_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard();
    Set<? extends EStructuralFeature> _set = IterableExtensions.toSet(Collections.<EStructuralFeature>unmodifiableList(CollectionLiterals.<EStructuralFeature>newArrayList(_event_Name, _event_Guard)));
    preparer.setDefinedFeatures(((Set<EStructuralFeature>) _set));
    final TextRegion region = preparer.calculateRegionForFeatures(event);
    Assert.assertEquals(58, region.getOffset());
    Assert.assertEquals(30, region.getLength());
    final String text = this.resolveRegion(rootRegion, region);
    Assert.assertEquals("event3\r\nccc\t \t[\r\nconstant1\t\t\t]", text);
  }
}
