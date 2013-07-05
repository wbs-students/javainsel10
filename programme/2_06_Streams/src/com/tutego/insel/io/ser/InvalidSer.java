package com.tutego.insel.io.ser;

import java.io.*;

class Player implements Serializable
{
//  static final long serialVersionUID = 8962277452270582278L;

  String name;
  double    age;
}

public class InvalidSer
{
  public static void main( String[] args ) throws Exception
  {
//    ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( "c:/test.ser" ) );
//    oos.writeObject( new Player() );
//    oos.close();

    ObjectInputStream ois = new ObjectInputStream( new FileInputStream( "c:/test.ser" ) );
    Player player = (Player) ois.readObject();
    System.out.println( player );
    ois.close();
  }
}
