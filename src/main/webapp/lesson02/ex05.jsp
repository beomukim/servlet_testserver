<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar</title>
</head>
<body>
<%
	Calendar today = Calendar.getInstance();
	//out.print(today);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	out.println(sdf.format(today.getTime()));

	// 어제 날짜
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
	Calendar yesterday = Calendar.getInstance();
	yesterday.add(Calendar.DATE, -1);
	//yesterday.add(Calendar.MONTH, -1);
	out.println(sdf2.format(yesterday.getTime()));
	
	// 두 날짜 비교
	int result = today.compareTo(yesterday); // 기준값(today)이 크면 1, 같으면 0, 작으면 -1
	out.print(result);
%>

</body>
</html>