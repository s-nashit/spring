package shreyP;

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
public class updateC extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			String action = req.getParameter("action");
			String mail = req.getParameter("mail");
			
			if ("update".equals(action)) {
				showUpdateForm(res, mail);
				
			}
			else if("delete".equals(action)){
				deleteData(res, mail);
			}
	}
	
	public void showUpdateForm(HttpServletResponse res, String mail) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<form action = 'crud'>");
		pw.println("<input type='hidden' name ='action' value='update'>");
		pw.println("User: <input type='text' name = 'user'>");
		pw.println("Phone: <input type='text' name= 'phone'>");
		pw.println("Phone: <input type='button' value= 'submit'>");
		pw.println("</form>");
	}
	public void updateData(HttpServletRequest req, HttpServletResponse res) throws ClassNotFoundException, SQLException, IOException {
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("user");
		String mail = req.getParameter("mail");
		String phone = req.getParameter("phone");
		String city = req.getParameter("location");
		String query ="update student set user=? , phone = ?, where mail=?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm", "root", "");
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, name);
		ps.setString(2, mail);
		ps.setString(3, phone);
		ps.setString(4, city);
		
		int updated = ps.executeUpdate();
		if(updated>0) {
			pw.print("updated");
		}
		else {
			pw.print("updated");
		}
	}
	private void deleteData(HttpServletResponse res, String mail) throws IOException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adit2", "root", "");
            String query = "DELETE FROM student WHERE mail=?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, mail);

            int deleted = st.executeUpdate();
            PrintWriter pw = res.getWriter();
            res.setContentType("text/html");
            if (deleted > 0) {
                pw.println("Data deleted successfully");
            } else {
                pw.println("Data delete failed");
            }

            st.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
        	e.getMessage();}
            }
//            PrintWriter pw = res.getWriter();
//            pw.print("Error: " + e.getMessage());
        }
    
}
	

}
