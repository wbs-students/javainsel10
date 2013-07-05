import java.util.Scanner;

public class BinaryBanner
{
  static void printLetter( char[][] letter )
  {
    for ( int colum = 0; colum < letter[0].length; colum++ )
    {
      for ( int line = letter.length - 1; line >= 0; line-- )
        System.out.print( letter[line][colum] );
      System.out.println();
    }
    System.out.println();
  }

  static void printZero()
  {
    char[][] zero = { { ' ', '#', ' ' },
                      { '#', ' ', '#' },
                      { '#', ' ', '#' },
                      { '#', ' ', '#' },
                      { ' ', '#', ' ' } };
    printLetter( zero );
  }

  static void printOne()
  {
    char[][] one = { { ' ', '#' },
                     { '#', '#' },
                     { ' ', '#' },
                     { ' ', '#' },
                     { ' ', '#' } };
    printLetter( one );
  }

  public static void main( String[] args )
  {
    int input  = new Scanner( System.in ).nextInt();
    String bin = Integer.toBinaryString( input );
    System.out.printf( "Banner für %s (binär %s):%n", input, bin );
    for ( int i = 0; i < bin.length(); i++ )
      switch ( bin.charAt( i ) )
      {
        case '0': printZero(); break;
        case '1': printOne(); break;
      } 
  }
}