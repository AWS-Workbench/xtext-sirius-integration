/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import java.util.ArrayList;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusModelEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;
import com.altran.general.integration.xtextsirius.runtime.editor.decider.BlankNoOpNullDeletionEditingDecider;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelEditpartDescriptor;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;
import com.google.common.collect.Lists;

public class XtextSiriusStyledTextCellEditorModel extends AXtextSiriusStyledTextCellEditor
implements IXtextSiriusModelEditorCallback {

	public XtextSiriusStyledTextCellEditorModel(final @NonNull XtextSiriusModelEditpartDescriptor descriptor) {
		super(descriptor, new XtextSiriusModelEditor(descriptor));
		
		getEditor().setEditingDecider(new BlankNoOpNullDeletionEditingDecider());
	}

	@Override
	protected void focusLost() {
		super.focusLost();
		getEditor().removeAllIgnoredFeatureAdapters();
	}

	public void updateSelectedRegion() {
		final TextRegion selectedRegion = getEditor().getSelectedRegion();
		if (selectedRegion != null) {
			getXtextAdapter().getXtextSourceViewer().setSelectedRange(selectedRegion.getOffset(),
					selectedRegion.getLength());
		}
	}

	@Override
	public IParseResult getXtextParseResult() {
		return getXtextAdapter().getXtextParseResult();
	}
	
	@Override
	public XtextSiriusSyntaxErrorException handleSyntaxErrors(final IParseResult parseResult) {
		final IRegion visibleRegionJFace = getXtextAdapter().getVisibleRegion();
		final TextRegion visibleRegion = new TextRegion(visibleRegionJFace.getOffset(), visibleRegionJFace.getLength());
		final ArrayList<INode> syntaxErrors = Lists.newArrayList(parseResult.getSyntaxErrors());
		return new XtextSiriusSyntaxErrorException((String) callbackGetText(), visibleRegion,
				syntaxErrors);
	}

	@Override
	public XtextSiriusErrorException handleUnresolvableProxies() {
		return new XtextSiriusErrorException("Entered text contains unresolvable references", (String) callbackGetText());
	}
	
	@Override
	public @NonNull XtextSiriusModelEditpartDescriptor getDescriptor() {
		return (@NonNull XtextSiriusModelEditpartDescriptor) super.getDescriptor();
	}

	@Override
	protected XtextSiriusModelEditor getEditor() {
		return (XtextSiriusModelEditor) super.getEditor();
	}
}
