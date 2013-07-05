package com.tutego.insel.xml.dom;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.Document;

public class DOMParty
{
  public static void main( String[] args ) throws Exception
  {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse( new File("party.xml") );
    System.out.println( document.getFirstChild().getTextContent() );
  }
}
