package elP;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/dServlet")
public class dServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name = "Nashit";
//		System.out.println(name);
//		PrintWriter pw = res.getWriter();
//		pw.println(name);
		
		req.setAttribute("label", name);
		
		RequestDispatcher rd = req.getRequestDispatcher("read.jsp");
		rd.forward(req, res);
		
	}
	

}
