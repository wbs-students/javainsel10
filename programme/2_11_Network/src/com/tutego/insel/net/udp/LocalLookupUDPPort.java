package com.tutego.insel.net.udp;

import java.net.*;

class LocalLookupUDPPort
{
  public static void main( String[] args )
  {
    for ( int i = 1; i <= 65535; i++ )
    {
      try
      {
        DatagramSocket server = new DatagramSocket( i );
      
        server.close();
      }
      catch ( SocketException e )
      {
        System.out.println( "Laufender UDP Dienst auf Port " + i + "." );
      }
    }
  }
}