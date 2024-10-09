package in.nashit.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import in.nashit.beans.Student;
import in.nashit.beans.student;

public class StudentMapper implements RowMapper{
	public Student mapR(ResultSet rs, int rCount) throws SQLException {
		student st = new student();
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
