/*
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.ide.contentassist.antlr;

import com.agicquel.csvs.ide.contentassist.antlr.internal.InternalCSVsParser;
import com.agicquel.csvs.services.CSVsGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class CSVsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CSVsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CSVsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getControlCommandAccess().getAlternatives(), "rule__ControlCommand__Alternatives");
			builder.put(grammarAccess.getCsvCommandAccess().getAlternatives(), "rule__CsvCommand__Alternatives");
			builder.put(grammarAccess.getAddCommandAccess().getOpAlternatives_2_0(), "rule__AddCommand__OpAlternatives_2_0");
			builder.put(grammarAccess.getCommentCommandAccess().getAlternatives(), "rule__CommentCommand__Alternatives");
			builder.put(grammarAccess.getEqualityExprAccess().getOpAlternatives_1_1_0(), "rule__EqualityExpr__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getComparaisonExprAccess().getOpAlternatives_1_1_0(), "rule__ComparaisonExpr__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPlusOrMinusExprAccess().getOpAlternatives_1_1_0(), "rule__PlusOrMinusExpr__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getMulOrDivExprAccess().getOpAlternatives_1_1_0(), "rule__MulOrDivExpr__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getPrimaryExprAccess().getAlternatives(), "rule__PrimaryExpr__Alternatives");
			builder.put(grammarAccess.getCsvsExprAccess().getAlternatives(), "rule__CsvsExpr__Alternatives");
			builder.put(grammarAccess.getLastExprAccess().getOpAlternatives_2_0(), "rule__LastExpr__OpAlternatives_2_0");
			builder.put(grammarAccess.getAtomicExprAccess().getAlternatives(), "rule__AtomicExpr__Alternatives");
			builder.put(grammarAccess.getAtomicExprAccess().getValueAlternatives_3_1_0(), "rule__AtomicExpr__ValueAlternatives_3_1_0");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getCommandAccess().getGroup_0(), "rule__Command__Group_0__0");
			builder.put(grammarAccess.getCommandAccess().getGroup_1(), "rule__Command__Group_1__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getWhileCommandAccess().getGroup(), "rule__WhileCommand__Group__0");
			builder.put(grammarAccess.getIfCommandAccess().getGroup(), "rule__IfCommand__Group__0");
			builder.put(grammarAccess.getIfCommandAccess().getGroup_6(), "rule__IfCommand__Group_6__0");
			builder.put(grammarAccess.getLoadCommandAccess().getGroup(), "rule__LoadCommand__Group__0");
			builder.put(grammarAccess.getStoreCommandAccess().getGroup(), "rule__StoreCommand__Group__0");
			builder.put(grammarAccess.getExportCommandAccess().getGroup(), "rule__ExportCommand__Group__0");
			builder.put(grammarAccess.getCreateCommandAccess().getGroup(), "rule__CreateCommand__Group__0");
			builder.put(grammarAccess.getSetCommandAccess().getGroup(), "rule__SetCommand__Group__0");
			builder.put(grammarAccess.getPrintCommandAccess().getGroup(), "rule__PrintCommand__Group__0");
			builder.put(grammarAccess.getDeleteCommandAccess().getGroup(), "rule__DeleteCommand__Group__0");
			builder.put(grammarAccess.getAddCommandAccess().getGroup(), "rule__AddCommand__Group__0");
			builder.put(grammarAccess.getRenameCommandAccess().getGroup(), "rule__RenameCommand__Group__0");
			builder.put(grammarAccess.getApplyCommandAccess().getGroup(), "rule__ApplyCommand__Group__0");
			builder.put(grammarAccess.getApplyFilterCommandAccess().getGroup(), "rule__ApplyFilterCommand__Group__0");
			builder.put(grammarAccess.getApplyExecCommandAccess().getGroup(), "rule__ApplyExecCommand__Group__0");
			builder.put(grammarAccess.getMergeCommandAccess().getGroup(), "rule__MergeCommand__Group__0");
			builder.put(grammarAccess.getConcatCommandAccess().getGroup(), "rule__ConcatCommand__Group__0");
			builder.put(grammarAccess.getOrExprAccess().getGroup(), "rule__OrExpr__Group__0");
			builder.put(grammarAccess.getOrExprAccess().getGroup_1(), "rule__OrExpr__Group_1__0");
			builder.put(grammarAccess.getAddExprAccess().getGroup(), "rule__AddExpr__Group__0");
			builder.put(grammarAccess.getAddExprAccess().getGroup_1(), "rule__AddExpr__Group_1__0");
			builder.put(grammarAccess.getEqualityExprAccess().getGroup(), "rule__EqualityExpr__Group__0");
			builder.put(grammarAccess.getEqualityExprAccess().getGroup_1(), "rule__EqualityExpr__Group_1__0");
			builder.put(grammarAccess.getComparaisonExprAccess().getGroup(), "rule__ComparaisonExpr__Group__0");
			builder.put(grammarAccess.getComparaisonExprAccess().getGroup_1(), "rule__ComparaisonExpr__Group_1__0");
			builder.put(grammarAccess.getPlusOrMinusExprAccess().getGroup(), "rule__PlusOrMinusExpr__Group__0");
			builder.put(grammarAccess.getPlusOrMinusExprAccess().getGroup_1(), "rule__PlusOrMinusExpr__Group_1__0");
			builder.put(grammarAccess.getMulOrDivExprAccess().getGroup(), "rule__MulOrDivExpr__Group__0");
			builder.put(grammarAccess.getMulOrDivExprAccess().getGroup_1(), "rule__MulOrDivExpr__Group_1__0");
			builder.put(grammarAccess.getNotExprAccess().getGroup(), "rule__NotExpr__Group__0");
			builder.put(grammarAccess.getPrimaryExprAccess().getGroup_0(), "rule__PrimaryExpr__Group_0__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup(), "rule__Selector__Group__0");
			builder.put(grammarAccess.getSelectorAccess().getGroup_11(), "rule__Selector__Group_11__0");
			builder.put(grammarAccess.getFieldSelectAccess().getGroup(), "rule__FieldSelect__Group__0");
			builder.put(grammarAccess.getCountExprAccess().getGroup(), "rule__CountExpr__Group__0");
			builder.put(grammarAccess.getLastExprAccess().getGroup(), "rule__LastExpr__Group__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_0(), "rule__AtomicExpr__Group_0__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_1(), "rule__AtomicExpr__Group_1__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_2(), "rule__AtomicExpr__Group_2__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_3(), "rule__AtomicExpr__Group_3__0");
			builder.put(grammarAccess.getAtomicExprAccess().getGroup_4(), "rule__AtomicExpr__Group_4__0");
			builder.put(grammarAccess.getModelAccess().getCommandsAssignment_2(), "rule__Model__CommandsAssignment_2");
			builder.put(grammarAccess.getBlockAccess().getCommandsAssignment_3(), "rule__Block__CommandsAssignment_3");
			builder.put(grammarAccess.getWhileCommandAccess().getCondAssignment_2(), "rule__WhileCommand__CondAssignment_2");
			builder.put(grammarAccess.getWhileCommandAccess().getBodyAssignment_4(), "rule__WhileCommand__BodyAssignment_4");
			builder.put(grammarAccess.getIfCommandAccess().getCondAssignment_2(), "rule__IfCommand__CondAssignment_2");
			builder.put(grammarAccess.getIfCommandAccess().getThenBodyAssignment_4(), "rule__IfCommand__ThenBodyAssignment_4");
			builder.put(grammarAccess.getIfCommandAccess().getElseBodyAssignment_6_2(), "rule__IfCommand__ElseBodyAssignment_6_2");
			builder.put(grammarAccess.getLoadCommandAccess().getVarAssignment_2(), "rule__LoadCommand__VarAssignment_2");
			builder.put(grammarAccess.getLoadCommandAccess().getPathAssignment_4(), "rule__LoadCommand__PathAssignment_4");
			builder.put(grammarAccess.getStoreCommandAccess().getVarAssignment_2(), "rule__StoreCommand__VarAssignment_2");
			builder.put(grammarAccess.getStoreCommandAccess().getPathAssignment_4(), "rule__StoreCommand__PathAssignment_4");
			builder.put(grammarAccess.getExportCommandAccess().getVarAssignment_2(), "rule__ExportCommand__VarAssignment_2");
			builder.put(grammarAccess.getExportCommandAccess().getPathAssignment_4(), "rule__ExportCommand__PathAssignment_4");
			builder.put(grammarAccess.getCreateCommandAccess().getVarAssignment_2(), "rule__CreateCommand__VarAssignment_2");
			builder.put(grammarAccess.getSetCommandAccess().getVarAssignment_0(), "rule__SetCommand__VarAssignment_0");
			builder.put(grammarAccess.getSetCommandAccess().getExpressionAssignment_4(), "rule__SetCommand__ExpressionAssignment_4");
			builder.put(grammarAccess.getPrintCommandAccess().getExpressionAssignment_2(), "rule__PrintCommand__ExpressionAssignment_2");
			builder.put(grammarAccess.getDeleteCommandAccess().getExpressionAssignment_2(), "rule__DeleteCommand__ExpressionAssignment_2");
			builder.put(grammarAccess.getAddCommandAccess().getOpAssignment_2(), "rule__AddCommand__OpAssignment_2");
			builder.put(grammarAccess.getAddCommandAccess().getExpressionAssignment_4(), "rule__AddCommand__ExpressionAssignment_4");
			builder.put(grammarAccess.getRenameCommandAccess().getExprAssignment_2(), "rule__RenameCommand__ExprAssignment_2");
			builder.put(grammarAccess.getRenameCommandAccess().getOldnameAssignment_4(), "rule__RenameCommand__OldnameAssignment_4");
			builder.put(grammarAccess.getRenameCommandAccess().getNewnameAssignment_8(), "rule__RenameCommand__NewnameAssignment_8");
			builder.put(grammarAccess.getApplyCommandAccess().getSelectionAssignment_2(), "rule__ApplyCommand__SelectionAssignment_2");
			builder.put(grammarAccess.getApplyCommandAccess().getIfAssignment_4(), "rule__ApplyCommand__IfAssignment_4");
			builder.put(grammarAccess.getApplyCommandAccess().getExecAssignment_6(), "rule__ApplyCommand__ExecAssignment_6");
			builder.put(grammarAccess.getApplyFilterCommandAccess().getVarNameAssignment_4(), "rule__ApplyFilterCommand__VarNameAssignment_4");
			builder.put(grammarAccess.getApplyFilterCommandAccess().getExprAssignment_8(), "rule__ApplyFilterCommand__ExprAssignment_8");
			builder.put(grammarAccess.getApplyExecCommandAccess().getVarNameAssignment_4(), "rule__ApplyExecCommand__VarNameAssignment_4");
			builder.put(grammarAccess.getApplyExecCommandAccess().getExprAssignment_8(), "rule__ApplyExecCommand__ExprAssignment_8");
			builder.put(grammarAccess.getMergeCommandAccess().getSelection1Assignment_2(), "rule__MergeCommand__Selection1Assignment_2");
			builder.put(grammarAccess.getMergeCommandAccess().getSelection2Assignment_6(), "rule__MergeCommand__Selection2Assignment_6");
			builder.put(grammarAccess.getConcatCommandAccess().getSelection1Assignment_2(), "rule__ConcatCommand__Selection1Assignment_2");
			builder.put(grammarAccess.getConcatCommandAccess().getSelection2Assignment_6(), "rule__ConcatCommand__Selection2Assignment_6");
			builder.put(grammarAccess.getOrExprAccess().getLeftAssignment_0(), "rule__OrExpr__LeftAssignment_0");
			builder.put(grammarAccess.getOrExprAccess().getRightAssignment_1_3(), "rule__OrExpr__RightAssignment_1_3");
			builder.put(grammarAccess.getAddExprAccess().getLeftAssignment_0(), "rule__AddExpr__LeftAssignment_0");
			builder.put(grammarAccess.getAddExprAccess().getRightAssignment_1_3(), "rule__AddExpr__RightAssignment_1_3");
			builder.put(grammarAccess.getEqualityExprAccess().getLeftAssignment_0(), "rule__EqualityExpr__LeftAssignment_0");
			builder.put(grammarAccess.getEqualityExprAccess().getOpAssignment_1_1(), "rule__EqualityExpr__OpAssignment_1_1");
			builder.put(grammarAccess.getEqualityExprAccess().getRightAssignment_1_3(), "rule__EqualityExpr__RightAssignment_1_3");
			builder.put(grammarAccess.getComparaisonExprAccess().getLeftAssignment_0(), "rule__ComparaisonExpr__LeftAssignment_0");
			builder.put(grammarAccess.getComparaisonExprAccess().getOpAssignment_1_1(), "rule__ComparaisonExpr__OpAssignment_1_1");
			builder.put(grammarAccess.getComparaisonExprAccess().getRightAssignment_1_3(), "rule__ComparaisonExpr__RightAssignment_1_3");
			builder.put(grammarAccess.getPlusOrMinusExprAccess().getLeftAssignment_0(), "rule__PlusOrMinusExpr__LeftAssignment_0");
			builder.put(grammarAccess.getPlusOrMinusExprAccess().getOpAssignment_1_1(), "rule__PlusOrMinusExpr__OpAssignment_1_1");
			builder.put(grammarAccess.getPlusOrMinusExprAccess().getRightAssignment_1_3(), "rule__PlusOrMinusExpr__RightAssignment_1_3");
			builder.put(grammarAccess.getMulOrDivExprAccess().getLeftAssignment_0(), "rule__MulOrDivExpr__LeftAssignment_0");
			builder.put(grammarAccess.getMulOrDivExprAccess().getOpAssignment_1_1(), "rule__MulOrDivExpr__OpAssignment_1_1");
			builder.put(grammarAccess.getMulOrDivExprAccess().getRightAssignment_1_3(), "rule__MulOrDivExpr__RightAssignment_1_3");
			builder.put(grammarAccess.getNotExprAccess().getExprAssignment_2(), "rule__NotExpr__ExprAssignment_2");
			builder.put(grammarAccess.getSelectorAccess().getVarAssignment_0(), "rule__Selector__VarAssignment_0");
			builder.put(grammarAccess.getSelectorAccess().getExpressionColAssignment_4(), "rule__Selector__ExpressionColAssignment_4");
			builder.put(grammarAccess.getSelectorAccess().getExpressionRowAssignment_8(), "rule__Selector__ExpressionRowAssignment_8");
			builder.put(grammarAccess.getSelectorAccess().getExpressionSubColAssignment_11_2(), "rule__Selector__ExpressionSubColAssignment_11_2");
			builder.put(grammarAccess.getSelectorAccess().getExpressionSubRowAssignment_11_6(), "rule__Selector__ExpressionSubRowAssignment_11_6");
			builder.put(grammarAccess.getFieldSelectAccess().getVarAssignment_2(), "rule__FieldSelect__VarAssignment_2");
			builder.put(grammarAccess.getFieldSelectAccess().getExpressionAssignment_6(), "rule__FieldSelect__ExpressionAssignment_6");
			builder.put(grammarAccess.getCountExprAccess().getExpressionAssignment_2(), "rule__CountExpr__ExpressionAssignment_2");
			builder.put(grammarAccess.getLastExprAccess().getOpAssignment_2(), "rule__LastExpr__OpAssignment_2");
			builder.put(grammarAccess.getLastExprAccess().getExpressionAssignment_4(), "rule__LastExpr__ExpressionAssignment_4");
			builder.put(grammarAccess.getAtomicExprAccess().getValueAssignment_0_1(), "rule__AtomicExpr__ValueAssignment_0_1");
			builder.put(grammarAccess.getAtomicExprAccess().getValueAssignment_1_1(), "rule__AtomicExpr__ValueAssignment_1_1");
			builder.put(grammarAccess.getAtomicExprAccess().getValueAssignment_2_1(), "rule__AtomicExpr__ValueAssignment_2_1");
			builder.put(grammarAccess.getAtomicExprAccess().getValueAssignment_3_1(), "rule__AtomicExpr__ValueAssignment_3_1");
			builder.put(grammarAccess.getAtomicExprAccess().getValueAssignment_4_1(), "rule__AtomicExpr__ValueAssignment_4_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CSVsGrammarAccess grammarAccess;

	@Override
	protected InternalCSVsParser createParser() {
		InternalCSVsParser result = new InternalCSVsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CSVsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CSVsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
