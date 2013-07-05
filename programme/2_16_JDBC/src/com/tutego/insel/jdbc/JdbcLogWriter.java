package com.tutego.insel.jdbc;

import java.io.PrintWriter;
import java.sql.DriverManager;

class JdbcLogWriter
{
  public static void main( String[] args ) throws ClassNotFoundException
  {
    DriverManager.setLogWriter( new PrintWriter( System.out ) );
    
    Class.forName( "org.hsqldb.jdbcDriver" );
  }
}
