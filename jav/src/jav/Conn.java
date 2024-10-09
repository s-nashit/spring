package jav;
import java.sql.*;

public class Conn {
	
	public static void main(String[] args) throws ClassNotFoundException {
//		jdbc driver register
		Class.forName("com.mysql.cj.jdbc.Driver");

		try {
//			connection 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Connected");
		
		
	}

}
