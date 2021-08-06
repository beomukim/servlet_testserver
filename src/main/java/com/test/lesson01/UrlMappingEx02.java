package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex02")
public class UrlMappingEx02 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		// 1 ~ 10까지의 합계
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		PrintWriter out = response.getWriter();
		out.print("<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title>합계</title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "    합계: " + "<strong>"+sum+"</strong>\r\n"
				+ "    </body>\r\n"
				+ "</html>");
		
	}
}