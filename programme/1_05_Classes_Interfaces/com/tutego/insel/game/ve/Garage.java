package com.tutego.insel.game.ve;

public class Garage extends Room
{
  private static final int MAX_GARAGE_SIZE = 40;

  @Override
  public void setSize( int size )
  {
    if ( size <= MAX_GARAGE_SIZE )
      super.setSize( size );
  }
}
