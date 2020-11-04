/**
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.csvs.impl;

import com.agicquel.csvs.csvs.CsvsExpr;
import com.agicquel.csvs.csvs.CsvsPackage;
import com.agicquel.csvs.csvs.Expression;
import com.agicquel.csvs.csvs.RenameCommand;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.agicquel.csvs.csvs.impl.RenameCommandImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.agicquel.csvs.csvs.impl.RenameCommandImpl#getOldname <em>Oldname</em>}</li>
 *   <li>{@link com.agicquel.csvs.csvs.impl.RenameCommandImpl#getNewname <em>Newname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameCommandImpl extends CsvCommandImpl implements RenameCommand
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected CsvsExpr expr;

  /**
   * The cached value of the '{@link #getOldname() <em>Oldname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldname()
   * @generated
   * @ordered
   */
  protected Expression oldname;

  /**
   * The cached value of the '{@link #getNewname() <em>Newname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewname()
   * @generated
   * @ordered
   */
  protected Expression newname;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RenameCommandImpl()
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
    return CsvsPackage.Literals.RENAME_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CsvsExpr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(CsvsExpr newExpr, NotificationChain msgs)
  {
    CsvsExpr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsvsPackage.RENAME_COMMAND__EXPR, oldExpr, newExpr);
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
  public void setExpr(CsvsExpr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.RENAME_COMMAND__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.RENAME_COMMAND__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvsPackage.RENAME_COMMAND__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getOldname()
  {
    return oldname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOldname(Expression newOldname, NotificationChain msgs)
  {
    Expression oldOldname = oldname;
    oldname = newOldname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsvsPackage.RENAME_COMMAND__OLDNAME, oldOldname, newOldname);
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
  public void setOldname(Expression newOldname)
  {
    if (newOldname != oldname)
    {
      NotificationChain msgs = null;
      if (oldname != null)
        msgs = ((InternalEObject)oldname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.RENAME_COMMAND__OLDNAME, null, msgs);
      if (newOldname != null)
        msgs = ((InternalEObject)newOldname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.RENAME_COMMAND__OLDNAME, null, msgs);
      msgs = basicSetOldname(newOldname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvsPackage.RENAME_COMMAND__OLDNAME, newOldname, newOldname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getNewname()
  {
    return newname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewname(Expression newNewname, NotificationChain msgs)
  {
    Expression oldNewname = newname;
    newname = newNewname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsvsPackage.RENAME_COMMAND__NEWNAME, oldNewname, newNewname);
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
  public void setNewname(Expression newNewname)
  {
    if (newNewname != newname)
    {
      NotificationChain msgs = null;
      if (newname != null)
        msgs = ((InternalEObject)newname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.RENAME_COMMAND__NEWNAME, null, msgs);
      if (newNewname != null)
        msgs = ((InternalEObject)newNewname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsvsPackage.RENAME_COMMAND__NEWNAME, null, msgs);
      msgs = basicSetNewname(newNewname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CsvsPackage.RENAME_COMMAND__NEWNAME, newNewname, newNewname));
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
      case CsvsPackage.RENAME_COMMAND__EXPR:
        return basicSetExpr(null, msgs);
      case CsvsPackage.RENAME_COMMAND__OLDNAME:
        return basicSetOldname(null, msgs);
      case CsvsPackage.RENAME_COMMAND__NEWNAME:
        return basicSetNewname(null, msgs);
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
      case CsvsPackage.RENAME_COMMAND__EXPR:
        return getExpr();
      case CsvsPackage.RENAME_COMMAND__OLDNAME:
        return getOldname();
      case CsvsPackage.RENAME_COMMAND__NEWNAME:
        return getNewname();
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
      case CsvsPackage.RENAME_COMMAND__EXPR:
        setExpr((CsvsExpr)newValue);
        return;
      case CsvsPackage.RENAME_COMMAND__OLDNAME:
        setOldname((Expression)newValue);
        return;
      case CsvsPackage.RENAME_COMMAND__NEWNAME:
        setNewname((Expression)newValue);
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
      case CsvsPackage.RENAME_COMMAND__EXPR:
        setExpr((CsvsExpr)null);
        return;
      case CsvsPackage.RENAME_COMMAND__OLDNAME:
        setOldname((Expression)null);
        return;
      case CsvsPackage.RENAME_COMMAND__NEWNAME:
        setNewname((Expression)null);
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
      case CsvsPackage.RENAME_COMMAND__EXPR:
        return expr != null;
      case CsvsPackage.RENAME_COMMAND__OLDNAME:
        return oldname != null;
      case CsvsPackage.RENAME_COMMAND__NEWNAME:
        return newname != null;
    }
    return super.eIsSet(featureID);
  }

} //RenameCommandImpl