<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1 class="text-center">2021-8</h1>
		<table class="table text-center">
			<thead>
				<tr>
					<td class="text-danger">일</td>
					<td>월</td>
					<td>화</td>
					<td>수</td>
					<td>목</td>
					<td>금</td>
					<td>토</td>
				</tr>
			</thead>
			<tbody>
				<%
				Calendar cal = Calendar.getInstance();
				cal.set(Calendar.YEAR, 2021);
				cal.set(Calendar.MONTH, 8);
				cal.set(2021, 8 - 1, 1);
				int end = cal.getActualMaximum(Calendar.DATE);
				int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
				%>
				<tr>
					<%
					for (int i = 1; i <= end; i++) {
						if (i == 1) {
							for (int j = i; j < dayOfWeek; j++) {
					%>
					<td></td>
					<%
					}
					}
					%>
					<td><%=i%></td>
					<%
					if (dayOfWeek % 7 == 0) {
					%>
				</tr>
				<tr>
					<%
					}
					dayOfWeek++;
					}
					%>
				
			</tbody>
		</table>

	</div>

</body>
</html>