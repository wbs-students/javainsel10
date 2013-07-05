<%@ page contentType="image/jpeg" %><%@
    page import="java.awt.*,java.awt.image.*, com.sun.image.codec.jpeg.*" %><%
  int width  = 200,
      height = 200;

  BufferedImage image = new BufferedImage( width, height,
                                           BufferedImage.TYPE_INT_RGB );
  Graphics g = image.getGraphics();
  
  g.setColor( Color.white );
  g.fillRect( 0, 0, width, height );
  
  g.setColor( Color.blue );
  g.drawLine( 0, 0, 200, 200 );
  g.drawLine( 0, 200, 200, 0 );
  
  g.dispose();
  
  ServletOutputStream sos = response.getOutputStream();
  JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder( sos );
  encoder.encode( image );
%>