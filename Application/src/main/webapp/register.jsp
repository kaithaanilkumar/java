
<%@page import="First.dao_serve.*"%>
<%@page import="First.dao.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name=request.getParameter("Fname");
		String Lname=request.getParameter("Lname");
		String Email=request.getParameter("Email");
		String Password=request.getParameter("Password");
		String Address=request.getParameter("Address");
		Dao_class sk=new Dao_class();
		sk.setFname(name);
		sk.setLname(Lname);
		sk.setEmail(Email);
		sk.setPassword(Password);
		sk.setAddress(Address);
		
		int row =jdbc_code.insert(sk);
		if(row>0)	
		{
			out.println("rows are insertd"+row);
		}
		else
		{
			out.println("try again");
		}
	%>
</body>
</html>