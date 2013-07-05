package com.tutego.insel.util;

import java.util.*;

public class MyFirstCollection
{
  private static void fill( Collection<String> c )
  {
    c.add( "Juvy" );
    c.add( "Maggie" );
    c.add( "Joy" );
  }

  public static void main( String[] args )
  {
    List<String> c = new LinkedList<String>();
    fill( c );
    System.out.println( c );     // [Juvy, Maggie, Joy]
    Collections.sort( c );
    System.out.println( c );     // [Joy, Juvy, Maggie]
  }
}
