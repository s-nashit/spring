package aldPro;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class receiveC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter pw = res.getWriter();
		
//		String a = (String) req.getAttribute("key1");
//		double b = (double) req.getAttribute("key2");
//		double c = (double) req.getAttribute("key2");
		pw.print("this is service/recieve Page: " +  " .your percentage:" +  "%");
	}

}
