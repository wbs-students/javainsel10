class StaticBlock
{
  static
  {
    System.out.println( "Eins" );
  }
  static
  {
    System.out.println( "Zwei" );
  }

  public static void main( String[] args )
  {
    System.out.println( "Jetzt geht's los." );
  }
}
