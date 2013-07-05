package com.tutego.insel.io.file;

import java.io.File;
import javax.activation.MimetypesFileTypeMap;

public class PrintMimeType
{
  public static void main( String[] args )
  {
    File f = new File( "C:/Programme/Java/jdk1.6.0/demo/applets/ImageMap/images/jim.graham.gif" );

    MimetypesFileTypeMap map = new MimetypesFileTypeMap();
    System.out.println( map.getContentType( f ) );  // image/gif
  }
}
