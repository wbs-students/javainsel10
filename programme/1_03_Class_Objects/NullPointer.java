/*  1 */public class NullPointer
/*  2 */{
/*  3 */  @SuppressWarnings("null") public static void main( String[] args )
/*  4 */  {
/*  5 */    java.awt.Point p = null;
/*  6 */    String         s = null;
/*  7 */
/*  8 */    p.setLocation( 1, 2 );
/*  9 */    s.length();
/* 10 */  }
/* 11 */}