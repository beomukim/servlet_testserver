<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Map"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	double length = Double.parseDouble(request.getParameter("length"));
	String[] units = request.getParameterValues("unit");

	Double[] values = { length / 2.54, length / 91.44, length / 30.48, length / 100 };
	Map<String, Double> answer = new HashMap<>();
	for (int i = 0; i < units.length; i++) {
		answer.put(units[i], values[i]);
	}
	%>
	<h1>길이 변환 결과</h1>
	<h2><%=length%>cm
	</h2>
	<hr>
	<%
	for (String str : answer.keySet()) {
		out.println("<h2>" + answer.get(str) + str + "<h2>");
	}
	%>

</body>
</html>