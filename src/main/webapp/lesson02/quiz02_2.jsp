<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	Date current = new Date();
	SimpleDateFormat time = new SimpleDateFormat("현재 시간은 HH시 mm분 ss초 입니다.");
	SimpleDateFormat date = new SimpleDateFormat("현재 날짜는 yyyy년 MM월 dd일 입니다.");
	if (request.getParameter("type").equals("time")) {
		out.print(time.format(current));
	} else {
		out.print(date.format(current));
	}
%>
</body>
	
</html>