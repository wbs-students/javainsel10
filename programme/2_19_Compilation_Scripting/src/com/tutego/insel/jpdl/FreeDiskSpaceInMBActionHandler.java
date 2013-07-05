package com.tutego.insel.jpdl;

import java.io.File;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

public class FreeDiskSpaceInMBActionHandler implements ActionHandler
{
  @Override public void execute( ExecutionContext executionContext )
  {
    executionContext.setVariable( "freeDiskSpace", new File("c:/").getFreeSpace() / (1024*1024) );
  }
}
