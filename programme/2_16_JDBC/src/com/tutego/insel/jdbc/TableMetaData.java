package com.tutego.insel.jdbc;

import java.sql.*;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TableMetaData
{
  public static void main( String[] args ) throws Exception
  {
    Connection con = ((DataSource) new InitialContext().lookup( "TutegoDS" )).getConnection();
    try
    {
      ResultSet rs = con.createStatement().executeQuery( "SELECT * FROM ITEM" );
      ResultSetMetaData meta = rs.getMetaData();

      int numerics = 0;

      for ( int i = 1; i <= meta.getColumnCount(); i++ )
      {
        System.out.printf( "%-20s %-20s%n", meta.getColumnLabel( i ),
                                            meta.getColumnTypeName( i ) );
  
        if ( meta.isSigned( i ) )
          numerics++;
      }
  
      System.out.println();
      System.out.println( "Spalten: " + meta.getColumnCount() +
                          ", Numerisch: " + numerics );
    }
    finally
    {
      con.close ();
    }
  }
}
