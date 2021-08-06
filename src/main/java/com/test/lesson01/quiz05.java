package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/quiz05")
public class quiz05 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		
		Integer number = Integer.valueOf(request.getParameter("number"));
		PrintWriter out = response.getWriter();
		
		out.print("<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title>뉴스기사</title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <ul>");
		for (int i = 1; i <= 9; i++) {
			out.print("<li>" + number + "*" + i + "=" + number*i);
		}
		out.print("</ul>\r\n"
				+ "    </body>\r\n"
				+ "</html>");
		
		
	}
}
