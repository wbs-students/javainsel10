package com.tutego.insel.game.ve;

public class Room extends GameObject
{
  private int size;

  public void setSize( int size )
  {
    if ( size > 0 )
      this.size = size;
  }

  public int getSize()
  {
    return size;
  }

  @Override
  public String toString()
  {
    return String.format( "Room[name=%s, size=%d]", getName(), getSize() );
  }
}
