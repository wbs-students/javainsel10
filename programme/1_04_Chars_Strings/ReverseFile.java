import java.util.Scanner;

public class ReverseFile
{
  public static void main( String[] args )
  {
    Scanner scanner = new Scanner( ReverseFile.class.getResourceAsStream( "EastOfJava.txt" ) );
    
    StringBuilder result = new StringBuilder();
    
    while ( scanner.hasNextLine() )
      result.insert( 0, scanner.nextLine() + "\n" );
    
    System.out.println( result.toString().trim() );
  }
}
