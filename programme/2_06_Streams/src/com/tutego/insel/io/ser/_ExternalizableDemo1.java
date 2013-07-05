package com.tutego.insel.io.ser;

import java.io.*;
import java.util.*;

public class _ExternalizableDemo1
{
  public static void main( String[] args ) throws IOException
  {
    PropertyLine line1 = new PropertyLine();
    line1.key = "name";
    line1.value = "Chris";
    PropertyLine line2 = new PropertyLine();
    line2.key = "place";
    line2.value = "Cagayan de Oro";
    Properties props = new Properties();
    Collections.addAll( props.lines, line1, line2 );

    OutputStream fos = new FileOutputStream( "servsext1.ser" );
    ObjectOutputStream oos = new ObjectOutputStream( fos );
    oos.writeObject( props );
    oos.close();
  }

  static class Properties implements Serializable
  {
    transient Collection<PropertyLine> lines = new ArrayList<PropertyLine>();

    private void writeObject( ObjectOutputStream out ) throws IOException
    {
      out.writeUTF( "# File creation: " + new Date() + "\n" );

      for ( PropertyLine line : lines )
        out.writeObject( line );
    }
  }

  static class PropertyLine implements Serializable
  {
    transient String key;
    transient String value;

    private void writeObject( ObjectOutputStream out ) throws IOException
    {
      out.writeUTF( key );
      out.writeChar( '=' );
      out.writeUTF( value );
    }
  }
}