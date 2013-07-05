public class VowelTest
{
  public static void main( String[] args )
  {
    for ( char charToTestIfVowel : "Come at me, @TheKevinButler".toCharArray() )
    {
      switch ( charToTestIfVowel )
      {
        case 'a': case 'A':     // Fällt durch
        case 'e': case 'E':
        case 'i': case 'I':
        case 'o': case 'O':
        case 'u': case 'U':
          System.out.println( charToTestIfVowel + " ist Vokal" );
          break;
        default:
          System.out.println( charToTestIfVowel + " ist kein Vokal" );
      }
    }
  }
}
