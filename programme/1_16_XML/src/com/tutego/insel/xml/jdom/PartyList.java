package com.tutego.insel.xml.jdom;

import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

class PartyList
{
  public static void main( String[] args ) throws Exception
  {
    Document doc = new SAXBuilder().build( "party.xml" );

    Element party = doc.getRootElement();

    List<?> partyInfo = party.getContent();
    Iterator<?> partyIterator = partyInfo.iterator();
    while ( partyIterator.hasNext() )
      System.out.println( partyIterator.next() );
  }
}
