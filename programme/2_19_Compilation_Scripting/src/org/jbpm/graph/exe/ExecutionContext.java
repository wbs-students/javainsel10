package org.jbpm.graph.exe;

import java.util.*;

public class ExecutionContext
{
  private Map<String, Object> map = new HashMap<String, Object>();

  public Object getVariable( String name )
  {
    return map.get( name );
  }

  public void setVariable( String name, Object value )
  {
    map.put( name, value );
  }
}
