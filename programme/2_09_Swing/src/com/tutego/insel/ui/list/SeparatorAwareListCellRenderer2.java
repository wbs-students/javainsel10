package com.tutego.insel.ui.list;

import java.awt.Component;
import javax.swing.*;

public class SeparatorAwareListCellRenderer2<E> implements ListCellRenderer<E>
{
  private final ListCellRenderer<? super E> delegate;

  public SeparatorAwareListCellRenderer2( ListCellRenderer<? super E> delegate )
  {
    this.delegate = delegate;
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  @Override
  public Component getListCellRendererComponent( JList list, E value,
                                                 int index, boolean isSelected,
                                                 boolean cellHasFocus )
  {
    if ( value == null )
      return new JSeparator();

    return delegate.getListCellRendererComponent( list, value, index, isSelected, cellHasFocus );
  }
}