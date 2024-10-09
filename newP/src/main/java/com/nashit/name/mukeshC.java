package com.nashit.name;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class mukeshC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) {
	String name = req.getParameter("name");
	System.out.println("welcome to our app "+ name);
	}

}
