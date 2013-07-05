import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAllLines
{
  public static void main( String[] args ) throws FileNotFoundException
  {
    Scanner scanner = new Scanner( new File("EastOfJava.txt") );
    while ( scanner.hasNextLine() )
      System.out.println( scanner.nextLine() );
    scanner.close();
  }
}
