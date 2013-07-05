package com.tutego.insel.io.ser;

import java.io.*;
import java.util.Date;
import java.beans.*;

public class SerializeAndDeserializeXML
{
  public static void main( String[] args )
  {
    String filename = "datum.ser.xml";

    // Serialize

    XMLEncoder enc = null;

    try
    {
      enc = new XMLEncoder( new FileOutputStream(filename) );
      enc.writeObject( "Today" );
      enc.writeObject( new Date() );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
    finally {
      if ( enc != null )
        enc.close();
    }

    // Deserialize

    XMLDecoder dec = null;

    try
    {
      dec = new XMLDecoder( new FileInputStream(filename) );

      String string = (String) dec.readObject();
      Date   date   = (Date)   dec.readObject();

      System.out.println( string );
      System.out.println( date );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
    finally {
      if ( dec != null )
        dec.close();
    }
  }
}
