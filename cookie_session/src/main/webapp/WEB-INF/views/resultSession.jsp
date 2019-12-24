<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Result Session jsp</h2>

	id : ${id }<br>
	age : ${sessionScope.age }<br>
	addr : ${addr }<br>
	<hr>
	<a href="makeSession">makeSession 이동</a><br>
	<a href="delSession">delSession 이동</a>
</body>
</html>