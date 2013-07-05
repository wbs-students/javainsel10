package com.tutego.insel.xpath;

import java.util.List;

import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

public class XPathDemo
{
  public static void main( String[] args ) throws Exception
  {
    Document doc = new SAXBuilder().build( "party.xml" );

    //

    List<?> nameList = XPath.selectNodes( doc, "/party/gast/@name" );
    
    for ( Object object : nameList )
    {
      Attribute attribute = (Attribute) object;
      System.out.println( attribute.getValue() );
    }

    //

    XPath xpath = XPath.newInstance( "/party/gast/getraenk" );
    List<?> drinkList = xpath.selectNodes( doc );
    
    for ( Object object : drinkList )
    {
      Element aktuellesElement= (Element) object;
      System.out.println( aktuellesElement.getValue() );
    }

    //

    Object firstGuest = XPath.selectSingleNode( doc, "/party/gast[1]/@name" );
    System.out.println( ((Attribute) firstGuest).getValue() );
  }
}
