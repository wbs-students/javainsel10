package com.tutego.insel.inner;

@SuppressWarnings("unused")
public class FunInside
{
  public static void main( String[] args )
  {
    int i = 2;
    final int j = 3;
    
    class In
    {
      In() {
        System.out.println( j );
//      System.out.println( i );    // Compiler error because i is not final
      }
    }
    new In();
  }
}
