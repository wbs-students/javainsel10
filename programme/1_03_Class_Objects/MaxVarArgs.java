public class MaxVarArgs
{
  static int max( int... array )
  {
    if ( array == null || array.length == 0 )
      throw new IllegalArgumentException( "Array null oder leer" );

    int currentMax = Integer.MIN_VALUE;

    for ( int e : array )
      if ( e > currentMax )
        currentMax = e;

    return currentMax;
  }
  
  public static void main( String[] args )
  {
    System.out.println( max(1, 2, 9, 3) );     // 9
  }
}
