package com.tutego.insel.ui.dialog;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JColorChooserDemo
{
  public static void main( String[] args )
  {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    JButton b = new JButton( "Farbe ändern" );
    f.add( b );

    b.addActionListener( new ActionListener() {
      @Override public void actionPerformed( ActionEvent e ) {
        Component comp = (Component) e.getSource();
        Color newColor = JColorChooser.showDialog( null, "Wähle neue Farbe",
                                                   comp.getBackground() );
        comp.setBackground( newColor );
      }
    } );

    f.pack();
    f.setVisible( true );
  }
}