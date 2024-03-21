<%@page import="First.dao_serve.*"%>
<%@page import="java.sql.*"%>
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
		String Email=request.getParameter("Email");
		String Password=request.getParameter("Password");
		Dao_class sj=new Dao_class();
		ResultSet rs=jdbc_code.search(Email,Password);
		if(rs.next())              
		{
			out.println("wellcome to haven");
		}
		else
		{
			out.println("invalid email and password");
		}
		
	%>
</body>
</html>