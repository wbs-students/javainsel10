package com.tutego.insel.inner;

@SuppressWarnings( "serial" )
public class AnonymousAndInside
{
  public static void main( String[] args )
  {
    java.awt.Point p = new java.awt.Point() { { x = -1; y = -1; } };
    
    System.out.println( p.getLocation() );  // java.awt.Point[x=-1,y=-1]
      
    System.out.println( new java.awt.Point( -1, 0 )
    {
      {
        y = -1;
      }
    }.getLocation() );                      // java.awt.Point[x=-1,y=-1]
  }
}