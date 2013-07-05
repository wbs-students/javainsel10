package com.tutego.insel.util.map;

import java.io.*;
import java.util.*;

class SaveProperties
{
  public static void main( String[] args )
  {
    Writer writer = null;
    Reader reader = null;

    try
    {
      writer = new FileWriter( "properties.txt" );
    
      Properties prop1 = new Properties( System.getProperties() ); 
      prop1.setProperty( "MeinNameIst", "Forrest Gump" );
      prop1.store( writer, "Eine Insel mit zwei Bergen" );

      reader = new FileReader( "properties.txt" );

      Properties prop2 = new Properties();
      prop2.load( reader );
      prop2.list( System.out );
    }
    catch ( IOException e )
    {
      e.printStackTrace();
    }
    finally
    {
      try { if ( writer != null ) writer.close(); }
      catch ( IOException e ) { e.printStackTrace(); }
      try { if ( reader != null ) reader.close(); }
      catch ( IOException e ) { e.printStackTrace(); }
    }
  }
}