package com.tutego.insel.tools;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

public class CompileWithDiagnosticsDemo
{
  public static void main( String[] args ) throws Exception
  {
    File javaSrcFile = new File( "A.java" );
    
    Writer p = new FileWriter( javaSrcFile );
    p.write( "class A\n{\nstaticccc\n{\nSystem.outprintln(\"Java Compiler API\")" );
    p.close();
    
    //

    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
    StandardJavaFileManager fileManager = compiler.getStandardFileManager( diagnostics, null, null );
    Iterable<? extends JavaFileObject> units;
    units = fileManager.getJavaFileObjectsFromFiles( Arrays.asList( new File("QQ.java"), javaSrcFile ) );
    CompilationTask task = compiler.getTask( null, fileManager, diagnostics, null, null, units );
    boolean success = task.call();
    fileManager.close();
    
    System.out.println( success ); // false
    
    for ( Diagnostic<?> diagnostic : diagnostics.getDiagnostics() )
    {
      System.out.printf( "Kind: %s%n", diagnostic.getKind() );
      System.out.printf( "Quelle: %s%n", diagnostic.getSource() );
      System.out.printf( "Code und Nachricht: %s: %s%n", diagnostic.getCode(), diagnostic.getMessage( null ) );
      System.out.printf( "Zeile: %s%n", diagnostic.getLineNumber() );
      System.out.printf( "Position/Spalte: %s/%s%n", diagnostic.getPosition(), diagnostic.getColumnNumber() );
      System.out.printf( "Startpostion/Endposition: %s/%s%n", diagnostic.getStartPosition(), diagnostic.getEndPosition() );
      System.out.println();
    }
    
    //

    javaSrcFile.delete();
  }
}
