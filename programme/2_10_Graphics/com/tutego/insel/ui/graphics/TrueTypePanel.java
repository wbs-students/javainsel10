package com.tutego.insel.ui.graphics;

import java.awt.*;
import javax.swing.*;

public class TrueTypePanel extends JPanel
{
  private static final long serialVersionUID = -8406293487001422087L;

  private final Font font;
  
  public TrueTypePanel() throws Exception
  {
    Font font = Font.createFont( Font.TRUETYPE_FONT,
                                getClass().getResourceAsStream( "/NASALIZA.TTF") );

    this.font = font.deriveFont( 50f );
  }

  @Override protected void paintComponent( Graphics g )
  {
    super.paintComponent( g );

    g.setFont( font );
    g.drawString( "NASA", getWidth() / 3, getHeight() / 2 );
  }

  public static void main( String[] args ) throws Exception
  {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.add( new TrueTypePanel() );
    f.setSize( 400, 200 );
    f.setVisible( true );
  }
}
