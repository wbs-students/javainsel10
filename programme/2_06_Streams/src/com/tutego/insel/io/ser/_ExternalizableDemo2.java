package com.tutego.insel.io.ser;

import java.io.*;
import java.util.*;

public class _ExternalizableDemo2
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

    OutputStream fos = new FileOutputStream( "servsext2.ser" );
    ObjectOutputStream oos = new ObjectOutputStream( fos );
    oos.writeObject( props );
    oos.close();
  }

  static class Properties implements Externalizable
  {
    Collection<PropertyLine> lines = new ArrayList<PropertyLine>();

    @Override
    public void writeExternal( ObjectOutput out ) throws IOException
    {
      out.writeUTF( "# File creation: " + new Date() + "\n" );

      for ( PropertyLine line : lines )
        out.writeObject( line );
    }

    @Override
    public void readExternal( ObjectInput in )
    {
    }
  }

  static class PropertyLine implements Externalizable
  {
    String key;
    String value;

    @Override
    public void writeExternal( ObjectOutput out ) throws IOException
    {
      out.writeUTF( key );
      out.writeChar( '=' );
      out.writeUTF( value );
    }

    @Override
    public void readExternal( ObjectInput in )
    {
    }
  }
}