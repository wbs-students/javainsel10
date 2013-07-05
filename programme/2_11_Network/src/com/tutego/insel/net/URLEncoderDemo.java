package com.tutego.insel.net;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLEncoderDemo
{
  static void enc( String s )
  {
    try {
      System.out.println( URLEncoder.encode( s, "UTF-8" ) );
    }
    catch ( UnsupportedEncodingException e ) {
      e.printStackTrace();
    }
  }

  public static void main( String[] args )
  {
    enc( "String mit Leerzeichen" );  // String+mit+Leerzeichen
    enc( "String%mit%Prozenten" );    // String%25mit%25Prozenten
    enc( "String*mit*Sternen" );      // String*mit*Sternen
    enc( "String+hat+ein+Plus" );     // String%2Bhat%2Bein%2BPlus
    enc( "String/mit/Slashes" );      // String%2Fmit%2FSlashes
    enc( "String\"mit\"Gänsen" );     // String%22mit%22G%C3%A4nsen
    enc( "String:Doppelpunkten" );    // String%3ADoppelpunkten
    enc( "String=ist=alles=gleich" ); // String%3Dist%3Dalles%3Dgleich
    enc( "String&String&String" );    // String%26String%26String
    enc( "String.mit.Punkten");       // String.mit.Punkten
  }
}
