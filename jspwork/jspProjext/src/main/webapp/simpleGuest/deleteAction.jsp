<%@page import="db.simpleguest.SimpleGuestDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String num=request.getParameter("num");
	
	SimpleGuestDao dao=new SimpleGuestDao();
	
	dao.deleteSimpleGuest(num);
	
	response.sendRedirect("guestList.jsp");
%>