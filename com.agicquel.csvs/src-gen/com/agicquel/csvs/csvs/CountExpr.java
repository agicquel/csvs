/**
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.csvs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.agicquel.csvs.csvs.CountExpr#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.agicquel.csvs.csvs.CsvsPackage#getCountExpr()
 * @model
 * @generated
 */
public interface CountExpr extends CsvsExpr
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(PrimaryExpr)
   * @see com.agicquel.csvs.csvs.CsvsPackage#getCountExpr_Expression()
   * @model containment="true"
   * @generated
   */
  PrimaryExpr getExpression();

  /**
   * Sets the value of the '{@link com.agicquel.csvs.csvs.CountExpr#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(PrimaryExpr value);

} // CountExpr
