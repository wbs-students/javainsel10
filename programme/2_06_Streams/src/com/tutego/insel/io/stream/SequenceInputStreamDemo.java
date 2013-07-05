package com.tutego.insel.io.stream;

import java.io.*;

public class SequenceInputStreamDemo
{
  public static void main( String[] args ) throws IOException
  {
    String s = "Gezeitenrechnung\nfür\nSchlickrutscher\n";

    InputStream bais = new ByteArrayInputStream( s.getBytes() );
    InputStream reis = SequenceInputStreamDemo.class.getResourceAsStream( "/lyrics.txt" );

    InputStream      sis = new SequenceInputStream( bais, reis );
    LineNumberReader lnr = new LineNumberReader( new InputStreamReader(sis) );

    for ( String line; (line = lnr.readLine()) != null; )
      System.out.printf( "%2d:%s%n", lnr.getLineNumber(), line );
    }
}
