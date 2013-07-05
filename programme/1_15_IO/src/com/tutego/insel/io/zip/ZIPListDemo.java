package com.tutego.insel.io.zip;

import java.io.IOException;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZIPListDemo
{
  public static void main( String[] args ) throws IOException
  {
    ZipFile zipfile = new ZipFile( "c:/a/b.zip" );
    
    for ( ZipEntry entry : Collections.list( zipfile.entries() ) )
      System.out.printf( "%s%-54s   Size: %6d   Packed: %6d   %tc%n", 
                         entry.isDirectory() ? "+" : " ",
                         entry.getName(),
                         entry.getSize(),
                         entry.getCompressedSize(),
                         entry.getTime() );
  }
}
