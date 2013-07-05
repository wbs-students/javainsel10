package com.tutego.insel.ui.swing;

import java.awt.*;

import javax.swing.Icon;

class CircleIcon implements Icon
{
 @Override
 public void paintIcon( Component c, Graphics g, int x, int y )
 {
  g.setColor( Color.red );
  g.fillOval( x, y, getIconWidth(), getIconHeight() );
 }

 @Override
 public int getIconWidth()
 {
  return 20;
 }

 @Override
 public int getIconHeight()
 {
  return 20;
 }
}
