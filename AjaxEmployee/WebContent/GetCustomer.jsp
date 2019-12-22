<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html> --%>

<%@ page import="java.sql.*"%>  
  
<%  
String s=request.getParameter("q");  
if(s==null || s.trim().equals("")){  
out.print("Please enter id");  
}else{  
int id=Integer.parseInt(s);  
//out.print(id);  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");  
PreparedStatement ps=con.prepareStatement("select * from details where CustomerID=?");  
ps.setInt(1,id);  
ResultSet rs=ps.executeQuery(); 
out.print("<table>");
while(rs.next()){  
out.print("<tr><th>CustomerID</th><td>"+rs.getInt(1)+"</td></tr>"+"<tr><th>Contact Name</th><td>"+rs.getString(2)+"</td></tr>"+"<tr><th>Company Name</th><td>"+rs.getString(3)+"</td></tr>"+"<tr><th>City</th><td>"+rs.getString(4)+"</td></tr>"+"<tr><th>Country</th><td>"+rs.getString(5)+"</td></tr>"+"<tr><th>Postal Code</th><td>"+rs.getString(6)+"</td></tr>");  
}  
out.print("</table>");
con.close();  
}catch(Exception e){e.printStackTrace();}  
}  
%>