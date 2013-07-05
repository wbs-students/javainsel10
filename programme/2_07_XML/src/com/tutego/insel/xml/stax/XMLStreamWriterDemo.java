package com.tutego.insel.xml.stax;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class XMLStreamWriterDemo
{
  public static void main( String[] args )
  {
    // <?xml version="1.0"?>
    // <party datum="31.12.01">
    // <gast name="Albert Angsthase">
    // <getraenk>Wein</getraenk>
    // <getraenk>Bier</getraenk>
    // <zustand ledig="true" nuechtern="false"/>
    // </gast>
    // </party>

    try
    {
      // Erzeuge einen XMLStreamWriter
      XMLOutputFactory factory = XMLOutputFactory.newInstance();
      XMLStreamWriter writer = factory.createXMLStreamWriter( new FileOutputStream( "writenParty.xml" ) );

      // Der XML-Header wird erzeugt
      writer.writeStartDocument();

      // Zuerst wird das Wurzelelement mit einem Attribut geschrieben
      writer.writeStartElement( "party" );
      writer.writeAttribute( "datum", "31.12.01" );

      // Unter diesem Element wird das Element gast mit einem Attribut erzeugt
      writer.writeStartElement( "gast" );
      writer.writeAttribute( "name", "Albert Angsthase" );

      // Für diesen Gast werden die Getränke erzeugt
      writer.writeStartElement( "getraenk" );
      writer.writeCharacters( "Wein" );
      writer.writeEndElement();

      writer.writeStartElement( "getraenk" );
      writer.writeCharacters( "Bier" );
      writer.writeEndElement();

      // Zum Schluss wird noch das Element Zustand eingef�gt
      writer.writeEmptyElement( "zustand" );
      writer.writeAttribute( "ledig", "true" );
      writer.writeAttribute( "nuechtern", "true" );
      writer.writeEndElement();

      // Das Element party muss geschlossen werden
      writer.writeEndElement();
      writer.writeEndDocument();

      // Das Dokument wird abgeschlossen
      writer.close();
    }
    catch ( FileNotFoundException e )
    {
      e.printStackTrace();
    }
    catch ( XMLStreamException e )
    {
      e.printStackTrace();
    }
  }
}
