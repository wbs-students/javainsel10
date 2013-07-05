package com.tutego.insel.util;

import java.util.*;

class Room
{
  int sm;

  Room( int sm )
  {
    this.sm = sm;
  }
}

class RoomComparator implements Comparator<Room>
{
  @Override public int compare( Room room1, Room room2 )
  {
    return room1.sm - room2.sm;
  }
}

public class RoomComparatorDemo
{
  public static void main( String[] args )
  {
    List<Room> list = Arrays.asList(
                             new Room(100), new Room(1123), new Room(123) );

    Collections.sort( list, new RoomComparator() );
    System.out.println( list.get(0).sm );      // 100
  }
}