package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sevlet/ex05")
public class PostMethodEx05 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		
		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");

		// 테이블 출력
		PrintWriter out = response.getWriter();
		out.print("<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title>뉴스기사</title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <table border=1>\r\n"
				+ "            <tr>\r\n"
				+ "                <th>아이디</th>\r\n"
				+ "                <td>"+userId+"</td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <th>이름</th>\r\n"
				+ "                <td>"+name+"</td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <th>생년월일</th>\r\n"
				+ "                <td>"+birth+"</td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <th>이메일</th>\r\n"
				+ "                <td>"+email+"</td>\r\n"
				+ "            </tr>\r\n"
				+ "        </table>\r\n"
				+ "    </body>\r\n"
				+ "</html>");
		System.out.println("#####서블릿통과");
		
	}
	
}
