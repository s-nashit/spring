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

@WebServlet("/crud")
public class crudC extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String action = req.getParameter("action");
		String mail = req.getParameter("mail");
		
		if(action.equals("update")){
			pw.println("updated");}
		else {
//			pw.println("deleted");
			deleteData(res,mail);
		}
		}

	private void deleteData(HttpServletResponse res, String mail) throws IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ald", "root","");
			String query = "delete from student where mail=?";
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1,  mail);
			int deleted = st.executeUpdate();
			if(deleted>0) {
				pw.println("deleted successfully");
			}
			else {
				pw.print("not");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
