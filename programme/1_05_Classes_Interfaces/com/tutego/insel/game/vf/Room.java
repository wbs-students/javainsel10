package com.tutego.insel.game.vf;

public class Room extends GameObject
{
  public int size;

  @Override public String toString()
  {
    return String.format( "Room[name=%s, size=%d]", name, size );
  }
}
