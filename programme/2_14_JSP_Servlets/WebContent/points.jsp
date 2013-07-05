<%! double d; %>

<%! java.awt.Point p = new java.awt.Point( 2, 3 ),
                   q = new java.awt.Point( 5, 8 );

  public java.awt.Point zufall( java.awt.Point p, java.awt.Point q ) {
    return ( Math.random() > 0.5 ) ? p : q;
  }
%>
<%= zufall(p, q) %>
