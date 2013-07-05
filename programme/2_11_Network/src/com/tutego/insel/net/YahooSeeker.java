package com.tutego.insel.net;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class YahooSeeker
{
  public static void main( String... args ) throws Exception
  {
    String search = "Teletubbies On Tour";

    if ( args.length > 0 )
    {
      search = args[ 0 ];
      
      for ( int i = 1; i < args.length; i++ )
        search += " " + args[ i ];
    }

    search = "p=" + URLEncoder.encode( search.trim(), "UTF-8" );
    URL u = new URL( "http://de.search.yahoo.com/search?" + search );

    String r = new Scanner( u.openStream() ).useDelimiter( "\\Z" ).next();
    System.out.println( r );
  }
}
