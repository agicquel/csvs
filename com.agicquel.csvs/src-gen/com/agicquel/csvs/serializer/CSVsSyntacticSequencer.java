/*
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.serializer;

import com.agicquel.csvs.services.CSVsGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CSVsSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CSVsGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Primary___LeftParenthesisKeyword_0_0_LCParserRuleCall_0_1__a;
	protected AbstractElementAlias match_Primary___LeftParenthesisKeyword_0_0_LCParserRuleCall_0_1__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CSVsGrammarAccess) access;
		match_Primary___LeftParenthesisKeyword_0_0_LCParserRuleCall_0_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getPrimaryAccess().getLCParserRuleCall_0_1()));
		match_Primary___LeftParenthesisKeyword_0_0_LCParserRuleCall_0_1__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getPrimaryAccess().getLCParserRuleCall_0_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getCommentCommandRule())
			return getCommentCommandToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLCRule())
			return getLCToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * CommentCommand: ML_COMMENT | SL_COMMENT;
	 */
	protected String getCommentCommandToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/*";
	}
	
	/**
	 * LC : WS?;
	 */
	protected String getLCToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING:
	 * 			'"' ( '\\' .  | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' .  | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Primary___LeftParenthesisKeyword_0_0_LCParserRuleCall_0_1__a.equals(syntax))
				emit_Primary___LeftParenthesisKeyword_0_0_LCParserRuleCall_0_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary___LeftParenthesisKeyword_0_0_LCParserRuleCall_0_1__p.equals(syntax))
				emit_Primary___LeftParenthesisKeyword_0_0_LCParserRuleCall_0_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('(' LC)*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '!' expression=Primary
	 *     (rule start) (ambiguity) 'cell' LC var=ID
	 *     (rule start) (ambiguity) 'col' LC var=ID
	 *     (rule start) (ambiguity) 'count' LC var=ID
	 *     (rule start) (ambiguity) 'field' LC var=ID
	 *     (rule start) (ambiguity) 'row' LC var=ID
	 *     (rule start) (ambiguity) term=ID
	 *     (rule start) (ambiguity) value='false'
	 *     (rule start) (ambiguity) value='true'
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Comparison.left=}
	 *     (rule start) (ambiguity) {Equality.left=}
	 *     (rule start) (ambiguity) {MulOrDiv.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 */
	protected void emit_Primary___LeftParenthesisKeyword_0_0_LCParserRuleCall_0_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' LC)+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'cell' LC var=ID
	 *     (rule start) (ambiguity) 'col' LC var=ID
	 *     (rule start) (ambiguity) 'count' LC var=ID
	 *     (rule start) (ambiguity) 'field' LC var=ID
	 *     (rule start) (ambiguity) 'row' LC var=ID
	 *     (rule start) (ambiguity) {And.left=}
	 *     (rule start) (ambiguity) {Comparison.left=}
	 *     (rule start) (ambiguity) {Equality.left=}
	 *     (rule start) (ambiguity) {MulOrDiv.left=}
	 *     (rule start) (ambiguity) {Or.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 */
	protected void emit_Primary___LeftParenthesisKeyword_0_0_LCParserRuleCall_0_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}