/**
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.csvs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.agicquel.csvs.csvs.WhileCommand#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see com.agicquel.csvs.csvs.CsvsPackage#getWhileCommand()
 * @model
 * @generated
 */
public interface WhileCommand extends ControlCommand
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Block)
   * @see com.agicquel.csvs.csvs.CsvsPackage#getWhileCommand_Body()
   * @model containment="true"
   * @generated
   */
  Block getBody();

  /**
   * Sets the value of the '{@link com.agicquel.csvs.csvs.WhileCommand#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Block value);

} // WhileCommand
