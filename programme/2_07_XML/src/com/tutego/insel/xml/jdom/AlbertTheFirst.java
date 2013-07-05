package com.tutego.insel.xml.jdom;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

class AlbertTheFirst
{
  public static void main( String[] args ) throws Exception
  {
    Document doc = new SAXBuilder().build( "party.xml" );
    
    Element party = doc.getRootElement();

    Element albert = party.getChild( "gast" );
    System.out.println( "albert: " + albert.toString() );
    
    Element albertGetraenk = albert.getChild( "getraenk" );
    System.out.println( "albertGetraenk: " + albertGetraenk.toString() );
  }
}
