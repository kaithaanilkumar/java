package customer.main.entity.serveres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import customer.main.entity.Customer;

public class jdbc_code 
{
	public static Connection boilerplate() throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://localhost:3306/employee";
		String u="root";
		String p="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,u,p);
		return con;
	}
	public static int insert(Customer cust) throws SQLException, ClassNotFoundException
	{
		Connection con=boilerplate();
		String sql="INSERT INTO registation VALUES(?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1,cust.getUsername());
		pst.setString(2, cust.getPassword());
		int rows=pst.executeUpdate();
		return rows;
	}
	public static ResultSet search(String Username,String Password) throws ClassNotFoundException, SQLException
	{
		Connection con=boilerplate();
		String sql="SELECT * FROM REGISTATION WHERE USERNAME=? AND pASSWORD=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, Username);
		pst.setString(2,Password);
		ResultSet rs=pst.executeQuery();
		return rs;
	}
	
	
}
