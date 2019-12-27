<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>입금할 금액 입력</div>
<form action="save_deposit" method="post">
<input type="text" name="deposit">
<input type="hidden" name="num" value="${num }">
<input type="submit" value="입금">
</form>
</body>
</html>