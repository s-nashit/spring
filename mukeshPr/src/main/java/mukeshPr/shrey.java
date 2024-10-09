package mukeshPr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class shrey extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("uname");
		String mail = req.getParameter("mail");
		String city = req.getParameter("city");
		
		resp.setContentType("text/html");
		PrintWriter a = resp.getWriter();
		a.println(name);
		a.println(mail);
		a.println(city);
	}

}
