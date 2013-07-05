package com.tutego.insel.rest;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class PostMessageJerseyClient
{
  public static void main( String[] args )
  {
    Client create = Client.create();
    WebResource service = create.resource( "http://localhost:8080/rest" );
    System.out.println( service.path( "message" ).path( "user" ).path( "chris" )
                               .type( MediaType.TEXT_PLAIN ).put( String.class, "Hey Chris" ) );
  }
}