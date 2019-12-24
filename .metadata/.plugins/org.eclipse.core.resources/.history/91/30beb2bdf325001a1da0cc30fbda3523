<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="mb" class="members.MemberDTO"/>
<jsp:useBean id="dao" class="members.MemberDAO"/>
<jsp:setProperty property="*" name="mb"/>
<c:choose>
	<c:when test="${dao.insertMember(mb) != 0}">
		<c:set var="login" value="${mb.getId() }" scope="session"/>
		<script>
			alert('가입 완료');
			location.href="/My_Home/Main.jsp";
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert('가입 실패');
			location.href="/My_Home/Main.jsp";
		</script>
	</c:otherwise>
</c:choose>