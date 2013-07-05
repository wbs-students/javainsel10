package com.tutego.insel.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class Deadlock
{
  static Lock lock1 = new ReentrantLock(),
              lock2 = new ReentrantLock();

  static class T1 extends Thread
  {
    @Override public void run()
    {
      lock1.lock();
      System.out.println( "T1: Lock auf lock1 bekommen" );

      try { TimeUnit.SECONDS.sleep( 1 ); } catch ( InterruptedException e ) { }

      lock2.lock();
      System.out.println( "T1: Lock auf lock2 bekommen" );

      lock2.unlock();
      lock1.unlock();
    }
  }

  static class T2 extends Thread
  {
    @Override public void run()
    {
      lock2.lock();
      System.out.println( "T2: Lock auf lock2 bekommen" );
      
      lock1.lock();
      System.out.println( "T2: Lock auf lock1 bekommen" );

      lock1.unlock();
      lock2.unlock();
    }
  }

  public static void main( String[] args )
  {
    new T1().start();
    new T2().start();
  }
}
