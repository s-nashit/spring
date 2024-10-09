package aditP;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//annotation
@WebServlet("/pass")
public class passC extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		String name;
		
//		String name = req.getParameter("name");
//		double marks = (double) req.getAttribute("marks");
		HttpSession sess = req.getSession();
		int name = (int) sess.getAttribute("age");
		
		PrintWriter pw = res.getWriter();
		pw.println("<h1> you have passed</h1>");
		pw.println("<h1>" + name + " : you have passed</h1>");
//		pw.println("<h1>" + name + " : scored: " + marks + "%</h1>");
		
	}

}
