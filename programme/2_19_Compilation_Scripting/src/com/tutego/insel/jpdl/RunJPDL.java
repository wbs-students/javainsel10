package com.tutego.insel.jpdl;

import java.net.URL;
import java.util.Collection;
import java.util.Collections;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

import org.jbpm.graph.exe.ExecutionContext;

import com.tutego.insel.tools.MemClassLoader;
import com.tutego.insel.tools.MemJavaFileManager;
import com.tutego.insel.tools.StringJavaFileObject;

public class RunJPDL
{
  public static void main( String[] args ) throws Exception
  {
    String name = "/resources/jpdl/freeDiskSpace/processdefinition.xml";
    URL sourceUrl = RunJPDL.class.getResource( name );
    JPDLCompiler jpdlCompiler = new JPDLCompiler();
    String src = jpdlCompiler.generateSourceForProcessDefinition( sourceUrl );
      System.out.println( src );
    
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    MemClassLoader classLoader = new MemClassLoader();
    JavaFileManager fileManager = new MemJavaFileManager( compiler, classLoader );
    JavaFileObject javaFile = new StringJavaFileObject( jpdlCompiler.getClassName(), src );
    Collection<JavaFileObject> units = Collections.singleton( javaFile );
    CompilationTask task = compiler.getTask( null, fileManager, null, null, null, units );
    task.call();
    fileManager.close();
    
    Class<?> clazz = Class.forName( jpdlCompiler.getClassName(), true, classLoader );
    ExecutionContext executionContext = new ExecutionContext();
    ProcessDefinition p = (ProcessDefinition) clazz.newInstance();
    p.start( executionContext );
  }
}
