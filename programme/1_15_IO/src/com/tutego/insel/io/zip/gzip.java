package com.tutego.insel.io.zip;

import java.io.*;
import java.util.zip.*;

public class gzip
{
  public static void main( String[] args )
  {
    if ( args.length != 1 ) {
      System.err.println( "Benutzung: gzip <source>" );
      return;
    }

    OutputStream os = null;
    InputStream  is = null;

    try
    {
      os = new GZIPOutputStream( new FileOutputStream( args[0] + ".gz" ) );
      is  = new FileInputStream( args[0] );

      byte[] buffer = new byte[ 8192 ];

      for ( int length; (length = is.read(buffer)) != -1; )
        os.write( buffer, 0, length );
    }
    catch ( IOException e )
    {
      System.err.println( "Fehler: Kann nicht packen " + args[0] );
    }
    finally
    {
      if ( is != null ) try { is.close(); } catch ( IOException e ) { }
      if ( os != null ) try { os.close(); } catch ( IOException e ) { }
    }
  }
}
