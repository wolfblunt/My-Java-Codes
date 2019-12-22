<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name="Manish";

application.setAttribute("nm", name);
name="Sanjeev";
session.setAttribute("nm", name);
name="Raj";
request.setAttribute("nm", name);
name="Amit";
pageContext.setAttribute("nm", name);
%>
Name is ${nm }<br>
Name is ${pageScope.nm }<br>
Name is ${requestScope.nm }<br>
Name is ${sessionScope.nm }<br>
Name is ${applicationScope.nm }<br>
Calculation ${3/0 }

<a href="abc.jsp">Go</a>

</body>
</html>

