package com.tutego.insel.util.map;

public class EqualsIgnoreCaseString
{
  private final String string;
  
  public EqualsIgnoreCaseString( String string )
  {
    this.string = string.toLowerCase(); 
  }

  @Override
  public int hashCode()
  {
    return string.hashCode();
  }

  @Override
  public boolean equals( Object obj )
  {
    if ( this == obj )
      return true;
    if ( obj == null )
      return false;
    if ( getClass() != obj.getClass() )
      return false;
    if ( string == null )
      if ( ((EqualsIgnoreCaseString) obj).string != null )
        return false;
    return string.equals( ((EqualsIgnoreCaseString) obj).string );
  }
}
