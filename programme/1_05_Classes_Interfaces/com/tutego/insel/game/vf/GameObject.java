package com.tutego.insel.game.vf;

public class GameObject
{
  public String name;

  @Override public String toString()
  {
    return String.format( "GameObject[name=%s]", name );
  }
}
