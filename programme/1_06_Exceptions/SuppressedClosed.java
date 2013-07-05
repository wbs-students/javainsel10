public class SuppressedClosed
{
  public static void main( String[] args )
  {
    class NotCloseable implements AutoCloseable
    {
      @Override public void close()
      {
        throw new UnsupportedOperationException( "close() mag ich nicht" );
      }
    }

    try ( NotCloseable res = new NotCloseable() ) {
      throw new NullPointerException();
    }
  }
}