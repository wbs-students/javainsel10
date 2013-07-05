package com.tutego.insel.io.zip;

import java.util.zip.*;

public class InflaterDeflaterDemo
{
  public static void main( String[] args ) throws DataFormatException
  {
    byte[] input = { 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1 };
    
    // Komprimieren
    
    byte[] output = new byte[ 100 ];
    Deflater compresser = new Deflater( Deflater.BEST_COMPRESSION );
    compresser.setInput( input );
    compresser.finish();
    int compressedBytes = compresser.deflate( output );
    
    // Komprimiertes Ergebnis zur Demonstration ausgeben
    
    for ( int i = 0; i < compressedBytes; i++ )
      System.out.printf( "%02x ", output[i] );
    // 78 da 63 60 60 60 60 64 64 44 22 01 00 51 00 09 
    System.out.println();
    
    // Dekomprimieren

    Inflater decompresser = new Inflater();
    decompresser.setInput( output, 0, compressedBytes );
    byte[] result = new byte[ 100 ];
    int uncompressedBytes = decompresser.inflate( result );
    decompresser.end();
    
    // Dekomprimiertes Ergebnis ist der Eingang
    
    for ( int i = 0; i < uncompressedBytes; i++ )
      System.out.printf( "%02x ", result[i] );
    // 00 00 00 00 01 01 01 00 00 00 01 01 01 00 00 00 01 01
}
}