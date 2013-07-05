package com.tutego.security.digest;

import java.io.*;
import java.security.MessageDigest;

public class MessageDigestDemo
{
  static byte[] messageDigest( InputStream in, String algo ) throws Exception
  {
    MessageDigest messageDigest = MessageDigest.getInstance( algo );
    byte[] md = new byte[ 8192 ];
  
    for ( int n = 0; (n = in.read( md )) > -1; )
      messageDigest.update( md, 0, n );
  
    return messageDigest.digest();
  }

  static void digestDemo( InputStream in, String algo ) throws Exception
  {
    byte[] digest = messageDigest( in, algo );

    System.out.println( algo + ", Schlüssellänge: " + digest.length * 8 + " Bit" );

    for ( byte b : digest )
      System.out.printf( "%02x", b );

    System.out.printf( "%n%n" );
  }

  public static void main( String[] args ) throws Exception
  {
    String filename = "sign.bat";
    digestDemo( new FileInputStream( filename ), "SHA" );
    digestDemo( new FileInputStream( filename ), "MD5" );
  }
}
