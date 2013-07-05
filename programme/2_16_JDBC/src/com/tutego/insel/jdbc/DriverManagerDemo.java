package com.tutego.insel.jdbc;

import java.io.PrintWriter;
import java.sql.*;
import java.util.Enumeration;

class DriverManagerDemo    
{
  public static void main( String[] args )
  {
    DriverManager.setLogWriter( new PrintWriter(System.out) );

    try
    {
      Class.forName( "org.hsqldb.jdbcDriver" );
//      Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
    }
    catch ( ClassNotFoundException e )
    {
      e.printStackTrace();
    }

    for ( Enumeration<Driver> e = DriverManager.getDrivers(); e.hasMoreElements(); )
      System.out.println( e.nextElement().getClass().getName() );
  }
}
