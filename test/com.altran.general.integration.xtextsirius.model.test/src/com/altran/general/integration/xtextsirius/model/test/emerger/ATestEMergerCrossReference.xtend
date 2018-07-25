package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
import org.junit.Test

import static org.junit.Assert.*

abstract class ATestEMergerCrossReference<T extends IElement<T>> extends ATestEMergerEReference<T> {
	@Test
	def void singleNull_singleNew() {
		val edited = createRootElement => [
			changeableRef = null
		]
		
		val existing = createRootElement => [
			changeableRef = null
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNull(result.changeableRef)
	}
	
	@Test
	def void singleNull_singleExisting() {
		val edited = createRootElement => [
			changeableRef = null
		]
		
		val existing = createRootElement => [
			changeableRef = newExisting(1, "")
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNull(result.changeableRef)
	}
	
	@Test
	def void singleNonNull_singleNew() {
		val edited = createRootElement => [
			changeableRef = newEdited(1, "answer")
		]
		
		val existing = createRootElement => [
			changeableRef = null
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertNotNull(result.changeableRef)
		assertEquals("aanswer", result.changeableRef.changeableAttr)
	}
	
	@Test
	def void singleNonNull_singleExisting() {
		val edited = createRootElement => [
			changeableRef = newEdited(1, "answer")
		]
		
		val existing = createRootElement => [
			changeableRef = newExisting(1, "question")
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals("aanswer", result.changeableRef.changeableAttr)
	}
	
	@Test
	def void bag_bagNew() {
		val edited = createRootElement => [
			changeableBagRef += #[newEdited(3, "3.14"), newEdited(2, "2.71")]
		]
		
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(31, "31.337"), newExisting(1, "1.337")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
	}
	
	@Test
	def void bag_bagExisting() {
		val edited = createRootElement => [
			changeableBagRef += #[newEdited(3, "3.14"), newEdited(2, "2.71")]
		]
		
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
	}
	
	@Test
	def void set_setNew() {
		val edited = createRootElement => [
			changeableSetRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("a3"))
		assertTrue(result.changeableSetRef.valueExists("a2"))
	}
	
	@Test
	def void set_setExisting() {
		val edited = createRootElement => [
			changeableSetRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("a3"))
		assertTrue(result.changeableSetRef.valueExists("a2"))
	}
	
	@Test
	def void list_listNew() {
		val edited = createRootElement => [
			changeableListRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableListRef.size)
		assertTrue("a3" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("a2" == result.changeableListRef.get(1).changeableAttr)
	}
	
	@Test
	def void list_listExisting() {
		val edited = createRootElement => [
			changeableListRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createRootElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, edited).merge(edited)
		assertEquals(2, result.changeableListRef.size)
		assertTrue("a3" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("a2" == result.changeableListRef.get(1).changeableAttr)
	}

	@Test
	def void singleNull_bagNew() {
		val existing = createRootElement => [
			changeableBagRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(null, AElement_ChangeableBagRef)
		assertTrue(result.changeableBagRef.isEmpty)
	}
	
	@Test
	def void singleNull_bagExisting() {
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(null, AElement_ChangeableBagRef)
		assertEquals(5, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("q1.337"))
		assertTrue(result.changeableBagRef.valueExists("q2.71"))
		assertTrue(result.changeableBagRef.valueExists("q31.337"))
	}
	
	@Test
	def void singleNull_setNew() {
		val existing = createRootElement => [
			changeableSetRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(null, AElement_ChangeableSetRef)
		assertTrue(result.changeableSetRef.isEmpty)
	}
	
	@Test
	def void singleNull_setExisting() {
		val existing = createRootElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(null, AElement_ChangeableSetRef)
		assertEquals(3, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("q1"))
		assertTrue(result.changeableSetRef.valueExists("q2"))
		assertTrue(result.changeableSetRef.valueExists("q31"))
	}
	
	@Test
	def void singleNull_listNew() {
		val existing = createRootElement => [
			changeableListRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(null, AElement_ChangeableListRef)
		assertTrue(result.changeableListRef.isEmpty)
	}
	
	@Test
	def void singleNull_listExisting() {
		val existing = createRootElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(null, AElement_ChangeableListRef)
		assertEquals(5, result.changeableListRef.size)
		assertTrue("q1" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("q2" == result.changeableListRef.get(1).changeableAttr)
		assertTrue("q31" == result.changeableListRef.get(2).changeableAttr)
		assertTrue("q1" == result.changeableListRef.get(3).changeableAttr)
		assertTrue("q2" == result.changeableListRef.get(4).changeableAttr)
	}

	@Test
	def void singleNonNull_bagNew() {
		val existing = createRootElement => [
			changeableBagRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(3.14, AElement_ChangeableBagRef)
		assertEquals(1, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
	}
	
	@Test
	def void singleNonNull_bagExisting() {
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(newEdited(3, "3.14"), AElement_ChangeableBagRef)
		assertEquals(6, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("q1.337"))
		assertTrue(result.changeableBagRef.valueExists("q2.71"))
		assertTrue(result.changeableBagRef.valueExists("q31.337"))
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
	}
	
	@Test
	def void singleNonNull_setNew() {
		val existing = createRootElement => [
			changeableSetRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(newEdited(3, "3"), AElement_ChangeableSetRef)
		assertEquals(1, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("a3"))
	}
	
	@Test
	def void singleNonNull_setExisting() {
		val existing = createRootElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(newEdited(3, "3"), AElement_ChangeableSetRef)
		assertEquals(4, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("q1"))
		assertTrue(result.changeableSetRef.valueExists("q2"))
		assertTrue(result.changeableSetRef.valueExists("q31"))
		assertTrue(result.changeableSetRef.valueExists("a3"))
	}
	
	@Test
	def void singleNonNull_listNew() {
		val existing = createRootElement => [
			changeableListRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(newEdited(3, "3"), AElement_ChangeableListRef)
		assertEquals(1, result.changeableListRef.size)
		assertTrue("a3" == result.changeableListRef.get(0).changeableAttr)
	}
	
	@Test
	def void singleNonNull_listExisting() {
		val existing = createRootElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(newEdited(3, "3"), AElement_ChangeableListRef)
		assertEquals(6, result.changeableListRef.size)
		assertTrue("q1" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("q2" == result.changeableListRef.get(1).changeableAttr)
		assertTrue("q31" == result.changeableListRef.get(2).changeableAttr)
		assertTrue("q1" == result.changeableListRef.get(3).changeableAttr)
		assertTrue("q2" == result.changeableListRef.get(4).changeableAttr)
		assertTrue("a3" == result.changeableListRef.get(5).changeableAttr)
	}

	@Test
	def void set_bagNew() {
		val existing = createRootElement => [
			changeableBagRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(#{newEdited(3, "3.14"), newEdited(2, "2.71")}, AElement_ChangeableBagRef)
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
	}
	
	@Test
	def void set_bagExisting() {
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(#{newEdited(3, "3.14"), newEdited(2, "2.71")}, AElement_ChangeableBagRef)
		assertEquals(6, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("q1.337"))
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
		assertTrue(result.changeableBagRef.valueExists("q31.337"))
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
	}
	
	@Test
	def void set_listNew() {
		val existing = createRootElement => [
			changeableListRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(#{newEdited(3, "3"), newEdited(2, "2")}, AElement_ChangeableListRef)
		assertEquals(2, result.changeableListRef.size)
		assertTrue(result.changeableListRef.valueExists("a3"))
		assertTrue(result.changeableListRef.valueExists("a2"))
	}
	
	@Test
	def void set_listExisting() {
		val existing = createRootElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableListRef).merge(#{newEdited(3, "3"), newEdited(2, "2")}, AElement_ChangeableListRef)
		assertEquals(6, result.changeableListRef.size)
		assertTrue("q1" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("q2" == result.changeableListRef.get(1).changeableAttr)
		assertTrue("q31" == result.changeableListRef.get(2).changeableAttr)
		assertTrue("q1" == result.changeableListRef.get(3).changeableAttr)
		assertTrue("a2" == result.changeableListRef.get(4).changeableAttr)
		assertTrue("a3" == result.changeableListRef.get(5).changeableAttr)
	}

	@Test
	def void list_bagNew() {
		val existing = createRootElement => [
			changeableBagRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(#[newEdited(3, "3.14"), newEdited(2, "2.71")], AElement_ChangeableBagRef)
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
	}
	
	@Test
	def void list_bagExisting() {
		val existing = createRootElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableBagRef).merge(#[newEdited(3, "3.14"), newEdited(2, "2.71")], AElement_ChangeableBagRef)
		assertEquals(6, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.valueExists("q1.337"))
		assertTrue(result.changeableBagRef.valueExists("a2.71"))
		assertTrue(result.changeableBagRef.valueExists("q31.337"))
		assertTrue(result.changeableBagRef.valueExists("a3.14"))
	}
	
	@Test
	def void list_setNew() {
		val existing = createRootElement => [
			changeableSetRef += #[]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(#[newEdited(3, "3"), newEdited(2, "2")], AElement_ChangeableSetRef)
		assertEquals(2, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("a3"))
		assertTrue(result.changeableSetRef.valueExists("a2"))
	}
	
	@Test
	def void list_setExisting() {
		val existing = createRootElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = createEMerger(existing, AElement_ChangeableSetRef).merge(#[newEdited(3, "3"), newEdited(2, "2")], AElement_ChangeableSetRef)
		assertEquals(4, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.valueExists("q1"))
		assertTrue(result.changeableSetRef.valueExists("a2"))
		assertTrue(result.changeableSetRef.valueExists("q31"))
		assertTrue(result.changeableSetRef.valueExists("a3"))
	}
}
