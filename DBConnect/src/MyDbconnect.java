//
//public class MyDbconnect {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
import java.sql.*;
 
public class MyDbconnect {
 
public static void main(String[] args) {
   try {
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");//Establishing connection
System.out.println("Connected With the database successfully");
} catch (SQLException e) {
System.out.println("Error while connecting to the database");
}
}
 
}