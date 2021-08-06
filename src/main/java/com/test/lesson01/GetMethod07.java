package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz07")
public class GetMethod07 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");

		String address = request.getParameter("address");
		String card = request.getParameter("card");
		Integer price = Integer.valueOf(request.getParameter("price"));
		
		PrintWriter out = response.getWriter();
		if (!address.contains("서울시")) {
			out.print("배달불가 지역입니다.");
			return;
		}
		if (card.equals("신한카드")) {
			out.print("결제불가 카드입니다.");
			return;
		}
		else out.println(address);
		out.print("결제금액: " + price);
	}
}