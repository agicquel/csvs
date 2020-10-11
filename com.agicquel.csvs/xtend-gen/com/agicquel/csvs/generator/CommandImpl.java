package com.agicquel.csvs.generator;

import com.agicquel.csvs.csvs.Command;
import com.agicquel.csvs.generator.Env;
import com.agicquel.csvs.generator.Quad;
import java.util.ArrayList;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Pure;

@Data
@SuppressWarnings("all")
public class CommandImpl {
  private final Env _env;
  
  private final ArrayList<Quad> _quads;
  
  private final Command _command;
  
  @Override
  public String toString() {
    int _inputCounter = this.getEnv().getInputCounter();
    String _plus = ("\nEnv : I" + Integer.valueOf(_inputCounter));
    String _plus_1 = (_plus + " | O");
    int _outputCounter = this.getEnv().getOutputCounter();
    String res = (_plus_1 + Integer.valueOf(_outputCounter));
    String _res = res;
    int _labelCounter = this.getEnv().getLabelCounter();
    String _plus_2 = (" | L" + Integer.valueOf(_labelCounter));
    String _plus_3 = (_plus_2 + " | V");
    int _variableCounter = this.getEnv().getVariableCounter();
    String _plus_4 = (_plus_3 + Integer.valueOf(_variableCounter));
    res = (_res + _plus_4);
    String _res_1 = res;
    res = (_res_1 + "\nCode : \n");
    ArrayList<Quad> _quads = this.getQuads();
    for (final Quad quad : _quads) {
      String _res_2 = res;
      String _string = quad.toString();
      String _plus_5 = ("\t" + _string);
      String _plus_6 = (_plus_5 + "\n");
      res = (_res_2 + _plus_6);
    }
    return res;
  }
  
  public CommandImpl(final Env env, final ArrayList<Quad> quads, final Command command) {
    super();
    this._env = env;
    this._quads = quads;
    this._command = command;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._env== null) ? 0 : this._env.hashCode());
    result = prime * result + ((this._quads== null) ? 0 : this._quads.hashCode());
    return prime * result + ((this._command== null) ? 0 : this._command.hashCode());
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CommandImpl other = (CommandImpl) obj;
    if (this._env == null) {
      if (other._env != null)
        return false;
    } else if (!this._env.equals(other._env))
      return false;
    if (this._quads == null) {
      if (other._quads != null)
        return false;
    } else if (!this._quads.equals(other._quads))
      return false;
    if (this._command == null) {
      if (other._command != null)
        return false;
    } else if (!this._command.equals(other._command))
      return false;
    return true;
  }
  
  @Pure
  public Env getEnv() {
    return this._env;
  }
  
  @Pure
  public ArrayList<Quad> getQuads() {
    return this._quads;
  }
  
  @Pure
  public Command getCommand() {
    return this._command;
  }
}
