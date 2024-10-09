package patnaP;

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
@WebServlet("/reg")
public class regC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ald", "root", "");

			String name = req.getParameter("user");
			String mail = req.getParameter("mail");
			String phone = req.getParameter("phone");
			String age = req.getParameter("age");
			String query = "insert into student values(?,?,?,?)";
			 PreparedStatement ps = conn.prepareStatement(query);
	            ps.setString(1, name);
	            ps.setString(3, phone);
	            ps.setString(4, age);
	            ps.setString(2, mail);
			int ins = ps.executeUpdate();
			if(ins>0) {
				out.println("successfully inserted");
//				out.println(age*2);
			}
			else {
				out.print("some error");
			}
//			String query = "create database allahabad";
//			out.print("<h3 style='color:red'>" + name + mail +phone+ age+ "</h3>");
			
//			out.print("connected to db");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			out.println(e);
		}
		
	}
	

}



