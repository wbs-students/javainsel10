package com.tutego.insel.annotation;

import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

public class ResourceReader
{
  public static<T> T getInitializedResourcesFor( Class<T> ressources )
  {
    try
    {
      T newInstance = ressources.newInstance();

      for ( Field field : ressources.getFields() )
      {
        if ( field.isAnnotationPresent( CurrentDateResource.class ) )
          field.set( newInstance, new Date() );

        else if ( field.isAnnotationPresent( ListOfFilesResource.class ) )
          field.set( newInstance, new File(field.getAnnotation( ListOfFilesResource.class ).value().toString()).list() );

        else if ( field.isAnnotationPresent( UrlResource.class ) )
        {
          String url = field.getAnnotation( UrlResource.class ).value();
          String content = new Scanner( new URL(url).openStream() ).useDelimiter( "\\z" ).next();

          if ( field.getAnnotation( UrlResource.class ).trim() )
            content = content.trim();

          switch ( field.getAnnotation( UrlResource.class ).upperLowerCase() )
          {
            case UPPERCASE: content = content.toUpperCase(); break;
            case LOWERCASE: content = content.toLowerCase(); break;
            default: // Nichts zu tun
          }

          Class<? extends ResourceConverter>[] converterClasses = field.getAnnotation( UrlResource.class ).converter();
          for ( Class< ? extends ResourceConverter> converterClass : converterClasses )
            content = converterClass.newInstance().convert( content );
          
          field.set( newInstance, content );
        }
      }

      return newInstance;
    }
    catch ( Exception e )
    {
      return null;
    }
  }
}
