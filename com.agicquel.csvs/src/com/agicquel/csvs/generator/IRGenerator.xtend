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

class IRGenerator {
	Resource res
	Env env
	
	def List<Instr> compileIR(Resource resource) {
		this.res = resource
		this.env = new Env(null)
		var instructions = newArrayList()
		
		for(command : resource.allContents.toIterable.filter(Command)) {
			instructions.addAll(command.compileCommand())
		}
		
		return instructions;
	}
	
	private def dispatch Instr compileCommand(CsvCommand csvCommand) {
		return csvCommand.compileCommand()
	}
	
	private def dispatch Instr compileCommand(ControlCommand controlCommand) {
		return controlCommand.compileCommand()
	}
	
	private def dispatch Instr compileCommand(LoadCommand loadCommand) {
		var e = new Instr()
		e.place = env.newVariable(loadCommand.^var)
		e.code.add(new Quad("load", e.place, loadCommand.path, ""))
		return e
	}
	
	private def dispatch Instr compileCommand(StoreCommand storeCommand) {
		var e = new Instr()
		e.code.add(new Quad("store", "", storeCommand.^var, storeCommand.path))
		return e
	}
	
	private def dispatch Instr compileCommand(CreateCommand createCommand) {
		var e = new Instr()
		e.place = env.newVariable(createCommand.^var)
		e.code.add(new Quad("create", e.place, "", ""))
		return e
	}
	
	private def dispatch Instr compileCommand(SetCommand setCommand) {
		var e = new Instr()
		var e1 = setCommand.^var.compileExpr();
		var e2 = setCommand.expression.compileExpr();
		//e.place = env.newVariable(createCommand.^var)
		e.code.addAll(e1.code)
		//e.code.add(new Quad("set", setCommand., "", ""))
		return e
	}
	
	private def dispatch Instr compileCommand(PrintCommand printCommand) {
	}
	
	private def dispatch Instr compileCommand(ExportCommand exportCommand) {
	}
	
	private def dispatch Instr compileCommand(DeleteCommand deleteCommand) {
	}
	
	private def dispatch Instr compileCommand(AddCommand addCommand) {
	}
	
	private def dispatch Instr compileCommand(ApplyCommand applyCommand) {
	}
	
	
	private	def dispatch Instr compileExpr(Expression expression) {	
	}
	
	private	def dispatch Instr compileExpr(Selector selector) {
	}
	
}