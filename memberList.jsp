<%@page import="java.text.SimpleDateFormat"%>
<%@page import="member.model.MemberDto"%>
<%@page import="member.model.MemberDao"%>
<%@page import="java.util.ArrayList"%>
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
	MemberDao dao=new MemberDao();
	ArrayList<MemberDto> list=dao.selectMember();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
%>
<button type="button" class="btn btn-outline-info" onclick="location.href='loginForm.jsp'">로그인</button>
<table class="table table-bordered" style="width: 750px">
	<tr align="center">
		<th width="60">번호</th>
		<th width="120">아이디</th>
		<th width="200">회원명</th>
		<th width="250">핸드폰</th>
		<th width="220">가입일</th>
		<th width="170">편집</th>
	</tr>

	 <% for(int i=0;i<list.size();i++){
	 		MemberDto dto=list.get(i);
	 %> 
	<tr align="center" valign="middle">
		<td><b>No.<%=(i+1) %></b></td>
		<td><b><%=dto.getId() %></b></td>
		<td>
			<img src="<%=dto.getImage()%>" width="70"><br>
			<b><%=dto.getName() %></b>
		</td>
		<td><b><%=dto.getHp() %></b></td>
		<td><b><%=sdf.format(dto.getGaip()) %></b></td>
		<td align="center" colspan="2" float="left">
			<input type="button" class="btn btn-success btn-sm" value="수정" onclick="location.href=''">
			<input type="button" class="btn btn-danger btn-sm" value="삭제" onclick="location.href='deleteMember.jsp?num=<%=dto.getNum()%>'">
		</td>
	</tr>
	<%}
	%>
</table>
</body>
</html>