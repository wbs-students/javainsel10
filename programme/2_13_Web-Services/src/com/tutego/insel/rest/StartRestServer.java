package com.tutego.insel.rest;

import javax.swing.JOptionPane;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

public class StartRestServer
{
  public static void main( String[] args ) throws Exception
  {
    HttpServer server = HttpServerFactory.create( "http://localhost:8080/rest" );
    server.start();
    JOptionPane.showMessageDialog( null, "Ende" );
    server.stop( 0 );
  }
}