import java.applet.Applet;

public class BrowserDetector extends Applet
{
  public void init()
  {
    if ( isNetscape() )
      System.out.println( "Netscape, Firefox, ... Browser." );

    if ( isMicrosoft() )
      System.out.println( "Microsoft Browser." );
  }

  public static boolean isNetscape()
  {
    try {
      Class.forName( "netscape.applet.MozillaAppletContext" );
    }
    catch ( ClassNotFoundException e ) { return false; }
    return true;
  }

  public static boolean isMicrosoft()
  {
    try {
      Class.forName( "com.ms.applet.GenericAppletContext" );
    }
    catch ( ClassNotFoundException e ) { return false; }
    return true;
  }
}
