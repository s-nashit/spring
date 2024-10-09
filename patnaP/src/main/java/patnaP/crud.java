package patnaP;

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

//@WebServlet("/crud")
public class crud extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter pw = res.getWriter();
        String action = req.getParameter("action");
        String mail = req.getParameter("mail");

        pw.println("Service method called with action: " + action);
        if ("update".equals(action)) {
            updateForm(res, mail);
        } else {
            pw.println("deleted");
            // deleteData(res, mail);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String action = req.getParameter("action");
        PrintWriter pw = res.getWriter();
        pw.println("doPost method called with action: " + action);
        if ("update".equals(action)) {
            try {
                updateData(req, res);
            } catch (SQLException e) {
                pw.println("SQL Exception: " + e.getMessage());
                e.printStackTrace();
            } catch (IOException e) {
                pw.println("IO Exception: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private void updateForm(HttpServletResponse res, String mail) throws IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("Displaying update form for email: " + mail);
        pw.println("<form action='crud' method='post'>");
        pw.println("<input type='hidden' name='action' value='update'><br/><br/>");
        pw.println("Name: <input type='text' name='user'><br/><br/>");
        pw.println("Email: <input type='text' name='mail' value='" + mail + "'><br/><br/>");
        pw.println("Phone: <input type='text' name='phone'><br/><br/>");
        pw.println("Age: <input type='text' name='age'><br/><br/>");
        pw.println("<input type='submit' value='update' />");
        pw.println("</form>");
    }

    private void updateData(HttpServletRequest req, HttpServletResponse res) throws SQLException, IOException {
//        String name = req.getParameter("user");
//        String mail = req.getParameter("mail");
//        String phone = req.getParameter("phone");
//        String age = req.getParameter("age");
    	
        String name = req.getParameter("user");
        String mail = req.getParameter("mail");
        String phone = req.getParameter("phone");
        String age = req.getParameter("age");
//        PrintWriter pw = res.getWriter();
        PrintWriter pw = res.getWriter();

//        pw.println("updateData method called with parameters:");
//        pw.println("Name: " + name);
//        pw.println("Email: " + mail);
//        pw.println("Phone: " + phone);
//        pw.println("Age: " + age);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            pw.println("JDBC Driver loaded successfully.");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ald", "root", "");
            pw.println("Database connection established.");
            
            String query = "UPDATE student SET user=?, phone=?, age=? WHERE mail=?";

//            String query = "UPDATE student SET user=?, phone=?, age=? WHERE mail=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(3, phone);
            ps.setString(4, age);
            ps.setString(2, mail);
            
            pw.println("Executing update query: " + query);
            int updated = ps.executeUpdate();

            res.setContentType("text/html");
            if (updated > 0) {
                pw.println("Record updated successfully.");
            } else {
                pw.println("No record found with the given email.");
            }

//            pw.println("Executing update query: " + query);
//            int updated = ps.executeUpdate();
//
//            res.setContentType("text/html");
//            if (updated > 0) {
//                pw.println("Record updated successfully.");
//            } else {
//                pw.println("No record found with the given email.");
//            }
        } catch (ClassNotFoundException e) {
            pw.println("Class Not Found Exception: " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            pw.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}