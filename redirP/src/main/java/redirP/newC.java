package redirP;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/new")
public class newC extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
//		ServletContext out = getServletContext();
//		String str = out.getInitParameter("phone");
//		String str1 = out.getInitParameter("browser");
		pw.println("hello");
//		String name = req.getParameter("name");
//		String pass = req.getParameter("pass");
//		int a = Integer.parseInt(req.getParameter("a"));
//		int b = Integer.parseInt(req.getParameter("b"));
//		int out = a+b;
//		
//		Cookie c = new Cookie("user", name);
		
//		HttpSession session = req.getSession();
//		session.setAttribute("key", out);
//		session.setAttribute("username", name);
//		session.setAttribute("password", pass);
		
//		req.setAttribute("inp", out);
//		res.sendRedirect("shrey");
		
//		RequestDispatcher rd = req.getRequestDispatcher("shrey");
//		rd.forward(req, res);
		
//		PrintWriter pw = res.getWriter();
//		pw.println("<h1 style='color:red'>");
//		pw.println(name + "  " + mail);
//		pw.println("</h1>");
//		pw.close();
//		res.sendRedirect("wikipedia.org");
	}
	

}
