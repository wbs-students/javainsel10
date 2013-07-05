package com.tutego.insel.rest;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class ParameterizedMessageJerseyClient
{
  public static void main( String[] args )
  {
    WebResource s1 = Client.create().resource( "http://localhost:8080/rest" );
    Builder sb1 = s1.path( "message" ).path( "user" ).path("chris").accept( MediaType.TEXT_PLAIN );
    System.out.println( sb1.get( String.class ) );
    
    WebResource s2 = Client.create().resource( "http://localhost:8080/rest" );
    Builder sb2 = s2.path( "message" ).path( "user" ).path("chris").path("search").path("kitesurfing").accept( MediaType.TEXT_PLAIN );
    System.out.println( sb2.get( String.class ) );
  }
}
