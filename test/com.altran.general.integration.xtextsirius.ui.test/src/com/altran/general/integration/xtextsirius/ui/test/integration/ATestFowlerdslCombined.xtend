package com.altran.general.integration.xtextsirius.ui.test.integration

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor
import com.google.inject.Injector
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.espilce.commons.lang.StringUtils2
import org.junit.Test

import static org.espilce.commons.emf.testsupport.AssertEmf.*
import static org.junit.Assert.*

abstract class ATestFowlerdslCombined extends ATestFowlerdsl {
	
//	protected override modelText() {
//		StringUtils2::normalizeNewline(
//		'''
//			events
//			 eventSD 2 [ c2 .. c1 ]
//			 event2 3 [ 2 ]
//			 event4 3 [ c1 ]
//			 event3 4 
//			end
//			
//			commands
//			 cmd0 0
//			 cmd1 1 [2]
//			 cmd2 2
//			end
//			
//			constants
//			 c1 23
//			 c2 4
//			end
//			
//			state A 
//				description "<p>This is a deschkriptschion</p>\n"
//				event2 => A
//				event2 => B
//			end
//			
//			state B
//			
//			end
//		''')
//	}
	
	protected override modelText() {
		StringUtils2::normalizeNewline(
		'''
			events
			 eventSD 2 [ c2 .. c1 ]
			 event2 3 [ 2 ]
			 event4 3 [ c1 ]
			 event3 4 
			end
			
			commands
			 cmd0 23
			 cmd1 42
			end
			
			constants
			 c1 23
			 c2 42
			end
			
			state A 
				description "<p>This is a deschkriptschion</p>\n"
				event2 => A
				event2 => B
			end
			
			state B
			
			end
		''')
	}
	protected def String getFeatureName()
	
//	@Test
//	def void asdf() {
//		assertEdit(
//			model.events.last,
//			"",
//			"event3 4",
//			"event3 5",
//			createEvent => [
//				name = "event3"
//				code = 5
//			]
//		)
//	} 
	
	protected static class TestXtextSiriusModelEditor extends XtextSiriusModelEditor {
		
		new(IXtextSiriusModelDescriptor descriptor) {
			super(descriptor)
		}
		
		override setSemanticElement(EObject element) {
			if (callback !== null) {
				(callback as TestXtextSiriusEditorCallbackAdapter).testSemanticElement = element
			}
			super.semanticElement = element
		}
	}
	
	protected static class AssertingXtextSiriusEditorCallback extends TestXtextSiriusEditorCallbackAdapter {
		val String message
		val String expectedText
		
		new(Injector injector, EObject model, String message, String expectedText) {
			super(injector, model)
			this.message = message
			this.expectedText = expectedText
		}
		
		override callbackSetValue(Object value, int offset, int length) {
			assertTrue("value is not string", value instanceof String)
			val text = (value as String).substring(offset, offset + length)
			assertEquals('''�message� doesn't match''', expectedText, text)
			super.callbackSetValue(value, offset, length)
		}
	}
	
	protected def void assertEdit(EObject elementToEdit, String expectedText, String newText, Object expectedResultElement) {
		assertEdit(elementToEdit, elementToEdit, getFeatureName(), expectedText, newText, expectedResultElement)
	}
	
	protected def void assertEdit(Object elementToEdit, EObject fallbackContainer, String expectedText, String newText, Object expectedResultElement) {
		assertEdit(elementToEdit, fallbackContainer, getFeatureName(), expectedText, newText, expectedResultElement)
	}
	
	protected def void assertEdit(Object elementToEdit, EObject fallbackContainer, String valueFeatureName, String expectedText, String newText, Object expectedResultElement) {
		val descriptor = eventDescriptor()
		val editor = new TestXtextSiriusModelEditor(descriptor)
		
		editor.callback = new AssertingXtextSiriusEditorCallback(injector, model, "expectedText", expectedText)
		editor.valueFeatureName = valueFeatureName
		
		val EObject commitTarget = if (elementToEdit instanceof EObject) elementToEdit else fallbackContainer
		editor.semanticElement = commitTarget
//		if (elementToEdit instanceof EObject) {
//			editor.semanticElement = elementToEdit
//		}
		editor.fallbackContainer = fallbackContainer
		editor.setValue(null)
		
		if (newText !== null) {
			editor.callback = new AssertingXtextSiriusEditorCallback(injector, model, "newText", newText)
		} else {
			editor.callback = new AssertingXtextSiriusEditorCallback(injector, model, "newText", expectedText)
		}
		
		// set to new callback
		editor.semanticElement = commitTarget
//		if (elementToEdit instanceof EObject) {
//			editor.semanticElement = elementToEdit
//		}
		
		editor.setValue(newText)
		
		val result = editor.commit(commitTarget)
		if (expectedResultElement instanceof EObject) {
			assertModelEquals(expectedResultElement, result as EObject)
		} else if (expectedResultElement instanceof List) {
			assertModelEquals(expectedResultElement, result as List<EObject>)
		}
	}

	protected def eventDescriptor() {
		new XtextSiriusModelDescriptor(inlineInjector, createXtextDirectEditModelDescription => [
		])
	}
}