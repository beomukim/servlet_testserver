package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz04")
public class UrlMappingQuiz04 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		PrintWriter out = response.getWriter();
		out.print("<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title>뉴스기사</title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <ul>\r\n"
				+ "            <script>\r\n"
				+ "                for (let i = 1; i <= 30; i++) {\r\n"
				+ "                document.write(\"<li>\" + i + \"번째 리스트</li>\")\r\n"
				+ "                }\r\n"
				+ "            </script>\r\n"
				+ "        </ul>\r\n"
				+ "    </body>\r\n"
				+ "</html>");
	}
}
