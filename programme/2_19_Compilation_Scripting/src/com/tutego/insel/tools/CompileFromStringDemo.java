package com.tutego.insel.tools;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

public class CompileFromStringDemo
{
  public static void main( String[] args ) throws Exception
  {
    String src = "class A { static { System.out.println(\"Java Compiler API 2\"); } }";
    StringJavaFileObject javaFile = new StringJavaFileObject( "A", src );
    
    //
    
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    StandardJavaFileManager fileManager = compiler.getStandardFileManager( null, null, null );
    Iterable<? extends JavaFileObject> units = Arrays.asList( javaFile );
    CompilationTask task = compiler.getTask( null, fileManager, null, null, null, units );
    task.call();
    fileManager.close();
    
    URLClassLoader classLoader = new URLClassLoader( new URL[] { new File(".").getAbsoluteFile().toURI().toURL() } );
    Class.forName( "A", true, classLoader );    // Java Compiler API 2
  }
}
