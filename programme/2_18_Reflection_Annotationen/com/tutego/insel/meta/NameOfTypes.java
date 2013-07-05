package com.tutego.insel.meta;

public class NameOfTypes
{
  public static void main( String[] args )
  {
    String n1 = new java.util.Date().getClass().getName();
    System.out.println( n1 );    // java.util.Date
    String n2 = java.util.RandomAccess.class.getName();
    System.out.println( n2 );    // java.util.RandomAccess
    String n3 = Deprecated.class.getName();
    System.out.println( n3 );    // java.lang.Deprecated
    String n4 = Thread.State.class.getName();
    System.out.println( n4 );    // java.lang.Thread$State
  }
}
