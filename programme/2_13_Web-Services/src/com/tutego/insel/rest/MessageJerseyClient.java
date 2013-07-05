package com.tutego.insel.rest;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class MessageJerseyClient
{
  public static void main( String[] args )
  {
    Client create = Client.create();
    WebResource service = create.resource( "http://localhost:8080/rest" );
    System.out.println( service.path( "message" ).accept( MediaType.TEXT_PLAIN ).get( String.class ) );
  }
}