<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="dao.CountryDAO" %>
    <%@ page import="core.Country" %>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>
	Select Country : 
		<select>
		<% CountryDAO c= new CountryDAO();
		ArrayList<String> d1  = c.printCountry(); %>
		
			<option selected = "selected">--Select Country--</option>
			<% for (int i=0;i<countr.size();i++)
          {%>

               <option><% d1.countr.get(i); %></option>

          } %>
		</select>
		
		<br>
		Select City : 
		<select>
			
			<option selected = "selected">--Select City--</option>
			
           
        
		</select>
	</form>
</body>
</html>