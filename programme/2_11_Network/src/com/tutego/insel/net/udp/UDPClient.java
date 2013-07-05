package com.tutego.insel.net.udp;

import java.io.IOException;
import java.net.*;
import java.util.*;

class UDPClient
{
  public static void main( String[] args ) throws IOException, InterruptedException
  {
    InetAddress ia = InetAddress.getByName( "localhost" );

    while ( true )
    {
      String s = new Date().toString();
      byte[] raw = s.getBytes();

      DatagramPacket packet = new DatagramPacket( raw, raw.length, ia, 4711 );

      DatagramSocket dSocket = new DatagramSocket();
    
      dSocket.send( packet );

      System.out.println( "Weg is' es" );
    
      Thread.sleep( 1000 );
    }
  }
}