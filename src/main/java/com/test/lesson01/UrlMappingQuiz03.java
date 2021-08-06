package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz03")
public class UrlMappingQuiz03 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		for (int i = 1; i < 2; i++) {
			out.print("<html>\r\n" + "    <head>\r\n" + "        <title>뉴스기사</title>\r\n" + "    </head>\r\n"
					+ "    <body>\r\n" + "        <h1>[단독] 고양이가 야옹해</h1>\r\n"
					+ "        기사 입력 시간:2021/32/21 11:11:11<br>\r\n" + "        <hr>\r\n" + "        끝\r\n"
					+ "    </body>\r\n" + "</html>");
		}
	}
}
