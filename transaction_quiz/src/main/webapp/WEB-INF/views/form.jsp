<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>은행 처리 시스템(회원번호 : ${num })</h3>

<div>
<form action="login">
<input type="text" placeholder="회원 번호" name="num">
<input type="submit" value="입력">
</form>
</div>
<a href="deposit">입금</a> | 
<a href="check">잔액 확인</a> |
<a href="send">송금</a>
</body>
</html>