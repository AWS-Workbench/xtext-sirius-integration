package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import org.junit.After
import org.junit.Test

import static org.junit.Assert.*

class TestEMergerContainmentEditableFeatures extends TestEMergerContainment {
	val EditableFeaturesExtension editableFeaturesExtension = new EditableFeaturesExtension(this)

	@After
	def checkUntouchedFeatures() {
		editableFeaturesExtension.checkUntouchedFeatures
	}
	
	override protected createEMerger(Element existing, Element edited) {
		editableFeaturesExtension.createEMerger(existing, edited)
	}
	
	@Test
	override singleNull_singleNew() {
		val edited = createElement => [
			changeableCont = null
		]
		
		val existing = createElement => [
			changeableCont = null
		]
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, #{"changeableCont"}).merge()
		assertNull(result.changeableCont)
	}
	
	@Test
	override singleNull_singleExisting() {
		val edited = createElement => [
			changeableCont = null
		]
		
		val existing = createElement => [
			changeableCont = newExisting(1, "")
		]
		
		val result = editableFeaturesExtension.createEMerger(existing, edited, #{"changeableCont"}).merge()
		assertNull(result.changeableCont)
	}
}
