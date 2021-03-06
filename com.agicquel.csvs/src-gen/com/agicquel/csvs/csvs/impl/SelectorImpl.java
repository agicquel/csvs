/**
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.csvs.impl;

import com.agicquel.csvs.csvs.CsvsExpr;
import com.agicquel.csvs.csvs.CsvsPackage;
import com.agicquel.csvs.csvs.Selector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.agicquel.csvs.csvs.impl.SelectorImpl#getVar <em>Var</em>}</li>
 *   <li>{@link com.agicquel.csvs.csvs.impl.SelectorImpl#getExpressionCol <em>Expression Col</em>}</li>
 *   <li>{@link com.agicquel.csvs.csvs.impl.SelectorImpl#getExpressionRow <em>Expression Row</em>}</li>
 *   <li>{@link com.agicquel.csvs.csvs.impl.SelectorImpl#getExpressionSubCol <em>Expression Sub Col</em>}</li>
 *   <li>{@link com.agicquel.csvs.csvs.impl.SelectorImpl#getExpressionSubRow <em>Expression Sub Row</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectorImpl extends CsvsExprImpl implements Selector
{
  /**
   * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected static final String VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected String var = VAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpressionCol() <em>Expression Col</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionCol()
   * @generated
   * @ordered
   */
  protected CsvsExpr expressionCol;

  /**
   * The cached value of the '{@link #getExpressionRow() <em>Expression Row</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionRow()
   * @generated
   * @ordered
   */
  protected CsvsExpr expressionRow;

  /**
   * The cached value of the '{@link #getExpressionSubCol() <em>Expression Sub Col</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionSubCol()
   * @generated
   * @ordered
   */
  protected CsvsExpr expressionSubCol;

  /**
   * The cached value of the '{@link #getExpressionSubRow() <em>Expression Sub Row</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionSubRow()
   * @generated
   * @ordered
   */
  protected CsvsExpr expressionSubRow;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CsvsPackage.Literals.SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVar(String newVar)
  {
    String oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvsPackage.SELECTOR__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CsvsExpr getExpressionCol()
  {
    return expressionCol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionCol(CsvsExpr newExpressionCol, NotificationChain msgs)
  {
    CsvsExpr oldExpressionCol = expressionCol;
    expressionCol = newExpressionCol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsvsPackage.SELECTOR__EXPRESSION_COL, oldExpressionCol, newExpressionCol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpressionCol(CsvsExpr newExpressionCol)
  {
    if (newExpressionCol != expressionCol)
    {
      NotificationChain msgs = null;
      if (expressionCol != null)
        msgs = ((InternalEObject)expressionCol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.SELECTOR__EXPRESSION_COL, null, msgs);
      if (newExpressionCol != null)
        msgs = ((InternalEObject)newExpressionCol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.SELECTOR__EXPRESSION_COL, null, msgs);
      msgs = basicSetExpressionCol(newExpressionCol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvsPackage.SELECTOR__EXPRESSION_COL, newExpressionCol, newExpressionCol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CsvsExpr getExpressionRow()
  {
    return expressionRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionRow(CsvsExpr newExpressionRow, NotificationChain msgs)
  {
    CsvsExpr oldExpressionRow = expressionRow;
    expressionRow = newExpressionRow;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsvsPackage.SELECTOR__EXPRESSION_ROW, oldExpressionRow, newExpressionRow);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpressionRow(CsvsExpr newExpressionRow)
  {
    if (newExpressionRow != expressionRow)
    {
      NotificationChain msgs = null;
      if (expressionRow != null)
        msgs = ((InternalEObject)expressionRow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.SELECTOR__EXPRESSION_ROW, null, msgs);
      if (newExpressionRow != null)
        msgs = ((InternalEObject)newExpressionRow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.SELECTOR__EXPRESSION_ROW, null, msgs);
      msgs = basicSetExpressionRow(newExpressionRow, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvsPackage.SELECTOR__EXPRESSION_ROW, newExpressionRow, newExpressionRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CsvsExpr getExpressionSubCol()
  {
    return expressionSubCol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionSubCol(CsvsExpr newExpressionSubCol, NotificationChain msgs)
  {
    CsvsExpr oldExpressionSubCol = expressionSubCol;
    expressionSubCol = newExpressionSubCol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsvsPackage.SELECTOR__EXPRESSION_SUB_COL, oldExpressionSubCol, newExpressionSubCol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpressionSubCol(CsvsExpr newExpressionSubCol)
  {
    if (newExpressionSubCol != expressionSubCol)
    {
      NotificationChain msgs = null;
      if (expressionSubCol != null)
        msgs = ((InternalEObject)expressionSubCol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.SELECTOR__EXPRESSION_SUB_COL, null, msgs);
      if (newExpressionSubCol != null)
        msgs = ((InternalEObject)newExpressionSubCol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.SELECTOR__EXPRESSION_SUB_COL, null, msgs);
      msgs = basicSetExpressionSubCol(newExpressionSubCol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvsPackage.SELECTOR__EXPRESSION_SUB_COL, newExpressionSubCol, newExpressionSubCol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CsvsExpr getExpressionSubRow()
  {
    return expressionSubRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionSubRow(CsvsExpr newExpressionSubRow, NotificationChain msgs)
  {
    CsvsExpr oldExpressionSubRow = expressionSubRow;
    expressionSubRow = newExpressionSubRow;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsvsPackage.SELECTOR__EXPRESSION_SUB_ROW, oldExpressionSubRow, newExpressionSubRow);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpressionSubRow(CsvsExpr newExpressionSubRow)
  {
    if (newExpressionSubRow != expressionSubRow)
    {
      NotificationChain msgs = null;
      if (expressionSubRow != null)
        msgs = ((InternalEObject)expressionSubRow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.SELECTOR__EXPRESSION_SUB_ROW, null, msgs);
      if (newExpressionSubRow != null)
        msgs = ((InternalEObject)newExpressionSubRow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.SELECTOR__EXPRESSION_SUB_ROW, null, msgs);
      msgs = basicSetExpressionSubRow(newExpressionSubRow, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvsPackage.SELECTOR__EXPRESSION_SUB_ROW, newExpressionSubRow, newExpressionSubRow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CsvsPackage.SELECTOR__EXPRESSION_COL:
        return basicSetExpressionCol(null, msgs);
      case CsvsPackage.SELECTOR__EXPRESSION_ROW:
        return basicSetExpressionRow(null, msgs);
      case CsvsPackage.SELECTOR__EXPRESSION_SUB_COL:
        return basicSetExpressionSubCol(null, msgs);
      case CsvsPackage.SELECTOR__EXPRESSION_SUB_ROW:
        return basicSetExpressionSubRow(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CsvsPackage.SELECTOR__VAR:
        return getVar();
      case CsvsPackage.SELECTOR__EXPRESSION_COL:
        return getExpressionCol();
      case CsvsPackage.SELECTOR__EXPRESSION_ROW:
        return getExpressionRow();
      case CsvsPackage.SELECTOR__EXPRESSION_SUB_COL:
        return getExpressionSubCol();
      case CsvsPackage.SELECTOR__EXPRESSION_SUB_ROW:
        return getExpressionSubRow();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CsvsPackage.SELECTOR__VAR:
        setVar((String)newValue);
        return;
      case CsvsPackage.SELECTOR__EXPRESSION_COL:
        setExpressionCol((CsvsExpr)newValue);
        return;
      case CsvsPackage.SELECTOR__EXPRESSION_ROW:
        setExpressionRow((CsvsExpr)newValue);
        return;
      case CsvsPackage.SELECTOR__EXPRESSION_SUB_COL:
        setExpressionSubCol((CsvsExpr)newValue);
        return;
      case CsvsPackage.SELECTOR__EXPRESSION_SUB_ROW:
        setExpressionSubRow((CsvsExpr)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CsvsPackage.SELECTOR__VAR:
        setVar(VAR_EDEFAULT);
        return;
      case CsvsPackage.SELECTOR__EXPRESSION_COL:
        setExpressionCol((CsvsExpr)null);
        return;
      case CsvsPackage.SELECTOR__EXPRESSION_ROW:
        setExpressionRow((CsvsExpr)null);
        return;
      case CsvsPackage.SELECTOR__EXPRESSION_SUB_COL:
        setExpressionSubCol((CsvsExpr)null);
        return;
      case CsvsPackage.SELECTOR__EXPRESSION_SUB_ROW:
        setExpressionSubRow((CsvsExpr)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CsvsPackage.SELECTOR__VAR:
        return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
      case CsvsPackage.SELECTOR__EXPRESSION_COL:
        return expressionCol != null;
      case CsvsPackage.SELECTOR__EXPRESSION_ROW:
        return expressionRow != null;
      case CsvsPackage.SELECTOR__EXPRESSION_SUB_COL:
        return expressionSubCol != null;
      case CsvsPackage.SELECTOR__EXPRESSION_SUB_ROW:
        return expressionSubRow != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (var: ");
    result.append(var);
    result.append(')');
    return result.toString();
  }

} //SelectorImpl
