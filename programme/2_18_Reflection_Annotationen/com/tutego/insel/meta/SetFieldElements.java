package com.tutego.insel.meta;

import java.lang.reflect.*;
import java.awt.*;

class SetFieldElements
{
  public static void main( String[] args )
  {
    Point p = new Point( 11, 22 );
    System.out.println( p );

    modify( p, "x", 1111 );   // java.awt.Point[x=11,y=22]
    modify( p, "y", 2222 );   // java.awt.Point[x=1111,y=2222]

    System.out.println( p );
    
    modify( p, "z", 0 );      // java.lang.NoSuchFieldException: z
  }

  static void modify( Object o, String name, Integer param )
  {
    try
    {
      Field field = o.getClass().getField( name );
      field.set( o, param );
    }
    catch ( NoSuchFieldException e ) {
      e.printStackTrace();
    }
    catch ( IllegalAccessException e ) {
      e.printStackTrace();
    }
  }
}
