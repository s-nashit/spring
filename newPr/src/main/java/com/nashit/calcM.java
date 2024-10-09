package com.nashit;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class calcM extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) {
//		int a = Integer.parseInt(req.getParameter("a"));
//		int b = Integer.parseInt(req.getParameter("b"));
//		int c = a+b;
		String c = req.getParameter("a");
		System.out.println(c);
	}	
	

}
