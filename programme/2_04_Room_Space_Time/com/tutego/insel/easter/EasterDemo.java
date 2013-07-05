package com.tutego.insel.easter;

import java.text.DateFormat;
import java.util.Calendar;

import static com.tutego.insel.easter.Easter.easterSunday;
import static java.lang.System.out;

public class EasterDemo
{
  public static void main( String[] args )
  {
    Calendar cal = easterSunday( Calendar.getInstance().get(Calendar.YEAR) );
    DateFormat df = DateFormat.getDateInstance( DateFormat.FULL );

    String s = df.format( cal.getTime() );
    out.println( s );                                       // Sonntag, 16. April 2006

    out.println( df.format(easterSunday(2007).getTime()));  // Sonntag, 8. April 2007
    out.println( df.format(easterSunday(2008).getTime()));  // Sonntag, 23. März 2008
    out.println( df.format(easterSunday(2009).getTime()));  // Sonntag, 12. April 2009
    out.println( df.format(easterSunday(2010).getTime()));  // Sonntag, 4. April 2010
    out.println( df.format(easterSunday(2011).getTime()));  // Sonntag, 24. April 2011
    out.println( df.format(easterSunday(2012).getTime()));  // Sonntag, 8. April 2012
    out.println( df.format(easterSunday(2013).getTime()));  // Sonntag, 31. März 2013
  }
}
