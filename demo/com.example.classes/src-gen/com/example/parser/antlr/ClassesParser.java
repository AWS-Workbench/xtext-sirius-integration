/*
 * generated by Xtext 2.18.0.M3
 */
package com.example.parser.antlr;

import com.example.parser.antlr.internal.InternalClassesParser;
import com.example.services.ClassesGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ClassesParser extends AbstractAntlrParser {

	@Inject
	private ClassesGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalClassesParser createParser(XtextTokenStream stream) {
		return new InternalClassesParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ClassModel";
	}

	public ClassesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ClassesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
