package com.agicquel.csvs.generator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Env {
  private HashMap<String, String> table;
  
  protected Env previous;
  
  @Accessors
  private int variableCounter = 0;
  
  @Accessors
  private int labelCounter = 0;
  
  @Accessors
  private int inputCounter = 0;
  
  @Accessors
  private int outputCounter = 0;
  
  public Env(final Env previous) {
    this.table = CollectionLiterals.<String, String>newHashMap();
    this.previous = previous;
  }
  
  public String newVariable(final String token) {
    String key = ("V" + Integer.valueOf(this.variableCounter));
    this.table.put(key, token);
    this.variableCounter++;
    return key;
  }
  
  public String newLabel() {
    String key = ("L" + Integer.valueOf(this.labelCounter));
    this.table.put(key, key);
    this.labelCounter++;
    return key;
  }
  
  public String newInput(final String token) {
    String key = ("I" + Integer.valueOf(this.inputCounter));
    this.table.put(key, token);
    this.inputCounter++;
    return key;
  }
  
  public String retrieve(final String token) {
    for (Env env = this; (env != null); env = env.previous) {
      Set<Map.Entry<String, String>> _entrySet = env.table.entrySet();
      for (final Map.Entry<String, String> entry : _entrySet) {
        boolean _equals = entry.getValue().equals(token);
        if (_equals) {
          return entry.getKey();
        }
      }
    }
    return null;
  }
  
  public int size() {
    return this.table.size();
  }
  
  @Pure
  public int getVariableCounter() {
    return this.variableCounter;
  }
  
  public void setVariableCounter(final int variableCounter) {
    this.variableCounter = variableCounter;
  }
  
  @Pure
  public int getLabelCounter() {
    return this.labelCounter;
  }
  
  public void setLabelCounter(final int labelCounter) {
    this.labelCounter = labelCounter;
  }
  
  @Pure
  public int getInputCounter() {
    return this.inputCounter;
  }
  
  public void setInputCounter(final int inputCounter) {
    this.inputCounter = inputCounter;
  }
  
  @Pure
  public int getOutputCounter() {
    return this.outputCounter;
  }
  
  public void setOutputCounter(final int outputCounter) {
    this.outputCounter = outputCounter;
  }
}
