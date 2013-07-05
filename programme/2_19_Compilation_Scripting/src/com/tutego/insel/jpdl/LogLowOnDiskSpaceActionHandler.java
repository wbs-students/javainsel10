package com.tutego.insel.jpdl;

import java.util.logging.Logger;
import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class LogLowOnDiskSpaceActionHandler implements ActionHandler
{
  @Override public void execute( ExecutionContext executionContext )
  {
    Logger.getAnonymousLogger().severe( "Just " + executionContext.getVariable( "freeDiskSpace" ) + " MB of free disk space!" ) ;
  }
}
