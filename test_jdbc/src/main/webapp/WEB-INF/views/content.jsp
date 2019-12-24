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

	<table border="1">
		<tr>
			<th>번호</th><th>이름</th>
		</tr>
		<c:forEach var="dto" items="${list }">
		<tr>
			<td>
			<a href="modify?id=${dto.id }">${dto.id }</a></td>
		<td>
				${dto.name }
		</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="2">글 갯수[${count }]<a href="save_view">등록</a></td>
		</tr>
	</table>
	
</body>
</html>