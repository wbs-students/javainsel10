package com.tutego.security.crypto;

import java.io.*;
import java.security.Key;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.*;

public class ReadWriteDES
{
  static void encode( byte[] bytes, OutputStream out, String pass ) throws Exception
  {
    Cipher c = Cipher.getInstance( "DES" );
    Key k = new SecretKeySpec( pass.getBytes(), "DES" );
    c.init( Cipher.ENCRYPT_MODE, k );

    OutputStream cos = new CipherOutputStream( out, c );
    cos.write( bytes );
    cos.close();
  }

  static byte[] decode( InputStream is, String pass ) throws Exception
  {
    Cipher c = Cipher.getInstance( "DES" );
    Key k = new SecretKeySpec( pass.getBytes(), "DES" );
    c.init( Cipher.DECRYPT_MODE, k );

    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    CipherInputStream cis = new CipherInputStream( is, c );

    for ( int b; (b = cis.read()) != -1; )
      bos.write( b );

    cis.close();
    return bos.toByteArray();
  }

  public static void main( String[] args ) throws Exception
  {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    encode( "Das wird anders werden".getBytes(), out, "01234567" );

    String s = new BASE64Encoder().encode( out.toByteArray() );
    System.out.println( s );  // qJYN+8Hd5dXsgMl1akQnw4iCbRN3EUbK

    byte[] decode = new BASE64Decoder().decodeBuffer( s );
    InputStream is = new ByteArrayInputStream( decode );
    System.out.println( new String( decode( is, "01234567" ) ) );
  }
}
