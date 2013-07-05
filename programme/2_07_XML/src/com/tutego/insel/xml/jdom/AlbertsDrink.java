package com.tutego.insel.xml.jdom;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

class AlbertsDrink
{
  public static void main( String[] args ) throws Exception
  {
    Document doc = new SAXBuilder().build( "party.xml" );

    Element party = doc.getRootElement();
    Element albertGetraenk = party.getChild( "gast" ).getChild( "getraenk" );
    String getraenk = albertGetraenk.getText();
    System.out.println( "getraenk: " + getraenk );

    Element albert = party.getChild( "gast" );
    System.out.println( albert.getChildText( "getraenk" ) );
  }
}
