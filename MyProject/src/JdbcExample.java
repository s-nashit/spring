//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;

public class JdbcExample {
	public static void main(String[] args) {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
		System.out.println("connected");
		
	}

}
