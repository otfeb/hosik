<%@page import="java.text.SimpleDateFormat"%>
<%@page import="db.memo.memoDto"%>
<%@page import="java.util.List"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="db.memo.memoDao"%>
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
memoDao dao=new memoDao();
//전체목록 가져옴
List<memoDto> list=dao.getAllMemos();
JSONObject arr=new JSONObject();

//arr에 먼저 size보내기
//JSONObject size=new JSONObject();
//size.put("size",list.size());

SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
for(memoDto dto:list){
	JSONObject ob=new JSONObject();
	ob.put("num",dto.getNum());
	ob.put("writer",dto.getWriter());
	ob.put("story",dto.getStory());
	ob.put("avata",dto.getStory());
	ob.put("writeday",dto.getWriteday());
}

%>
</body>
</html>