/**
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.csvs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.agicquel.csvs.csvs.OrExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link com.agicquel.csvs.csvs.OrExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.agicquel.csvs.csvs.CsvsPackage#getOrExpr()
 * @model
 * @generated
 */
public interface OrExpr extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(AddExpr)
   * @see com.agicquel.csvs.csvs.CsvsPackage#getOrExpr_Left()
   * @model containment="true"
   * @generated
   */
  AddExpr getLeft();

  /**
   * Sets the value of the '{@link com.agicquel.csvs.csvs.OrExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(AddExpr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link com.agicquel.csvs.csvs.AddExpr}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see com.agicquel.csvs.csvs.CsvsPackage#getOrExpr_Right()
   * @model containment="true"
   * @generated
   */
  EList<AddExpr> getRight();

} // OrExpr