package com.tutego.insel.io;

import java.io.*;
import java.util.zip.*;

class CRC32Demo
{
  static public void main( String[] args )
  {
    InputStream in = CRC32Demo.class.getResourceAsStream( "/lyrics.txt" );

    try
    {
      CRC32 crc = new CRC32();
      InputStream cis = new CheckedInputStream( in, crc );  

      while ( cis.read() != -1 ) { /* To the end. */ }

      System.out.printf( "%X", crc.getValue() );             // F9A39CFC
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
    finally {
      try { in.close(); } catch ( Exception e ) { }
    }
  }
}
