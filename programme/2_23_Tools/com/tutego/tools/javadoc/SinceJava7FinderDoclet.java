package com.tutego.tools.javadoc;

import java.io.*;
import java.util.Formatter;
import com.sun.javadoc.*;
import com.sun.tools.javadoc.Main;

public class SinceJava7FinderDoclet
{
  private final static Formatter formatter = new Formatter();

  public static boolean start( RootDoc root )
  {
    for ( ClassDoc clazz : root.classes() )
      processClass( clazz );
    return true;
  }

  private static void processClass( ClassDoc clazz )
  {
    for ( Tag tag : clazz.tags( "since" ) )
      if ( "1.7".equals( tag.text() ) )
        formatter.format( "Neuer Typ %s%n", clazz );

    for ( MethodDoc method : clazz.methods() )
      for ( Tag tag : method.tags( "since" ) )
        if ( "1.7".equals( tag.text() ) )
          formatter.format( "Neue Methode %s%n", method );

    for ( ConstructorDoc constructor : clazz.constructors() )
      for ( Tag tag : constructor.tags( "since" ) )
        if ( "1.7".equals( tag.text() ) )
          formatter.format( "Neuer Konstruktor %s%n", constructor );

    for ( FieldDoc field : clazz.fields() )
      for ( Tag tag : field.tags( "since" ) )
        if ( "1.7".equals( tag.text() ) )
          formatter.format( "Neues Attribut %s%n", field );
  }

  public static void main( String[] args )
  {
    PrintStream err = System.err, out = System.out;
    System.setErr( new PrintStream( new OutputStream() {
      @Override public void write( int b ) { }
    } ) );
    System.setOut( System.err );

    String[] params = { "-quiet", // ignored!?
                        "-doclet", SinceJava7FinderDoclet.class.getName(),
                        "-sourcepath", "C:/Program Files/Java/jdk1.7.0/src/",
//                        "java.lang"
                        "-subpackages", "java:javax"
                        };
    Main.execute( params );

    System.setErr( err );
    System.setOut( out );

    System.out.println( formatter );
  }
}