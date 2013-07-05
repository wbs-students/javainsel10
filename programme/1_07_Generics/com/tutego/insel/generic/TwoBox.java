package com.tutego.insel.generic;

import java.lang.reflect.Array;

@SuppressWarnings("all")
class TwoBox<T>
{
//  private T[] array = new T[ 2 ];   // Cannot create a generic array of T
  T[] array = (T[]) Array.newInstance( Object.class, 2 );

  T[] getArray()
  {
    return array;
  }
  
  public static void main( String[] args )
  {
    TwoBox<String> twoStrings = new TwoBox<String>();
    String[] stringArray = twoStrings.getArray();
  }
}
