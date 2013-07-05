public class RegionMatchesDemo
{
  public static void main( String[] args )
  {
    String s = "Deutsche Kinder sind zu dick";
    boolean b = s.regionMatches( 9, "Bewegungsarmut bei Kindern", 19, 6 );
    System.out.println( b );
    
    String t = "Deutsche KINDER sind zu dick";
    System.out.println( t.regionMatches( true, 9, "Bewegungsarmut bei kindern", 19, 6 ) );
  }
}
