/**
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.csvs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.agicquel.csvs.csvs.VariableExpr#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see com.agicquel.csvs.csvs.CsvsPackage#getVariableExpr()
 * @model
 * @generated
 */
public interface VariableExpr extends Expression
{
  /**
   * Returns the value of the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' attribute.
   * @see #setTerm(String)
   * @see com.agicquel.csvs.csvs.CsvsPackage#getVariableExpr_Term()
   * @model
   * @generated
   */
  String getTerm();

  /**
   * Sets the value of the '{@link com.agicquel.csvs.csvs.VariableExpr#getTerm <em>Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' attribute.
   * @see #getTerm()
   * @generated
   */
  void setTerm(String value);

} // VariableExpr