package com.tutego.insel.lang;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class ExecWithArguments
{
  public static void main( String[] args ) throws IOException
  {
    ProcessBuilder pb = new ProcessBuilder( "cmd" , "/c", "echo", "%JAVATUTOR%" );
    Map<String, String> env = pb.environment();
    env.put( "JAVATUTOR", "Christian Ullenboom" );

    Process p = pb.start();

    System.out.println( new Scanner(p.getInputStream()).nextLine() );
  }
}
