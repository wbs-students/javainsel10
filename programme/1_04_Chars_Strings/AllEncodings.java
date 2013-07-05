import java.nio.charset.Charset;

public class AllEncodings
{
  public static void main( String[] args )
  {
    for ( String charsetName : Charset.availableCharsets().keySet() )
    {
      System.out.println( charsetName );

      @SuppressWarnings("unused")
      Charset charset = Charset.forName( charsetName );
    }
  }
}
