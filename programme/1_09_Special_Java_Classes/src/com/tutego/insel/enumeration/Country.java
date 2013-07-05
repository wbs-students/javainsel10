package com.tutego.insel.enumeration;

import java.util.Locale;

public enum Country
{
//  GERMANY( Locale.GERMANY ), UK( Locale.UK ), CHINA( Locale.CHINA );
//
//  private Locale country;
//
//  private Country( Locale country )
//  {
//    this.country = country;
//  }
//
//  public String getISO3Country()
//  {
//    return country.getISO3Country();
//  }

  GERMANY, UK, CHINA;

  public String getISO3Country()
  {
    if ( this == GERMANY )
      return Locale.GERMANY.getISO3Country();
    else if ( this == UK )
      return Locale.UK.getISO3Country();
    return Locale.CHINA.getISO3Country();
  }
}
