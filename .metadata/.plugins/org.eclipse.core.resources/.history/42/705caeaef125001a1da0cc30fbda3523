<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/layout/Header.jsp" %>
<%
	Cookie[] ck = request.getCookies();
	boolean triger = true;
	for(Cookie c : ck){
		if(c.getValue().equals("popup_off")){
			triger = false;
		}
	}
	if(triger) {
%>
		<script> window.open("/My_Home/sub/Popup.jsp", "", "width=400, height=300, top=500, left=500");</script>
<% 	} %>
<% if(session.getAttribute("login")==null) { %>
<form class="form-horizontal" action="/My_Home/login/ChkLogin.jsp" method="post">
  <div class="form-group">
    <label for="id" class="col-sm-2 control-label">ID</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="id" name="id" placeholder="ID">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="pwd" name="pwd" placeholder="Password">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Sign in</button>
    </div>
  </div>
</form>
<% } else { %>
<div id="login">	
	<div class="alert alert-warning" role="alert">로그인 되어있습니다.</div>
	<p><a href="/My_Home/login/Logout.jsp">Logout Page로 이동</a></p>
</div>
<%} %>

<%@ include file="/layout/Footer.jsp" %>
