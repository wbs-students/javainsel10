import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NestedException
{
  public static boolean isAvailable( String url )
  {
    try
    {
      HttpURLConnection.setFollowRedirects( false );
      HttpURLConnection con = (HttpURLConnection)(new URL( url ).openConnection());
      return con.getResponseCode() == HttpURLConnection.HTTP_OK;
    }
    catch ( MalformedURLException e )
    {
      throw new RuntimeException( e );
    }
    catch ( IOException e )
    {
      throw new RuntimeException( e );
    }
  }
  
  public static void main( String[] args )
  {
    System.out.println( isAvailable( "http://laber.rabar.ber/" ) ); // false
    System.out.println( isAvailable( "http://www.tutego.de/" ) );   // true
    System.out.println( isAvailable( "taube://sonsbeck/schlosstrasse/5/" ) );
  }
}
