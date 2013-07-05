package com.tutego.insel.io.file;

import java.io.File;

public class DeleteTree
{
  public static void deleteTree( File path )
  {
    for ( File file : path.listFiles() )
    {
      if ( file.isDirectory() )
        deleteTree( file );
      else
        if ( ! file.delete() )
          System.err.println( file + " could not be deleted!" );
    }

    if ( ! path.delete() )
      System.err.println( path + " could not be deleted!" );
  }

  public static void main( String[] args )
  {
    deleteTree( new File("c:/ati/") );
  }
}
