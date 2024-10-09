import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConn {
	static final String URL = "jdbc:mysql://localhost";
	static final String user = "root";
	static final String pass = "";
//	static final String query = "create database damodar";
	static final String query = "drop database adit";
	
	public static void main(String[] args) throws Exception {
		Connection conn = DriverManager.getConnection(URL, user, pass);
		Statement st = conn.createStatement();
		st.executeUpdate(query);
		System.out.println("deleted");
		
		
}
}
