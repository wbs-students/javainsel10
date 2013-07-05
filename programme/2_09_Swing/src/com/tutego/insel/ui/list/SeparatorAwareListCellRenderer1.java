package com.tutego.insel.ui.list;

import java.awt.*;
import java.util.Arrays;

import javax.swing.*;

public class SeparatorAwareListCellRenderer1<E> implements ListCellRenderer<E>
{
  private final ListCellRenderer<? super E> delegate;
  private final int[] indexes;
  private final JPanel panel = new JPanel( new BorderLayout() );

  public SeparatorAwareListCellRenderer1( ListCellRenderer<? super E> delegate,
                                          int... indexes )
  {
    Arrays.sort( indexes );
    this.delegate = delegate;
    this.indexes  = indexes;
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Override
  public Component getListCellRendererComponent( JList list, E value,
                                                 int index, boolean isSelected,
                                                 boolean cellHasFocus )
  {
    panel.removeAll();
    panel.add( delegate.getListCellRendererComponent( list, value, index,
                                                      isSelected, cellHasFocus ) );
    if ( Arrays.binarySearch( indexes, index ) >= 0 )
      panel.add( new JSeparator(), BorderLayout.PAGE_END );

    return panel;
  }
}