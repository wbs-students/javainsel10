import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

@SuppressWarnings("unused")
public class TooManyExceptions
{
  void openFile() throws FileNotFoundException, IOException, InterruptedException
  {
    new RandomAccessFile("", "");
  }

  void useFile()
  {
    try
    {
      openFile();
    }
    catch ( IOException e ) { }
    catch ( InterruptedException e ) { }
  }
}
