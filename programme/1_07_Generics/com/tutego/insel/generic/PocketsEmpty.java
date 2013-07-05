package com.tutego.insel.generic;

public class PocketsEmpty
{
  public static boolean isOnePocketEmpty( Pocket<?>... pockets )
  {
    for ( Pocket<?> pocket : pockets )
      if ( pocket.isEmpty() )
        return true;

    return false;
  }

  public static void main( String[] args )
  {
    Pocket<String> p1 = new Pocket<String>( "Bad-Bank" );
    Pocket<Integer> p2 = new Pocket<Integer>( 1500000 );
    System.out.println( isOnePocketEmpty( p1, p2 ));                     // false 
    System.out.println( isOnePocketEmpty( p1, p2, new Pocket<Byte>() )); // true 
  }
}
