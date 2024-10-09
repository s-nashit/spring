package patnaP;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//class abc{
//	public void new1(int a, int b) {
//		System.out.println(a*b);
//	}
//}
@WebServlet("/login")
public class patnaC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String name = req.getParameter("name");
		double eng = Integer.parseInt(req.getParameter("eng"));
		double maths = Integer.parseInt(req.getParameter("maths"));
		
		HttpSession session = req.getSession();
		session.setAttribute("key1", name);
		res.sendRedirect("register");
		
//		req.setAttribute("key1", name);
//		
//		RequestDispatcher rd = req.getRequestDispatcher("register");
//		rd.forward(req, res);
//		res.setContentType("text/html");
//		
//		PrintWriter pw = res.getWriter();
//		pw.println("<h1 style='color:red'>"+name + " registered"+"</h1>");
		
//		System.out.println(name);
	}

}
