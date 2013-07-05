package org.jbpm.graph.def;

import org.jbpm.graph.exe.ExecutionContext;

public interface ActionHandler
{
  void execute( ExecutionContext executionContext );
}
