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
Welcome ${username}....
<br>
<a href="video.jsp">Video</a>
<br>
<a href="aboutUs.jsp">AboutUs</a>
<br>
<br>
<form action="Logout">
<input type="submit" value="Logout"> 
</form>
</body>
</html>