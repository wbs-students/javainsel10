package com.tutego.insel.io.ser;

import java.io.*;
import java.util.*;

class Dolly
{
  @SuppressWarnings("unchecked")
  public static <T> T deepCopy( T o ) throws Exception
  {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    new ObjectOutputStream( baos ).writeObject( o );

    ByteArrayInputStream bais = new ByteArrayInputStream( baos.toByteArray() );
    Object p = new ObjectInputStream( bais ).readObject();

    return (T) p;
  }

  public static void main( String[] args ) throws Exception
  {
    Map<String,String> map = new HashMap<String,String>();
    map.put( "Cul de Paris",
             "hinten unter dem Kleid getragenes Gestell oder Polster" );

    LinkedList<Map<String,String>> l1 = new LinkedList<Map<String,String>>();
    l1.add( map );

    @SuppressWarnings("unchecked")
    List<Map<String, String>> l2 = (List<Map<String, String>>) l1.clone();

    List<Map<String,String>> l3 = deepCopy( l1 );

    map.clear();

    System.out.println( l1 ); // [{}]
    System.out.println( l2 ); // [{}]
    System.out.println( l3 ); // [{Cul de Paris=hinten unter dem Kleid ...}]
  }
}
