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
String irum=request.getParameter("irum");
String birth=request.getParameter("birth");

//select가 multi인 경우
//getParameterValues로 읽는다(반환타입이 String[])
//이때 선택하지 않으면 null이 되고 선택하면 배열로 값이 넘어온다
String[] hobby=request.getParameterValues("hobby");
%>

<h3 class="alert alert-info">폼태그로부터 읽은값</h3>

이름:
<%=irum %><br>
생년월일:
<%=birth %><br>
취미:
<%
	if(hobby==null){%>
		<b style="color: red;">취미없음</b>
	<%}
	else{
		for(String h:hobby){%>
			[<%=h %>]&nbsp;
		<%}
	}
%>
</body>
</html>