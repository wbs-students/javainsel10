package com.tutego.insel.meta;

import java.util.Date;

class Ober
{
  int    i = 123;
  double d = 3.1415;
}

public class ToStringHelperDemo extends Ober
{
  String hello = "world";
  int    i     = 42;
  Date   date;

  public static void main( String[] args )
  {
    ToStringHelperDemo t = new ToStringHelperDemo();

    System.out.println( ToStringHelper.toString( t ) );
    // c.t.i.m.ToStringHelperDemo[hello=world, i=42, date=null, i=123, d=3.1415]
  }
}