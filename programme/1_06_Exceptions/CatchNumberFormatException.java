public class CatchNumberFormatException
{
  public static void main( String[] args )
  {
    String stringToConvert = "19%";

    try
    {
      Integer.parseInt( stringToConvert );
    }
    catch ( NumberFormatException e )
    {
      System.err.printf( "'%s' kann man nicht in eine Zahl konvertieren!%n", stringToConvert );
    }
    
    System.out.println( "Weiter geht's" );
  }
}