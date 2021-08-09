package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/quiz10")
public class GetMethodQuiz10 extends HttpServlet {
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "marobiana");
	        put("password", "qwerty1234");
	        put("name", "신보람");
	    }
	};
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		if (!userMap.get("id").equals(userId)) {
			out.print("id가 일치하지 않습니다.");
			return;
		}
		if (!userMap.get("password").equals(password)) {
			out.print("password가 일치하지 않습니다.");
			return;
		}
		
		out.print(userId + "님. 환영합니다!");
		out.print(""); // 이슈를 위한 foo

	}
}
