package com.tutego.insel.xml.jaxb;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.tutego.insel.xml.jaxb.yahoo.geocoding.ObjectFactory;
import com.tutego.insel.xml.jaxb.yahoo.geocoding.ResultSet;
import com.tutego.insel.xml.jaxb.yahoo.geocoding.ResultType;

// xjc -d "c:/" -p com.tutego.insel.xml.jaxb.yahoo.geocoding http://local.yahooapis.com/MapsService/V1/GeocodeResponse.xsd
public class YahooGeocoding
{
  public static void main( String[] args ) throws JAXBException, MalformedURLException
  {
    JAXBContext context = JAXBContext.newInstance( ObjectFactory.class );
    Unmarshaller unmarshaller = context.createUnmarshaller();
    
    // http://developer.yahoo.com/maps/rest/V1/geocode.html
    String url = "http://local.yahooapis.com/MapsService/V1/geocode?" +
    		         "appid=YD-9G7bey8_JXxQP6rxl.fBFGgCdNjoDMACQA--&" +
    		         "street=701+First+Ave&city=Sunnyvale&state=CA";
    ResultSet results = (ResultSet) unmarshaller.unmarshal( new URL(url) );
    
    ResultType result = results.getResult().get( 0 );
    System.out.printf( "Longitude = %s, Latitude= %s%n", result.getLongitude(), result.getLatitude() );
  }
}
