package com.tutego.insel.xml.sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParty
{
  public static void main( String[] args ) throws Exception
  {
    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser saxParser = factory.newSAXParser();
    DefaultHandler handler = new PartyHandler();
    saxParser.parse( new File( "party.xml" ), handler );
  }
}
