package crudP;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class registerC extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm", "root", "");
//			String name = req.getParameter("user");
//			String mail = req.getParameter("mail");
//			String phone = req.getParameter("phone");
//			String city = req.getParameter("location");
//			pw.println(name+ "--" + mail+"--" +phone+"--" +city);
//			String query ="insert into student values(?,?,?,?)";
			String query = "select * from student";
//			PreparedStatement ps = conn.prepareStatement(query);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			pw.println("<table border='1px' style='border-collapse:collapse'>");
			pw.println("<tr><th>Name</th><th>E-Mail</th><th>Phone</th><th>City</th></tr>");
			while(rs.next()) {
				String name = rs.getString(1);
				String mail = rs.getString(2);
				String phone = rs.getString(3);
				String city = rs.getString(4);
				pw.println("<tr>" +"<td>" + name + "</td>" + "<td>" + mail +"<td>" + phone + "</td>" + "<td>" + city + "</td></tr>" );
			}
			pw.println("</table>");
			
//			ps.setString(1, name);
//			ps.setString(2, mail);
//			ps.setString(3, phone);
//			ps.setString(4, city);
//			
//			ps.executeUpdate();
//			
//			pw.print("inserted");
			
//			if(inserted>0) {
//				pw.print("data inserted");
//			}
//			else {
//				pw.print("some error");
//			}
			
			
			
//			pw.print("registered");
//			String query = "create database ibm";
//			String query = "create table student(name varchar(30), mail varchar(40) primary key, phone varchar(12), location varchar(12))";
//			Statement st = conn.createStatement();
//			st.executeUpdate(query);
//			pw.println("table created");
//				pw.println("connected");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			pw.print(e);
		}

	}

}
