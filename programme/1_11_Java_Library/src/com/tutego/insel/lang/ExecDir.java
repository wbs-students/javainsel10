package com.tutego.insel.lang;

import java.io.*;
import java.util.Scanner;

public class ExecDir
{
  public static void main( String[] args ) throws IOException
  {
    ProcessBuilder builder = new ProcessBuilder( "cmd", "/c", "dir" );
    builder.directory( new File("c:/") );
    Process p = builder.start();

    Scanner s = new Scanner( p.getInputStream() ).useDelimiter( "\\Z" );
    System.out.println( s.next() );
    s.close();
  }
}