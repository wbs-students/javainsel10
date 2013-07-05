package com.tutego.insel.jdbc;

import javax.sql.rowset.*;

public class WebRowSetDemo
{
  public static void main( String[] args ) throws Exception
  {
    WebRowSet data = RowSetProvider.newFactory().createWebRowSet();
    data.setDataSourceName( "TutegoDS" );
    data.setCommand( "SELECT * FROM Customer" );
    data.setMaxRows( 2 );
    data.execute();

    data.writeXml( System.out );
    data.close();
  }
}
