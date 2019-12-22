<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<select>
		<option value="-1">Select Country</option>
		<%
		
		try
		{
			String sql = "select * from country";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/countries","root","root");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()){
				%>
					<option value="<%=rs.getInt("id") %>"><%=rs.getString("country") %></option>
				<%
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			out.println("Error "+ex.getMessage());
		}
		
		%>
	</select>
</body>
</html>