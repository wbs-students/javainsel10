package com.tutego.insel.ui.graphics;

import java.awt.*;
import javax.swing.*;

public class ClipDemo extends JPanel
{
  private static final long serialVersionUID = 3020598670163407618L;

  @Override protected void paintComponent( Graphics g )
  {
    super.paintComponent( g );

    Graphics gcopy = g.create();

    // Set first clipping region. clipRect() is also possible.

    g.setClip( 100, 100, 100, 200 );            // setClip()!!

    g.setColor( Color.ORANGE );
    g.fillRect( 0, 0, getWidth(), getHeight() );
    g.setColor( Color.BLACK );
    g.drawOval( 150, 100, 100, 100 );

    // Second clipping region.
    g.clipRect( 0, 200, 150, 50 );              // clipRect()!

    g.setColor( Color.BLUE );
    g.fillRect( 0, 0, 5000, 5000 );

//    System.out.println( g.getClip() );

    // With gcopy we are working with original settings. 

    gcopy.setColor( Color.GREEN );
    gcopy.fillRect( 50, 50, 20, 50 );

    gcopy.dispose();
  }

  public static void main( String[] args )
  {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 400, 400 );
    f.add( new ClipDemo() );
    f.setVisible( true );
  }
}
