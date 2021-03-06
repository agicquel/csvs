/**
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.csvs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.agicquel.csvs.csvs.NotExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see com.agicquel.csvs.csvs.CsvsPackage#getNotExpr()
 * @model
 * @generated
 */
public interface NotExpr extends PrimaryExpr
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(PrimaryExpr)
   * @see com.agicquel.csvs.csvs.CsvsPackage#getNotExpr_Expr()
   * @model containment="true"
   * @generated
   */
  PrimaryExpr getExpr();

  /**
   * Sets the value of the '{@link com.agicquel.csvs.csvs.NotExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(PrimaryExpr value);

} // NotExpr
