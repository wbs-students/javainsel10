package com.tutego.insel.ui.binding;
//package com.tutego.insel.ui.binding;
//
//import java.beans.IntrospectionException;
//import java.beans.PropertyChangeListener;
//import java.beans.PropertyChangeSupport;
//import java.beans.PropertyDescriptor;
//import java.beans.SimpleBeanInfo;
//
//public class PersonModel extends SimpleBeanInfo
//{
//  private final PropertyChangeSupport changes = new PropertyChangeSupport( this );
//
//  private String name;
//
//  public void setName( String newName )
//  {
//    System.out.printf( "setName(%s)%n", newName );
//
//    String oldName = name;
//    name = newName;
//    changes.firePropertyChange( "name", oldName, newName );
//  }
//
//  public String getName()
//  {
//    System.out.println( "getName()" );
//    return name;
//  }
//
//  //
//
//  public void addPropertyChangeListener( PropertyChangeListener l )
//  {
//    changes.addPropertyChangeListener( l );
//  }
//
//  public void removePropertyChangeListener( PropertyChangeListener l )
//  {
//    changes.removePropertyChangeListener( l );
//  }
//
//  @Override
//  public PropertyDescriptor[] getPropertyDescriptors()
//  {
//    try
//    {
//      PropertyDescriptor name = new PropertyDescriptor( "name", getClass() );
//      name.setBound( true );
//
//      return new PropertyDescriptor[]{ name };
//    }
//    catch ( IntrospectionException e )
//    {
//      throw new RuntimeException( e );
//    }
//  }
//}
