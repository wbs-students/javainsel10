Kontext der Anfrage:
<b><%= request.getContextPath() %></b>
<br/>

Zusätzliche Pfad-Informationen:
<b><%= request.getPathInfo() %></b>
<br/>

Zusätzliche Pfad-Informationen:
<b><%= request.getPathTranslated() %></b>
<br/>

Teil der URL vom Protokoll bis zum Query-String:
<b><%= request.getRequestURI() %></b>
<br/>

Rekonstruiert die URL vom Client für diese Anfrage:
<b><%= request.getRequestURL() %></b>
<br/>

Name oder Pfad zur JSP/zum Servlet:
<b><%= request.getServletPath() %></b>
<br/>

Realer Pfad für den viruellen JSP-Pfad:
<b><%= application.getRealPath("") %></b>
<br/>
