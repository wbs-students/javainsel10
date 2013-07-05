package com.tutego.insel.ui.text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JTextAreaDemo extends JFrame
{
  private Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 12 );

  public JTextAreaDemo()
  {
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    final JTextArea t = new JTextArea();
    t.setFont( font );
    add( new JScrollPane( t ) );

    ActionListener al = new ActionListener()
    {
      @Override public void actionPerformed( ActionEvent e )
      {
        if ( "Ende".equals(e.getActionCommand()) )
          System.exit( 0 );
        if ( "fett".equals(e.getActionCommand()) )
          t.setFont( font = font.deriveFont( font.getStyle() ^ Font.BOLD ) );
        else if ( "kursiv".equals(e.getActionCommand()) )
          t.setFont( font = font.deriveFont( font.getStyle() ^ Font.ITALIC ) );
      }
    };

    JPanel panel = new JPanel( new GridLayout(1,3) );
    add( panel, BorderLayout.PAGE_START );

    AbstractButton button;

    panel.add( button = new JToggleButton("fett") );
    button.addActionListener( al );
    button.setFont( font.deriveFont( Font.BOLD ) );

    panel.add( button = new JToggleButton("kursiv") );
    button.addActionListener( al );
    button.setFont( font.deriveFont( Font.ITALIC ) );

    panel.add( button = new JButton("Ende") );
    button.addActionListener( al );

    setSize( 400, 600 );
  }
  
  public static void main( String[] args )
  {
    new JTextAreaDemo().setVisible( true );
  }
}

/*
 Ehemann: "Es ist doch immer wieder erstaunlich, dass die hübschesten Mädchen die größten Idioten heiraten!"
 Ehefrau: "Liebling, das ist das schönste Kompliment seit Jahren!"
*/