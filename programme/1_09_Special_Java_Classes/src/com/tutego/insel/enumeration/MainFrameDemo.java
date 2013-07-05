package com.tutego.insel.enumeration;

public class MainFrameDemo
{
  public static void main( String[] args )
  {
    MainFrame.INSTANCE.getFrame().setTitle( "Singleton" );
    MainFrame.INSTANCE.getFrame().setBounds( 100, 100, 300, 400 );
    MainFrame.INSTANCE.getFrame().setVisible( true );
  }
}
