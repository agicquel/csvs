/**
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.csvs.util;

import com.agicquel.csvs.csvs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.agicquel.csvs.csvs.CsvsPackage
 * @generated
 */
public class CsvsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CsvsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CsvsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CsvsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CsvsSwitch<Adapter> modelSwitch =
    new CsvsSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseControlCommand(ControlCommand object)
      {
        return createControlCommandAdapter();
      }
      @Override
      public Adapter caseWhileCommand(WhileCommand object)
      {
        return createWhileCommandAdapter();
      }
      @Override
      public Adapter caseIfCommand(IfCommand object)
      {
        return createIfCommandAdapter();
      }
      @Override
      public Adapter caseCsvCommand(CsvCommand object)
      {
        return createCsvCommandAdapter();
      }
      @Override
      public Adapter caseLoadCommand(LoadCommand object)
      {
        return createLoadCommandAdapter();
      }
      @Override
      public Adapter caseStoreCommand(StoreCommand object)
      {
        return createStoreCommandAdapter();
      }
      @Override
      public Adapter caseExportCommand(ExportCommand object)
      {
        return createExportCommandAdapter();
      }
      @Override
      public Adapter caseCreateCommand(CreateCommand object)
      {
        return createCreateCommandAdapter();
      }
      @Override
      public Adapter caseSetCommand(SetCommand object)
      {
        return createSetCommandAdapter();
      }
      @Override
      public Adapter casePrintCommand(PrintCommand object)
      {
        return createPrintCommandAdapter();
      }
      @Override
      public Adapter caseDeleteCommand(DeleteCommand object)
      {
        return createDeleteCommandAdapter();
      }
      @Override
      public Adapter caseAddCommand(AddCommand object)
      {
        return createAddCommandAdapter();
      }
      @Override
      public Adapter caseRenameCommand(RenameCommand object)
      {
        return createRenameCommandAdapter();
      }
      @Override
      public Adapter caseApplyCommand(ApplyCommand object)
      {
        return createApplyCommandAdapter();
      }
      @Override
      public Adapter caseApplyFilterCommand(ApplyFilterCommand object)
      {
        return createApplyFilterCommandAdapter();
      }
      @Override
      public Adapter caseApplyExecCommand(ApplyExecCommand object)
      {
        return createApplyExecCommandAdapter();
      }
      @Override
      public Adapter caseMergeCommand(MergeCommand object)
      {
        return createMergeCommandAdapter();
      }
      @Override
      public Adapter caseConcatCommand(ConcatCommand object)
      {
        return createConcatCommandAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseOrExpr(OrExpr object)
      {
        return createOrExprAdapter();
      }
      @Override
      public Adapter caseAddExpr(AddExpr object)
      {
        return createAddExprAdapter();
      }
      @Override
      public Adapter caseEqualityExpr(EqualityExpr object)
      {
        return createEqualityExprAdapter();
      }
      @Override
      public Adapter caseComparaisonExpr(ComparaisonExpr object)
      {
        return createComparaisonExprAdapter();
      }
      @Override
      public Adapter casePlusOrMinusExpr(PlusOrMinusExpr object)
      {
        return createPlusOrMinusExprAdapter();
      }
      @Override
      public Adapter caseMulOrDivExpr(MulOrDivExpr object)
      {
        return createMulOrDivExprAdapter();
      }
      @Override
      public Adapter caseNotExpr(NotExpr object)
      {
        return createNotExprAdapter();
      }
      @Override
      public Adapter casePrimaryExpr(PrimaryExpr object)
      {
        return createPrimaryExprAdapter();
      }
      @Override
      public Adapter caseCsvsExpr(CsvsExpr object)
      {
        return createCsvsExprAdapter();
      }
      @Override
      public Adapter caseSelector(Selector object)
      {
        return createSelectorAdapter();
      }
      @Override
      public Adapter caseFieldSelect(FieldSelect object)
      {
        return createFieldSelectAdapter();
      }
      @Override
      public Adapter caseCountExpr(CountExpr object)
      {
        return createCountExprAdapter();
      }
      @Override
      public Adapter caseLastExpr(LastExpr object)
      {
        return createLastExprAdapter();
      }
      @Override
      public Adapter caseAtomicExpr(AtomicExpr object)
      {
        return createAtomicExprAdapter();
      }
      @Override
      public Adapter caseIntConstant(IntConstant object)
      {
        return createIntConstantAdapter();
      }
      @Override
      public Adapter caseDoubleConstant(DoubleConstant object)
      {
        return createDoubleConstantAdapter();
      }
      @Override
      public Adapter caseStringConstant(StringConstant object)
      {
        return createStringConstantAdapter();
      }
      @Override
      public Adapter caseBoolConstant(BoolConstant object)
      {
        return createBoolConstantAdapter();
      }
      @Override
      public Adapter caseVariableConstant(VariableConstant object)
      {
        return createVariableConstantAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.ControlCommand <em>Control Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.ControlCommand
   * @generated
   */
  public Adapter createControlCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.WhileCommand <em>While Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.WhileCommand
   * @generated
   */
  public Adapter createWhileCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.IfCommand <em>If Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.IfCommand
   * @generated
   */
  public Adapter createIfCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.CsvCommand <em>Csv Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.CsvCommand
   * @generated
   */
  public Adapter createCsvCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.LoadCommand <em>Load Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.LoadCommand
   * @generated
   */
  public Adapter createLoadCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.StoreCommand <em>Store Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.StoreCommand
   * @generated
   */
  public Adapter createStoreCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.ExportCommand <em>Export Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.ExportCommand
   * @generated
   */
  public Adapter createExportCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.CreateCommand <em>Create Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.CreateCommand
   * @generated
   */
  public Adapter createCreateCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.SetCommand <em>Set Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.SetCommand
   * @generated
   */
  public Adapter createSetCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.PrintCommand <em>Print Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.PrintCommand
   * @generated
   */
  public Adapter createPrintCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.DeleteCommand <em>Delete Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.DeleteCommand
   * @generated
   */
  public Adapter createDeleteCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.AddCommand <em>Add Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.AddCommand
   * @generated
   */
  public Adapter createAddCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.RenameCommand <em>Rename Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.RenameCommand
   * @generated
   */
  public Adapter createRenameCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.ApplyCommand <em>Apply Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.ApplyCommand
   * @generated
   */
  public Adapter createApplyCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.ApplyFilterCommand <em>Apply Filter Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.ApplyFilterCommand
   * @generated
   */
  public Adapter createApplyFilterCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.ApplyExecCommand <em>Apply Exec Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.ApplyExecCommand
   * @generated
   */
  public Adapter createApplyExecCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.MergeCommand <em>Merge Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.MergeCommand
   * @generated
   */
  public Adapter createMergeCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.ConcatCommand <em>Concat Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.ConcatCommand
   * @generated
   */
  public Adapter createConcatCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.OrExpr <em>Or Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.OrExpr
   * @generated
   */
  public Adapter createOrExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.AddExpr <em>Add Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.AddExpr
   * @generated
   */
  public Adapter createAddExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.EqualityExpr <em>Equality Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.EqualityExpr
   * @generated
   */
  public Adapter createEqualityExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.ComparaisonExpr <em>Comparaison Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.ComparaisonExpr
   * @generated
   */
  public Adapter createComparaisonExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.PlusOrMinusExpr <em>Plus Or Minus Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.PlusOrMinusExpr
   * @generated
   */
  public Adapter createPlusOrMinusExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.MulOrDivExpr <em>Mul Or Div Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.MulOrDivExpr
   * @generated
   */
  public Adapter createMulOrDivExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.NotExpr <em>Not Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.NotExpr
   * @generated
   */
  public Adapter createNotExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.PrimaryExpr <em>Primary Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.PrimaryExpr
   * @generated
   */
  public Adapter createPrimaryExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.CsvsExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.CsvsExpr
   * @generated
   */
  public Adapter createCsvsExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.Selector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.Selector
   * @generated
   */
  public Adapter createSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.FieldSelect <em>Field Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.FieldSelect
   * @generated
   */
  public Adapter createFieldSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.CountExpr <em>Count Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.CountExpr
   * @generated
   */
  public Adapter createCountExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.LastExpr <em>Last Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.LastExpr
   * @generated
   */
  public Adapter createLastExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.AtomicExpr <em>Atomic Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.AtomicExpr
   * @generated
   */
  public Adapter createAtomicExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.IntConstant
   * @generated
   */
  public Adapter createIntConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.DoubleConstant <em>Double Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.DoubleConstant
   * @generated
   */
  public Adapter createDoubleConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.StringConstant <em>String Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.StringConstant
   * @generated
   */
  public Adapter createStringConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.BoolConstant
   * @generated
   */
  public Adapter createBoolConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.agicquel.csvs.csvs.VariableConstant <em>Variable Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.agicquel.csvs.csvs.VariableConstant
   * @generated
   */
  public Adapter createVariableConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CsvsAdapterFactory
