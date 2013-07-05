package com.tutego.insel.io.stream;

import java.io.*;

public class FileWriterDemo
{
  public static void main( String[] args )
  {
    Writer fw = null;
    
    try
    {
      fw = new FileWriter( "fileWriter.txt" );
      fw.write( "Zwei Jäger treffen sich..." );
      fw.append( System.getProperty("line.separator") ); // e.g. "\n" 
    }
    catch ( IOException e ) {
      System.err.println( "Konnte Datei nicht erstellen" );
    }
    finally {
      if ( fw != null )
        try { fw.close(); } catch ( IOException e ) { }
    }
  }
}
