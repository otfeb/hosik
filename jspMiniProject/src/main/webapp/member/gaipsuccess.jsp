<%@page import="data.dao.memberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Dongle&family=Gugi&family=Orbit&display=swap"
        rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
<%
	String id=request.getParameter("id");
	memberDao dao=new memberDao();
	
	//아이디에 대한 이름 얻기
	String name=dao.getName(id);
%>

<div style="margin: -70px 300px;">
	<img alt="" src="image/submit.png" style="width: 300px;"><br>
	<b><%=name %>님의 회원가입을 축하합니다!</b>
	<br><br>
	<button type="button" class="btn btn-info" onclick="location.href='index.jsp?main=login/loginmain.jsp'">로그인</button>
	<button type="button" class="btn btn-info" onclick="location.href='index.jsp'">메인</button>
</div>
</body>
</html>