package com.agicquel.csvs.generator

import java.util.ArrayList
import com.agicquel.csvs.csvs.Command

@Data
class CommandImpl {
	Env env
	ArrayList<Quad> quads
	Command command
	
	override String toString() {
		var res = "\nEnv : I" + env.inputCounter + " | O" + env.outputCounter
		res += " | L" + env.labelCounter + " | V" + env.variableCounter
		res += "\nCode : \n"
		for(quad : quads) {
			res += "\t" + quad.toString() + "\n"
		}
		
		return res
	}
}