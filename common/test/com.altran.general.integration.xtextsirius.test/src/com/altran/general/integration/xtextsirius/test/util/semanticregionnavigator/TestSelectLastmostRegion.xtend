package com.altran.general.integration.xtextsirius.test.util.semanticregionnavigator

import com.altran.general.integration.xtextsirius.test.util.ARegion
import com.altran.general.integration.xtextsirius.util.SemanticRegionNavigator
import java.util.Collections
import java.util.NoSuchElementException
import java.util.Random
import org.junit.Test

import static org.junit.Assert.*

class TestSelectLastmostRegion extends ARegion {
	@Test(expected=NoSuchElementException)
	def void emptyRegionList() {
		SemanticRegionNavigator.instance.selectLastmostRegion(emptySet)
	}

	@Test
	def singleEntry() {
		val model = defaultModel

		val event = model.events.head

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val semanticRegion = eventRegion.semanticRegions.head

		val lastmost = SemanticRegionNavigator.instance.selectLastmostRegion(#[semanticRegion].toSet)

		assertSame(semanticRegion, lastmost)
	}

	@Test
	def manyEntries() {
		val model = defaultModel

		val event = model.events.head

		val rootRegion = getRootRegion(event)
		val eventRegion = rootRegion.regionForEObject(event)
		val lastRegion = eventRegion.semanticRegions.last

		val regions = eventRegion.semanticRegions.toList
		Collections.shuffle(regions, new Random(31337))

		val lastmost = SemanticRegionNavigator.instance.selectLastmostRegion(regions.toSet)

		assertSame(lastRegion, lastmost)
	}

}
