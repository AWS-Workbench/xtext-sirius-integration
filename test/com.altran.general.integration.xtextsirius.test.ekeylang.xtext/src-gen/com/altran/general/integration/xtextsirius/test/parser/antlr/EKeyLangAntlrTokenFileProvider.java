/*
 * generated by Xtext 2.17.0
 */
package com.altran.general.integration.xtextsirius.test.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EKeyLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/altran/general/integration/xtextsirius/test/parser/antlr/internal/InternalEKeyLang.tokens");
	}
}
