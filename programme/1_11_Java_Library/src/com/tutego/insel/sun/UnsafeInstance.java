package com.tutego.insel.sun;

import java.io.File;
import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class UnsafeInstance
{
  public static void main( String[] args ) throws Exception
  {
    Field field = Unsafe.class.getDeclaredField( "theUnsafe" );
    field.setAccessible( true );
    Unsafe unsafe = (Unsafe) field.get( null );
    File f = (File) unsafe.allocateInstance( File.class );
    System.out.println( f.getPath() );
  }
}
