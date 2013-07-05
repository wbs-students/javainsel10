package com.tutego.insel.xml.jdom;

import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;
import java.util.*;

class AlbertsWater
{
  @SuppressWarnings("all")
  public static void main( String[] args ) throws Exception
  {
    Document doc = new SAXBuilder().build( "party.xml" );
    Element party = doc.getRootElement();
    Element albert = party.getChild( "gast" );

    List albertInfo = albert.getContent();
    Element wasser = new Element( "getraenk" );
    wasser.addContent( "Wasser" );

    albertInfo.add( wasser );

    XMLOutputter fmt = new XMLOutputter();
    fmt.output( doc, System.out );
  }
}
