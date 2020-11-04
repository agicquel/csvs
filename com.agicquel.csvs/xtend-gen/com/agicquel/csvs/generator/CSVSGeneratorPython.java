package com.agicquel.csvs.generator;

import com.agicquel.csvs.csvs.AddCommand;
import com.agicquel.csvs.csvs.AddExpr;
import com.agicquel.csvs.csvs.ApplyCommand;
import com.agicquel.csvs.csvs.ApplyFilterCommand;
import com.agicquel.csvs.csvs.AtomicExpr;
import com.agicquel.csvs.csvs.Block;
import com.agicquel.csvs.csvs.BoolConstant;
import com.agicquel.csvs.csvs.Command;
import com.agicquel.csvs.csvs.ComparaisonExpr;
import com.agicquel.csvs.csvs.ControlCommand;
import com.agicquel.csvs.csvs.CountExpr;
import com.agicquel.csvs.csvs.CreateCommand;
import com.agicquel.csvs.csvs.CsvCommand;
import com.agicquel.csvs.csvs.CsvsExpr;
import com.agicquel.csvs.csvs.DeleteCommand;
import com.agicquel.csvs.csvs.EqualityExpr;
import com.agicquel.csvs.csvs.ExportCommand;
import com.agicquel.csvs.csvs.Expression;
import com.agicquel.csvs.csvs.FieldSelect;
import com.agicquel.csvs.csvs.IfCommand;
import com.agicquel.csvs.csvs.IntConstant;
import com.agicquel.csvs.csvs.LastExpr;
import com.agicquel.csvs.csvs.LoadCommand;
import com.agicquel.csvs.csvs.Model;
import com.agicquel.csvs.csvs.MulOrDivExpr;
import com.agicquel.csvs.csvs.NotExpr;
import com.agicquel.csvs.csvs.OrExpr;
import com.agicquel.csvs.csvs.PlusOrMinusExpr;
import com.agicquel.csvs.csvs.PrimaryExpr;
import com.agicquel.csvs.csvs.PrintCommand;
import com.agicquel.csvs.csvs.RenameCommand;
import com.agicquel.csvs.csvs.Selector;
import com.agicquel.csvs.csvs.SetCommand;
import com.agicquel.csvs.csvs.StoreCommand;
import com.agicquel.csvs.csvs.StringConstant;
import com.agicquel.csvs.csvs.VariableConstant;
import com.agicquel.csvs.csvs.WhileCommand;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CSVSGeneratorPython {
  public String compileIR(final Resource resource) {
    String pythonCode = "import pandas as pd\n";
    String _pythonCode = pythonCode;
    pythonCode = (_pythonCode + "pd.options.mode.chained_assignment = None\n");
    String _pythonCode_1 = pythonCode;
    pythonCode = (_pythonCode_1 + "\n");
    String _pythonCode_2 = pythonCode;
    pythonCode = (_pythonCode_2 + "def len_csvs(obj):\r\n\tif hasattr(obj, \'__len__\'):\r\n\t\treturn len(obj)\r\n\telse:\r\n\t\treturn 1\n");
    String _pythonCode_3 = pythonCode;
    pythonCode = (_pythonCode_3 + "\n");
    Iterable<Model> _filter = Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class);
    for (final Model model : _filter) {
      EList<Command> _commands = model.getCommands();
      for (final Command command : _commands) {
        String _pythonCode_4 = pythonCode;
        String _compileCommand = this.compileCommand(command);
        String _plus = (_compileCommand + "\n");
        pythonCode = (_pythonCode_4 + _plus);
      }
    }
    return pythonCode;
  }
  
  private String _compileCommand(final CsvCommand csvCommand) {
    return this.compileCommand(csvCommand);
  }
  
  private String _compileCommand(final ControlCommand controlCommand) {
    return this.compileCommand(controlCommand);
  }
  
  private String _compileCommand(final LoadCommand loadCommand) {
    String _var = loadCommand.getVar();
    String _plus = (_var + " = pd.read_csv(\'");
    String _path = loadCommand.getPath();
    String _plus_1 = (_plus + _path);
    return (_plus_1 + "\')");
  }
  
  private String _compileCommand(final StoreCommand storeCommand) {
    String _var = storeCommand.getVar();
    String _plus = (_var + ".to_csv(r\'");
    String _path = storeCommand.getPath();
    String _plus_1 = (_plus + _path);
    return (_plus_1 + "\', index=False)");
  }
  
  private String _compileCommand(final CreateCommand createCommand) {
    String _var = createCommand.getVar();
    return (_var + " = pd.DataFrame()");
  }
  
  private String _compileCommand(final SetCommand setCommand) {
    String ret = this.compileExpr(setCommand.getVar());
    String _ret = ret;
    String _compileExpr = this.compileExpr(setCommand.getExpression());
    String _plus = (" = " + _compileExpr);
    ret = (_ret + _plus);
    return ret;
  }
  
  private String _compileCommand(final PrintCommand printCommand) {
    String _compileExpr = this.compileExpr(printCommand.getExpression());
    String _plus = ("print(str(" + _compileExpr);
    return (_plus + "))");
  }
  
  private String _compileCommand(final ExportCommand exportCommand) {
    String _var = exportCommand.getVar();
    String _plus = (_var + ".to_json(r\'");
    String _path = exportCommand.getPath();
    String _plus_1 = (_plus + _path);
    return (_plus_1 + "\')");
  }
  
  private String _compileCommand(final DeleteCommand deleteCommand) {
    String _compileExpr = this.compileExpr(deleteCommand.getExpression());
    return ("del " + _compileExpr);
  }
  
  private String _compileCommand(final AddCommand addCommand) {
    try {
      boolean _equals = addCommand.getOp().equals("row");
      if (_equals) {
        String _compileExpr = this.compileExpr(addCommand.getExpression());
        return (_compileExpr + ".iloc[-1] = None ");
      } else {
        boolean _equals_1 = addCommand.getOp().equals("col");
        if (_equals_1) {
          String _compileExpr_1 = this.compileExpr(addCommand.getExpression());
          String _plus = (_compileExpr_1 + "[str(len(");
          String _compileExpr_2 = this.compileExpr(addCommand.getExpression());
          String _plus_1 = (_plus + _compileExpr_2);
          return (_plus_1 + ".columns)+1)] = None");
        } else {
          throw new Exception("Wrong add command");
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private String _compileCommand(final RenameCommand renameCommand) {
    String _compileExpr = this.compileExpr(renameCommand.getExpr());
    String _plus = (_compileExpr + ".rename(columns = {");
    String _compileExpr_1 = this.compileExpr(renameCommand.getOldname());
    String _plus_1 = (_plus + _compileExpr_1);
    String _plus_2 = (_plus_1 + ":");
    String _compileExpr_2 = this.compileExpr(renameCommand.getNewname());
    String _plus_3 = (_plus_2 + _compileExpr_2);
    return (_plus_3 + "}, inplace = True)");
  }
  
  private String _compileCommand(final ApplyCommand applyCommand) {
    String name = this.compileExpr(applyCommand.getSelection()).toString().split("\\[")[0];
    String ret = "";
    String _ret = ret;
    ret = (_ret + "try:\n");
    String _ret_1 = ret;
    String _compileExpr = this.compileExpr(applyCommand.getSelection());
    String _plus = ("\tcsv_index = " + _compileExpr);
    String _plus_1 = (_plus + ".index\n");
    ret = (_ret_1 + _plus_1);
    String _ret_2 = ret;
    String _compileExpr_1 = this.compileExpr(applyCommand.getSelection());
    String _plus_2 = ("\tcsv_columns = " + _compileExpr_1);
    String _plus_3 = (_plus_2 + ".columns\n");
    ret = (_ret_2 + _plus_3);
    String _ret_3 = ret;
    ret = (_ret_3 + "except:\n");
    String _ret_4 = ret;
    String _compileExpr_2 = this.compileExpr(applyCommand.getSelection());
    String _plus_4 = ("\tcsv_index = " + _compileExpr_2);
    String _plus_5 = (_plus_4 + ".to_frame().index\n");
    ret = (_ret_4 + _plus_5);
    String _ret_5 = ret;
    String _compileExpr_3 = this.compileExpr(applyCommand.getSelection());
    String _plus_6 = ("\tcsv_columns = " + _compileExpr_3);
    String _plus_7 = (_plus_6 + ".to_frame().columns\n");
    ret = (_ret_5 + _plus_7);
    String _ret_6 = ret;
    ret = (_ret_6 + "for csv_row_index in csv_index:\n");
    String _ret_7 = ret;
    ret = (_ret_7 + "\tfor csv_col_name in csv_columns:\n");
    String _ret_8 = ret;
    ret = (_ret_8 + "\t\t");
    ApplyFilterCommand _if = applyCommand.getIf();
    boolean _tripleNotEquals = (_if != null);
    if (_tripleNotEquals) {
      String _ret_9 = ret;
      String _varName = applyCommand.getIf().getVarName();
      String _plus_8 = (_varName + " = ");
      String _plus_9 = (_plus_8 + name);
      String _plus_10 = (_plus_9 + "[csv_col_name][csv_row_index]\n");
      ret = (_ret_9 + _plus_10);
      String _ret_10 = ret;
      ret = (_ret_10 + "\t\t");
      String _ret_11 = ret;
      String _compileExpr_4 = this.compileExpr(applyCommand.getIf().getExpr());
      String _plus_11 = ("if not (" + _compileExpr_4);
      String _plus_12 = (_plus_11 + "):\n");
      ret = (_ret_11 + _plus_12);
      String _ret_12 = ret;
      ret = (_ret_12 + "\t\t\t");
      String _ret_13 = ret;
      ret = (_ret_13 + "continue\n");
      String _ret_14 = ret;
      ret = (_ret_14 + "\t\t");
    }
    String _ret_15 = ret;
    String _varName_1 = applyCommand.getExec().getVarName();
    String _plus_13 = (_varName_1 + " = ");
    String _plus_14 = (_plus_13 + name);
    String _plus_15 = (_plus_14 + "[csv_col_name][csv_row_index]\n");
    ret = (_ret_15 + _plus_15);
    String _ret_16 = ret;
    ret = (_ret_16 + "\t\t");
    String _ret_17 = ret;
    String _varName_2 = applyCommand.getExec().getVarName();
    String _plus_16 = (_varName_2 + " = ");
    String _compileExpr_5 = this.compileExpr(applyCommand.getExec().getExpr());
    String _plus_17 = (_plus_16 + _compileExpr_5);
    String _plus_18 = (_plus_17 + "\n");
    ret = (_ret_17 + _plus_18);
    String _ret_18 = ret;
    ret = (_ret_18 + "\t\t");
    String _ret_19 = ret;
    String _varName_3 = applyCommand.getExec().getVarName();
    String _plus_19 = ((name + "[csv_col_name][csv_row_index] = ") + _varName_3);
    String _plus_20 = (_plus_19 + "\n");
    ret = (_ret_19 + _plus_20);
    return ret;
  }
  
  private String compileBlock(final Block block) {
    String blockString = "";
    EList<Command> _commands = block.getCommands();
    for (final Command com : _commands) {
      {
        String comString = this.compileCommand(com);
        String[] _split = comString.toString().split(System.getProperty("line.separator"));
        for (final String s : _split) {
          String _blockString = blockString;
          blockString = (_blockString + (("\t" + s) + "\n"));
        }
      }
    }
    return blockString;
  }
  
  private String _compileCommand(final WhileCommand whileCommand) {
    String _compileExpr = this.compileExpr(whileCommand.getCond());
    String _plus = ("while " + _compileExpr);
    String _plus_1 = (_plus + ":\n");
    String _compileBlock = this.compileBlock(whileCommand.getBody());
    return (_plus_1 + _compileBlock);
  }
  
  private String _compileCommand(final IfCommand ifCommand) {
    String _compileExpr = this.compileExpr(ifCommand.getCond());
    String _plus = ("if " + _compileExpr);
    String _plus_1 = (_plus + ":\n");
    String _compileBlock = this.compileBlock(ifCommand.getThenBody());
    String _plus_2 = (_plus_1 + _compileBlock);
    String _xifexpression = null;
    Block _elseBody = ifCommand.getElseBody();
    boolean _tripleEquals = (_elseBody == null);
    if (_tripleEquals) {
      _xifexpression = "";
    } else {
      String _compileBlock_1 = this.compileBlock(ifCommand.getElseBody());
      _xifexpression = ("\nelse:\n" + _compileBlock_1);
    }
    return (_plus_2 + _xifexpression);
  }
  
  private String _compileExpr(final Expression expression) {
    return this.compileExpr(expression);
  }
  
  private String _compileExpr(final OrExpr orExpr) {
    String code = this.compileExpr(orExpr.getLeft());
    EList<AddExpr> _right = orExpr.getRight();
    for (final AddExpr right : _right) {
      String _code = code;
      String _compileExpr = this.compileExpr(right);
      String _plus = (" or " + _compileExpr);
      code = (_code + _plus);
    }
    return code;
  }
  
  private String _compileExpr(final AddExpr addExpr) {
    String code = this.compileExpr(addExpr.getLeft());
    EList<EqualityExpr> _right = addExpr.getRight();
    for (final EqualityExpr right : _right) {
      String _code = code;
      String _compileExpr = this.compileExpr(right);
      String _plus = (" and " + _compileExpr);
      code = (_code + _plus);
    }
    return code;
  }
  
  private String _compileExpr(final EqualityExpr equalityExpr) {
    String _compileExpr = this.compileExpr(equalityExpr.getLeft());
    String _xifexpression = null;
    ComparaisonExpr _right = equalityExpr.getRight();
    boolean _tripleEquals = (_right == null);
    if (_tripleEquals) {
      _xifexpression = "";
    } else {
      String _op = equalityExpr.getOp();
      String _plus = (" " + _op);
      String _plus_1 = (_plus + " ");
      String _compileExpr_1 = this.compileExpr(equalityExpr.getRight());
      _xifexpression = (_plus_1 + _compileExpr_1);
    }
    return (_compileExpr + _xifexpression);
  }
  
  private String _compileExpr(final ComparaisonExpr comparaisonExpr) {
    String _compileExpr = this.compileExpr(comparaisonExpr.getLeft());
    String _xifexpression = null;
    PlusOrMinusExpr _right = comparaisonExpr.getRight();
    boolean _tripleEquals = (_right == null);
    if (_tripleEquals) {
      _xifexpression = "";
    } else {
      String _op = comparaisonExpr.getOp();
      String _plus = (" " + _op);
      String _plus_1 = (_plus + " ");
      String _compileExpr_1 = this.compileExpr(comparaisonExpr.getRight());
      _xifexpression = (_plus_1 + _compileExpr_1);
    }
    return (_compileExpr + _xifexpression);
  }
  
  private String _compileExpr(final PlusOrMinusExpr comparaisonExpr) {
    String code = this.compileExpr(comparaisonExpr.getLeft());
    int _size = comparaisonExpr.getRight().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      String _code = code;
      String _get = comparaisonExpr.getOp().get((i).intValue());
      String _plus = (" " + _get);
      String _plus_1 = (_plus + " ");
      String _compileExpr = this.compileExpr(comparaisonExpr.getRight().get((i).intValue()));
      String _plus_2 = (_plus_1 + _compileExpr);
      code = (_code + _plus_2);
    }
    return code;
  }
  
  private String _compileExpr(final MulOrDivExpr mulOrDivExpr) {
    String code = this.compileExpr(mulOrDivExpr.getLeft());
    int _size = mulOrDivExpr.getRight().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      String _code = code;
      String _get = mulOrDivExpr.getOp().get((i).intValue());
      String _plus = (" " + _get);
      String _plus_1 = (_plus + " ");
      String _compileExpr = this.compileExpr(mulOrDivExpr.getRight().get((i).intValue()));
      String _plus_2 = (_plus_1 + _compileExpr);
      code = (_code + _plus_2);
    }
    return code;
  }
  
  private String _compileExpr(final PrimaryExpr primaryExpr) {
    return this.compileExpr(primaryExpr);
  }
  
  private String _compileExpr(final NotExpr notExpr) {
    String _compileExpr = this.compileExpr(notExpr.getExpr());
    return ("not " + _compileExpr);
  }
  
  private String _compileExpr(final AtomicExpr atomicExpr) {
    return this.compileExpr(atomicExpr);
  }
  
  private String _compileExpr(final IntConstant intConstant) {
    return Integer.valueOf(intConstant.getValue()).toString();
  }
  
  private String _compileExpr(final StringConstant stringConstant) {
    String _value = stringConstant.getValue();
    String _plus = ("\"" + _value);
    return (_plus + "\"");
  }
  
  private String _compileExpr(final BoolConstant boolConstant) {
    String _upperCase = boolConstant.getValue().substring(0, 1).toUpperCase();
    String _substring = boolConstant.getValue().substring(1);
    return (_upperCase + _substring);
  }
  
  private String _compileExpr(final VariableConstant variableConstant) {
    return variableConstant.getValue().toString();
  }
  
  private String _compileExpr(final CsvsExpr csvsExpr) {
    String _xblockexpression = null;
    {
      InputOutput.<String>print("csv expr");
      _xblockexpression = this.compileExpr(csvsExpr);
    }
    return _xblockexpression;
  }
  
  private String _compileExpr(final CountExpr countExpr) {
    String _compileExpr = this.compileExpr(countExpr.getExpression());
    String _plus = ("len_csvs(" + _compileExpr);
    return (_plus + ")");
  }
  
  private String _compileExpr(final Selector cellSelect) {
    try {
      String ret = cellSelect.getVar();
      String _xifexpression = null;
      CsvsExpr _expressionRow = cellSelect.getExpressionRow();
      boolean _tripleNotEquals = (_expressionRow != null);
      if (_tripleNotEquals) {
        _xifexpression = this.compileExpr(cellSelect.getExpressionRow());
      } else {
        _xifexpression = null;
      }
      String row = _xifexpression;
      String _xifexpression_1 = null;
      CsvsExpr _expressionCol = cellSelect.getExpressionCol();
      boolean _tripleNotEquals_1 = (_expressionCol != null);
      if (_tripleNotEquals_1) {
        _xifexpression_1 = this.compileExpr(cellSelect.getExpressionCol());
      } else {
        _xifexpression_1 = null;
      }
      String col = _xifexpression_1;
      String _xifexpression_2 = null;
      CsvsExpr _expressionSubRow = cellSelect.getExpressionSubRow();
      boolean _tripleNotEquals_2 = (_expressionSubRow != null);
      if (_tripleNotEquals_2) {
        _xifexpression_2 = this.compileExpr(cellSelect.getExpressionSubRow());
      } else {
        _xifexpression_2 = null;
      }
      String subrow = _xifexpression_2;
      String _xifexpression_3 = null;
      CsvsExpr _expressionSubCol = cellSelect.getExpressionSubCol();
      boolean _tripleNotEquals_3 = (_expressionSubCol != null);
      if (_tripleNotEquals_3) {
        _xifexpression_3 = this.compileExpr(cellSelect.getExpressionSubCol());
      } else {
        _xifexpression_3 = null;
      }
      String subcol = _xifexpression_3;
      if (((subrow != null) || (subcol != null))) {
        if (((((row == null) || (subrow == null)) || (col == null)) || (subcol == null))) {
          throw new Exception("Wrong subset selection");
        }
        String _ret = ret;
        ret = (_ret + ((((((((".iloc[" + row) + ":") + subrow) + ", ") + col) + ":") + subcol) + "]"));
      } else {
        if (((row == null) && (col == null))) {
          throw new Exception("Wrong cell selection.");
        } else {
          if (((row != null) && (col == null))) {
            String _ret_1 = ret;
            ret = (_ret_1 + ((".loc[" + row) + "]"));
          } else {
            if ((col != null)) {
              if (((cellSelect.getExpressionCol() instanceof StringConstant) || (cellSelect.getExpressionCol() instanceof VariableConstant))) {
                String _ret_2 = ret;
                ret = (_ret_2 + (("[" + col) + "]"));
              } else {
                CsvsExpr _expressionCol_1 = cellSelect.getExpressionCol();
                if ((_expressionCol_1 instanceof IntConstant)) {
                  String _ret_3 = ret;
                  String _var = cellSelect.getVar();
                  String _plus = ("[" + _var);
                  String _plus_1 = (_plus + ".columns[");
                  String _plus_2 = (_plus_1 + col);
                  String _plus_3 = (_plus_2 + "]]");
                  ret = (_ret_3 + _plus_3);
                } else {
                  throw new Exception("Wrong column type.");
                }
              }
              if ((row != null)) {
                String _ret_4 = ret;
                ret = (_ret_4 + (("[" + row) + "]"));
              }
            }
          }
        }
      }
      return ret;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private String _compileExpr(final FieldSelect fieldSelect) {
    String _var = fieldSelect.getVar();
    String _plus = (_var + ".columns[");
    String _compileExpr = this.compileExpr(fieldSelect.getExpression());
    String _plus_1 = (_plus + _compileExpr);
    return (_plus_1 + "]");
  }
  
  private String _compileExpr(final LastExpr lastExpr) {
    try {
      boolean _equals = lastExpr.getOp().equals("row");
      if (_equals) {
        String _compileExpr = this.compileExpr(lastExpr.getExpression());
        String _plus = ("(len_csvs(" + _compileExpr);
        return (_plus + ".index) - 1)");
      } else {
        boolean _equals_1 = lastExpr.getOp().equals("col");
        if (_equals_1) {
          String _compileExpr_1 = this.compileExpr(lastExpr.getExpression());
          String _plus_1 = ("(len_csvs(" + _compileExpr_1);
          return (_plus_1 + ".columns) - 1)");
        } else {
          throw new Exception("Wrong add command");
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private String compileCommand(final Command addCommand) {
    if (addCommand instanceof AddCommand) {
      return _compileCommand((AddCommand)addCommand);
    } else if (addCommand instanceof ApplyCommand) {
      return _compileCommand((ApplyCommand)addCommand);
    } else if (addCommand instanceof CreateCommand) {
      return _compileCommand((CreateCommand)addCommand);
    } else if (addCommand instanceof DeleteCommand) {
      return _compileCommand((DeleteCommand)addCommand);
    } else if (addCommand instanceof ExportCommand) {
      return _compileCommand((ExportCommand)addCommand);
    } else if (addCommand instanceof IfCommand) {
      return _compileCommand((IfCommand)addCommand);
    } else if (addCommand instanceof LoadCommand) {
      return _compileCommand((LoadCommand)addCommand);
    } else if (addCommand instanceof PrintCommand) {
      return _compileCommand((PrintCommand)addCommand);
    } else if (addCommand instanceof RenameCommand) {
      return _compileCommand((RenameCommand)addCommand);
    } else if (addCommand instanceof SetCommand) {
      return _compileCommand((SetCommand)addCommand);
    } else if (addCommand instanceof StoreCommand) {
      return _compileCommand((StoreCommand)addCommand);
    } else if (addCommand instanceof WhileCommand) {
      return _compileCommand((WhileCommand)addCommand);
    } else if (addCommand instanceof ControlCommand) {
      return _compileCommand((ControlCommand)addCommand);
    } else if (addCommand instanceof CsvCommand) {
      return _compileCommand((CsvCommand)addCommand);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(addCommand).toString());
    }
  }
  
  private String compileExpr(final EObject boolConstant) {
    if (boolConstant instanceof BoolConstant) {
      return _compileExpr((BoolConstant)boolConstant);
    } else if (boolConstant instanceof IntConstant) {
      return _compileExpr((IntConstant)boolConstant);
    } else if (boolConstant instanceof StringConstant) {
      return _compileExpr((StringConstant)boolConstant);
    } else if (boolConstant instanceof VariableConstant) {
      return _compileExpr((VariableConstant)boolConstant);
    } else if (boolConstant instanceof AtomicExpr) {
      return _compileExpr((AtomicExpr)boolConstant);
    } else if (boolConstant instanceof CountExpr) {
      return _compileExpr((CountExpr)boolConstant);
    } else if (boolConstant instanceof FieldSelect) {
      return _compileExpr((FieldSelect)boolConstant);
    } else if (boolConstant instanceof LastExpr) {
      return _compileExpr((LastExpr)boolConstant);
    } else if (boolConstant instanceof OrExpr) {
      return _compileExpr((OrExpr)boolConstant);
    } else if (boolConstant instanceof Selector) {
      return _compileExpr((Selector)boolConstant);
    } else if (boolConstant instanceof CsvsExpr) {
      return _compileExpr((CsvsExpr)boolConstant);
    } else if (boolConstant instanceof Expression) {
      return _compileExpr((Expression)boolConstant);
    } else if (boolConstant instanceof NotExpr) {
      return _compileExpr((NotExpr)boolConstant);
    } else if (boolConstant instanceof AddExpr) {
      return _compileExpr((AddExpr)boolConstant);
    } else if (boolConstant instanceof ComparaisonExpr) {
      return _compileExpr((ComparaisonExpr)boolConstant);
    } else if (boolConstant instanceof EqualityExpr) {
      return _compileExpr((EqualityExpr)boolConstant);
    } else if (boolConstant instanceof MulOrDivExpr) {
      return _compileExpr((MulOrDivExpr)boolConstant);
    } else if (boolConstant instanceof PlusOrMinusExpr) {
      return _compileExpr((PlusOrMinusExpr)boolConstant);
    } else if (boolConstant instanceof PrimaryExpr) {
      return _compileExpr((PrimaryExpr)boolConstant);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(boolConstant).toString());
    }
  }
}
