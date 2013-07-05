package com.tutego.insel.xml.xslt;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

import org.jdom.Document;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.jdom.transform.JDOMResult;
import org.jdom.transform.JDOMSource;

class XslTransformer
{
  public static void main( String[] args ) throws Exception
  {
    Document doc = new SAXBuilder().build( "party.xml" );

    Source xmlFile = new JDOMSource( doc );
    JDOMResult htmlResult = new JDOMResult();

    Transformer transformer = TransformerFactory.newInstance()
        .newTransformer( new StreamSource( "party.xsl" ) );

    transformer.transform( xmlFile, htmlResult );

    XMLOutputter xmlOutputter = new XMLOutputter();
    xmlOutputter.output( doc, System.out );
    xmlOutputter.output( htmlResult.getDocument(), System.out );
  }
}
