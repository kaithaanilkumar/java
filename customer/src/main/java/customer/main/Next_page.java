package customer.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import customer.main.entity.Customer;
import customer.main.entity.serveres.jdbc_code;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/rs")
public class Next_page extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			String Username=req.getParameter("Username");
			String Password=req.getParameter("Password");
			Customer cust=new Customer();
			try {
				ResultSet rs=jdbc_code.search(Username,Password);
				if(rs.next())
				{
					out.println("wllcome to booking");
				}
				else
				{
					out.println("invalid username and password");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
