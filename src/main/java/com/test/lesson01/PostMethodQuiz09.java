package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz09")
public class PostMethodQuiz09 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");

		String name = request.getParameter("name");
		String text = request.getParameter("text");
		PrintWriter out = response.getWriter();
		out.print("<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title>자기소개서</title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>");
		out.print("<b>" + name + "<b>님 지원 완료 되었습니다.<br>");
		out.print("지원내용<br>" + text);
		out.print( "</body></html>");
		
	}
}
