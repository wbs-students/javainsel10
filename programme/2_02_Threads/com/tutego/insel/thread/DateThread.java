package com.tutego.insel.thread;

import java.util.Date;

public class DateThread extends Thread
{
  @Override public void run()
  {
    for ( int i = 0; i < 20; i++ )
      System.out.println( new Date() );
  }
}
