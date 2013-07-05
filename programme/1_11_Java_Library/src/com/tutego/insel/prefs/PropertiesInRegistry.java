package com.tutego.insel.prefs;

import java.io.ByteArrayOutputStream;
import java.util.prefs.*;

public class PropertiesInRegistry
{
  static Preferences prefs = Preferences.userRoot().node( "/com/tutego/insel" );

  static void fillRegistry()
  {
    for ( Object o : System.getProperties().keySet() )
    {
      String key = o.toString();

      if ( key.startsWith("user.") && System.getProperty(key).length() != 0 )
        prefs.put( key, System.getProperty(key) );
    }
  }

  static void display()
  {
    try
    {
      for ( String key : prefs.keys() )
        System.out.println( key + ": " + prefs.get(key, "---") );
    }
    catch ( BackingStoreException e )
    {
      System.err.println( "Knoten k�nnen nicht ausgelesen werden: " + e );
    }
  }

  static void saveAsXml()
  {
    ByteArrayOutputStream sos = new ByteArrayOutputStream();

    try
		{
			prefs.exportNode( sos );
      System.out.println( sos.toString() );
    }
    catch ( Exception e ) // IOException, BackingStoreException
    {
      System.err.println( "Knoten k�nnen nicht exportiert werden: " + e );
    }
  }

  static void clean()
  {
    try
    {
      prefs.removeNode();
    }
    catch ( BackingStoreException e )
    {
      System.err.println( "Knoten k�nnen nicht gel�scht werden: " + e );
    }
  }

  static void addListener()
  {
    NodePreferenceChangeListener listener = new NodePreferenceChangeListener();
    
    prefs.addNodeChangeListener( listener );
    prefs.addPreferenceChangeListener( listener );
  }

  
	public static void main( String[] args )
	{
//    addListener();
    fillRegistry();
//    display();
//    saveAsXml();
//    clean();
	}
}

