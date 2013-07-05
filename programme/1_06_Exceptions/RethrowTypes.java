import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class RethrowTypes
{
  public static void saveScreenshot( String filename ) throws AWTException, IOException
  {
    try
    {
      Rectangle r = new Rectangle( Toolkit.getDefaultToolkit().getScreenSize() );
      BufferedImage screenshot = new Robot().createScreenCapture( r );
      ImageIO.write( screenshot, "png", new File(filename) );
    }
    catch ( AWTException e )
    {
      throw e;
    }
    catch ( Throwable e )
    { 
      new File( filename ).delete();
      throw e;
    }
  }

  public static void main( String[] args ) throws IOException, AWTException
  {
    saveScreenshot( System.getProperty( "user.home" ) + "/screenshot.png" );
  }
}