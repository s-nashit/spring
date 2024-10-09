import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqljava {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Driver Register
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection establish
		Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","");
		System.out.println(conn);
		
		
	}

}
