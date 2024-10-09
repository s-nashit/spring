package databaseP;

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
public class registerC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		System.out.println("thank you for registering");

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adit", "root", "");
//				String query = "create table students(name varchar(30), mail varchar(30), age int)";
//				String query = "insert into ibm values(?,?,?,?)";
//				PreparedStatement st = conn.prepareStatement(query);
//				String name = req.getParameter("user");
//				st.setString(1, req.getParameter("user"));
//				st.setString(2, req.getParameter("mail"));
//				st.setString(3, req.getParameter("pass"));
//				st.setString(4, req.getParameter("phone"));
//				String name = req.getParameter("user");
//				String mail = req.getParameter("mail");
//				String pass = req.getParameter("pass");
//				String phone = req.getParameter("phone");
				PrintWriter pw = res.getWriter();
				res.setContentType("text/html");
				
//				String query = "select * from ibm";
//				String query = "update ibm set name=?, mail=?, pass=?, phone=? where mail=123";
				String query = "delete from ibm where name=?";
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, "shrey");
//				ps.setString(2, "Shah rUKH kHAN");
//				ps.setString(3, "Shah rUKH kHAN");
//				ps.setString(4, "Shah rUKH kHAN");
				int rupd = ps.executeUpdate();
				if(rupd>0) {
					pw.println("deleted");
//					Statement st = conn.createStatement();
//					ResultSet rs = st.executeQuery(query);
//					pw.println("<table border=1px>");
//					pw.println("<tr>");
//					pw.println("<th>"+ "NAME" + "</th>" + "<th>" + "EMAIL" + "</th>"+ "<th>" + "PASSWORD" + "</th>"+ "<th>" + "PHONE" + "</th>" + "<th>" + "OPERATION" + "</th>");
//					pw.println("</tr>");
//					while(rs.next()) {
//						String name = rs.getString(1);
//						String mail = rs.getString(2);
//						String pass = rs.getString(3);
//						String phone = rs.getString(4);
//						pw.println("<tr>");
//						pw.println("<td>" + name + "</td>" + "<td>" + mail + "</td>" + "<td>" + pass + "</td>" + "<td>" + phone + "</td>"+"<td>" + "Update|Delete" + "</td>");
//				
//						pw.println("</tr>");
//					}
//					pw.println("</table>");
				}
				else {
					pw.println("data not updated");
				}
				
//				
//				Statement st = conn.createStatement();
//				ResultSet rs = st.executeQuery(query);
//				pw.println("<table border=1px>");
//				pw.println("<tr>");
//				pw.println("<th>"+ "NAME" + "</th>" + "<th>" + "EMAIL" + "</th>"+ "<th>" + "PASSWORD" + "</th>"+ "<th>" + "PHONE" + "</th>" + "<th>" + "OPERATION" + "</th>");
//				pw.println("</tr>");
//				while(rs.next()) {
//					String name = rs.getString(1);
//					String mail = rs.getString(2);
//					String pass = rs.getString(3);
//					String phone = rs.getString(4);
//					pw.println("<tr>");
//					pw.println("<td>" + name + "</td>" + "<td>" + mail + "</td>" + "<td>" + pass + "</td>" + "<td>" + phone + "</td>"+"<td>" + "Update|Delete" + "</td>");
//			
//					pw.println("</tr>");
//				}
//				pw.println("</table>");
//				int inserted = st.executeUpdate();
//				if(inserted>0) {
//					pw.println(name + " inserted");
//				}
//				else {
//					pw.println("not inserted");
//				}
//				
				
//				st.executeUpdate(query);
				
//				st.executeUpdate(query);
				
//				PrintWriter pw = res.getWriter();
//				pw.println(name+mail+phone+pass);
//				pw.print("table created");
//				while(rs.next()) {
//
//					pw.println(rs.getString(1));
//				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	
	}

}
