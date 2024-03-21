package customer.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import customer.main.entity.Customer;
import customer.main.entity.serveres.jdbc_code;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/app1")
public class FirstPro extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String Username=req.getParameter("Username");
		String Password=req.getParameter("Password");
		Customer cust=new Customer();
		cust.setUsername(Username);
		cust.setPassword(Password);
		out.println(cust);
		try {
			int rows=jdbc_code.insert(cust);
			if(rows>0)
			{
				
			}
			else
			{
				out.println("try again");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
