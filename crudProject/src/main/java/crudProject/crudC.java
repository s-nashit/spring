package crudProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/crud")
public class crudC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String action = req.getParameter("action");
		String mail = req.getParameter("mail");
//		pw.println(action + "........" +  mail);
		
		if(action.equals("update")){
//			pw.print("updated successfully");
			updateForm(res, mail);
			
		}
		else if(action.equals("delete")){
//			pw.print("deleted successfully");
			try {
				deleteData(res, mail);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String action = req.getParameter("action");
		if(action.equals("update1")) {
			updateData(req,res);
		}
	}

	private void updateData(HttpServletRequest req, HttpServletResponse res) throws IOException {
	    String name = req.getParameter("user");
	    String mail = req.getParameter("mail");
	    String phone = req.getParameter("phone");
	    String age = req.getParameter("age");
	    res.setContentType("text/html");
	    PrintWriter pw = res.getWriter();
	    
	    // Print debug information
	    pw.println("Name: " + name);
	    pw.println("Mail: " + mail);
	    pw.println("Phone: " + phone);
	    pw.println("Age: " + age);
	    
	    // Validate parameters (you can customize this as per your requirement)
	    if (name == null || phone == null || age == null || mail == null) {
	        pw.print("Error: Required parameters are missing.");
	        return;
	    }
	    
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ald", "root",""); 
	        String query = "update student set name=?, phone=?, age=? where mail=?";
	        PreparedStatement ps = conn.prepareStatement(query);
	        ps.setString(1, name);
	        ps.setString(2, phone);
	        ps.setString(3, age);
	        ps.setString(4, mail); // mail should be the last parameter
	        int updated = ps.executeUpdate();
	        if(updated > 0) {
	            pw.print("Updated successfully.");
	        }
	        else {
	            pw.print("Error: Update operation failed.");
	        }
	    } catch (ClassNotFoundException | SQLException e) {
	        // Log the exception instead of printing to the response
	        e.printStackTrace(); // print stack trace to console or log file
	        
	        // Print an error message to the response
	        pw.print("Error: " + e.getMessage());
	    }
	}

		
		
		// TODO Auto-generated method stub
		
	
	public void updateForm(HttpServletResponse res, String mail) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		// TODO Auto-generated method stub
		pw.print("form");
		pw.println("<form action='crud'>");
		pw.println("<input type = 'hidden' name = 'action' value = 'update1'>");
		pw.println("<input type = 'text' name = 'mail' value = '"+mail +"'>");
		pw.println("<input type = 'text' name = 'user'>");
		pw.println("<input type = 'text' name = 'phone'>");
		pw.println("<input type = 'text' name = 'age'>");
		pw.println("<input type = 'submit' value = 'update'>");
		pw.println("</form>");
		
	}

	public void deleteData(HttpServletResponse res, String mail) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ald", "root",""); 
			String query = "delete from student where mail=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, mail);
			int deleted = ps.executeUpdate();
			if(deleted>0) {
				pw.print("deleted successfully");
			}
			else {
				pw.print("error");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			pw.print(e);
		}

	}
}
