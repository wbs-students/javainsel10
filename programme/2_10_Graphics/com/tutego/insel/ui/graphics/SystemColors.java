package com.tutego.insel.ui.graphics;

import java.awt.*;
import javax.swing.*;

class SystemColors extends JPanel
{
  private static final long serialVersionUID = 672202780608967629L;

  private String[] systemColorString = {  
    "desktop", "activeCaption", "activeCaptionText",
    "activeCaptionBorder", "inactiveCaption",
    "inactiveCaptionText", "inactiveCaptionBorder", 
    "window", "windowText", "menu", "menuText", 
    "text", "textText", "textHighlight", 
    "textHighlightText","textInactiveText", 
    "control", "controlText", "controlHighlight", 
    "controlLtHighlight", "controlShadow",
    "controlDkShadow", "scrollbar",
    "info", "infoText"
  };

  private SystemColor[] systemColor = {  
    SystemColor.desktop,
    SystemColor.activeCaption,
    SystemColor.activeCaptionText, 
    SystemColor.activeCaptionBorder, 
    SystemColor.inactiveCaption, 
    SystemColor.inactiveCaptionText, 
    SystemColor.inactiveCaptionBorder, 
    SystemColor.window, 
    SystemColor.windowText, 
    SystemColor.menu, 
    SystemColor.menuText, 
    SystemColor.text, 
    SystemColor.textText, 
    SystemColor.textHighlight, 
    SystemColor.textHighlightText, 
    SystemColor.textInactiveText, 
    SystemColor.control, 
    SystemColor.controlText, 
    SystemColor.controlHighlight, 
    SystemColor.controlLtHighlight,
    SystemColor.controlShadow,
    SystemColor.controlDkShadow,
    SystemColor.scrollbar,
    SystemColor.info,
    SystemColor.infoText
  };

  @Override
  protected void paintComponent( Graphics g )
  {
    super.paintComponent( g );

    g.setFont( new Font( "Dialog", Font.BOLD, 12 ) );

    for ( int i = 0; i < systemColorString.length; i++ )
    {
      g.setColor( new Color( systemColor[i].getRGB() ) );
      g.drawString( systemColorString[i], 20, 20 + (i * 13) );
    }
  }

  public static void main( String[] args )
  {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    f.setSize( 170, 400 );
    f.add( new SystemColors() );
    f.setVisible( true );
  }
}
