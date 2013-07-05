package com.tutego.web.servlet;

import java.io.IOException;
import javax.servlet.http.*;

public class SchnarchServlet extends HttpServlet
{
  @Override
  protected void doGet( HttpServletRequest req, HttpServletResponse res )
      throws IOException
  {
    res.getWriter().println( "'Chr! Schnarch! Razong! Chr! Chr! Rapüh!'" );
    res.getWriter().println( "(Disneys beste Comics, Band 5, S.  218)" );
  }
}
