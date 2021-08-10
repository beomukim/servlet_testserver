<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
	public int sum(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i;
		}
		return sum;
	}
%>
<%
	int[] scores = {80, 90, 100, 95, 80};
	int sum = 0;
	for (int i = 0; i < scores.length; i++) {
		sum += scores[i];
	}
	int avg = sum / scores.length;

	// 2번
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	int score = 0;
	for (String str : scoreList) {
		if (str.equals("O")) {
			score += 100 / scoreList.size();
		}
	}
	//3번
	String birthDay = "20010820";
	Integer age = 2022 - Integer.valueOf(birthDay.substring(0,4));
%>
	<h1>1부터 50까지의 합은 <%= sum(50) %> 입니다.</h1>
	<h1>평균 점수는 <%= avg %> 입니다</h1>
	<h1>채점 결과는 <%= score %> 입니다</h1>
	<h1>20010820의 나이는 <%= age %> 입니다</h1>
</body>
</html>