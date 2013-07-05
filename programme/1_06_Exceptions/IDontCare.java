import java.io.*;

class IDontCare
{
  public static void main( String[] args ) throws Exception
  {
    RandomAccessFile f = new RandomAccessFile( "Datei.txt", "r" );
    System.out.println( f.readLine() );
  }
}
