class ShiftRightDemo
{
  public static void main( String[] args )
  {
    int i, j;
     
    i = 64;
    j = i >>> 1;

    System.out.println( " 64 >>> 1 = " + j );

    i = -64;
    j = i >>> 1;

    System.out.println( "-64 >>> 1 = " + j );
  }
}