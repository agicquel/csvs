package com.agicquel.csvs.generator

import com.agicquel.csvs.csvs.AddCommand
import com.agicquel.csvs.csvs.ApplyCommand
import com.agicquel.csvs.csvs.Command
import com.agicquel.csvs.csvs.ControlCommand
import com.agicquel.csvs.csvs.CreateCommand
import com.agicquel.csvs.csvs.CsvCommand
import com.agicquel.csvs.csvs.DeleteCommand
import com.agicquel.csvs.csvs.ExportCommand
import com.agicquel.csvs.csvs.LoadCommand
import com.agicquel.csvs.csvs.PrintCommand
import com.agicquel.csvs.csvs.SetCommand
import com.agicquel.csvs.csvs.StoreCommand
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import com.agicquel.csvs.csvs.Selector
import com.agicquel.csvs.csvs.Expression
import com.agicquel.csvs.csvs.WhileCommand
import com.agicquel.csvs.csvs.IfCommand
import com.agicquel.csvs.csvs.Block
import com.agicquel.csvs.csvs.OrExpr
import com.agicquel.csvs.csvs.AddExpr
import com.agicquel.csvs.csvs.ComparaisonExpr
import com.agicquel.csvs.csvs.PlusOrMinusExpr
import com.agicquel.csvs.csvs.MulOrDivExpr
import com.agicquel.csvs.csvs.PrimaryExpr
import com.agicquel.csvs.csvs.NotExpr
import com.agicquel.csvs.csvs.AtomicExpr
import com.agicquel.csvs.csvs.IntConstant
import com.agicquel.csvs.csvs.StringConstant
import com.agicquel.csvs.csvs.BoolConstant
import com.agicquel.csvs.csvs.EqualityExpr
import com.agicquel.csvs.csvs.RowSelect
import com.agicquel.csvs.csvs.ColSelect
import com.agicquel.csvs.csvs.CellSelect
import com.agicquel.csvs.csvs.FieldSelect
import com.agicquel.csvs.csvs.VariableSelect
import com.agicquel.csvs.csvs.CountExpr

class CSVSGeneratorPython {
	
	def String compileIR(Resource resource) {
		var pythonCode = "import pandas as pd\n";
		for(command : resource.allContents.toIterable.filter(Command)) {
			pythonCode += command.compileCommand() + "\n"
		}
		
		return pythonCode;
	}
	
	private def dispatch String compileCommand(CsvCommand csvCommand) {
		return csvCommand.compileCommand()
	}
	
	private def dispatch String compileCommand(ControlCommand controlCommand) {
		return controlCommand.compileCommand()
	}
	
	private def dispatch String compileCommand(LoadCommand loadCommand) {
		loadCommand.^var + " = pd.read_csv('" + loadCommand.path + "')"
	}
	
	private def dispatch String compileCommand(StoreCommand storeCommand) {
		storeCommand.^var + ".to_csv(r'" + storeCommand.path + "')"
	}
	
	private def dispatch String compileCommand(CreateCommand createCommand) {
		createCommand.^var + " = pd.DataFrame()"
	}
	
	private def dispatch String compileCommand(SetCommand setCommand) {
		setCommand.^var.compileExpr() + " = " + setCommand.expression.compileExpr()
	}
	
	private def dispatch String compileCommand(PrintCommand printCommand) {
		"print(str(" + printCommand.expression.compileExpr() + "))"
	}
	
	private def dispatch String compileCommand(ExportCommand exportCommand) {
		exportCommand.^var + ".to_json(r'" + exportCommand.path + "')"
	}
	
	private def dispatch String compileCommand(DeleteCommand deleteCommand) {
		"del " + deleteCommand.expression.compileExpr()
	}
	
	private def dispatch String compileCommand(AddCommand addCommand) {
		/*if(addCommand.op.equals("row")) {
			return ""
		}
		else if(addCommand.op.equals("col")) {
			return ""
		}
		else {
			return ""
		}*/
		return "" // TODO
	}
	
	
	private def dispatch String compileCommand(ApplyCommand applyCommand) {
	}
	
	private def String compileBlock(Block block) {
		
	}
	
	
	private def dispatch String compileCommand(WhileCommand whileCommand) {
		"while " + whileCommand.cond.compileExpr() + ":\n" + whileCommand.body.compileBlock()
	}
	
	private def dispatch String compileCommand(IfCommand ifCommand) {
		"if " + ifCommand.cond.compileExpr() + ":\n" + ifCommand.thenBody.compileBlock() 
			+ (ifCommand.elseBody === null ? "" : ("\nelse:\n" + ifCommand.elseBody.compileBlock()))
	}

	
	private	def dispatch String compileExpr(Expression expression) {
		expression.compileExpr()
	}
	
	private	def dispatch String compileExpr(OrExpr orExpr) {
		var code = orExpr.left.compileExpr()
		for(AddExpr right : orExpr.right) {
			code += " or " + right.compileExpr()
		}
		return code
	}
	
	private	def dispatch String compileExpr(AddExpr addExpr) {
		var code = addExpr.left.compileExpr()
		for(EqualityExpr right : addExpr.right) {
			code += " and " + right.compileExpr()
		}
		return code
	}
	
	private	def dispatch String compileExpr(EqualityExpr equalityExpr) {
		equalityExpr.left.compileExpr() + (equalityExpr.right === null ? "" : (" " + equalityExpr.op + " " + equalityExpr.right.compileExpr()))
	}
	
	private	def dispatch String compileExpr(ComparaisonExpr comparaisonExpr) {
		comparaisonExpr.left.compileExpr() + (comparaisonExpr.right === null ? "" : (" " + comparaisonExpr.op + " " + comparaisonExpr.right.compileExpr()))
	}
	
	private	def dispatch String compileExpr(PlusOrMinusExpr comparaisonExpr) {
		var code = comparaisonExpr.left.compileExpr()
		for(i : 0 ..< comparaisonExpr.right.size) {
			code += " " + comparaisonExpr.op.get(i) + " " + comparaisonExpr.right.get(i).compileExpr()
		}
		return code
	}
	
	private	def dispatch String compileExpr(MulOrDivExpr mulOrDivExpr) {
		var code = mulOrDivExpr.left.compileExpr()
		for(i : 0 ..< mulOrDivExpr.right.size) {
			code += " " + mulOrDivExpr.op.get(i) + " " + mulOrDivExpr.right.get(i).compileExpr()
		}
		return code
	}
	
	private	def dispatch String compileExpr(PrimaryExpr primaryExpr) {
		primaryExpr.compileExpr()
	}
	
	private	def dispatch String compileExpr(NotExpr notExpr) {
		"not " + notExpr.expr.compileExpr()
	}
	
	private	def dispatch String compileExpr(AtomicExpr atomicExpr) {
		atomicExpr.compileExpr()
	}
	
	private	def dispatch String compileExpr(IntConstant intConstant) {
		intConstant.value.toString
	}
	
	private	def dispatch String compileExpr(StringConstant stringConstant) {
		stringConstant.value
	}
	
	private	def dispatch String compileExpr(BoolConstant boolConstant) {
		boolConstant.value.substring(0, 1).toUpperCase() + boolConstant.value.substring(1)
	}
	
	private	def dispatch String compileExpr(Selector selector) {
		selector.compileExpr()
	}
	
	private	def dispatch String compileExpr(CountExpr countExpr) {
	}
	
	private	def dispatch String compileExpr(RowSelect rowSelect) {
		rowSelect.^var + "[" + rowSelect.expression.compileExpr() + "]"
	}
	
	private	def dispatch String compileExpr(ColSelect colSelect) {
		colSelect.^var + "[:" + colSelect.expression.compileExpr() + "]"
	}
	
	private	def dispatch String compileExpr(CellSelect cellSelect) {
		cellSelect.^var + "at[" + cellSelect.expressionRow.compileExpr() + ", " + cellSelect.expressionCol.compileExpr() + "]"
	}
	
	private	def dispatch String compileExpr(FieldSelect fieldSelect) {
		"" // TODO
	}
	
	private	def dispatch String compileExpr(VariableSelect variableSelect) {
		variableSelect.term
	}
	
}