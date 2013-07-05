package com.tutego.insel.ui.table;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Comparator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class TableWithRowSorter
{
  public static void main( String[] args )
  {
    TableModel model = new DefaultTableModel( 100, 3 ) {
      @Override public Object getValueAt( int row, int column ) {
        return "" + (int) Math.pow( row, column + 1 );
      } 
    };
    final JTable table = new JTable( model );

    final TableRowSorter<TableModel> rowSorter = new TableRowSorter<TableModel>( model );
    table.setRowSorter( rowSorter );

    rowSorter.setComparator( 0, new Comparator<String>() {
      @Override public int compare( String s1, String s2 )
      {
        int i1 = Integer.parseInt( s1 ), i2 = Integer.parseInt( s2 );
        return Integer.bitCount( i1 ) - Integer.bitCount( i2 ); 
      }
    } );
    rowSorter.setSortable( 1, false );
//    rowSorter.sort();

    rowSorter.setRowFilter( RowFilter.regexFilter("(0|2|4|6|8)$", 2) );

    table.addMouseListener( new MouseAdapter()
    {
      @Override
      public void mouseClicked( MouseEvent e )
      {
        int rowAtPoint = table.rowAtPoint( e.getPoint() );
        int columnAtPoint = table.columnAtPoint( e.getPoint() );    
        System.out.printf( "%d/%d%n", rowAtPoint, columnAtPoint );

        int convertedRowAtPoint = rowSorter.convertRowIndexToModel( rowAtPoint );        
        int convertedColumAtPoint = table.convertColumnIndexToModel( columnAtPoint );        
        System.out.println( rowSorter.getModel().getValueAt( convertedRowAtPoint, convertedColumAtPoint) );
      }
    } );

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.add( new JScrollPane(table) );
    frame.pack();
    frame.setVisible( true );
  }
}
