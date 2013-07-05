public class StringBuilderToStringDemo
{
  public static String join( Object... strings )
  {
    StringBuilder result = new StringBuilder();
  
    for ( Object string : strings )
      result.append( string );
    
    return result.toString();
  }
  
  public static void main( String[] args )
  {    
    System.out.println( join("Aus", ' ', "die Maus" ) );
  }
}
