public class InterestRates
{
  public static void main( String[] args )
  {
    double capital      = 20000 /* Euro */;
    double interestRate = 3.6 /* Prozent */;
    double years        = 2;

    double interestRates = capital * interestRate * years / 100;
    System.out.printf( "Zinsen: " + interestRates );   // 1440.0
  }
}