<jsp:useBean id="birthday" class="java.util.Date" />
<jsp:setProperty name="birthday" property="date" value="12" />
<jsp:setProperty name="birthday" property="month" value="2" />
<jsp:setProperty name="birthday" property="year" value="${1973 - 1900}" />
${birthday}