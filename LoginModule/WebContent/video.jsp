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

	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");	

	response.setHeader("Pragma", "no-cache");//HTTP 1.0

	response.setHeader("Expires", "0");//Proxies

	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
	}
%>

<iframe width="560" height="315" src="https://www.youtube.com/embed/G0Hx6uN2AJE" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
<br>
<br>
<a href="welcome.jsp">back</a>
</body>
</html>