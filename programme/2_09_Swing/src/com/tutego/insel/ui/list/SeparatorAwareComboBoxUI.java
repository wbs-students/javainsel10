package com.tutego.insel.ui.list;

import com.sun.java.swing.plaf.windows.WindowsComboBoxUI;

public class SeparatorAwareComboBoxUI extends WindowsComboBoxUI
{
  @Override
  protected void selectNextPossibleValue()
  {
    for ( int index = comboBox.getSelectedIndex() + 1;
          index < comboBox.getItemCount();
          index++ )
      if ( comboBox.getItemAt( index ) != null )
      {
        comboBox.setSelectedIndex( index );
        break;
      }
  }

  @Override
  protected void selectPreviousPossibleValue()
  {
    for ( int index = comboBox.getSelectedIndex() - 1;
          index >= 0;
          index-- )
      if ( comboBox.getItemAt( index ) != null )
      {
        comboBox.setSelectedIndex( index );
        break;
      }
  }
}