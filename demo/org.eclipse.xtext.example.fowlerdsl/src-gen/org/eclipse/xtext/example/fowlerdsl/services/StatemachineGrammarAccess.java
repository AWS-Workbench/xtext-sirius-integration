/*
 * generated by Xtext
 */
package org.eclipse.xtext.example.fowlerdsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class StatemachineGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class StatemachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.Statemachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStatemachineAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEventsKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEventsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEventsEventParserRuleCall_1_1_0 = (RuleCall)cEventsAssignment_1_1.eContents().get(0);
		private final Keyword cEndKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cResetEventsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cResetEventsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cResetEventsEventCrossReference_2_1_0 = (CrossReference)cResetEventsAssignment_2_1.eContents().get(0);
		private final RuleCall cResetEventsEventIDTerminalRuleCall_2_1_0_1 = (RuleCall)cResetEventsEventCrossReference_2_1_0.eContents().get(1);
		private final Keyword cEndKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommandsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cCommandsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cCommandsCommandParserRuleCall_3_1_0 = (RuleCall)cCommandsAssignment_3_1.eContents().get(0);
		private final Keyword cEndKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cConstantsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cConnstantsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cConnstantsConstantParserRuleCall_4_1_0 = (RuleCall)cConnstantsAssignment_4_1.eContents().get(0);
		private final Keyword cEndKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Assignment cStatesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cStatesStateParserRuleCall_5_0 = (RuleCall)cStatesAssignment_5.eContents().get(0);
		
		//Statemachine:
		//	{Statemachine} ('events' events+=Event+ 'end')? ('resetEvents' resetEvents+=[Event]+ 'end')? ('commands'
		//	commands+=Command+ 'end')? ('constants' connstants+=Constant+ 'end')? states+=State*;
		@Override public ParserRule getRule() { return rule; }

		//{Statemachine} ('events' events+=Event+ 'end')? ('resetEvents' resetEvents+=[Event]+ 'end')? ('commands'
		//commands+=Command+ 'end')? ('constants' connstants+=Constant+ 'end')? states+=State*
		public Group getGroup() { return cGroup; }

		//{Statemachine}
		public Action getStatemachineAction_0() { return cStatemachineAction_0; }

		//('events' events+=Event+ 'end')?
		public Group getGroup_1() { return cGroup_1; }

		//'events'
		public Keyword getEventsKeyword_1_0() { return cEventsKeyword_1_0; }

		//events+=Event+
		public Assignment getEventsAssignment_1_1() { return cEventsAssignment_1_1; }

		//Event
		public RuleCall getEventsEventParserRuleCall_1_1_0() { return cEventsEventParserRuleCall_1_1_0; }

		//'end'
		public Keyword getEndKeyword_1_2() { return cEndKeyword_1_2; }

		//('resetEvents' resetEvents+=[Event]+ 'end')?
		public Group getGroup_2() { return cGroup_2; }

		//'resetEvents'
		public Keyword getResetEventsKeyword_2_0() { return cResetEventsKeyword_2_0; }

		//resetEvents+=[Event]+
		public Assignment getResetEventsAssignment_2_1() { return cResetEventsAssignment_2_1; }

		//[Event]
		public CrossReference getResetEventsEventCrossReference_2_1_0() { return cResetEventsEventCrossReference_2_1_0; }

		//ID
		public RuleCall getResetEventsEventIDTerminalRuleCall_2_1_0_1() { return cResetEventsEventIDTerminalRuleCall_2_1_0_1; }

		//'end'
		public Keyword getEndKeyword_2_2() { return cEndKeyword_2_2; }

		//('commands' commands+=Command+ 'end')?
		public Group getGroup_3() { return cGroup_3; }

		//'commands'
		public Keyword getCommandsKeyword_3_0() { return cCommandsKeyword_3_0; }

		//commands+=Command+
		public Assignment getCommandsAssignment_3_1() { return cCommandsAssignment_3_1; }

		//Command
		public RuleCall getCommandsCommandParserRuleCall_3_1_0() { return cCommandsCommandParserRuleCall_3_1_0; }

		//'end'
		public Keyword getEndKeyword_3_2() { return cEndKeyword_3_2; }

		//('constants' connstants+=Constant+ 'end')?
		public Group getGroup_4() { return cGroup_4; }

		//'constants'
		public Keyword getConstantsKeyword_4_0() { return cConstantsKeyword_4_0; }

		//connstants+=Constant+
		public Assignment getConnstantsAssignment_4_1() { return cConnstantsAssignment_4_1; }

		//Constant
		public RuleCall getConnstantsConstantParserRuleCall_4_1_0() { return cConnstantsConstantParserRuleCall_4_1_0; }

		//'end'
		public Keyword getEndKeyword_4_2() { return cEndKeyword_4_2; }

		//states+=State*
		public Assignment getStatesAssignment_5() { return cStatesAssignment_5; }

		//State
		public RuleCall getStatesStateParserRuleCall_5_0() { return cStatesStateParserRuleCall_5_0; }
	}

	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cCodeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCodeIDTerminalRuleCall_1_0 = (RuleCall)cCodeAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cGuardAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cGuardGuardParserRuleCall_2_1_0 = (RuleCall)cGuardAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		//Event:
		//	name=ID code=ID ('[' guard=Guard ']')?;
		@Override public ParserRule getRule() { return rule; }

		//name=ID code=ID ('[' guard=Guard ']')?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//code=ID
		public Assignment getCodeAssignment_1() { return cCodeAssignment_1; }

		//ID
		public RuleCall getCodeIDTerminalRuleCall_1_0() { return cCodeIDTerminalRuleCall_1_0; }

		//('[' guard=Guard ']')?
		public Group getGroup_2() { return cGroup_2; }

		//'['
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }

		//guard=Guard
		public Assignment getGuardAssignment_2_1() { return cGuardAssignment_2_1; }

		//Guard
		public RuleCall getGuardGuardParserRuleCall_2_1_0() { return cGuardGuardParserRuleCall_2_1_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_2_2() { return cRightSquareBracketKeyword_2_2; }
	}

	public class GuardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.Guard");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cValueGuardParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRangeGuardParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Guard:
		//	ValueGuard | RangeGuard;
		@Override public ParserRule getRule() { return rule; }

		//ValueGuard | RangeGuard
		public Alternatives getAlternatives() { return cAlternatives; }

		//ValueGuard
		public RuleCall getValueGuardParserRuleCall_0() { return cValueGuardParserRuleCall_0; }

		//RangeGuard
		public RuleCall getRangeGuardParserRuleCall_1() { return cRangeGuardParserRuleCall_1; }
	}

	public class ValueGuardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.ValueGuard");
		private final Assignment cCondAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCondValueParserRuleCall_0 = (RuleCall)cCondAssignment.eContents().get(0);
		
		//ValueGuard:
		//	cond=Value;
		@Override public ParserRule getRule() { return rule; }

		//cond=Value
		public Assignment getCondAssignment() { return cCondAssignment; }

		//Value
		public RuleCall getCondValueParserRuleCall_0() { return cCondValueParserRuleCall_0; }
	}

	public class RangeGuardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.RangeGuard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cMinAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cMinValueParserRuleCall_0_0 = (RuleCall)cMinAssignment_0.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMaxAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMaxValueParserRuleCall_2_0 = (RuleCall)cMaxAssignment_2.eContents().get(0);
		
		//RangeGuard:
		//	min=Value '..' max=Value;
		@Override public ParserRule getRule() { return rule; }

		//min=Value '..' max=Value
		public Group getGroup() { return cGroup; }

		//min=Value
		public Assignment getMinAssignment_0() { return cMinAssignment_0; }

		//Value
		public RuleCall getMinValueParserRuleCall_0_0() { return cMinValueParserRuleCall_0_0; }

		//'..'
		public Keyword getFullStopFullStopKeyword_1() { return cFullStopFullStopKeyword_1; }

		//max=Value
		public Assignment getMaxAssignment_2() { return cMaxAssignment_2; }

		//Value
		public RuleCall getMaxValueParserRuleCall_2_0() { return cMaxValueParserRuleCall_2_0; }
	}

	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cConstantRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIntLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Value:
		//	ConstantRef | IntLiteral;
		@Override public ParserRule getRule() { return rule; }

		//ConstantRef | IntLiteral
		public Alternatives getAlternatives() { return cAlternatives; }

		//ConstantRef
		public RuleCall getConstantRefParserRuleCall_0() { return cConstantRefParserRuleCall_0; }

		//IntLiteral
		public RuleCall getIntLiteralParserRuleCall_1() { return cIntLiteralParserRuleCall_1; }
	}

	public class ConstantRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.ConstantRef");
		private final Assignment cConstantAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cConstantConstantCrossReference_0 = (CrossReference)cConstantAssignment.eContents().get(0);
		private final RuleCall cConstantConstantIDTerminalRuleCall_0_1 = (RuleCall)cConstantConstantCrossReference_0.eContents().get(1);
		
		//ConstantRef:
		//	constant=[Constant];
		@Override public ParserRule getRule() { return rule; }

		//constant=[Constant]
		public Assignment getConstantAssignment() { return cConstantAssignment; }

		//[Constant]
		public CrossReference getConstantConstantCrossReference_0() { return cConstantConstantCrossReference_0; }

		//ID
		public RuleCall getConstantConstantIDTerminalRuleCall_0_1() { return cConstantConstantIDTerminalRuleCall_0_1; }
	}

	public class IntLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.IntLiteral");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//IntLiteral:
		//	value=INT;
		@Override public ParserRule getRule() { return rule; }

		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }

		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}

	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.Command");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cCodeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCodeIDTerminalRuleCall_1_0 = (RuleCall)cCodeAssignment_1.eContents().get(0);
		
		//Command:
		//	name=ID code=ID;
		@Override public ParserRule getRule() { return rule; }

		//name=ID code=ID
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//code=ID
		public Assignment getCodeAssignment_1() { return cCodeAssignment_1; }

		//ID
		public RuleCall getCodeIDTerminalRuleCall_1_0() { return cCodeIDTerminalRuleCall_1_0; }
	}

	public class ConstantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.Constant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueValueParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Constant:
		//	name=ID value=Value;
		@Override public ParserRule getRule() { return rule; }

		//name=ID value=Value
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//value=Value
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//Value
		public RuleCall getValueValueParserRuleCall_1_0() { return cValueValueParserRuleCall_1_0; }
	}

	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cDescriptionAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cActionsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cActionsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final CrossReference cActionsCommandCrossReference_3_2_0 = (CrossReference)cActionsAssignment_3_2.eContents().get(0);
		private final RuleCall cActionsCommandIDTerminalRuleCall_3_2_0_1 = (RuleCall)cActionsCommandCrossReference_3_2_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cTransitionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransitionsTransitionParserRuleCall_4_0 = (RuleCall)cTransitionsAssignment_4.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//State:
		//	'state' name=ID ('description' description=STRING)? ('actions' '{' actions+=[Command]+ '}')? transitions+=Transition*
		//	'end';
		@Override public ParserRule getRule() { return rule; }

		//'state' name=ID ('description' description=STRING)? ('actions' '{' actions+=[Command]+ '}')? transitions+=Transition*
		//'end'
		public Group getGroup() { return cGroup; }

		//'state'
		public Keyword getStateKeyword_0() { return cStateKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//('description' description=STRING)?
		public Group getGroup_2() { return cGroup_2; }

		//'description'
		public Keyword getDescriptionKeyword_2_0() { return cDescriptionKeyword_2_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_2_1() { return cDescriptionAssignment_2_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_2_1_0() { return cDescriptionSTRINGTerminalRuleCall_2_1_0; }

		//('actions' '{' actions+=[Command]+ '}')?
		public Group getGroup_3() { return cGroup_3; }

		//'actions'
		public Keyword getActionsKeyword_3_0() { return cActionsKeyword_3_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }

		//actions+=[Command]+
		public Assignment getActionsAssignment_3_2() { return cActionsAssignment_3_2; }

		//[Command]
		public CrossReference getActionsCommandCrossReference_3_2_0() { return cActionsCommandCrossReference_3_2_0; }

		//ID
		public RuleCall getActionsCommandIDTerminalRuleCall_3_2_0_1() { return cActionsCommandIDTerminalRuleCall_3_2_0_1; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_3_3() { return cRightCurlyBracketKeyword_3_3; }

		//transitions+=Transition*
		public Assignment getTransitionsAssignment_4() { return cTransitionsAssignment_4; }

		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_4_0() { return cTransitionsTransitionParserRuleCall_4_0; }

		//'end'
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.example.fowlerdsl.Statemachine.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEventAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEventEventCrossReference_0_0 = (CrossReference)cEventAssignment_0.eContents().get(0);
		private final RuleCall cEventEventIDTerminalRuleCall_0_0_1 = (RuleCall)cEventEventCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cGuardAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cGuardGuardParserRuleCall_1_1_0 = (RuleCall)cGuardAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Keyword cEqualsSignGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStateAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cStateStateCrossReference_3_0 = (CrossReference)cStateAssignment_3.eContents().get(0);
		private final RuleCall cStateStateIDTerminalRuleCall_3_0_1 = (RuleCall)cStateStateCrossReference_3_0.eContents().get(1);
		
		//Transition:
		//	event=[Event] ('[' guard=Guard ']')? '=>' state=[State];
		@Override public ParserRule getRule() { return rule; }

		//event=[Event] ('[' guard=Guard ']')? '=>' state=[State]
		public Group getGroup() { return cGroup; }

		//event=[Event]
		public Assignment getEventAssignment_0() { return cEventAssignment_0; }

		//[Event]
		public CrossReference getEventEventCrossReference_0_0() { return cEventEventCrossReference_0_0; }

		//ID
		public RuleCall getEventEventIDTerminalRuleCall_0_0_1() { return cEventEventIDTerminalRuleCall_0_0_1; }

		//('[' guard=Guard ']')?
		public Group getGroup_1() { return cGroup_1; }

		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }

		//guard=Guard
		public Assignment getGuardAssignment_1_1() { return cGuardAssignment_1_1; }

		//Guard
		public RuleCall getGuardGuardParserRuleCall_1_1_0() { return cGuardGuardParserRuleCall_1_1_0; }

		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }

		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_2() { return cEqualsSignGreaterThanSignKeyword_2; }

		//state=[State]
		public Assignment getStateAssignment_3() { return cStateAssignment_3; }

		//[State]
		public CrossReference getStateStateCrossReference_3_0() { return cStateStateCrossReference_3_0; }

		//ID
		public RuleCall getStateStateIDTerminalRuleCall_3_0_1() { return cStateStateIDTerminalRuleCall_3_0_1; }
	}
	
	
	private final StatemachineElements pStatemachine;
	private final EventElements pEvent;
	private final GuardElements pGuard;
	private final ValueGuardElements pValueGuard;
	private final RangeGuardElements pRangeGuard;
	private final ValueElements pValue;
	private final ConstantRefElements pConstantRef;
	private final IntLiteralElements pIntLiteral;
	private final CommandElements pCommand;
	private final ConstantElements pConstant;
	private final StateElements pState;
	private final TransitionElements pTransition;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public StatemachineGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pStatemachine = new StatemachineElements();
		this.pEvent = new EventElements();
		this.pGuard = new GuardElements();
		this.pValueGuard = new ValueGuardElements();
		this.pRangeGuard = new RangeGuardElements();
		this.pValue = new ValueElements();
		this.pConstantRef = new ConstantRefElements();
		this.pIntLiteral = new IntLiteralElements();
		this.pCommand = new CommandElements();
		this.pConstant = new ConstantElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.example.fowlerdsl.Statemachine".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Statemachine:
	//	{Statemachine} ('events' events+=Event+ 'end')? ('resetEvents' resetEvents+=[Event]+ 'end')? ('commands'
	//	commands+=Command+ 'end')? ('constants' connstants+=Constant+ 'end')? states+=State*;
	public StatemachineElements getStatemachineAccess() {
		return pStatemachine;
	}
	
	public ParserRule getStatemachineRule() {
		return getStatemachineAccess().getRule();
	}

	//Event:
	//	name=ID code=ID ('[' guard=Guard ']')?;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}

	//Guard:
	//	ValueGuard | RangeGuard;
	public GuardElements getGuardAccess() {
		return pGuard;
	}
	
	public ParserRule getGuardRule() {
		return getGuardAccess().getRule();
	}

	//ValueGuard:
	//	cond=Value;
	public ValueGuardElements getValueGuardAccess() {
		return pValueGuard;
	}
	
	public ParserRule getValueGuardRule() {
		return getValueGuardAccess().getRule();
	}

	//RangeGuard:
	//	min=Value '..' max=Value;
	public RangeGuardElements getRangeGuardAccess() {
		return pRangeGuard;
	}
	
	public ParserRule getRangeGuardRule() {
		return getRangeGuardAccess().getRule();
	}

	//Value:
	//	ConstantRef | IntLiteral;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//ConstantRef:
	//	constant=[Constant];
	public ConstantRefElements getConstantRefAccess() {
		return pConstantRef;
	}
	
	public ParserRule getConstantRefRule() {
		return getConstantRefAccess().getRule();
	}

	//IntLiteral:
	//	value=INT;
	public IntLiteralElements getIntLiteralAccess() {
		return pIntLiteral;
	}
	
	public ParserRule getIntLiteralRule() {
		return getIntLiteralAccess().getRule();
	}

	//Command:
	//	name=ID code=ID;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}

	//Constant:
	//	name=ID value=Value;
	public ConstantElements getConstantAccess() {
		return pConstant;
	}
	
	public ParserRule getConstantRule() {
		return getConstantAccess().getRule();
	}

	//State:
	//	'state' name=ID ('description' description=STRING)? ('actions' '{' actions+=[Command]+ '}')? transitions+=Transition*
	//	'end';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}

	//Transition:
	//	event=[Event] ('[' guard=Guard ']')? '=>' state=[State];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
