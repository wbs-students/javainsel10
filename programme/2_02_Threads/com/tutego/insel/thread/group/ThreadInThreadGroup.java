package com.tutego.insel.thread.group;

public class ThreadInThreadGroup
{
  static public void main( String[] args )
  {
    ThreadGroup group = new ThreadGroup( "Helden" );

    new OwnThread( group, "Darkwing Duck" ).start();
    new OwnThread( group, "Kikky" ).start();

    Thread[] threadArray = new Thread[ group.activeCount() ];

    // Fill array with all Threads of the group

    group.enumerate( threadArray );
    
    // List array

    for ( Thread t : threadArray )
      System.out.println( t );

    System.out.println( "--" );
    
    group.list();
   }
}

class OwnThread extends Thread
{
  public OwnThread( ThreadGroup group, String name ) {
    super( group, name );
  }

  @Override public void run()
  {
    for ( int i = 0; i < 3; i++ )
    {
      System.out.println( getName() + ": Ich bin der Schrecken, "+
                          "der die Nacht durchflattert" );
    }
  }
}
