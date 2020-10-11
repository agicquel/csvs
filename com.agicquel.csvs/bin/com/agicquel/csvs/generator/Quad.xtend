package com.agicquel.csvs.generator

import org.eclipse.xtend.lib.annotations.Accessors

class Quad {
	@Accessors String op;
	@Accessors String dest;
	@Accessors String arg1;
	@Accessors String arg2;
	
	new(String op, String dest, String arg1, String arg2) {
		this.op = op;
		this.dest = dest;
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	
	override String toString() {
		return "<" + this.op + ", " + this.dest + ", " + this.arg1 + ", " + this.arg2 + ">"
	}
	
	
}