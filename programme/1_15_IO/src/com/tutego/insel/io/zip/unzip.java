package com.tutego.insel.io.zip;

import java.util.zip.*;
import java.io.*;
import java.util.*;

public class unzip
{
  private static final byte[] BUFFER = new byte[ 0xFFFF ];

  public static void main( String[] args )
  {
    if ( args.length != 2 )
      System.out.println( "Benutzung: unzip <zipfile> <destination>" );
    else
    {
      try
      {
        ZipFile zipFile = new ZipFile( args[0] );
        Enumeration<? extends ZipEntry> zipEntryEnum = zipFile.entries();

        while ( zipEntryEnum.hasMoreElements() )
        {
          ZipEntry zipEntry = zipEntryEnum.nextElement();
          System.out.print( zipEntry.getName() + "." );
          extractEntry( zipFile, zipEntry, args[1] );
          System.out.println( ".. unpacked" );
        }
      }
      catch ( FileNotFoundException e )
      {
        System.err.println( "Fehler: ZipFile nicht gefunden!" );
      }
      catch ( IOException e )
      {
        System.err.println( "Fehler: Allgemeiner Ein-/Ausgabefehler!" );
      }
    }
  }

  private static void extractEntry( ZipFile zf, ZipEntry entry, String destDir )
    throws IOException
  {
    File file = new File( destDir, entry.getName() );

    if ( entry.isDirectory() )
    {
      if ( ! file.mkdirs() )
        throw new IOException( "Konnte Verzeichnisse nicht anlegen!" );
    }
    else
    {
      if ( ! new File( file.getParent() ).mkdirs() )
        throw new IOException( "Konnte Verzeichnisse nicht anlegen!" );

      InputStream  is = null;
      OutputStream os = null;

      try
      {
        is = zf.getInputStream( entry );
        os = new FileOutputStream( file );

        for ( int len; (len = is.read(BUFFER)) != -1; )
          os.write( BUFFER, 0, len );
      }
      finally
      {
        if ( os != null ) os.close(); 
        if ( is != null ) is.close();
      }
    }
  }
}