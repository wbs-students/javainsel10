package com.tutego.insel.rest;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class XmlJsonMessageJerseyClient
{
  public static void main( String[] args )
  {
    WebResource s1 = Client.create().resource( "http://localhost:8080/rest" );
    Builder sb1 = s1.path( "message" ).path( "serverinfo" ).accept( MediaType.APPLICATION_JSON );
    System.out.println( sb1.get( ServerInfo.class ).server );  // Windows Vista 6.0

    WebResource s2 = Client.create().resource( "http://localhost:8080/rest" );
    Builder sb2 = s2.path( "message" ).path( "serverinfo" ).accept( MediaType.TEXT_XML );
    System.out.println( sb2.get( ServerInfo.class ).server );  // Windows Vista 6.0

    WebResource s3 = Client.create().resource( "http://localhost:8080/rest" );
    Builder sb3 = s3.path( "message" ).path( "serverinfo" ).accept( MediaType.TEXT_PLAIN );
    System.out.println( sb3.get( ServerInfo.class ).server );  // UniformInterfaceException
  }
}
