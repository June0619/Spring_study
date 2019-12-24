<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dao" class="members.MemberDAO"/>
<c:set var="id" value="${param.id }"/>
<c:set var="pwd" value="${param.pwd }"/>
<c:set var="dto" value="${dao.memberInfo(id) }"/>
<c:if test="${dto != null}">
	<c:if test="${dto.getPwd() == pwd }">
		<c:set var="login" value="${id}" scope="session"/>
		<c:set var="user" value="${dto.name}" scope="session"/>
		<script>
			alert('${user}님 로그인 되었습니다!');
			alert('${id}님 로그인 되었습니다!');
			location.href="/My_Home/Main.jsp";
		</script>
	</c:if>
	<c:if test="${dto.getPwd() != pwd }">
		<script>
			alert('비밀번호가 일치하지 않습니다.');
			location.href="/My_Home/login/Login.jsp";
		</script>
	</c:if>
</c:if>
<c:if test="${dto == null}">
	<script>
		alert('일치하는 회원 정보가 없습니다.');
		location.href="/My_Home/login/Login.jsp";
	</script>
</c:if>
</html>