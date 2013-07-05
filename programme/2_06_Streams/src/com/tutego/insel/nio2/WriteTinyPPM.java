package com.tutego.insel.nio2;

import java.io.*;
import java.nio.file.*;

public class WriteTinyPPM
{
  public static void main( String[] args )
  {
    try ( OutputStream out = Files.newOutputStream( Paths.get( "littlepic.ppm" ) ) )
    {
      out.write( "P3 1 1 255 255 0 0".getBytes() );
    }
    catch ( IOException e )
    {
      e.printStackTrace();
    }
  }
}