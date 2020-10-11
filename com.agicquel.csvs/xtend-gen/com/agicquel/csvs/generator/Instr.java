package com.agicquel.csvs.generator;

import com.agicquel.csvs.generator.Quad;
import java.util.ArrayList;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Instr {
  @Accessors
  private String place;
  
  @Accessors
  private ArrayList<Quad> code;
  
  public Instr(final String place, final Quad code) {
    this.place = place;
    this.code = CollectionLiterals.<Quad>newArrayList();
    this.code.add(code);
  }
  
  public Instr(final String place, final ArrayList<Quad> code) {
    this.place = place;
    this.code = code;
  }
  
  public Instr() {
    this.place = "";
    this.code = CollectionLiterals.<Quad>newArrayList();
  }
  
  @Override
  public String toString() {
    String res = (("\nplace = " + this.place) + " | code : \n");
    for (final Quad q : this.code) {
      String _res = res;
      String _string = q.toString();
      String _plus = ("\t" + _string);
      String _plus_1 = (_plus + "\n");
      res = (_res + _plus_1);
    }
    return res;
  }
  
  @Pure
  public String getPlace() {
    return this.place;
  }
  
  public void setPlace(final String place) {
    this.place = place;
  }
  
  @Pure
  public ArrayList<Quad> getCode() {
    return this.code;
  }
  
  public void setCode(final ArrayList<Quad> code) {
    this.code = code;
  }
}
