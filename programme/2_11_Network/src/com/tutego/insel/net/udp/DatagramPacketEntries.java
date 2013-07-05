package com.tutego.insel.net.udp;

import java.net.*;
import java.util.*;

public class DatagramPacketEntries
{
  public static void main( String[] args ) throws Exception
  {
    byte data[] = new Date().toString().getBytes();
    
    InetAddress ia    = InetAddress.getByName( "localhost" );
    int         port = 7;
  
    DatagramPacket p = new DatagramPacket( data, data.length, ia, port );

    System.out.printf( "Paket adressiert an %s an Port %d mit %d Byte:%n%s%n",
                       p.getAddress(), p.getPort(), p.getLength(),
                       new String(p.getData()) );
  }
}
