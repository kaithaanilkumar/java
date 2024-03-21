package First.dao_serve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import First.dao.Dao_class;

public class jdbc_code 
{
	public static Connection boilerplatecode() throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://localhost:3306/employee";
		String u="root";
		String p="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, u, p);
		return con;
	}
	public static int insert (Dao_class dd) throws SQLException, ClassNotFoundException
	{
		Connection con=boilerplatecode();
		String sql="INSERT INTO details VALUES(?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1,dd.getFname());
		pst.setString(2, dd.getLname());
		pst.setString(3,dd.getEmail());
		pst.setString(4,dd.getPassword());
		pst.setString(5,dd.getAddress());
		int rows=pst.executeUpdate();
		return rows;
	}
	public static ResultSet search(String Email,String Password) throws ClassNotFoundException, SQLException
	{
		Connection con=boilerplatecode();
		String sql="SELECT * FROM  details where email=? AND PASSWORD=?";
		PreparedStatement pst=con.prepareCall(sql);
		pst.setString(1,Email);
		pst.setString(2, Password);
		ResultSet rs=pst.executeQuery();
		return rs;
	}
}
