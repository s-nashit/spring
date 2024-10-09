package patna;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class welC extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter out = res.getWriter();
//		out.println("second");
		
		int x = (int) req.getAttribute("key");
		x = x*2;
		PrintWriter out = res.getWriter();
		out.println("from second class, output is :" + x);
		
		
	}

}
