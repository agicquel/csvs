/**
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.csvs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.agicquel.csvs.csvs.MergeCommand#getSelection1 <em>Selection1</em>}</li>
 *   <li>{@link com.agicquel.csvs.csvs.MergeCommand#getSelection2 <em>Selection2</em>}</li>
 * </ul>
 *
 * @see com.agicquel.csvs.csvs.CsvsPackage#getMergeCommand()
 * @model
 * @generated
 */
public interface MergeCommand extends CsvCommand
{
  /**
   * Returns the value of the '<em><b>Selection1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection1</em>' containment reference.
   * @see #setSelection1(CsvsExpr)
   * @see com.agicquel.csvs.csvs.CsvsPackage#getMergeCommand_Selection1()
   * @model containment="true"
   * @generated
   */
  CsvsExpr getSelection1();

  /**
   * Sets the value of the '{@link com.agicquel.csvs.csvs.MergeCommand#getSelection1 <em>Selection1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection1</em>' containment reference.
   * @see #getSelection1()
   * @generated
   */
  void setSelection1(CsvsExpr value);

  /**
   * Returns the value of the '<em><b>Selection2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection2</em>' containment reference.
   * @see #setSelection2(CsvsExpr)
   * @see com.agicquel.csvs.csvs.CsvsPackage#getMergeCommand_Selection2()
   * @model containment="true"
   * @generated
   */
  CsvsExpr getSelection2();

  /**
   * Sets the value of the '{@link com.agicquel.csvs.csvs.MergeCommand#getSelection2 <em>Selection2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection2</em>' containment reference.
   * @see #getSelection2()
   * @generated
   */
  void setSelection2(CsvsExpr value);

} // MergeCommand
