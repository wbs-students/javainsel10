package com.tutego.insel.ui.list;

import javax.swing.*;

public class JComboBoxWithSeparator1
{
  public static void main( String[] args ) throws Exception
  {
    UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    String[] items = { "Cambria", "Arial", "Verdana", "Times" };
    JComboBox<String> comboBox = new JComboBox<String>( items );
    ListCellRenderer<String> renderer = new SeparatorAwareListCellRenderer1<String>(
                                          comboBox.getRenderer(), 0 );
    comboBox.setRenderer( renderer );
    frame.add( comboBox );
    frame.pack();
    frame.setVisible( true );
  }
}