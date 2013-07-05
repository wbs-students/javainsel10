import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;

public class CheckUrlApplet extends Applet
{
  private boolean urlOk = false; 

  @Override
  public void init()
  {
    try {
      urlOk = new URL( getParameter("url" ) ) != null;
    } catch ( MalformedURLException e ) { /* urlOk is false */ }
  }

  @Override
  public void paint( Graphics g )
  {
    g.setColor( urlOk ? Color.GREEN : Color.RED );
    g.fillRect( 0, 0, 10, 10 );
  }
}
