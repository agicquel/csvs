/**
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.csvs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.agicquel.csvs.csvs.Program#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see com.agicquel.csvs.csvs.CsvsPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends Block
{
  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link com.agicquel.csvs.csvs.Command}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see com.agicquel.csvs.csvs.CsvsPackage#getProgram_Commands()
   * @model containment="true"
   * @generated
   */
  EList<Command> getCommands();

} // Program