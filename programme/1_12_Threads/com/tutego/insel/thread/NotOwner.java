package com.tutego.insel.thread;

class NotOwner
{
  public static void main( String[] args ) throws InterruptedException
  {
    //
    
    //    new NotOwner().wait();
    
    //
    
    //    NotOwner o = new NotOwner();
    //
    //    synchronized( o )
    //    {
    //      o.wait();
    //    }
    
    //
  
    synchronized( NotOwner.class )
    {
        NotOwner.class.wait();
    }
  }
}

