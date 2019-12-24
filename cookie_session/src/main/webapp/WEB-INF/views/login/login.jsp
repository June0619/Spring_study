<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ include file = "../cookie.jsp" %>

<c:choose>
<c:when test="${loginUser == null}">
	<form action="chkUser" method="post">
		<input type="text" name="id" placeholder="아이디"><br>
		<input type="text" name="pwd" placeholder="pwd"><br>
		<input type="submit" value="로그인">
	</form>
</c:when>
<c:otherwise>

</c:otherwise>
</c:choose>
</body>
</html>