package com.tutego.insel.ui.swing;

import javax.swing.*;

public class SetLookAndFeel
{
  public static void main( String[] args )
  {
    try
    {
//      UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
      UIManager.setLookAndFeel( "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel" );
    }
    catch ( Exception e )
    {
      e.printStackTrace();
    }

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.add( new JScrollPane( new JTree() ) );
    frame.setSize( 160, 200 );
    frame.setLocationRelativeTo( null );
    frame.setVisible( true );
  }
}
