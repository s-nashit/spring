package redirP;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class shreyC extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		HttpSession session = req.getSession();
//		int out = (int) session.getAttribute("key");
//		String name = (String) session.getAttribute("username");
//		String pass = (String) session.getAttribute("password");
//		out = out+out;
//		PrintWriter pw = res.getWriter();
//		pw.println(out + 3 + " " + name + pass);
		
//		String i = "";
//		Cookie cookies[] = req.getCookies();
//		
//		for(Cookie c : cookies) {
//			i = c.getName();
//		}
//		
//		PrintWriter pw = res.getWriter();
//		pw.println(i);
		
		
		
//		String c = (String) req.getAttribute("out");
		
		PrintWriter pw = res.getWriter();
		pw.println("this is annoitation");
//		pw.println("hello from refdi");
//		System.out.println(out);
		
	}
	
	

}
