<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	function popup(){
		console.log("cookie=>" + "${cook}");
		if("${cook}"==""){
			window.open('popup', '',"width=400, height=300, top=500, left=500");
		}
	}
</script>
<body onload="popup()">
	<h2>cookie Page</h2>
