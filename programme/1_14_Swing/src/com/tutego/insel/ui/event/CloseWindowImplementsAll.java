package com.tutego.insel.ui.event;

import javax.swing.*;
import java.awt.event.*;

public class CloseWindowImplementsAll extends JFrame implements WindowListener
{
  // Implement WindowListener

  @Override public void windowClosing( WindowEvent event )
  {
    System.exit( 0 );
  }

  @Override public void windowClosed( WindowEvent event ) { /*Empty*/ }
  @Override public void windowDeiconified( WindowEvent event ) { /*Empty*/ }
  @Override public void windowIconified( WindowEvent event ) { /*Empty*/ }
  @Override public void windowActivated( WindowEvent event ) { /*Empty*/ }
  @Override public void windowDeactivated( WindowEvent event ) { /*Empty*/ }
  @Override public void windowOpened( WindowEvent event ) { /*Empty*/ }

  //

  CloseWindowImplementsAll()
  {
    setSize( 400, 400 );
    addWindowListener( this );
    setVisible( true );
  }

  public static void main( String[] args )
  {
    new CloseWindowImplementsAll();
  }
}
