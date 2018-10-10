/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil

import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil
import com.altran.general.integration.xtextsirius.test.InlineFowlerdslEnvironment
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.junit.Test

import static org.junit.Assert.*

class TestUpdateFakeResourceUri extends ATestFakeResourceUtil {
	@Test
	def update() {
		val model = defaultModel
		val fakeModel = createFakeModel(model)

		val orgUri = model.eResource.getURI
		val fakeUri = fakeModel.eResource.getURI

		FakeResourceUtil.instance.updateFakeResourceUri(fakeModel.eResource, orgUri);

		val newUri = fakeModel.eResource.getURI
		val unsynthNewUri = accessibleFakeResourceUtil.removeSynthetic(newUri)

		assertNotEquals(orgUri, fakeUri)
		assertNotEquals(orgUri, newUri)
		assertNotEquals(fakeUri, newUri)
		assertEquals(orgUri, unsynthNewUri)
	}

	@Test
	def differentFileExtension() {
		val model = defaultModel
		
		val inlineInjector = InlineFowlerdslEnvironment.instance.injector
		val fakeResourceSet =  createResourceSet(inlineInjector)
		val fakeResource = fakeResourceSet.createResource(URI.createPlatformResourceURI("/proj/fakeModel.statemachineInlineedit", false))
		val fakeModel = parseAndLink(NodeModelUtils.getNode(model).getText(), fakeResource, inlineInjector);
		
		val orgUri = model.eResource.getURI
		val fakeUri = fakeModel.eResource.getURI

		FakeResourceUtil.instance.updateFakeResourceUri(fakeModel.eResource, orgUri);

		val newUri = fakeModel.eResource.getURI
		val unsynthNewUri = accessibleFakeResourceUtil.removeSynthetic(newUri)

		assertNotEquals(orgUri, fakeUri)
		assertNotEquals(orgUri, newUri)
		assertNotEquals(fakeUri, newUri)
		assertEquals(orgUri.trimFileExtension, unsynthNewUri.trimFileExtension)
		assertNotEquals(orgUri.fileExtension, unsynthNewUri.fileExtension)
		assertEquals("statemachineInlineedit", newUri.fileExtension)
		assertEquals("statemachineInlineedit", unsynthNewUri.fileExtension)
	}

}
