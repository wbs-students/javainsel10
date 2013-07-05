package com.tutego.insel.thread;

class JoinTheThread
{
  static class JoinerThread extends Thread
  {
    public int result;

    @Override public void run()
    {
      result = 1;
    }
  }
  
  public static void main( String[] args ) throws InterruptedException
  {
    JoinerThread t = new JoinerThread();
    t.start();

    t.join();
    
    System.out.println( t.result );
  }
}

