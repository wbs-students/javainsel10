import java.applet.Applet;
import java.awt.*;

public class Applet1 extends Applet
{
  private TextField inputText = new TextField( "", 10 );

  public void init()
  {
    add( inputText );
    add( new Button( "Sende an Applet2" ) );
  }

  public boolean action( Event ev, Object arg )
  {
    if ( ev.target instanceof Button )
    {
      Applet2 applet2 = (Applet2) getAppletContext().getApplet( "applet2" );

      if ( applet2 != null )
      {
        applet2.appendTheText( inputText.getText().trim() );
        return true;
      }
    }

    return false;
  }
}
