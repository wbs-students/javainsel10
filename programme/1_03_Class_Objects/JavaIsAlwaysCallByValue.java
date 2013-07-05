import java.awt.Point;

public class JavaIsAlwaysCallByValue
{
  static void clear( Point p )
  {
    p = new Point();
  }

  public static void main( String[] args )
  {
    Point p = new Point( 10, 20 );
    clear( p );
    System.out.println( p );  // java.awt.Point[x=10,y=20]
  }
}