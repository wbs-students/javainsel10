package com.tutego.insel.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

class ReadAllFromUrl
{
  public static void main( String[] args )
  {
    InputStream is = null;

    try
    {
      URL url = new URL( "http://www.tutego.com/aufgaben/bond.txt" );
      is = url.openStream();
      System.out.println( new Scanner( is ).useDelimiter( "\\Z" ).next() );
    }
    catch ( Exception e )
    {
      e.printStackTrace();
    }
    finally
    {
      if ( is != null )
        try { is.close(); } catch ( IOException e ) { }
    }
  }
}
