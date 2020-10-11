package com.agicquel.csvs.generator;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Quad {
  @Accessors
  private String op;
  
  @Accessors
  private String dest;
  
  @Accessors
  private String arg1;
  
  @Accessors
  private String arg2;
  
  public Quad(final String op, final String dest, final String arg1, final String arg2) {
    this.op = op;
    this.dest = dest;
    this.arg1 = arg1;
    this.arg2 = arg2;
  }
  
  @Override
  public String toString() {
    return (((((((("<" + this.op) + ", ") + this.dest) + ", ") + this.arg1) + ", ") + this.arg2) + ">");
  }
  
  @Pure
  public String getOp() {
    return this.op;
  }
  
  public void setOp(final String op) {
    this.op = op;
  }
  
  @Pure
  public String getDest() {
    return this.dest;
  }
  
  public void setDest(final String dest) {
    this.dest = dest;
  }
  
  @Pure
  public String getArg1() {
    return this.arg1;
  }
  
  public void setArg1(final String arg1) {
    this.arg1 = arg1;
  }
  
  @Pure
  public String getArg2() {
    return this.arg2;
  }
  
  public void setArg2(final String arg2) {
    this.arg2 = arg2;
  }
}
