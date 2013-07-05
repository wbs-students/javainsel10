package com.tutego.insel.ui.graphics;

import java.awt.*;
import java.awt.geom.Arc2D;
import javax.swing.*;

public class PanelWithArc extends JPanel
{
  private static final long serialVersionUID = -2996844704190542848L;

  @Override protected void paintComponent( Graphics g )
  {
    Shape arc =              // x, y, w, h, start, extend, type
            new Arc2D.Double( 100, 100, 60, 60, 30, 120, Arc2D.PIE );

    ((Graphics2D) g).draw( arc );
  }

  public static void main( String[] args )
  {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 300, 300 );
    f.add( new PanelWithArc() );
    f.setVisible( true );
  }
}
