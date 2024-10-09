package in.nashit.crudMaven;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sun.tools.javac.util.List;

import in.nashit.beans.Student;
import in.nashit.beans.student;
import in.nashit.map.studentMap;
import in.nashit.mapper.StudentMapper;
import in.sp.context.ConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Connected!" );
    	try {
	    	ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
	    	JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
	    	String query = "insert into student values(?,?,?)";
	    	String name = "hrithik";
	    	String mail = "adit@adhhhit.com";
	    	String location = "Patna";
	    	jT.update(query, name, mail,location);
	    	System.out.println("inserted");
//	    	String query = "select * from student";
//	    	StudentMapper mp = new StudentMapper();
//	    	List <Student> ls = jT.query(query, new ResultSetExtractor<List<Student>>() {
//	    		public List<Student> st = new ArrayList<>();
//	    		public List<Student> extractData(ResultSet rs) throws SQLException {
//	    			List<Student> st = new ArrayList<>();
//	    			while(rs.next()) {
//	    				st.add(mp.mapR(rs, 0));		
//	    			}
//	    			return st;
//	    		}
//	    	});
//	    	for (Student s:ls) {
//    			System.out.println(s.getName());
//    			System.out.println(s.getMail());
//    			System.out.println(s.getLocation());
//    		}
    	}
    	catch (Exception e) {
    		System.out.println(e);
    	}
    }
}