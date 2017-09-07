package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import com.google.common.base.Predicate
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion
import org.eclipse.xtext.formatting2.regionaccess.internal.AbstractSemanticRegionsFinder
import org.junit.Test

import static org.junit.Assert.*

@SuppressWarnings("accessRestriction")
class TestCanBeHandledByGetRegionForFeature extends AModelRegionEditorPreparer {
	protected static class TestSemanticRegionsFinder extends AbstractSemanticRegionsFinder {
		
		override protected findAll(Predicate<ISemanticRegion> predicate) {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
		override protected findFirst(Predicate<ISemanticRegion> predicate) {
			throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
		override public assertNoContainment(EStructuralFeature feat) {
			super.assertNoContainment(feat)
		}
		
	}
	
	@Test
	def eAttribute() {
		val feature = statemachinePackage.event_Code
		
		// this would throw an exception if we had a different implementation in our code
		new TestSemanticRegionsFinder().assertNoContainment(feature)
		assertTrue(fakePreparer.canBeHandledByGetRegionForFeature(feature))
	}

	@Test
	def eReferenceNoContainment() {
		val feature = statemachinePackage.constantRef_Constant
		
		// this would throw an exception if we had a different implementation in our code
		new TestSemanticRegionsFinder().assertNoContainment(feature)
		assertTrue(fakePreparer.canBeHandledByGetRegionForFeature(feature))
	}

	@Test(expected = IllegalStateException)
	def eReferenceContainment() {
		val feature = statemachinePackage.event_Guard
		
		assertFalse(fakePreparer.canBeHandledByGetRegionForFeature(feature))
		// this would throw an exception if we had a different implementation in our code
		new TestSemanticRegionsFinder().assertNoContainment(feature)
	}
}
