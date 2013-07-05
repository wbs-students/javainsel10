import java.applet.Applet;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet
{
  @Override
  public void paint( Graphics g )
  {
    g.drawString( "Hallo Welt!", 50, 25 );
  }
}
