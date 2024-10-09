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

@WebServlet("/crud")
public class crudC extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String action = req.getParameter("action");
        String mail = req.getParameter("mail");

        if ("update".equals(action)) {
            showUpdateForm(res, mail);
        } else if ("delete".equals(action)) {
            deleteData(res, mail);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String action = req.getParameter("action");

        if ("update".equals(action)) {
            updateData(req, res);
        }
    }

    private void showUpdateForm(HttpServletResponse res, String mail) throws IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        pw.println("<form action='crud' method='post'>");
        pw.println("<input type='hidden' name='action' value='update'>");
        pw.println("<input type='hidden' name='mail' value='" + mail + "'>");
        pw.println("New Username: <input type='text' name='user'><br>");
        pw.println("New Age: <input type='text' name='age'><br>");
        pw.println("New Phone: <input type='text' name='phone'><br>");
        pw.println("<input type='submit' value='Update'>");
        pw.println("</form>");
    }

    private void updateData(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String user = req.getParameter("user");
        String mail = req.getParameter("mail");
        String phone = req.getParameter("phone");
        String age = req.getParameter("age");

        Connection conn = null;
        PreparedStatement st = null;
        PrintWriter pw = res.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ald", "root", "");
            String query = "UPDATE student SET name=?, age=?, phone=? WHERE mail=?";
            st = conn.prepareStatement(query);
            st.setString(1, user);
            st.setString(2, age);
            st.setString(3, phone);
            st.setString(4, mail);

            int updated = st.executeUpdate();
            res.setContentType("text/html");
            if (updated > 0) {
                pw.println("Data updated successfully");
            } else {
                pw.println("Data update failed");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            pw.print("Error: " + e.getMessage());
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void deleteData(HttpServletResponse res, String mail) throws IOException {
        Connection conn = null;
        PreparedStatement st = null;
        PrintWriter pw = res.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ald", "root", "");
            String query = "DELETE FROM student WHERE mail=?";
            st = conn.prepareStatement(query);
            st.setString(1, mail);

            int deleted = st.executeUpdate();
            res.setContentType("text/html");
            if (deleted > 0) {
                pw.println("Data deleted successfully");
            } else {
                pw.println("Data delete failed");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            pw.print("Error: " + e.getMessage());
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
