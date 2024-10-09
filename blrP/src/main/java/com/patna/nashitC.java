package com.patna;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class nashitC extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		String a = req.getParameter("fname");
		String b = req.getParameter("pass");
		System.out.println(a + " " + b);	
		}
}
