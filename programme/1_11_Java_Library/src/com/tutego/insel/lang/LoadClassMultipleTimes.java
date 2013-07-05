package com.tutego.insel.lang;

import java.io.File;
import java.net.*;

public class LoadClassMultipleTimes
{
  static Object newInstance( String path, String classname ) throws Exception
  {
    URL url = new File( path ).toURI().toURL();

    URLClassLoader cl = new URLClassLoader( new URL[]{ url } );

    Class<?> c = cl.loadClass( classname );

    return c.newInstance();
  }

  public static void main( String[] args ) throws Exception
  {
    newInstance( "/", "com.tutego.insel.lang.ClassToLoadMultipleTimes" );

    newInstance( "/", "com.tutego.insel.lang.ClassToLoadMultipleTimes" );
  }
}
