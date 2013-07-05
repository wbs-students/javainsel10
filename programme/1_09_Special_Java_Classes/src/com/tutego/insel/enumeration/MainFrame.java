package com.tutego.insel.enumeration;

import javax.swing.*;

public enum MainFrame
{
  INSTANCE;

  private JFrame f = new JFrame();
  
  public JFrame getFrame()
  {
    return f;
  }
}
