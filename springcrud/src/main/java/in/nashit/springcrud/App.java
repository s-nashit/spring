package in.nashit.springcrud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import in.nashit.beans.Student;
import in.nashit.context.ConfigFile;
import in.sp.mappers.StudentRowMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        String name = "mukesh";
//        String mail = "mukesh@hotmail.com";
//        String location = "Patna";
        try {
            ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
            
            JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
            String query = "select * from student";
            StudentRowMapper mp = new StudentRowMapper();
        	List<Student> ls = jT.query(query, new ResultSetExtractor<List<Student>>() {
        		@Override
        		public List<Student> extractData(ResultSet rs) throws SQLException {
        		List<Student> students = new ArrayList<>();
        		while (rs.next()) {
        		students.add(mp.mapRow(rs, 0));
        		}
        		return students;
        		}
        		});
        	
        	
        	for (Student s: ls) {
        		System.out.println(s.getName() + " -- " + s.getMail() + " -- " + s.getLocation());
//        		System.out.println();
        	}


//        String query = "create database newApp";
//        jT.update(query);
//        String query = "insert into student values(?,?,?)";
//        jT.update(query, name, mail, location);
//        System.out.println("inserted");
//        if(created>0) {
//        	System.out.println("inserted");
//        }
//        else {
//        	System.out.println("error");
//        
//        }
        }
        catch(Exception e) {
        	System.out.println(e);}
        }
//        System.out.println("connected");
    }

