package com.tutego.insel.script;

import java.io.InputStreamReader;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptDemo
{
  public static void main( String[] args ) throws ScriptException
  {
    ScriptEngine engine = new ScriptEngineManager().getEngineByName( "JavaScript" );
 
    engine.put( "name", "Christian Ullenboom" );
    engine.eval( new InputStreamReader( JavaScriptDemo.class.getResourceAsStream( "tutego.js" ) ) );
    System.out.println( engine.get( "month" ) );
  }
}
