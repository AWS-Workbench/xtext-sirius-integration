package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil

import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject

abstract class ATestFakeResourceUtil extends AFowlerdslDefaultModelTest {
	protected static class AccessibleFakeResourceUtil extends FakeResourceUtil {
		override public insertSynthetic(URI uri) {
			super.insertSynthetic(uri)
		}

		override public removeSynthetic(URI uri) {
			super.removeSynthetic(uri)
		}

		override public equalsDisregardingSyntheticAndFileExtension(URI a, URI b) {
			super.equalsDisregardingSyntheticAndFileExtension(a, b)
		}

		override public collectAllReferencedObjectsDeep(EObject base) {
			super.collectAllReferencedObjectsDeep(base)
		}

		override public collectAllReferencedObjects(EObject base) {
			super.collectAllReferencedObjects(base)
		}
	}

	def protected getAccessibleFakeResourceUtil() {
		new AccessibleFakeResourceUtil()
	}

	def protected <T> front(List<T> list) {
		if (list.size < 2) {
			return emptyList
		}

		list.subList(0, list.size - 2)
	}
}
