package com.altran.general.integration.xtextsirius.runtime.editor;

import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusValueDescriptor;
import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil;

public class XtextSiriusValueEditor extends AXtextSiriusEditor<IXtextSiriusValueEditorCallback> {
	public XtextSiriusValueEditor(final IXtextSiriusValueDescriptor descriptor) {
		super(descriptor);
	}

	@Override
	public void doSetValue(final @Nullable Object value) {
		if (value instanceof String) {
			final StringBuffer text = new StringBuffer((String) value);
			final int length = text.length();
			StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 0, length, isMultiLine());

			final String prefixText = interpret(getDescriptor().getPrefixTextExpression());
			final String suffixText = interpret(getDescriptor().getSuffixTextExpression());
			final String editablePart = StyledTextUtil.getInstance().guessNewline(text.toString()) + text;
			
			final int offset = prefixText.length() + 1;
			final String completeText = prefixText + editablePart + suffixText;
			updateCallbackSetValue(completeText, offset, length);
		}
	}

	@Override
	public @Nullable Object getValueToCommit() {
		return getCallback().getValue();
	}

	@Override
	public IXtextSiriusValueDescriptor getDescriptor() {
		return (IXtextSiriusValueDescriptor) super.getDescriptor();
	}
}
