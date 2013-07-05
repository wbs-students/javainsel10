import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Demo
{
  public static void main( String[] args ) throws IOException
  {
    byte[] bytes1 = new byte[ 112 ];
    new Random().nextBytes( bytes1 );

    // Byte array -> String
    String s = new BASE64Encoder().encode( bytes1 );
    System.out.println( s );

    // String enthält etwa:
    // QFgwDyiQ28/4GsF75fqLMj/bAIWNwOuBmE/SCl3H2XQFpSsSz0jtyR0LU+kLiwWsnSUZljJr97Hy
    // LA3YUbf96Ym2zx9F9Y1N7P5lsOCb/vr2crTQ/gXs757qaJF9E3szMN+E0CSSslDrrzcNBrlcQg==

    // String -> byte[]
    byte[] bytes2 = new BASE64Decoder().decodeBuffer( s );
    System.out.println( Arrays.equals(bytes1, bytes2) );    // true
  }
}
