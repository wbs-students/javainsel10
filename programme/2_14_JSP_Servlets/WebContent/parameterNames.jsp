<%
  java.util.Enumeration<?> paramNames = request.getParameterNames();

  while ( paramNames.hasMoreElements() )
  {
    String param = (String) paramNames.nextElement();

    out.print( "<p>" + param + " = " );

    String paramValues[] = request.getParameterValues( param );

    if ( paramValues.length == 1 )
    {
      String paramValue = paramValues[0];

      if ( paramValue.length() == 0 )
        out.println( "unbestimmt" );
      else
        out.println( paramValue );
    }
    else
    {
      for ( int i=0; i<paramValues.length; i++ )
        out.print( paramValues[i] + " " ) ;

      out.println( "<p>" );
    }
  }
%>
