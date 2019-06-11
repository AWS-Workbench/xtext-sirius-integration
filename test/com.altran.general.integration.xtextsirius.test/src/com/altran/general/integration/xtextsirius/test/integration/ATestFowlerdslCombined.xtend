package com.altran.general.integration.xtextsirius.test.integration

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor
import com.google.inject.Injector
import java.util.List
import org.apache.commons.lang.StringUtils
import org.eclipse.emf.ecore.EObject
import org.espilce.commons.lang.StringUtils2

import static org.espilce.commons.emf.testsupport.AssertEmf.*
import static org.junit.Assert.*

abstract class ATestFowlerdslCombined extends ATestFowlerdsl {
	
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
	
	protected static class TestXtextSiriusModelEditor extends XtextSiriusModelEditor {
		
		new(IXtextSiriusModelDescriptor descriptor) {
			super(descriptor)
		}
		
		override setModelEntryPoint(ModelEntryPoint modelEntryPoint) {
			if (callback !== null) {
				(callback as TestXtextSiriusEditorCallbackAdapter).testSemanticElement = modelEntryPoint.semanticElement
			}

			super.modelEntryPoint = modelEntryPoint
		}
	}
	
	protected static class AssertingXtextSiriusEditorCallback extends TestXtextSiriusEditorCallbackAdapter {
		val String newText
		val String expectedText
		
		String initialValue
		int offset
		int length
		
		new(Injector injector, EObject model, String newText, String expectedText) {
			super(injector, model)
			this.newText = newText
			this.expectedText = expectedText
		}
		
		override callbackInitText(String initialValue, int offset, int length) {
			val text = (initialValue as String).substring(offset, offset + length)
			this.initialValue = initialValue
			this.offset = offset;
			this.length = length;
			assertEquals('''doesn't match''', expectedText, text)
			super.callbackInitText(initialValue, offset, length)
		}
		
		override getXtextParseResult() {
			val overlay = StringUtils.overlay(initialValue, newText, offset, offset + length)
			updateEditedText(overlay)
			super.xtextParseResult
		}
		
		override callbackGetText() {
			this.newText
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
		
		var callback = new AssertingXtextSiriusEditorCallback(injector, model, newText, expectedText)
		editor.callback = callback
		
		val EObject commitTarget = if (elementToEdit instanceof EObject) elementToEdit else fallbackContainer
		editor.modelEntryPoint = new ModelEntryPoint(commitTarget, fallbackContainer, valueFeatureName)
		editor.initValue(null)
		
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
