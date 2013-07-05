package com.tutego.insel.jpdl;

public interface ProcessDefinition
{
  void start( org.jbpm.graph.exe.ExecutionContext executionContext ) throws Exception;
}
