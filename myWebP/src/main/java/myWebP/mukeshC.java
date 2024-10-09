package myWebP;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class mukeshC extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name = req.getParameter("uname");
			String age = req.getParameter("age");
			String mail = req.getParameter("mail");
			String location = req.getParameter("location");
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			out.print(name);
			out.print(age);
			out.print(mail);
			out.print(location);
	}

}
