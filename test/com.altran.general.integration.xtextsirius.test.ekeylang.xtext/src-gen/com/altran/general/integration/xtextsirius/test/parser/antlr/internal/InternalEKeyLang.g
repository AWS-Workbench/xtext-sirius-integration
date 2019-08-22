/*
 * generated by Xtext 2.18.0.M3
 */
grammar InternalEKeyLang;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.altran.general.integration.xtextsirius.test.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.altran.general.integration.xtextsirius.test.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.altran.general.integration.xtextsirius.test.services.EKeyLangGrammarAccess;

}

@parser::members {

 	private EKeyLangGrammarAccess grammarAccess;

    public InternalEKeyLangParser(TokenStream input, EKeyLangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Container";
   	}

   	@Override
   	protected EKeyLangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleContainer
entryRuleContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainerRule()); }
	iv_ruleContainer=ruleContainer
	{ $current=$iv_ruleContainer.current; }
	EOF;

// Rule Container
ruleContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getContainerAccess().getContainerAction_0(),
					$current);
			}
		)
		otherlv_1='Container'
		{
			newLeafNode(otherlv_1, grammarAccess.getContainerAccess().getContainerKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getContainerAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContainerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getContainerAccess().getContentsIContainerContentParserRuleCall_3_0());
				}
				lv_contents_3_0=ruleIContainerContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContainerRule());
					}
					add(
						$current,
						"contents",
						lv_contents_3_0,
						"com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleIContainerContent
entryRuleIContainerContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIContainerContentRule()); }
	iv_ruleIContainerContent=ruleIContainerContent
	{ $current=$iv_ruleIContainerContent.current; }
	EOF;

// Rule IContainerContent
ruleIContainerContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getIContainerContentAccess().getGroupParserRuleCall_0());
		}
		this_Group_0=ruleGroup
		{
			$current = $this_Group_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getIContainerContentAccess().getLeafParserRuleCall_1());
		}
		this_Leaf_1=ruleLeaf
		{
			$current = $this_Leaf_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGroup
entryRuleGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGroupRule()); }
	iv_ruleGroup=ruleGroup
	{ $current=$iv_ruleGroup.current; }
	EOF;

// Rule Group
ruleGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getGroupAccess().getGroupAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGroupRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGroupAccess().getLeafsIContainerContentParserRuleCall_3_0());
				}
				lv_leafs_3_0=ruleIContainerContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGroupRule());
					}
					add(
						$current,
						"leafs",
						lv_leafs_3_0,
						"com.altran.general.integration.xtextsirius.test.EKeyLang.IContainerContent");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleLeaf
entryRuleLeaf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLeafRule()); }
	iv_ruleLeaf=ruleLeaf
	{ $current=$iv_ruleLeaf.current; }
	EOF;

// Rule Leaf
ruleLeaf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getLeafAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLeafRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_number_1_0=RULE_INT
				{
					newLeafNode(lv_number_1_0, grammarAccess.getLeafAccess().getNumberINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLeafRule());
					}
					setWithLastConsumed(
						$current,
						"number",
						lv_number_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
