package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/quiz06")
public class quiz06 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json");
		Integer number1 = Integer.valueOf(request.getParameter("number1"));
		Integer number2 = Integer.valueOf(request.getParameter("number2"));
		PrintWriter out = response.getWriter();
		
		// {"addition" : 1570, "subtraction" : 1430, ..}
		out.print("{\"addition\":" + (number1+number2) + ", \"subtraction\":"
				+ (number1-number2)+"}");
		
	}
}