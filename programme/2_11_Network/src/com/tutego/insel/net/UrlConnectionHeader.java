package com.tutego.insel.net;

import java.util.*;
import java.net.*;

public class UrlConnectionHeader
{
  public static void main( String[] args ) throws Exception
  {
    URL url = new URL( "http://www.tutego.com/index.html" );
    URLConnection con = url.openConnection();
    System.out.println( con );
    
    System.out.println( "Date            : " + new Date(con.getDate()) );
    System.out.println( "Last Modified   : " + new Date(con.getLastModified()) );
    System.out.println( "Content encoding: " + con.getContentEncoding() );
    System.out.println( "Content type    : " + con.getContentType() );
    System.out.println( "Content length  : " + con.getContentLength() );
  }
}
