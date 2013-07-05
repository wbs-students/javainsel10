package com.tutego.insel.xml.jaxb;

import java.io.File;
import java.util.Arrays;

import javax.xml.bind.JAXB;

public class RoomMarshaller
{
  public static void main( String[] args )
  {
    Player john = new Player();
    john.setName( "John Peel" );
    
    Player tweet = new Player();
    tweet.setName( "Zwitscher Zoe" );
    
    Room room = new Room();
    room.setPlayers( Arrays.asList( john, tweet ) );
    
    File file = new File( "room.xml" );
    JAXB.marshal( room, file );
    
    Room room2 = JAXB.unmarshal( file, Room.class );
    System.out.println( room2.getPlayers().get( 0 ).getName() ); // John Peel
  
    System.out.println( file );
//    file.deleteOnExit();
  }
}
