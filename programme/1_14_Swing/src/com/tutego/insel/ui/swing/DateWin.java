package com.tutego.insel.ui.swing;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DateWin extends JFrame
{
  private static final long serialVersionUID = -8806944289902109328L;

  public DateWin()
  {
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    add( new JLabel( new SimpleDateFormat().format( new Date() ) ) );
    pack();
  }

  public static void main( String[] args )
  {
    DateWin win = new DateWin();
    win.setVisible( true );
  }
}