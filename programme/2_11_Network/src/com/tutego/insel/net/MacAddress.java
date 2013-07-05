package com.tutego.insel.net;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;

public class MacAddress
{
  public static String getMacAddress() throws SocketException
  {
    String result = "";
  
    for ( NetworkInterface ni : Collections.list( NetworkInterface.getNetworkInterfaces() ) )
    {
      byte[] hardwareAddress = ni.getHardwareAddress();
  
      if ( hardwareAddress != null )
      {
        for ( int i = 0; i < hardwareAddress.length; i++ )
          result += String.format( (i==0?"":"-")+"%02X", hardwareAddress[i] );
  
        return result;
      }
    }
  
    return result;
  }

  public static void main( String[] args )
  {
    try
    {
      System.out.println( getMacAddress() );
    }
    catch ( SocketException e )
    {
      e.printStackTrace();
    }
  }
}
