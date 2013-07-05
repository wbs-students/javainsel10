public class BoxingQuestion
{
  public static void main( String[] args )
  {
    Integer i = 1, j = 1;
    
    boolean b = (i <= j && j <= i && i != j);
    
    System.out.println( b );
  }
}
