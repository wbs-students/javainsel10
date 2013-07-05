package com.tutego.insel.jdbc;

import java.sql.*;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JdbcWithDS
{
  public static void main( String[] args ) throws Exception
  {
    Connection con = null;

    try
    {
      DataSource ds = (DataSource) new InitialContext().lookup( "TutegoDS" );
      con = ds.getConnection();
      ResultSet rs = con.createStatement().executeQuery( "SELECT * FROM Customer" );

      while ( rs.next() )
        System.out.printf( "%s, %s %s%n", rs.getString( 1 ), rs.getString( 2 ),
                           rs.getString( 3 ) );
    }
    finally
    {
      if ( con != null )
        try { con.close(); } catch ( SQLException e ) { e.printStackTrace(); }
    }
  }
}
