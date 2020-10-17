/**
 * generated by Xtext 2.23.0
 */
package com.agicquel.csvs.generator;

import com.agicquel.csvs.generator.CSVSGeneratorPython;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CSVsGenerator extends AbstractGenerator {
  private CSVSGeneratorPython generator;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    CSVSGeneratorPython _cSVSGeneratorPython = new CSVSGeneratorPython();
    this.generator = _cSVSGeneratorPython;
    String code = this.generator.compileIR(resource);
    InputOutput.<String>println(code);
    fsa.generateFile("test.py", code);
  }
}
