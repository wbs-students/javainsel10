package com.tutego.insel.io;

public class PasswordFromConsole
{
  public static void main( String[] args )
  {
    if ( System.console() != null )
    {
      String passwd = new String( System.console().readPassword() );
      System.out.println( passwd );
    }
  }
}
