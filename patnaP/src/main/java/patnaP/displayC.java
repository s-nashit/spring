package patnaP;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class displayC extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ald", "root", "");
			String query = "select * from student";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			out.println("<table border='1px'>");
			out.println("<tr><th>Name</th><th>Mail</th><th>Mobile</th><th>Age</th></tr>");
			while(rs.next()) {
				String name = rs.getString(1);
				String mail = rs.getString(2);
				String phone = rs.getString(3);
				String age = rs.getString(4);
				out.println("<tr><td>" + name + "</td><td>" + mail + "</td><td>"+ phone+ "</td><td>"+ age+"</td>");
				out.println("<td><a href = 'crud?action=update&mail=" + mail + "'>Update</a>" + " | <a href = 'crud?action=delete&mail=" + mail + "'>Delete</a></td></tr>");
			}
			out.println("</table>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
