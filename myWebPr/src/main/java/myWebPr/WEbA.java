package myWebPr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WEbA extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("uname");
		String mail = req.getParameter("mail");
		String loc = req.getParameter("location");
		
		resp.setContentType("text/html");
		PrintWriter a = resp.getWriter();
		a.print(name);
		a.print(mail);
		a.print(loc);
		
		
	}

}
