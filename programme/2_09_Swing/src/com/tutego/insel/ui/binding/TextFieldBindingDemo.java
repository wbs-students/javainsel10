package com.tutego.insel.ui.binding;
//package com.tutego.insel.ui.binding;
//
//import java.beans.IntrospectionException;
//
//import javax.swing.JFrame;
//import javax.swing.JTextField;
//import javax.swing.text.JTextComponent;
//
//import org.jdesktop.binding.DataModel;
//import org.jdesktop.binding.JavaBeanDataModel;
//import org.jdesktop.binding.swingx.TextBinding;
//
//public class TextFieldBindingDemo
//{
//  public static void main( String[] args ) throws IntrospectionException
//  {
//    JFrame frame = new JFrame();
//    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
//
//    JTextComponent tf = new JTextField();
//
//    PersonModel pm = new PersonModel();
//    DataModel beanDataModel = new JavaBeanDataModel( pm );
//    TextBinding binding = new TextBinding( tf, beanDataModel, "name" );
//
//    frame.add( tf );
//    frame.pack();
//    frame.setVisible( true );
//
//    pm.setName( "Christian" );
//
////        tf.setText( "Christian" );
////        System.out.println( binding.isModified() );
//  }
//}
