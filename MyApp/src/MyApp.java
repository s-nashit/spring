import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyApp {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
		System.out.println("Connection created");
	}

}
