package com.tutego.insel.ui.image;

import java.awt.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class FramesIconImage
{
  public static void main( String[] args )
  {
    JFrame f = new JFrame();

    try
    {
      Image img = ImageIO.read( FramesIconImage.class.getResource( "discovery.gif" ) );
      f.setIconImage( img );
    }
    catch ( IOException e ) { e.printStackTrace(); }
    
    f.setVisible( true );
  }
}
