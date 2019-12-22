<%@page import="java.util.Date"%>
<%@page import="javax.print.attribute.DateTimeSyntax"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=new Date() %>
<%!
	int cube(int n)
	{
	return n*n*n;
	}
%>
<br>
<br>
<h1>Cube of 15 is <%=cube(15) %></h1>

</body>
</html>