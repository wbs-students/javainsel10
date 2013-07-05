import java.io.*;

public class TryWithResourcesReadsLine
{
  static String readFirstLine( File file )
  {
    try ( BufferedReader br = new BufferedReader(new FileReader(file) ) )
    {
      return br.readLine();
    }
    catch ( IOException e ) { e.printStackTrace(); return null; }
  }
}
