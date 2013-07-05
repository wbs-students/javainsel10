package com.tutego.insel.io.stream;

import java.io.*;

public class FileReaderDemo
{
  public static void main( String[] args )
  {
    Reader reader = null;

    try
    {
      reader = new FileReader( "bin/lyrics.txt" );

      for ( int c; ( c = reader.read() ) != -1; )
        System.out.print( (char) c );
    }
    catch ( IOException e ) {
      System.err.println( "Fehler beim Lesen der Datei!" );
    }
    finally {
      try { reader.close(); } catch ( Exception e ) { }
    }
  }
}
