package com.nashit;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class calcC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) {
		
		int x = Integer.parseInt(req.getParameter("n1"));
		int y = Integer.parseInt(req.getParameter("n2"));
		int res1 = x+y;
		int res2 = x*y;
		System.out.println(res1+ "...." + res2);
	}

}
