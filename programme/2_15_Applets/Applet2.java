import java.applet.Applet;
import java.awt.TextArea;

public class Applet2 extends Applet
{
  private TextArea textBox = new TextArea( 5, 40 );

  public void init()
  {
    add( textBox );
  }

  public void appendTheText( String s )
  {
    textBox.append( s + "\n" );
  }
}
