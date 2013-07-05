package com.tutego.insel.io.stream;

import java.io.*;

public class cp
{
  static void copy( InputStream in, OutputStream out ) throws IOException
  {
    byte[] buffer = new byte[ 0xFFFF ];

    for ( int len; (len = in.read(buffer)) != -1; )
      out.write( buffer, 0, len );
  }

  static void copyFile( String src, String dest )
  {
    FileInputStream  fis = null;
    FileOutputStream fos = null;

    try
    {
      fis = new FileInputStream( src );
      fos = new FileOutputStream( dest );

      copy( fis, fos );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
    finally {
      if ( fis != null )
        try { fis.close(); } catch ( IOException e ) { }
      if ( fos != null )
        try { fos.close(); } catch ( IOException e ) { }
    }
  }

  public static void main( String[] args )
  {
    if ( args.length != 2 )
      System.err.println( "Benutzung: FileCopy <src> <dest>" );
    else
      copyFile( args[0], args[1] );
  }
}
