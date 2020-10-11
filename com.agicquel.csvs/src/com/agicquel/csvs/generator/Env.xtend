package com.agicquel.csvs.generator

import java.util.HashMap
import org.eclipse.xtend.lib.annotations.Accessors

class Env {
	HashMap<String, String> table
	protected Env previous
	@Accessors int variableCounter = 0
	@Accessors int labelCounter = 0
	@Accessors int inputCounter = 0
	@Accessors int outputCounter = 0
	
	new(Env previous) {
		this.table = newHashMap()
		this.previous = previous
	}
	
	def String newVariable(String token) {
		var key = "V" + this.variableCounter
		this.table.put(key, token)
		this.variableCounter++
		return key
	}
	
	def String newLabel() {
		var key = "L" + this.labelCounter
		this.table.put(key, key)
		this.labelCounter++
		return key
	}
	
	def String newInput(String token) {
		var key = "I" + this.inputCounter
		this.table.put(key, token)
		this.inputCounter++
		return key
	}
	
	def String retrieve(String token) {
		for(var env = this; env !== null; env = env.previous) {
			for(entry : env.table.entrySet()) {
		        if(entry.getValue().equals(token)) {
		            return entry.getKey();
		        }
		    }
		}
		return null
	}
	
	def int size() {
		return this.table.size()
	}
}