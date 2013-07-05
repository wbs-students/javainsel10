<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:forEach var="col" begin="0" end="255">
	<span style="color:rgb(${col},${col},${col})">${col}</span>
</c:forEach>
