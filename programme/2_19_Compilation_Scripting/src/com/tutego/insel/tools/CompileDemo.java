package com.tutego.insel.tools;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

public class CompileDemo
{
  public static void main( String[] args ) throws Exception
  {
    File javaSrcFile = new File( "A.java" );
    
    Writer p = new FileWriter( javaSrcFile );
    p.write( "class A { static { System.out.println(\"Java Compiler API\"); } }" );
    p.close();
    
    //

    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    StandardJavaFileManager manager = compiler.getStandardFileManager( null, null, null );
    Iterable<? extends JavaFileObject> units;
    units = manager.getJavaFileObjectsFromFiles( Arrays.asList( javaSrcFile ) );
    Iterable<String> options = null; // Arrays.asList( "-verbose" );
    CompilationTask task = compiler.getTask( null, manager, null, options, null, units );
    task.call();
    manager.close();
    
    //

    URLClassLoader classLoader = new URLClassLoader(
                                  new URL[] { javaSrcFile.getAbsoluteFile().getParentFile().toURI().toURL() } );
    Class.forName( "A", true, classLoader );    // Java Compiler API

    javaSrcFile.delete();
  }
}
