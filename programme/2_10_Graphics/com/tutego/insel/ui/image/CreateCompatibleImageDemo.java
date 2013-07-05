package com.tutego.insel.ui.image;

import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;

public class CreateCompatibleImageDemo
{
  public static void main( String[] args )
  {
    GraphicsConfiguration gfxConf = GraphicsEnvironment.getLocalGraphicsEnvironment().
        getDefaultScreenDevice().getDefaultConfiguration();
    
    int width = 600, height = 400;
    BufferedImage image = gfxConf.createCompatibleImage( width, height );
    Graphics2D graphics2D = image.createGraphics();
    graphics2D.drawLine( 0, 0, 100, 100 );
  }
}
