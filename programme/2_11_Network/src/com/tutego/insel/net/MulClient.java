package com.tutego.insel.net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class MulClient
{
  public static void main( String[] args )
  {
    Socket server = null;

    try
    {
      server = new Socket( "localhost", 3141 );
      Scanner     in  = new Scanner( server.getInputStream() );
      PrintWriter out = new PrintWriter( server.getOutputStream(), true );

      out.println( "2" );
      out.println( "4" );
      System.out.println( in.nextLine() );

      server = new Socket( "localhost", 3141 );
      in  = new Scanner( server.getInputStream() );
      out = new PrintWriter( server.getOutputStream(), true );

      out.println( "23895737895" );
      out.println( "434589358935857" );
      System.out.println( in.nextLine() );
}
    catch ( UnknownHostException e ) {
      e.printStackTrace();
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
    finally
    {
      if ( server != null )
        try { server.close(); } catch ( IOException e ) { }
    }
  }
}
