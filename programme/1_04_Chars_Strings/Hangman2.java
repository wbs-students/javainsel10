import java.util.*;

public class Hangman2
{
  public static void main( String[] args )
  {
    List<String> hangmanWords = Arrays.asList( "samoa", "tonga", "fiji", "vanuatu" );
    Collections.shuffle( hangmanWords );

    String hangmanWord = hangmanWords.get( 0 );
    String usedChars = "";
    String guessedWord = hangmanWord.replaceAll( ".", "_" );

    for ( int guesses = 1; ; )
    {
      if ( guesses == 10 )
      {
        System.out.printf( "Nach 10 Versuchen ist jetzt Schluss. Sorry! Apropos, das Wort war '%s'.", hangmanWord );
        break;
      }

      System.out.printf( "Runde %d. Bisher geraten: %s. Was wählst du für ein Zeichen?%n", guesses, guessedWord );
      char c = new java.util.Scanner( System.in ).next().charAt( 0 );
      if ( usedChars.indexOf( c ) >= 0 )
      {
        System.out.printf( "%c hast du schon mal getippt!%n", c );
        guesses++;
      }
      else  // Zeichen wurde noch nicht benutzt 
      {
        usedChars += c;
        if ( hangmanWord.indexOf( c ) >= 0 )
        {
          guessedWord = hangmanWord.replaceAll( "[^"+usedChars+"]", "_" );
          if ( guessedWord.contains( "_" ) )
            System.out.printf( "Gut geraten, '%s' gibt es im Wort. Aber es fehlt noch was!%n", c );
          else
          {
            System.out.printf( "Gratulation, du hast das Wort '%s' erraten!", hangmanWord );
            break;
          }
        }
        else // hangmanWord.indexOf( c ) == -1 
        {
          System.out.printf( "Pech gehabt, %c kommt im Wort nicht vor!%n", c );
          guesses++;
        }
      }
    }
  }
}