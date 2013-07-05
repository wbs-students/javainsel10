package com.tutego.insel.io.file;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

public class FileUtils
{
  public static boolean isLocked( String filename )
  {
    try
    {
      FileLock lock = new RandomAccessFile( filename, "r" ).getChannel().tryLock();
      lock.release(); // ignore ClosedChannelException 
    }
    catch ( IOException e )
    {
      return false;
    }

    return true;
  }
}
