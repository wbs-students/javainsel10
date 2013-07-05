package com.tutego.insel.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class PostRequest
{
  public static void main( String[] args ) throws IOException
  {
    String body = "param1=" + URLEncoder.encode( "value1", "UTF-8" ) + "&" +
                  "param2=" + URLEncoder.encode( "value2", "UTF-8" );
    
    URL url = new URL( "http://li.la.lu.lo/post/" );
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod( "POST" );
    connection.setDoInput( true );
    connection.setDoOutput( true );
    connection.setUseCaches( false );
    connection.setRequestProperty( "Content-Type",
                                   "application/x-www-form-urlencoded" );
    connection.setRequestProperty( "Content-Length", String.valueOf(body.length()) );
    
    OutputStreamWriter writer = new OutputStreamWriter( connection.getOutputStream() );
    writer.write( body );
    writer.flush();
    
    BufferedReader reader = new BufferedReader(
                              new InputStreamReader(connection.getInputStream()) ); 
    
    for ( String line; (line = reader.readLine()) != null; )
    {
      System.out.println( line );
    }
    
    writer.close();
    reader.close();
  }
}
