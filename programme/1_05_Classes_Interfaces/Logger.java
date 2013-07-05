public class Logger
{
  private static Logger logger;

  private Logger()
  {
    // Singleton
  }
  
  public static synchronized Logger getInstance()
  {
    if ( logger == null )
      logger = new Logger();
    
    return logger;
  }
  
  public void log( String s )
  {
    System.out.println( s );
  }
}