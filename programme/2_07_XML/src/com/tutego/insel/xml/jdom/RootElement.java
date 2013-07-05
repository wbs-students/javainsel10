package com.tutego.insel.xml.jdom;

import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;

class RootElement
{
  public static void main( String[] args ) throws Exception
  {
    SAXBuilder builder = new SAXBuilder();
    Document doc = builder.build( "party.xml" );

    Element party = doc.getRootElement();

    System.out.println( "Wurzelelement: " + party.toString() );
    
    XMLOutputter fmt = new XMLOutputter();
    fmt.output( doc, System.out );
  }
}
