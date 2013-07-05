package com.tutego.security.digest;

import java.security.*;

class SHATest
{
  public static void main( String[] args ) throws Exception
  {
    MessageDigest md = MessageDigest.getInstance( "SHA" );
    
    byte[] digest = md.digest( "abc".getBytes() );
    
    for ( byte b : digest )
      System.out.print( Integer.toHexString( b & 0xFF) + " " );
  }
}
