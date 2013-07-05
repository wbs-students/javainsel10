package com.tutego.insel.ui.graphics;

import java.awt.*;
import javax.swing.*;

public class N_Vertex extends JPanel
{
  private static final long serialVersionUID = -6314283966378303073L;

  @Override
  protected void paintComponent( Graphics g )
  {
    VertexDrawer.drawVertex( g, getWidth() / 2, getHeight() / 2, 50, 6, true );
    VertexDrawer.drawVertex( g, getWidth() / 2, getHeight() / 2, 60, 6, false );
  }

  public static void main( String[] args )
  {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.add( new N_Vertex() );
    f.setSize( 200, 200 );
    f.setVisible( true );
  }
}

class VertexDrawer
{
  public static void drawVertex( Graphics g, int x, int y, int r, int n, boolean filled )
  {
    Polygon p = new Polygon();

    for ( int i = 0; i < n; i++ )
      p.addPoint( (int) (x + r * Math.cos( i * 2 * Math.PI / n )),
                  (int) (y + r * Math.sin( i * 2 * Math.PI / n )) );

    if ( filled )
      g.fillPolygon( p );
    else
      g.drawPolygon( p );
  }
}
