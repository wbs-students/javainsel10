package com.tutego.insel.io.stream;

import java.io.*;

public class ChainedWriter
{
  public static void main( String[] args )
  {
    PrintWriter pw = null;
    try
    {
      Writer fw = new FileWriter( "charArrayWriterDemoPuffer.txt" );
      Writer bw = new BufferedWriter( fw );
      pw = new PrintWriter( bw );

      for ( int i = 1; i < 10000; i++ )
        pw.println( "Zeile " + i );
    }
    catch ( IOException e ) {
      System.err.println( "Konnte Datei nicht erstellen!" );
    }
    finally {
      if ( pw != null )
        pw.close();
    }
  }
}
