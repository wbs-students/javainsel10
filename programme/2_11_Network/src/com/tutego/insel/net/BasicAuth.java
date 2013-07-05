package com.tutego.insel.net;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.Scanner;

public class BasicAuth
{
  public static void main( String[] args ) throws IOException
  {
    Authenticator.setDefault( new Authenticator()
    {
      @Override protected PasswordAuthentication getPasswordAuthentication()
      {
        System.out.printf( "url=%s, host=%s, ip=%s, port=%s%n",
                           getRequestingURL(), getRequestingHost(),
                           getRequestingSite(), getRequestingPort() );
      
        return new PasswordAuthentication( "user", "abc".toCharArray() );
      }
    } );
    
    URL url = new URL( "http://www.bla.net/login/" );
  
    System.out.println( new Scanner( url.openStream() ).useDelimiter( "\\Z" ).next() );
  }
}