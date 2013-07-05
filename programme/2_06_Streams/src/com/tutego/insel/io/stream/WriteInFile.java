package com.tutego.insel.io.stream;

import java.io.*;
import java.util.Date;

public class WriteInFile
{
  public static void main( String[] args ) throws FileNotFoundException
  {
    PrintWriter out = new PrintWriter( "c:/datei.txt" );
    out.println( "Hallo Welt!" );
    out.print( "Es ist " );
    out.printf( "%tT Uhr.", new Date() );
    out.close();
  }
}
