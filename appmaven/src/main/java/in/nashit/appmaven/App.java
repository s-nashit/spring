package in.nashit.appmaven;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import in.nashit.beans.student;
import in.nashit.context.ConfigFile;
import in.nashit.mapper.StudentMapper;

public class App 
{
    public static void main( String[] args )
    {
       	try{
    		ApplicationContext cxt = new AnnotationConfigApplicationContext(ConfigFile.class);
    	JdbcTemplate jT = (JdbcTemplate) cxt.getBean(JdbcTemplate.class);
    	String query = "select * from student";
    	StudentMapper mp = new StudentMapper();
    	List<student> st = jT.query(query, new ResultSetExtractor<List<student>>() {
    		@Override
    		public List<student> extractData(ResultSet rs) throws SQLException{
    			List<student> students = new ArrayList<>();
    			while(rs.next()) {
    				students.add(mp.mapR(rs, 0));
    			}
				return students;   			
    		}
    	});
	
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}}
}
