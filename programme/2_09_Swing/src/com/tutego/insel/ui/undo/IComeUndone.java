package com.tutego.insel.ui.undo;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.undo.*;

public class IComeUndone
{
  public static void main( String[] args )
  {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    final JTextArea textarea = new JTextArea( 20, 40 );
    textarea.setText( "Hier zurück" );
    f.add( new JScrollPane(textarea) );

//    final UndoManager undomanager = new MyUndoManager();
    final UndoManager undomanager = new UndoManager();
    textarea.getDocument().addUndoableEditListener( undomanager );
    undomanager.setLimit( 1000 );

    JButton undoB = new JButton( "Undo" );
    undoB.addActionListener( new ActionListener() {
      @Override public void actionPerformed( ActionEvent e )
      {
        undomanager.end();

        if ( undomanager.canUndo() )
          undomanager.undo();

        textarea.requestFocus();
      }
    } );

    f.add( undoB, BorderLayout.PAGE_END );
    f.pack();
    f.setVisible( true );
  }
}

class MyUndoManager extends UndoManager
{
  // Original:
  // public void undoableEditHappened(UndoableEditEvent e) {
  //      addEdit(e.getEdit());
  //  }
  
  private static final long serialVersionUID = 4048012669369935065L;

  @Override
  public void undoableEditHappened( UndoableEditEvent e )
  {
    UndoableEdit ue = e.getEdit();
    
    System.out.println( ue );
    
    addEdit( ue );
  }
}

