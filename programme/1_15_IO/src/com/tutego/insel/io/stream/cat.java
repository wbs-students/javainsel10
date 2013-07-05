package com.tutego.insel.io.stream;

import java.io.*;

class cat
{
  public static void main( String[] args )
  {
    for ( String filename : args ) {
      try {
        InputStream in = new BufferedInputStream( new FileInputStream(filename) );

        try {
          for ( int c; (c = in.read()) != -1 /* EOF */; )
            System.out.write( c );
        }
        finally {
          in.close(); 
        }
      }
      catch ( IOException e ) {
        System.err.println( "cat: Fehler beim Verarbeiten von " + filename );
        System.exit( 1 );
      }
    } // end for
  }
}
