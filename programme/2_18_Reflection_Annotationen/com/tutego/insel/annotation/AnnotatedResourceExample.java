package com.tutego.insel.annotation;

import java.util.Arrays;
import java.util.Date;

class Resources
{
  @CurrentDateResource()
  public Date now;

  @ListOfFilesResource( value = "c:/" )
  public String[] files;

//  @UrlResource( "http://tutego.de/aufgaben/bond.txt" )
//  public String testFile;

//  @UrlResource( value = "http://tutego.de/aufgaben/bond.txt", upperLowerCase = UpperLowerCase.UPPERCASE, trim = true )
//  public String testFile;

  @UrlResource( value = "http://tutego.de/aufgaben/bond.txt",
                 converter = { RemoveNoWordCharactersConverter.class, SortConverter.class } )
  public String testFile;
}

public class AnnotatedResourceExample
{
  public static void main( String[] args )
  {
    Resources resources = ResourceReader.getInitializedResourcesFor( Resources.class );
    System.out.println( resources.now );
    System.out.println( Arrays.toString( resources.files ) );
    System.out.println( resources.testFile );
  }
}
