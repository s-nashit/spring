package javaC;

import java.sql.*;

public class javaC {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		register drivers
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		register
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mumbai", "root", "");
//		String query = "create table usa(id int, name varchar(20))";
//		String query = "show tables";
//		String query ="insert into usa values(1, 'shrey'),(2, 'tannu'),(3,'smriti')";
//		String query = "update usa set name='shreya bharti' where id =1";
//		String query = "delete from usa where id = 1";
		String query = "drop table russia";

		Statement st = conn.createStatement();
		st.executeUpdate(query);
//		st.execute(query);
		System.out.println("updated");
		
//		System.out.println("connected");
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
//		for(int i=0; i<rs.length(); i++) {
//		System.out.println(i);}
//
//	}

}}
