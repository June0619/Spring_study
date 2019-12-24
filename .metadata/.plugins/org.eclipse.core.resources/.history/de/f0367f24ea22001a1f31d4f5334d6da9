<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${loginUser == null }">
			<script>location.href="login"</script>
		</c:when>
		<c:otherwise>
			${loginUser }님 환영합니다.
			<hr>
			<a href="logout">로그아웃 페이지로 이동</a> 
			<a href="login">로그인 페이지로 이동</a>
		</c:otherwise>
	</c:choose>
</body>
</html>