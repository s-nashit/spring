package loginP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class log {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection conn = DriverManager.getConnection("jdbc:mysql:/localhost:3306/jdbc", "root", "");
		String query = "show databases";
		Statement st = conn.createStatement();
		st.executeQuery(query);
	}

}
