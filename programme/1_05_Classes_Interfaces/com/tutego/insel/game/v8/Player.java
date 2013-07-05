package com.tutego.insel.game.v8;

public class Player
{
  public String name;
  public String item;

  public Player( Player player )
  {
    name = player.name;
    item = player.item;
  }

  public Player( String name, String item )
  {
    this.name = name;
    this.item = item;
  }
}