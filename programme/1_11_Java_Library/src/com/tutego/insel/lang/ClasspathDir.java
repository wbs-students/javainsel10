package com.tutego.insel.lang;

public class ClasspathDir
{
  public static void main( String[] args )
  {
    System.out.println( System.getProperty("java.class.path") );     // C:\Users\Christian\Documents\My Dropbox\Insel\programme\1_11_Java_Library\bin
    
    System.out.println( System.getProperty("java.ext.dirs") );       // C:\Program Files\Java\jdk1.7.0\jre\lib\ext;C:\Windows\Sun\Java\lib\ext

    System.out.println( System.getProperty("sun.boot.class.path") ); // C:\Program Files\Java\jdk1.7.0\jre\lib\resources.jar;C:\Program Files\Java\jdk1.7.0\jre\lib\rt.jar;C:\Program Files\Java\jdk1.7.0\jre\lib\sunrsasign.jar;C:\Program Files\Java\jdk1.7.0\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.7.0\jre\lib\jce.jar;C:\Program Files\Java\jdk1.7.0\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.7.0\jre\lib\modules\jdk.boot.jar;C:\Program Files\Java\jdk1.7.0\jre\classes
  }
}
