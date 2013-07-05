package com.tutego.insel.io.stream;

import java.io.PrintWriter;
import java.io.StringWriter;

public class HTMLWriterDemo
{
  public static void main( String[] args )
  {
    StringWriter sw = new StringWriter();
    HTMLWriter html = new HTMLWriter( sw, "Superkreativer Titel" );
    PrintWriter pw  = new PrintWriter( html );

    pw.println( "Und eine Menge von Sonderzeichen: < und > und &" );
    pw.println( "Zweite Zeile" );
    pw.println();
    pw.println( "Leerzeile" );
    pw.println( "Keine Leerzeile danach" );
    pw.close();

    System.out.println( sw.toString() );
  }
}
