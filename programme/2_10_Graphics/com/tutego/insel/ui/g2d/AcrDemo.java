package com.tutego.insel.ui.g2d;

import java.awt.*;
import java.awt.geom.Arc2D;
import javax.swing.*;

class AcrDemo extends JPanel
{
  private static final long serialVersionUID = 1383247363793264116L;

  @Override
  protected void paintComponent( Graphics g )
  {
    Shape arc =  //       x,   y,  w,  h, start, extend, type
      new Arc2D.Double( 100, 100, 60, 60,    30,    120, Arc2D.PIE );
  
    ((Graphics2D)g).draw( arc );
  }

  public static void main( String[] args )
  {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 300, 320 );
    f.add( new AcrDemo() );
    f.setVisible( true );
  }
}
