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

	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//HTTP 1.1
	
	response.setHeader("Pragma", "no-cache");//HTTP 1.0
	
	response.setHeader("Expires", "0");//Proxies

	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
%>

<h1>Hello I am Aman Khandelwal</h1>
<h2>This is my first successful login page using servlet,jsp</h2>
<h3>My email id - amankhandelwaljuly@gmail.com</h3>

<a href="welcome.jsp">back</a>

</body>
</html>