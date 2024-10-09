package aldCRUD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/display")
public class readC extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ald", "root","");
			String query = "select * from student";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			pw.println("<table border='1px'><tr><th>Name</th><th>E-Mail</th><th>Phone</th><th>Age</th><th>Operations</th></tr>");
			while(rs.next()) {
				String name = rs.getString(1);
				String mail = rs.getString(2);
				String phone = rs.getString(3);
				String age = rs.getString(4);
				pw.println("<tr><td>"+name+ "</td><td>"+ mail + "</td><td>"+ phone+ "</td><td>"+ age + "</td>");
				pw.println("<td><a href= 'crud?action=update&mail="+mail+"'>Update</a> |<a href= 'crud?action=delete&mail="+mail+"' >Delete</a></td></tr>");
				
			}
			pw.println("</table>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
