package loginP;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//class serv extends HttpServlet{
//	
//	public void newp() throws SQLException, ClassNotFoundException{
//		 String url
//         = "jdbc:mysql://localhost:3306/jdbc"; // table details
//     String username = "root"; // MySQL credentials
//     String password = "";
//     String query
//         = "select * from login"; // query to be run
//     Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
//     Connection con = DriverManager.getConnection(url, username, password);
//     System.out.println(
//         "Connection Established successfully");
//     Statement st = con.createStatement();
//     ResultSet rs
//         = st.executeQuery(query); // Execute query
//     rs.next();
//     String name
//         = rs.getString("user"); // Retrieve name from db
//
//     
//	}
//}

@WebServlet("/login")
public class loginC extends HttpServlet  {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","");
		String query = "show tables";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		PrintWriter pw = resp.getWriter();
		while(rs.next()) {
//			System.out.println(rs.getString(1));
			pw.println(rs.getString(1));
			
		}
		
		
//		System.out.print("connected");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	

	
	}
	
	


			
			
			
	


}
