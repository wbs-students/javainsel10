package com.tutego.insel.jdbc;

import java.sql.*;

public class SecondSqlAccess
{
  public static void main( String[] args )
  {
    Connection con = null;

    try
    {
      con = DriverManager.getConnection( "jdbc:derby://localhost:1527/sample", "app", "app" );
      Statement stmt = con.createStatement();

      ResultSet rs = stmt.executeQuery( "SELECT NAME, ADDRESSLINE1, PHONE FROM Customer" );

      while ( rs.next() )
        System.out.printf( "%s, %s %s%n", rs.getString(1),
                           rs.getString(2), rs.getString(3) );

      rs.close();

      stmt.close();
    }
    catch ( SQLException e )
    {
      e.printStackTrace();
    }
    finally
    {
      if ( con != null )
        try { con.close(); } catch ( SQLException e ) { e.printStackTrace(); }
    }
  }
}
