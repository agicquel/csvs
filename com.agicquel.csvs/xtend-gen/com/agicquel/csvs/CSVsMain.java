package com.agicquel.csvs;

import com.agicquel.csvs.CSVsStandaloneSetup;
import com.agicquel.csvs.generator.CSVSGeneratorBash;
import com.agicquel.csvs.generator.CSVSGeneratorPython;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class CSVsMain {
  private static int GENERATE_BASH = 0;
  
  private static int GENERATE_PYTHON = 1;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  private IResourceValidator validator;
  
  @Inject
  private JavaIoFileSystemAccess fileAccess;
  
  public static void main(final String[] args) {
    int _size = ((List<String>)Conversions.doWrapArray(args)).size();
    boolean _notEquals = (_size != 2);
    if (_notEquals) {
      InputOutput.<String>println("Bad parameters : java -jar compiler.jar -bash|-python input_file");
      return;
    }
    int mode = 0;
    boolean _equals = (args[0]).equals("-bash");
    if (_equals) {
      mode = CSVsMain.GENERATE_BASH;
    } else {
      boolean _equals_1 = (args[0]).equals("-python");
      if (_equals_1) {
        mode = CSVsMain.GENERATE_PYTHON;
      } else {
        InputOutput.<String>println("Bad parameters : use java -jar compiler.jar -bash|-python output_file");
        return;
      }
    }
    final Injector injector = new CSVsStandaloneSetup().createInjectorAndDoEMFRegistration();
    final CSVsMain main = injector.<CSVsMain>getInstance(CSVsMain.class);
    final String input = args[1];
    String output = input;
    if ((mode == CSVsMain.GENERATE_BASH)) {
      output = output.replace(".csvs", ".sh");
    } else {
      if ((mode == CSVsMain.GENERATE_PYTHON)) {
        output = output.replace(".csvs", ".py");
      }
    }
    final ResourceSet set = main.resourceSetProvider.get();
    final Resource resource = set.getResource(URI.createFileURI(input), true);
    final List<Issue> issues = main.validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
    boolean _isEmpty = issues.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      InputOutput.<String>println("Erreur : Le fichier source est invalide.");
      final Consumer<Issue> _function = (Issue it) -> {
        System.err.println(("\t" + it));
      };
      issues.forEach(_function);
      return;
    }
    main.fileAccess.setOutputPath("./");
    GeneratorContext _generatorContext = new GeneratorContext();
    final Procedure1<GeneratorContext> _function_1 = (GeneratorContext it) -> {
      it.setCancelIndicator(CancelIndicator.NullImpl);
    };
    final GeneratorContext context = ObjectExtensions.<GeneratorContext>operator_doubleArrow(_generatorContext, _function_1);
    if ((mode == CSVsMain.GENERATE_BASH)) {
      new CSVSGeneratorBash(output).doGenerate(resource, main.fileAccess, context);
    } else {
      if ((mode == CSVsMain.GENERATE_PYTHON)) {
        new CSVSGeneratorPython(output).doGenerate(resource, main.fileAccess, context);
      }
    }
  }
}
