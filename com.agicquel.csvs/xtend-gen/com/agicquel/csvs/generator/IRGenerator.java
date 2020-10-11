package com.agicquel.csvs.generator;

import com.agicquel.csvs.csvs.AddCommand;
import com.agicquel.csvs.csvs.ApplyCommand;
import com.agicquel.csvs.csvs.Command;
import com.agicquel.csvs.csvs.ControlCommand;
import com.agicquel.csvs.csvs.CreateCommand;
import com.agicquel.csvs.csvs.CsvCommand;
import com.agicquel.csvs.csvs.DeleteCommand;
import com.agicquel.csvs.csvs.ExportCommand;
import com.agicquel.csvs.csvs.Expression;
import com.agicquel.csvs.csvs.LoadCommand;
import com.agicquel.csvs.csvs.PrimaryExpr;
import com.agicquel.csvs.csvs.PrintCommand;
import com.agicquel.csvs.csvs.Selector;
import com.agicquel.csvs.csvs.SetCommand;
import com.agicquel.csvs.csvs.StoreCommand;
import com.agicquel.csvs.generator.Env;
import com.agicquel.csvs.generator.Instr;
import com.agicquel.csvs.generator.Quad;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class IRGenerator {
  private Resource res;
  
  private Env env;
  
  public List<Instr> compileIR(final Resource resource) {
    this.res = resource;
    Env _env = new Env(null);
    this.env = _env;
    ArrayList<Instr> instructions = CollectionLiterals.<Instr>newArrayList();
    Iterable<Command> _filter = Iterables.<Command>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Command.class);
    for (final Command command : _filter) {
      CollectionExtensions.<Instr>addAll(instructions, this.compileCommand(command));
    }
    return instructions;
  }
  
  private Instr _compileCommand(final CsvCommand csvCommand) {
    return this.compileCommand(csvCommand);
  }
  
  private Instr _compileCommand(final ControlCommand controlCommand) {
    return this.compileCommand(controlCommand);
  }
  
  private Instr _compileCommand(final LoadCommand loadCommand) {
    Instr e = new Instr();
    e.setPlace(this.env.newVariable(loadCommand.getVar()));
    String _place = e.getPlace();
    String _path = loadCommand.getPath();
    Quad _quad = new Quad("load", _place, _path, "");
    e.getCode().add(_quad);
    return e;
  }
  
  private Instr _compileCommand(final StoreCommand storeCommand) {
    Instr e = new Instr();
    String _var = storeCommand.getVar();
    String _path = storeCommand.getPath();
    Quad _quad = new Quad("store", "", _var, _path);
    e.getCode().add(_quad);
    return e;
  }
  
  private Instr _compileCommand(final CreateCommand createCommand) {
    Instr e = new Instr();
    e.setPlace(this.env.newVariable(createCommand.getVar()));
    String _place = e.getPlace();
    Quad _quad = new Quad("create", _place, "", "");
    e.getCode().add(_quad);
    return e;
  }
  
  private Instr _compileCommand(final SetCommand setCommand) {
    Instr e = new Instr();
    Instr e1 = this.compileExpr(setCommand.getVar());
    Instr e2 = this.compileExpr(setCommand.getExpression());
    e.getCode().addAll(e1.getCode());
    return e;
  }
  
  private Instr _compileCommand(final PrintCommand printCommand) {
    return null;
  }
  
  private Instr _compileCommand(final ExportCommand exportCommand) {
    return null;
  }
  
  private Instr _compileCommand(final DeleteCommand deleteCommand) {
    return null;
  }
  
  private Instr _compileCommand(final AddCommand addCommand) {
    return null;
  }
  
  private Instr _compileCommand(final ApplyCommand applyCommand) {
    return null;
  }
  
  private Instr _compileExpr(final Expression expression) {
    return null;
  }
  
  private Instr _compileExpr(final Selector selector) {
    return null;
  }
  
  private Instr compileCommand(final Command addCommand) {
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
    } else if (addCommand instanceof LoadCommand) {
      return _compileCommand((LoadCommand)addCommand);
    } else if (addCommand instanceof PrintCommand) {
      return _compileCommand((PrintCommand)addCommand);
    } else if (addCommand instanceof SetCommand) {
      return _compileCommand((SetCommand)addCommand);
    } else if (addCommand instanceof StoreCommand) {
      return _compileCommand((StoreCommand)addCommand);
    } else if (addCommand instanceof ControlCommand) {
      return _compileCommand((ControlCommand)addCommand);
    } else if (addCommand instanceof CsvCommand) {
      return _compileCommand((CsvCommand)addCommand);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(addCommand).toString());
    }
  }
  
  private Instr compileExpr(final PrimaryExpr expression) {
    if (expression instanceof Expression) {
      return _compileExpr((Expression)expression);
    } else if (expression instanceof Selector) {
      return _compileExpr((Selector)expression);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expression).toString());
    }
  }
}