package com.tutego.insel.thread.concurrent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Dancefloor
{
  private final Queue<String> dancers = new LinkedList<String>();
  private final Lock lock             = new ReentrantLock();
  private final Condition notFull     = lock.newCondition();
  private final Condition notEmpty    = lock.newCondition();

  public void in( String name ) throws InterruptedException
  {
    lock.lock();
    try
    {
      while ( dancers.size() == 5 )
      {
        System.out.printf( "Tanzfläche ist voll, kann %s nicht aufnehmen!%n", name  );
        notFull.await();
      }

      dancers.add( name );
      System.out.printf( "%s ist neu auf der Tanzfläche.%n", name );

      notEmpty.signalAll();
    }
    finally {
      lock.unlock();
    }
  }

  public String out() throws InterruptedException
  {
    lock.lock();
    try
    {
      while ( dancers.size() == 0 )
      {
        System.out.println( "Keiner auf der Tanzfläche!" );
        notEmpty.await();
      }

      String elem = dancers.poll();

      notFull.signalAll();

      return elem;
    }
    finally {
      lock.unlock();
    }
  }
}

public class DancefloorDemo
{
  public static void main( String[] args )
  {
    final Dancefloor dancefloor = new Dancefloor();

    new Thread()
    {
      @Override public void run()
      {
        try
        {
          while ( true )
          {
            dancefloor.in( "Tony Manero " + System.nanoTime() % 100 );

            TimeUnit.MILLISECONDS.sleep( new Random().nextInt( 200 ) + 1 );
          }
        }
        catch ( InterruptedException e ) { e.printStackTrace(); }
      }
    }.start();

    class Thimblerigger extends Thread
    {
      final private String name;

      Thimblerigger( String name )
      {
        this.name = name;
      }

      @Override public void run()
      {
        try
        {
          while ( true )
          {
            System.out.println( name + " nahm " + dancefloor.out() + " von der Tanzfläche." );

            TimeUnit.MILLISECONDS.sleep( new Random().nextInt( 2000 ) + 1 );
          }
        }
        catch ( InterruptedException e ) { e.printStackTrace(); }
      }
    }

    new Thimblerigger( "Hütchenspieler Heinz" ).start();
    new Thimblerigger( "Pronto Salvatore" ).start();
    new Thimblerigger( "Flinker Finger Jo" ).start();
  }
}
