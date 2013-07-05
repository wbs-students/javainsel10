package com.tutego.insel.ui.image;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

class ImageGrabber extends JPanel
{
  private static final long serialVersionUID = -3114117835388720394L;

  private static BufferedImage image;

  ImageGrabber()
  {
    addMouseMotionListener( new MouseMotionAdapter()
    {
      @Override public void mouseMoved( MouseEvent e )
      {
        int pixel = image.getRGB( e.getX(), e.getY() );
      
        int red   = (pixel >> 16) & 0xFF,
            green = (pixel >> 8) & 0xFF,
            blue  = (pixel) & 0xFF;

          System.out.println( "R=" + red + " G=" + green + " B=" + blue );

          image.setRGB( e.getX(), e.getY(), new Color(pixel).darker().getRGB() );
          repaint();
        }
      } );
  }

  @Override
  protected void paintComponent( Graphics g )
  {
    g.drawImage( image, 0, 0, this );
  }

  public static void main( String[] args ) throws IOException
  {
    image = ImageIO.read(ClassLoader.getSystemResource( "gatesInAlbuquerque.jpg" ) );

    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( image.getWidth(), image.getHeight() );
    f.add( new ImageGrabber() );
    f.setVisible( true );
  }
}
