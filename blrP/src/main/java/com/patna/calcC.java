package com.patna;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class calcC extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		int x = Integer.parseInt(req.getParameter("n1"));
		int y = Integer.parseInt(req.getParameter("n2"));
		int z = x*y;
		System.out.println(z);
	}

}
