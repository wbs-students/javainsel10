import java.util.*;

public class HeapUser
{
  String string = "Hallo Welt";
  Date   date   = new Date();
  ArrayList<String> list = new ArrayList<String>( Arrays.asList( string, date.toString() ) );
  HeapUser heapUser;

  public static void main( String[] args )
  {
    HeapUser h = new HeapUser();
    h.heapUser = h;
    new Scanner( System.in ).next();
    System.out.println( h.string );
  }
}
