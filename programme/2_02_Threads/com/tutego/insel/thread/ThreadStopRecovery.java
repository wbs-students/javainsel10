package com.tutego.insel.thread;

class ThreadStopRecovery
{
  @SuppressWarnings( "deprecation" )
  public static void main( String[] args )
  {
    Thread t = new Thread()
    {
      @Override public void run()
      {
        try
        {
          while ( true ) System.out.println( "I Like To Move It." );
        }
        catch ( ThreadDeath td )
        {
          System.out.println( "Das Leben ist nicht totzukriegen." );
          throw td;
        }
      }
    };
    t.start();
    try { Thread.sleep( 1 ); } catch ( Exception e ) { }
    t.stop();
  }
}
