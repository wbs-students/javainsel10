package com.tutego.insel.ui.list;

import javax.swing.*;

public class SeparatorAwareJComboBox<E> extends JComboBox<E>
{
  @SafeVarargs
  public SeparatorAwareJComboBox( E... items )
  {
    super( items );
  }

  @Override
  public void setSelectedItem( Object anObject )
  {
    if ( anObject != null )
      super.setSelectedItem( anObject );
  }
}