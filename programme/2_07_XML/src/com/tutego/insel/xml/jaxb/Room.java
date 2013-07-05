package com.tutego.insel.xml.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( namespace = "http://tutego.com/" )
public class Room
{
  private List<Player> players = new ArrayList<Player>();

  @XmlElement( name = "player" )
  public List<Player> getPlayers()
  {
    return players;
  }
  
  public void setPlayers( List<Player> players )
  {
    this.players = players;
  }
}
