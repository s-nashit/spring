package aldCRUD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class deleteC extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
//		pw.println("deleted");
		String mail = req.getParameter("mail");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ald", "root","");
			String query = "delete from student where mail=?";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1,  mail);
			int deleted = st.executeUpdate(query);
			if(deleted>0) {pw.println("deleted");}
			else {pw.print("not deleted");}
		} catch (ClassNotFoundException | SQLException e) {
			
			pw.print(e);
		}

		
	}
	

}
