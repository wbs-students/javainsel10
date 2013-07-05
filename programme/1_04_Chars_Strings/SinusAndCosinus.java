import javax.swing.JOptionPane;

public class SinusAndCosinus
{
  public static void main( String[] args )
  {
    String s = JOptionPane.showInputDialog( "Bitte Zahl eingeben" );
    double value = Double.parseDouble( s );
    System.out.println( "Sinus: " + Math.sin( value ) );
    System.out.println( "Kosinus: " + Math.cos( value ) );
  }
}
