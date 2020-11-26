package com.agicquel.csvs.generator;

import com.agicquel.csvs.csvs.AddCommand;
import com.agicquel.csvs.csvs.AddExpr;
import com.agicquel.csvs.csvs.ApplyCommand;
import com.agicquel.csvs.csvs.AtomicExpr;
import com.agicquel.csvs.csvs.Block;
import com.agicquel.csvs.csvs.BoolConstant;
import com.agicquel.csvs.csvs.Command;
import com.agicquel.csvs.csvs.ComparaisonExpr;
import com.agicquel.csvs.csvs.ConcatCommand;
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
import com.agicquel.csvs.csvs.MergeCommand;
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
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CSVSGeneratorBash extends AbstractGenerator {
  private String output;
  
  public CSVSGeneratorBash() {
    this.output = "output.sh";
  }
  
  public CSVSGeneratorBash(final String output) {
    this.output = output;
  }
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile(this.output, this.compile(input));
  }
  
  private String compile(final Resource resource) {
    try {
      String bashCode = Files.readString(Path.of("/home/agicquel/workspace/CsvDslProject/com.agicquel.csvs/src/com/agicquel/csvs/generator/bash_lib"));
      String _bashCode = bashCode;
      bashCode = (_bashCode + "\n");
      Iterable<Model> _filter = Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class);
      for (final Model model : _filter) {
        EList<Command> _commands = model.getCommands();
        for (final Command command : _commands) {
          String _bashCode_1 = bashCode;
          String _compileCommand = this.compileCommand(command);
          String _plus = (_compileCommand + "\n");
          bashCode = (_bashCode_1 + _plus);
        }
      }
      return bashCode;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private String _compileCommand(final CsvCommand csvCommand) {
    return this.compileCommand(csvCommand);
  }
  
  private String _compileCommand(final ControlCommand controlCommand) {
    return this.compileCommand(controlCommand);
  }
  
  private String _compileCommand(final LoadCommand loadCommand) {
    String _var = loadCommand.getVar();
    String _plus = ("declare -A " + _var);
    String _plus_1 = (_plus + "\n");
    String _plus_2 = (_plus_1 + "read_csv_array ");
    String _var_1 = loadCommand.getVar();
    String _plus_3 = (_plus_2 + _var_1);
    String _plus_4 = (_plus_3 + " ");
    String _path = loadCommand.getPath();
    return (_plus_4 + _path);
  }
  
  private String _compileCommand(final StoreCommand storeCommand) {
    String _var = storeCommand.getVar();
    String _plus = ("print_all " + _var);
    String _plus_1 = (_plus + " > ");
    String _path = storeCommand.getPath();
    return (_plus_1 + _path);
  }
  
  private String _compileCommand(final CreateCommand createCommand) {
    String _var = createCommand.getVar();
    return ("declare -A " + _var);
  }
  
  private String _compileCommand(final SetCommand setCommand) {
    String expr = this.compileExpr(setCommand.getExpression());
    InputOutput.<String>println(setCommand.getExpression().getClass().getTypeName());
    boolean _contains = expr.contains("\"");
    if (_contains) {
      String _compileExpr = this.compileExpr(setCommand.getVar());
      String _plus = (_compileExpr + "=");
      return (_plus + expr);
    } else {
      String _compileExpr_1 = this.compileExpr(setCommand.getVar());
      String _plus_1 = ("let \"" + _compileExpr_1);
      String _plus_2 = (_plus_1 + " = ");
      String _plus_3 = (_plus_2 + expr);
      return (_plus_3 + "\"");
    }
  }
  
  private String _compileCommand(final PrintCommand printCommand) {
    String _compileExpr = this.compileExpr(printCommand.getExpression());
    return ("print_all " + _compileExpr);
  }
  
  private String _compileCommand(final ExportCommand exportCommand) {
    String _var = exportCommand.getVar();
    String _plus = ("export_json_csv " + _var);
    String _plus_1 = (_plus + " ");
    String _path = exportCommand.getPath();
    return (_plus_1 + _path);
  }
  
  private String _compileCommand(final DeleteCommand deleteCommand) {
    String _compileExpr = this.compileExpr(deleteCommand.getExpression());
    return ("unset " + _compileExpr);
  }
  
  private String _compileCommand(final AddCommand addCommand) {
    String _op = addCommand.getOp();
    String _plus = ("add_" + _op);
    String _plus_1 = (_plus + "_csv ");
    String _compileExpr = this.compileExpr(addCommand.getExpression());
    return (_plus_1 + _compileExpr);
  }
  
  private String _compileCommand(final RenameCommand renameCommand) {
    String _compileExpr = this.compileExpr(renameCommand.getExpr());
    String _plus = ("rename_csv " + _compileExpr);
    String _plus_1 = (_plus + " ");
    String _compileExpr_1 = this.compileExpr(renameCommand.getOldname());
    String _plus_2 = (_plus_1 + _compileExpr_1);
    String _plus_3 = (_plus_2 + " ");
    String _compileExpr_2 = this.compileExpr(renameCommand.getNewname());
    return (_plus_3 + _compileExpr_2);
  }
  
  private String _compileCommand(final ApplyCommand applyCommand) {
    return "# Apply is not implemented yet";
  }
  
  private String _compileCommand(final MergeCommand mergeCommand) {
    return "# Merge is not implemented yet";
  }
  
  private String _compileCommand(final ConcatCommand concatCommand) {
    String _compileExpr = this.compileExpr(concatCommand.getSelection1());
    String _plus = ("concat_two_csv " + _compileExpr);
    String _plus_1 = (_plus + " ");
    String _compileExpr_1 = this.compileExpr(concatCommand.getSelection2());
    return (_plus_1 + _compileExpr_1);
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
    String _plus = ("while [[ " + _compileExpr);
    String _plus_1 = (_plus + " ]]; do\n");
    String _compileBlock = this.compileBlock(whileCommand.getBody());
    String _plus_2 = (_plus_1 + _compileBlock);
    return (_plus_2 + "done");
  }
  
  private String _compileCommand(final IfCommand ifCommand) {
    String _compileExpr = this.compileExpr(ifCommand.getCond());
    String _plus = ("if [[ " + _compileExpr);
    String _plus_1 = (_plus + " ]]; then \n");
    String _compileBlock = this.compileBlock(ifCommand.getThenBody());
    String _plus_2 = (_plus_1 + _compileBlock);
    String _xifexpression = null;
    Block _elseBody = ifCommand.getElseBody();
    boolean _tripleEquals = (_elseBody == null);
    if (_tripleEquals) {
      _xifexpression = "";
    } else {
      String _compileBlock_1 = this.compileBlock(ifCommand.getElseBody());
      _xifexpression = ("\nelse\n" + _compileBlock_1);
    }
    String _plus_3 = (_plus_2 + _xifexpression);
    return (_plus_3 + "fi");
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
      String _plus = ("||" + _compileExpr);
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
      String _plus = ("&&" + _compileExpr);
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
      String _compileExpr_1 = this.compileExpr(equalityExpr.getRight());
      _xifexpression = (_op + _compileExpr_1);
    }
    return (_compileExpr + _xifexpression);
  }
  
  private String _compileExpr(final ComparaisonExpr comparaisonExpr) {
    PlusOrMinusExpr _right = comparaisonExpr.getRight();
    boolean _tripleEquals = (_right == null);
    if (_tripleEquals) {
      return this.compileExpr(comparaisonExpr.getLeft());
    } else {
      String ret = this.compileExpr(comparaisonExpr.getLeft());
      String op = "";
      String _op = comparaisonExpr.getOp();
      if (_op != null) {
        switch (_op) {
          case ">=":
            op = "-ge";
            break;
          case "<=":
            op = "-le";
            break;
          case ">":
            op = "-gt";
            break;
          case "<":
            op = "-lt";
            break;
        }
      }
      String _compileExpr = this.compileExpr(comparaisonExpr.getRight());
      return ((((ret + " ") + op) + " ") + _compileExpr);
    }
  }
  
  private String _compileExpr(final PlusOrMinusExpr comparaisonExpr) {
    String code = this.compileExpr(comparaisonExpr.getLeft());
    int _size = comparaisonExpr.getRight().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      String _code = code;
      String _get = comparaisonExpr.getOp().get((i).intValue());
      String _compileExpr = this.compileExpr(comparaisonExpr.getRight().get((i).intValue()));
      String _plus = (_get + _compileExpr);
      code = (_code + _plus);
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
      String _compileExpr = this.compileExpr(mulOrDivExpr.getRight().get((i).intValue()));
      String _plus = (_get + _compileExpr);
      code = (_code + _plus);
    }
    return code;
  }
  
  private String _compileExpr(final PrimaryExpr primaryExpr) {
    return this.compileExpr(primaryExpr);
  }
  
  private String _compileExpr(final NotExpr notExpr) {
    String _compileExpr = this.compileExpr(notExpr.getExpr());
    return ("!" + _compileExpr);
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
    return boolConstant.getValue();
  }
  
  private String _compileExpr(final VariableConstant variableConstant) {
    return variableConstant.getValue().toString();
  }
  
  private String _compileExpr(final CsvsExpr csvsExpr) {
    return this.compileExpr(csvsExpr);
  }
  
  private String _compileExpr(final CountExpr countExpr) {
    String _compileExpr = this.compileExpr(countExpr.getExpression());
    String _plus = ("$(count_csv " + _compileExpr);
    return (_plus + ")");
  }
  
  private String _compileExpr(final Selector cellSelect) {
    String _var = cellSelect.getVar();
    String _plus = ("$(get_val_csv_simple " + _var);
    String _plus_1 = (_plus + " ");
    String _compileExpr = this.compileExpr(cellSelect.getExpressionRow());
    String _plus_2 = (_plus_1 + _compileExpr);
    String _plus_3 = (_plus_2 + " ");
    String _compileExpr_1 = this.compileExpr(cellSelect.getExpressionCol());
    String _plus_4 = (_plus_3 + _compileExpr_1);
    return (_plus_4 + ")");
  }
  
  private String _compileExpr(final FieldSelect fieldSelect) {
    String _var = fieldSelect.getVar();
    String _plus = ("$(get_field_csv " + _var);
    String _plus_1 = (_plus + " ");
    String _compileExpr = this.compileExpr(fieldSelect.getExpression());
    String _plus_2 = (_plus_1 + _compileExpr);
    return (_plus_2 + ")");
  }
  
  private String _compileExpr(final LastExpr lastExpr) {
    boolean _equals = lastExpr.getOp().equals("row");
    if (_equals) {
      String _compileExpr = this.compileExpr(lastExpr.getExpression());
      String _plus = ("$(get_len_row_csv " + _compileExpr);
      return (_plus + ")");
    } else {
      boolean _equals_1 = lastExpr.getOp().equals("col");
      if (_equals_1) {
        String _compileExpr_1 = this.compileExpr(lastExpr.getExpression());
        String _plus_1 = ("$(get_len_col_csv " + _compileExpr_1);
        return (_plus_1 + ")");
      }
    }
    return null;
  }
  
  private String compileCommand(final Command addCommand) {
    if (addCommand instanceof AddCommand) {
      return _compileCommand((AddCommand)addCommand);
    } else if (addCommand instanceof ApplyCommand) {
      return _compileCommand((ApplyCommand)addCommand);
    } else if (addCommand instanceof ConcatCommand) {
      return _compileCommand((ConcatCommand)addCommand);
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
    } else if (addCommand instanceof MergeCommand) {
      return _compileCommand((MergeCommand)addCommand);
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
