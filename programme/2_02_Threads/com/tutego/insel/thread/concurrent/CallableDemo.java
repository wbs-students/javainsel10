package com.tutego.insel.thread.concurrent;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableDemo
{
  public static void main( String[] args )
  {
    byte b[] = new byte[ 4000000 ];
    new Random().nextBytes( b );
    Callable<byte[]> c = new SorterCallable( b );
    
    ExecutorService executor = Executors.newCachedThreadPool();

    Future<byte[]> result = executor.submit( c );

    System.out.println( result.isDone() );

    try
    {
      byte[] bs = result.get( 1, TimeUnit.SECONDS );
      System.out.printf( "%d, %d, %d%n", bs[0], bs[1], bs[bs.length-1] );  // -128, -128, 127

//      byte[] bs = result.get();
//      System.out.printf( "%d, %d, %d%n", bs[0], bs[1], bs[bs.length-1] );  // -128, -128, 127
    }
    catch ( Exception e )  // InterruptedException, ExecutionException
    {
      e.printStackTrace();
    }

    System.out.println( result.isDone() );

    executor.shutdown();
  }
}

class SorterCallable implements Callable<byte[]>
{
  private final byte[] b;

  SorterCallable( byte[] b )
  {
    this.b = b;
  }

  @Override public byte[] call()
  {
    Arrays.sort( b );
    return b;
  }  
}
