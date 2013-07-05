package com.tutego.insel.util.map;

import java.util.HashMap;
import java.util.Map;

public class MapInMapInMapInMapInMap
{
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static void main( String[] args )
  {
    Map h = new HashMap();
    h.put( h, "a" );
    h.put( h, "b" );
  }
}
