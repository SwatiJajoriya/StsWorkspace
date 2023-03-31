import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	public	int insert(Student s) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		String sql="insert into student values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,s.getName());
		ps.setString(2,s.getEmail());
		ps.setString(3,s.getPassword());
		ps.setInt(4,s.getPhono());
		return ps.executeUpdate();
	}

	public	int delete(Student s) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		String sql="delete from student where name=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,s.getName());
		return ps.executeUpdate();
	}


public List<Student> getall() throws ClassNotFoundException, SQLException{
	List<Student> list=new ArrayList<Student>();
 	Connection con=DbUtil.dbConn();
	String sql="select * from student";
	PreparedStatement ps=con.prepareStatement(sql);
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		Student s=new Student();
		s.setName(rs.getString(1));
		s.setEmail(rs.getString(2));
		s.setPassword(rs.getString(3));
		s.setPhono(rs.getInt(4));
		list.add(s);
	}
	return list;
	
	
}
	
}



	


