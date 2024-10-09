package aditP;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class loginC extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		int en = Integer.parseInt(req.getParameter("eng"));
		int ma = Integer.parseInt(req.getParameter("math"));
		int sc = Integer.parseInt(req.getParameter("sc"));
		double total = en+ma+sc;
		double per = total/3;
		
		HttpSession sess = req.getSession();
		sess.setAttribute("name", name);
		sess.setAttribute("age", age);
		sess.setAttribute("per", per);
		
		
		
//		req.setAttribute("key", name);
//		req.setAttribute("marks", per);
		
		res.sendRedirect("pass");
		
//		RequestDispatcher rd= req.getRequestDispatcher("pass");
//		rd.forward(req,res);
//		System.out.println(name + " " + age + " " + marks);
//		PrintWriter pw = res.getWriter();
//		pw.print("<body bgcolor='pink'>");
//		pw.print("<h1>");
//		pw.println("hello. login success");
//		
//		pw.print("</h1>");
//		
//		pw.print("<h1>");
//		pw.println("Name : "+name);
//		pw.print("</h1>");
//		pw.print("<h1>");
//		pw.println("Roll : "+age);
//		pw.print("</h1>");
//		pw.print("<h1>");
//		pw.println("percentage: "+per + "%");
//		pw.print("</h1>");
//		pw.print("</body>");
	}


	
}
