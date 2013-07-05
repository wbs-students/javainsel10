package com.tutego.insel.inner;

public class FirstThread
{
  public static void main( String[] args )
  {
    new Thread( new Runnable() {
      @Override public void run() {
        for ( int i = 0; i < 10; i++ )
          System.out.printf( "%d ", i );    
      }
    } ).start();

    for ( int i = 0; i < 10; i++ )
      System.out.printf( "%d ", i );    
  }
}
