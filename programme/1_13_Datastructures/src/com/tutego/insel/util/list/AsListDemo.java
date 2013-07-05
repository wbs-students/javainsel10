package com.tutego.insel.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListDemo
{
  public static void main( String[] args )
  {
    Integer[] ints = { 1, 2, 1, 2, 3 };
    List<Integer> intList = Arrays.asList( ints );
    System.out.println( Collections.frequency( intList, 1 ));     // 2

    intList.set( 0, 9 );
    System.out.println( ints[0] );

//    intList.remove( 1 );
    
    List<String> list = new ArrayList<String>( Arrays.asList( "Purzelchen", "Häschen" ) );
    list.remove( 0 );
    System.out.println( list );    // [Häschen]
  }
}
