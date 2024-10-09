package in.nashit.manocrud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.context.ConfigFile;

public class App 
{
    public static void main( String[] args )
    {
//        String name = "paul";
//        String mail = "paaaul@hotmsail.com";
//        String location = "Patna";
    	
//        String location = "patna";
        try{ApplicationContext cxt= new 
        		AnnotationConfigApplicationContext(ConfigFile.class);
        
//        String query = "create database shrey";
//        String query = 
//        		"create table student1(name varchar(30), mail varchar(30), "
//        		+ "location varchar(30))";
//        String query = "drop table student1";
        String query = "insert into student values(?,?,?)";
//        String query = "update student set mail=? where location=?";

        JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
//        int updated = jT.update(query,"newyork@gmail.com","patna");
//        int inserted = jT.update(query, "paul", "paul@gmail.com", "new");
//        String query = "update student set name = ? where location = ?";
        int updated = jT.update(query, "Tom Cruise", "Patna");
        if(updated>0) {System.out.println("updated");}
        else {System.out.println("not updated");}
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}
