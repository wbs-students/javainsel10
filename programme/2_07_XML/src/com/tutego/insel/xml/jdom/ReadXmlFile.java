package com.tutego.insel.xml.jdom;

import java.io.IOException;

import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.*;

class ReadXmlFile
{
  public static void main( String[] args ) throws IOException, JDOMException
  {
    String filename = "party.xml";
    Document doc = new SAXBuilder().build( filename );

    XMLOutputter fmt = new XMLOutputter();
    fmt.output( doc, System.out );
  }
}
