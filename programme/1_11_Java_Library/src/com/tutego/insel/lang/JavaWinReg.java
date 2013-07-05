package com.tutego.insel.lang;

import java.io.IOException;
import java.util.Scanner;

public class JavaWinReg
{
  public static void main( String[] args ) throws IOException
  {
    ProcessBuilder builder = new ProcessBuilder( "reg", "query", "\"HKEY_CURRENT_USER\\Control Panel\\Desktop\"", "/v", "Wallpaper" );
    Process p = builder.start();
    Scanner scanner = new Scanner( p.getInputStream() ).useDelimiter( "    \\w+\\s+\\w+\\s+" );
    scanner.next();
    System.out.println( scanner.next() );
  }
}
