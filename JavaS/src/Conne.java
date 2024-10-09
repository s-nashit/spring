//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conne {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
//		Driver register
//		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Class.forName("com.mysql.cj.jdbc.Driver");
//		String url = "jdbc:mysql://localhost:3306";
//		String user = "root";
//		String pass = "";
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/nsti", "root", "");
//		String sql = "create table adit(id int, name varchar(30), mail varchar(45) primary key)";
//		String query = "create table patna(name varchar(30), address varchar(100), age int, mail varchar(30) primary key)";
//		System.out.println("connected: "+conn);
//		String query = "insert into patna values('Hanuman','NSTI Katra', 22, 'hanuuuumaaaaan@aabc.com')";
//		String query = "insert into patna values ('Hanuman','NSTI Katra', 22, 'h@aabc.com'), ('Mukesh', 'Patna', 21, 'abc@muk.com'), ('Vaishnavu', 'Allahabad', 20, 'vaish@abc.com')";
//		String query = "select * from patna";
//		String query = "update patna set name='Mukesh Shrey' where mail='abc@muk.com'";
//		String query = "delete from patna where name='Shrey'";
//		String query = "alter table patna add phone int";
//		String query = "drop table adit";
//		String query = "drop database patna";
//		String query = "alter table patna drop column phone";
		String query = "select * from patna where age=22";
		Statement st = conn.createStatement();
		ResultSet a = st.executeQuery(query);
		System.out.println("NAME    -  AGE  -    MAIL");
//		System.out.println(a);	
		while(a.next()) {
			System.out.println(a.getString("name") + " - "+ a.getInt("age") + " - " + a.getString("mail"));
		}
		
//		while(res.next()) {
//			System.out.println(res.getString("mail") + " - " +res.getInt("age")+ " - " +res.getString("name") + " - "+ res.getString("address"));
//			
//		}
		
//		System.out.println(res);
//		st.executeUpdate(sql);
//		System.out.println("data updated");	
//		st.executeUpdate("create database nsti");
//		System.out.println("databases created");
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}



}

}
