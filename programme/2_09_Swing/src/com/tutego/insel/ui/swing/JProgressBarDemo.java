package com.tutego.insel.ui.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JProgressBarDemo
{
  static JProgressBar bar = new JProgressBar( 0, 1000000 );

  static class ButtonActionListener implements ActionListener
  {
    @Override public void actionPerformed( ActionEvent e )
    {
      new Thread( new Runnable()
      {
        @Override public void run()
        {
          for ( int i = 1; i <= bar.getMaximum(); ++i )
          {
            final int j = i;

            SwingUtilities.invokeLater( new Runnable()
            {
              @Override public void run() {
                bar.setValue( j );
              }
            } );
          }
        }
      } ).start();
    }
  }

  public static void main( String[] args )
  {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    JButton but = new JButton( "Start zählen" );
    but.addActionListener( new ButtonActionListener() );

    bar.setStringPainted( true );

    f.add( bar, BorderLayout.PAGE_START );
    f.add( but, BorderLayout.PAGE_END );

    f.pack();
    f.setVisible( true );
  }
}