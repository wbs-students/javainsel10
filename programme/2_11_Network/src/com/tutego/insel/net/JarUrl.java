package com.tutego.insel.net;

import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class JarUrl
{
  public static void main( String[] args ) throws IOException
  {
		String host = "file://C:/Programme/Java/jdk1.6.0/lib/tools.jar";

		URL url = new URL( "jar:" + host + "!/" ); //+ path );

		JarURLConnection conn = (JarURLConnection) url.openConnection();
		JarFile jarFile = conn.getJarFile();

		for ( Enumeration<?> it = jarFile.entries(); it.hasMoreElements(); )
		{
		  JarEntry entry = ( JarEntry ) it.nextElement();

		  if ( ! entry.isDirectory() )
		    System.out.println( entry + ", " + entry.getSize() );
		}

//    String path = "a/a.class";
//		ZipEntry entry = jarFile.getEntry( path );
//		InputStream in = new BufferedInputStream( jarFile.getInputStream(entry) );

//		String entryName = conn.getEntryName();
//		System.out.println( entryName );
//
//		JarEntry jarEntry = conn.getJarEntry();
//		System.out.println( jarEntry.getSize() );
//		System.out.println( jarEntry.);
  }
}
