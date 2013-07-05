public class LateConstant
{
  public final static int  HUBBLE;
  public final String      ISBN;

  static
  {
    HUBBLE = new java.util.Scanner(
      LateConstant.class.getResourceAsStream("hubble-constant.txt")).nextInt();
  }

  public LateConstant()
  {
    ISBN = "3572100100";
  }

  public static void main( String[] args )
  {
    System.out.println( HUBBLE );                      // 77

    System.out.println( new LateConstant().ISBN );     // 3572100100
  }
}
