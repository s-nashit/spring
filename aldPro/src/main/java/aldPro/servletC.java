package aldPro;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servletC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		System.out.println("form submitted");
		
		String name = req.getParameter("name");
		double emarks = Integer.parseInt(req.getParameter("eng"));
		double mmarks = Integer.parseInt(req.getParameter("maths"));
		
		res.sendRedirect("receive");
		
//		req.setAttribute("key1", name);
//		req.setAttribute("key2", emarks);
//		req.setAttribute("key3", mmarks);
		
		
//		RequestDispatcher rd = req.getRequestDispatcher("receive");
//		rd.forward(req, res);
//		double total = (emarks+mmarks)/2;
//		
//		req.getParameter("name");
//	PrintWriter pw = res.getWriter();
//	pw.println("Welcome to our application: " + name);
//	pw.println("percentage is: "+ total + "%");
	
	
	}

}
