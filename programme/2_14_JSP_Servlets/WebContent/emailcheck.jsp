<jsp:useBean id="emailchecker" class="com.tutego.web.EMailChecker" />
<jsp:setProperty name="emailchecker" property="email" value="${param.email}" />
${emailchecker.email} ist gültig? ${emailchecker.validEmail}