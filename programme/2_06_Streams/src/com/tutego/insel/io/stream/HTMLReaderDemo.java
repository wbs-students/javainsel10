package com.tutego.insel.io.stream;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;

public class HTMLReaderDemo
{
  public static void main( String[] args )
  {
    try
    {
      String s = "<html>Hallo! <b>Ganz schön fett.</b>"
                 + "Ah, wieder normal.</html>";

      Reader sr = new StringReader( s );
      Reader hr = new HTMLReader( sr );
      BufferedReader in = new BufferedReader( hr );

      for ( String line; (line = in.readLine()) != null; )
        System.out.println( line );

      in.close();
    }
    catch ( Exception e )
    {
      e.printStackTrace();
    }
  }
}
