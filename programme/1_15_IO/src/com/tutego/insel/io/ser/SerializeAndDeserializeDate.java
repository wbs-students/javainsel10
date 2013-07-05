package com.tutego.insel.io.ser;

import java.io.*;
import java.util.*;

public class SerializeAndDeserializeDate
{
  static void serialize( String filename )
  {
    OutputStream fos = null;
    
    try
    {
      fos = new FileOutputStream( filename );
      ObjectOutputStream o = new ObjectOutputStream( fos );
      o.writeObject( "Today" );
      o.writeObject( new Date() );
    }
    catch ( IOException e ) { System.err.println( e ); }
    finally { try { fos.close(); } catch ( Exception e ) { } }
  }

  static void deserialize( String filename )
  {
    InputStream fis = null;
    
    try
    {
      fis = new FileInputStream( filename );
      ObjectInputStream o = new ObjectInputStream( fis );
      String string = (String) o.readObject();
      Date date     = (Date) o.readObject();
 
      System.out.println( string );
      System.out.println( date );
    }
    catch ( IOException e ) { System.err.println( e ); }
    catch ( ClassNotFoundException e ) { System.err.println( e ); }
    finally { try { fis.close(); } catch ( Exception e ) { } }
  }
  
  public static void main( String[] args )
  {
    String filename = "c:/datum.ser";
    
    serialize( filename );
    deserialize( filename );
  }
}

