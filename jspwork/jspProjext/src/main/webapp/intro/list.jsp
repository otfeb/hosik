<%@page import="model.intro.introDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.intro.introDao"%>
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
	introDao dao=new introDao();
	ArrayList<introDto> list=dao.selectIntro();
%>

<div>
	<h3 class="alert alert-info" style="width: 600px"></h3>
	<br>
	<button type="button" onclick="location.href='addForm.jsp'">상품추가</button>
	<br><br>
	<table class="table table-bordered" style="width: 800px;">
	<tr width="60">
		<th width="120">번호</th>
		<th width="120">이름</th>
		<th width="120">지역</th>
		<th width="180">전화번호</th>
		<th width="120">혈액형</th>
		<th width="180">가입일</th>
		<th width="160">수정|삭제</th>
	</tr>
	
	<%
	if(list.size()==0){%>
		
	<%}
	%>
</div>
</body>
</html>