package com.tutego.insel.xml.jaxb;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

public class ValidatingRoomUnmarshaller
{
  public static void main( String[] args ) throws Exception
  {
    File file = new File( "invalid-room.xml" );
    
    JAXBContext context = JAXBContext.newInstance( Room.class );
    Unmarshaller unmarshaller = context.createUnmarshaller();
    SchemaFactory sf = SchemaFactory.newInstance( XMLConstants.W3C_XML_SCHEMA_NS_URI );
    Schema schema = sf.newSchema( ValidatingRoomUnmarshaller.class.getResource( "/schema1.xsd" ) );
    unmarshaller.setSchema( schema );
    
    Room room = (Room) unmarshaller.unmarshal( file ); 
    System.out.println( room.getPlayers() );
  }
}
