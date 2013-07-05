package com.tutego.insel.io.stream;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo
{
  public static void main( String[] args ) throws IOException
  {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    DataOutputStream out = new DataOutputStream( baos );
    // Header
    out.write( 'G' ); out.write( 'I' ); out.write( 'F' );
    out.write( '8' ); out.write( '9' ); out.write( 'a' );
    // Logical Screen Descriptor
    out.writeShort( 128 );   // Logical Screen Width  (Unsigned)
    out.writeShort( 37 );    // Logical Screen Height (Unsigned)
    // <Packed Fields>, Background Color Index, Pixel Aspect Ratio
    // and so on.
    out.close();
    @SuppressWarnings("unused")
    byte[] result = baos.toByteArray();
  }
}
