<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="send_save" method="post">
<input type="text" placeholder="금액" name="money"><br>
<input type="hidden" name="send_num" value=${num }>
<input type="text" placeholder="받는 고객" name="to_num"><br>
<input type="submit" value="송금">
</form>
</body>
</html>