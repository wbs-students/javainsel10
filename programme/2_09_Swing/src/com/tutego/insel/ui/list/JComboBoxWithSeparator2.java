package com.tutego.insel.ui.list;

import javax.swing.*;

public class JComboBoxWithSeparator2
{
  public static void main( String[] args ) throws Exception
  {
    UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
//    UIManager.setLookAndFeel( new NimbusLookAndFeel() );
    
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    String[] items = { "Cambria", null, "Arial", "Verdana", "Times" };
    JComboBox<String> comboBox = new SeparatorAwareJComboBox<String>( items );
    comboBox.setRenderer( new SeparatorAwareListCellRenderer2<String>(comboBox.getRenderer()) );
    comboBox.setUI( new SeparatorAwareComboBoxUI() );
    comboBox.setSelectedIndex( 1 );
    frame.add( comboBox );
    frame.pack();
    frame.setVisible( true );
  }
}