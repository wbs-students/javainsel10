<jsp:useBean id="emailchecker" class="com.tutego.web.EMailChecker" />

<jsp:setProperty name="emailchecker" property="email" value="a@b.com" />
${emailchecker.validEmail}
<br>

<jsp:setProperty name="emailchecker" property="email" value="@b.com" />
${emailchecker.validEmail}
<br>

<jsp:setProperty name="emailchecker" property="email" value="a@b" />
${emailchecker.validEmail}
