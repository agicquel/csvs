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
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class CSVSGeneratorBash {
  public String compileIR(final Resource resource) {
    String bashCode = "import pandas as pd\n";
    String _bashCode = bashCode;
    bashCode = (_bashCode + "pd.options.mode.chained_assignment = None\n");
    String _bashCode_1 = bashCode;
    bashCode = (_bashCode_1 + "\n");
    String _bashCode_2 = bashCode;
    bashCode = (_bashCode_2 + "def len_csvs(obj):\r\n\tif hasattr(obj, \'__len__\'):\r\n\t\treturn len(obj)\r\n\telse:\r\n\t\treturn 1\n");
    String _bashCode_3 = bashCode;
    bashCode = (_bashCode_3 + "\n");
    Iterable<Model> _filter = Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class);
    for (final Model model : _filter) {
      EList<Command> _commands = model.getCommands();
      for (final Command command : _commands) {
        String _bashCode_4 = bashCode;
        String _compileCommand = this.compileCommand(command);
        String _plus = (_compileCommand + "\n");
        bashCode = (_bashCode_4 + _plus);
      }
    }
    return bashCode;
  }
  
  private String _compileCommand(final CsvCommand csvCommand) {
    return this.compileCommand(csvCommand);
  }
  
  private String _compileCommand(final ControlCommand controlCommand) {
    return this.compileCommand(controlCommand);
  }
  
  private String _compileCommand(final LoadCommand loadCommand) {
    return "";
  }
  
  private String _compileCommand(final StoreCommand storeCommand) {
    return "";
  }
  
  private String _compileCommand(final CreateCommand createCommand) {
    return "";
  }
  
  private String _compileCommand(final SetCommand setCommand) {
    return "";
  }
  
  private String _compileCommand(final PrintCommand printCommand) {
    return "";
  }
  
  private String _compileCommand(final ExportCommand exportCommand) {
    return "";
  }
  
  private String _compileCommand(final DeleteCommand deleteCommand) {
    return "";
  }
  
  private String _compileCommand(final AddCommand addCommand) {
    return "";
  }
  
  private String _compileCommand(final RenameCommand renameCommand) {
    return "";
  }
  
  private String _compileCommand(final ApplyCommand applyCommand) {
    return "";
  }
  
  private String _compileCommand(final MergeCommand mergeCommand) {
    return "";
  }
  
  private String _compileCommand(final ConcatCommand concatCommand) {
    return "";
  }
  
  private String compileBlock(final Block block) {
    return "";
  }
  
  private String _compileCommand(final WhileCommand whileCommand) {
    return "";
  }
  
  private String _compileCommand(final IfCommand ifCommand) {
    return "";
  }
  
  private String _compileExpr(final Expression expression) {
    return this.compileExpr(expression);
  }
  
  private String _compileExpr(final OrExpr orExpr) {
    return "";
  }
  
  private String _compileExpr(final AddExpr addExpr) {
    return "";
  }
  
  private String _compileExpr(final EqualityExpr equalityExpr) {
    return "";
  }
  
  private String _compileExpr(final ComparaisonExpr comparaisonExpr) {
    return "";
  }
  
  private String _compileExpr(final PlusOrMinusExpr comparaisonExpr) {
    return "";
  }
  
  private String _compileExpr(final MulOrDivExpr mulOrDivExpr) {
    return "";
  }
  
  private String _compileExpr(final PrimaryExpr primaryExpr) {
    return "";
  }
  
  private String _compileExpr(final NotExpr notExpr) {
    return "";
  }
  
  private String _compileExpr(final AtomicExpr atomicExpr) {
    return "";
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
    return "";
  }
  
  private String _compileExpr(final VariableConstant variableConstant) {
    return variableConstant.getValue().toString();
  }
  
  private String _compileExpr(final CsvsExpr csvsExpr) {
    return this.compileExpr(csvsExpr);
  }
  
  private String _compileExpr(final CountExpr countExpr) {
    return "";
  }
  
  private String _compileExpr(final Selector cellSelect) {
    return "";
  }
  
  private String _compileExpr(final FieldSelect fieldSelect) {
    return "";
  }
  
  private String _compileExpr(final LastExpr lastExpr) {
    return "";
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
