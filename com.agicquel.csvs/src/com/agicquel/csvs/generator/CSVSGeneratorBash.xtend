package com.agicquel.csvs.generator

import com.agicquel.csvs.csvs.AddExpr
import com.agicquel.csvs.csvs.ApplyCommand
import com.agicquel.csvs.csvs.AtomicExpr
import com.agicquel.csvs.csvs.Block
import com.agicquel.csvs.csvs.BoolConstant
import com.agicquel.csvs.csvs.Command
import com.agicquel.csvs.csvs.ComparaisonExpr
import com.agicquel.csvs.csvs.ControlCommand
import com.agicquel.csvs.csvs.CountExpr
import com.agicquel.csvs.csvs.CreateCommand
import com.agicquel.csvs.csvs.CsvCommand
import com.agicquel.csvs.csvs.DeleteCommand
import com.agicquel.csvs.csvs.EqualityExpr
import com.agicquel.csvs.csvs.ExportCommand
import com.agicquel.csvs.csvs.Expression
import com.agicquel.csvs.csvs.FieldSelect
import com.agicquel.csvs.csvs.IfCommand
import com.agicquel.csvs.csvs.IntConstant
import com.agicquel.csvs.csvs.LoadCommand
import com.agicquel.csvs.csvs.Model
import com.agicquel.csvs.csvs.MulOrDivExpr
import com.agicquel.csvs.csvs.NotExpr
import com.agicquel.csvs.csvs.OrExpr
import com.agicquel.csvs.csvs.PlusOrMinusExpr
import com.agicquel.csvs.csvs.PrimaryExpr
import com.agicquel.csvs.csvs.PrintCommand
import com.agicquel.csvs.csvs.Selector
import com.agicquel.csvs.csvs.SetCommand
import com.agicquel.csvs.csvs.StoreCommand
import com.agicquel.csvs.csvs.StringConstant
import com.agicquel.csvs.csvs.WhileCommand
import org.eclipse.emf.ecore.resource.Resource
import com.agicquel.csvs.csvs.CsvsExpr
import com.agicquel.csvs.csvs.VariableConstant
import com.agicquel.csvs.csvs.AddCommand
import com.agicquel.csvs.csvs.RenameCommand
import com.agicquel.csvs.csvs.LastExpr
import com.agicquel.csvs.csvs.MergeCommand
import com.agicquel.csvs.csvs.ConcatCommand

class CSVSGeneratorBash {
	
	def String compileIR(Resource resource) {
		var bashCode = "import pandas as pd\n";
		bashCode += "pd.options.mode.chained_assignment = None\n"
		bashCode += "\n"
		bashCode += "def len_csvs(obj):\r\n\tif hasattr(obj, \'__len__\'):\r\n\t\treturn len(obj)\r\n\telse:\r\n\t\treturn 1\n"
		bashCode += "\n"
		for(model : resource.allContents.toIterable.filter(Model)) {
			for(command : model.commands) {
				bashCode += command.compileCommand() + "\n"	
			}
		}
		
		return bashCode;
	}
	
	private def dispatch String compileCommand(CsvCommand csvCommand) {
		return csvCommand.compileCommand()
	}
	
	private def dispatch String compileCommand(ControlCommand controlCommand) {
		return controlCommand.compileCommand()
	}
	
	private def dispatch String compileCommand(LoadCommand loadCommand) {
		"" // TODO
	}
	
	private def dispatch String compileCommand(StoreCommand storeCommand) {
		"" // TODO
	}
	
	private def dispatch String compileCommand(CreateCommand createCommand) {
		"" // TODO
	}
	
	private def dispatch String compileCommand(SetCommand setCommand) {
		"" // TODO
	}
	
	private def dispatch String compileCommand(PrintCommand printCommand) {
		"" // TODO
	}
	
	private def dispatch String compileCommand(ExportCommand exportCommand) {
		"" // TODO
	}
	
	private def dispatch String compileCommand(DeleteCommand deleteCommand) {
		"" // TODO
	}
	
	private def dispatch String compileCommand(AddCommand addCommand) {
		"" // TODO
	}
	
	private def dispatch String compileCommand(RenameCommand renameCommand) {
		"" // TODO
	}
		
	private def dispatch String compileCommand(ApplyCommand applyCommand) {
		"" // TODO
	}
	
	private def dispatch String compileCommand(MergeCommand mergeCommand) {
		"" // TODO 
	}
	
	private def dispatch String compileCommand(ConcatCommand concatCommand) {
		"" // TODO 
	}
	
	private def String compileBlock(Block block) {
		"" // TODO
	}
	
	
	private def dispatch String compileCommand(WhileCommand whileCommand) {
		"" // TODO
	}
	
	private def dispatch String compileCommand(IfCommand ifCommand) {
		"" // TODO
	}

	
	private	def dispatch String compileExpr(Expression expression) {
		expression.compileExpr()
	}
	
	private	def dispatch String compileExpr(OrExpr orExpr) {
		"" // TODO
	}
	
	private	def dispatch String compileExpr(AddExpr addExpr) {
		"" // TODO
	}
	
	private	def dispatch String compileExpr(EqualityExpr equalityExpr) {
		"" // TODO
	}
	
	private	def dispatch String compileExpr(ComparaisonExpr comparaisonExpr) {
		"" // TODO
	}
	
	private	def dispatch String compileExpr(PlusOrMinusExpr comparaisonExpr) {
		"" // TODO
	}
	
	private	def dispatch String compileExpr(MulOrDivExpr mulOrDivExpr) {
		"" // TODO
	}
	
	private	def dispatch String compileExpr(PrimaryExpr primaryExpr) {
		"" // TODO
	}
	
	private	def dispatch String compileExpr(NotExpr notExpr) {
		"" // TODO
	}
	
	private	def dispatch String compileExpr(AtomicExpr atomicExpr) {
		"" // TODO
	}
	
	private	def dispatch String compileExpr(IntConstant intConstant) {
		intConstant.value.toString
	}
	
	private	def dispatch String compileExpr(StringConstant stringConstant) {
		"\"" + stringConstant.value + "\""
	}
	
	private	def dispatch String compileExpr(BoolConstant boolConstant) {
		"" // TODO boolConstant.value.substring(0, 1).toUpperCase() + boolConstant.value.substring(1)
	}
	
	private	def dispatch String compileExpr(VariableConstant variableConstant) {
		variableConstant.value.toString
	}
	
	private	def dispatch String compileExpr(CsvsExpr csvsExpr) {
		csvsExpr.compileExpr()
	}
	
	private	def dispatch String compileExpr(CountExpr countExpr) {
		"" // TODO 
	}
	
	private	def dispatch String compileExpr(Selector cellSelect) {
		"" // TODO
	}
	
	private	def dispatch String compileExpr(FieldSelect fieldSelect) {
		"" // TODO
	}
	
	private def dispatch String compileExpr(LastExpr lastExpr) {
		"" // TODO
	}
	
}