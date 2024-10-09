package in.sp.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import in.nashit.beans.Student;

public class StudentRowMapper implements RowMapper{
	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st = new Student();
		st.setName(rs.getString("name"));
		st.setMail(rs.getString("mail"));
		st.setLocation(rs.getString("location"));
		return st;
		
		
	}

	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		// TODO Auto-generated method stub
		return null;
	}

}
