package aditP;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//controller

@WebServlet("/cmmodel")
public class cmC extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
//		variables/objects/array
		String name = "Nashitjhbwerhcvbwhbgrv";
		int age = 30;
		
		req.setAttribute("key1", name);
		req.setAttribute("key2", age);
		
		RequestDispatcher rd = req.getRequestDispatcher("log.jsp");
		rd.forward(req, res);
	}
	

}
