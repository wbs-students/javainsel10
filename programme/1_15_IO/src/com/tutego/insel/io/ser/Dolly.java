package com.tutego.insel.io.ser;

import java.io.*;
import java.util.*;

class Dolly
{
  public static Object deepCopy( Object o ) throws Exception
  {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    new ObjectOutputStream( baos ).writeObject( o );
    
    ByteArrayInputStream bais = new ByteArrayInputStream( baos.toByteArray() );
    Object p = new ObjectInputStream( bais ).readObject();

    return p;
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
    
    @SuppressWarnings("unchecked")
    List<Map<String,String>> l3 = (List<Map<String,String>>) deepCopy( l1 );
    
    map.clear();
    
    System.out.println( l1 ); // [{}]
    System.out.println( l2 ); // [{}]
    System.out.println( l3 ); // [{Cul de Paris=hinten unter dem Kleid ...}]
  }
}
