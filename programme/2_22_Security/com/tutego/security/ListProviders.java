package com.tutego.security;

import java.security.Provider;
import java.security.Security;

public class ListProviders
{
  public static void main( String[] args )
  {
    for ( Provider p : Security.getProviders() )
      System.out.println( p + ": " + p.getInfo() );
  }
}
