import java.io.*;
import java.net.ProtocolException;

public class ExceptionlessRandomAccessFile extends RandomAccessFile
{
  public ExceptionlessRandomAccessFile( File file, String mode ) throws FileNotFoundException
  {
    super( file, mode );
  }

  @Override
  public long length()
  {
    try
    {
      return super.length();
    }
    catch ( IOException e )
    {
      return 0;
    }
  }

  @Override
  public void write( int b ) throws ProtocolException
  {
    try
    {
      super.write( b );
    }
    catch ( IOException e )
    {
      throw new ProtocolException();
    }
  }
  
  public static void main( String[] args )
  {
    try
    {
      RandomAccessFile raf = new ExceptionlessRandomAccessFile( new File( "file" ), "r" );
      raf.length();
    }
    catch ( IOException e )
    {
      e.printStackTrace();
    }

    ExceptionlessRandomAccessFile raf = null;

    try
    {
      raf = new ExceptionlessRandomAccessFile( new File( "file" ), "r" );
      raf.length();
    }
    catch ( FileNotFoundException e )
    {
      e.printStackTrace();
    }
  }
}
