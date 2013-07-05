package com.tutego.insel.io.ser;

import java.io.*;

public class SpecialWomen implements Serializable
{
  private static final long serialVersionUID = 2584203323009771108L;

  String name = "Madonna";
  transient int age = 30;

  private void writeObject( ObjectOutputStream oos ) throws IOException
  {
    oos.defaultWriteObject();  // Write name but not age
  }

  private void readObject( ObjectInputStream ois ) throws IOException
  {
    try
    {
      ois.defaultReadObject(); // Read name but there is no age
      age = 30;
    }
    catch ( ClassNotFoundException e )
    {
      throw new IOException( "No class found. HELP!!" );
    }
  }
}
