interface BaseColors
{
  int RED     = 1;
  int GREEN   = 2;
  int BLUE    = 3;
}

interface CarColors extends BaseColors
{
  int BLACK   = 10;
  int PURPLE  = 11;
}

interface CoveringColors extends BaseColors
{
  int PURPLE  = 11;
  int BLACK   = 20;
  int WHITE   = 21;
}

interface AllColors extends CarColors, CoveringColors
{
  int WHITE  = 30;
}

public class Colors
{
  @SuppressWarnings("all")
  public static void main( String[] args )
  {
    System.out.println( CarColors.RED );        // 1
    System.out.println( AllColors.RED );        // 1
    System.out.println( CarColors.BLACK );      // 10
    System.out.println( CoveringColors.BLACK ); // 20

//    System.out.println( AllColors.BLACK );      // The field AllColors.BLACK is ambiguous
//    System.out.println( AllColors.PURPLE );     // The field AllColors.PURPLE is ambiguous
  }
}
