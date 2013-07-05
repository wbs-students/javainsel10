import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAllEmailAddresses
{ 
  public static void main( String[] args )
  {
    printAllEMailAddresses( "http://www.galileocomputing.de/hilfe/Impressum" );
  }

  static void printAllEMailAddresses( String urlString )
  {
    try
    {
      URL     url     = new URL( urlString );
      Scanner scanner = new Scanner( url.openStream() );
      Pattern compile = Pattern.compile( "[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}" );

      while ( scanner.hasNextLine() )
      {
        String line = scanner.nextLine();
        for ( Matcher m = compile.matcher( line ); m.find(); )
          System.out.println( line.substring( m.start(), m.end() ) );
      }
    }
    catch ( MalformedURLException e )
    {
      System.err.println( "URL ist falsch aufgebaut!" );
    }
    catch ( IOException e )
    {
      System.err.println( "URL konnte nicht geöffnet werden!" );
    }
  }
}
