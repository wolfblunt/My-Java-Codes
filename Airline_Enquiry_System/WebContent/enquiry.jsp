<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enquiry about Domestic and International Flights</h1>
<form action="Enquirycont">
<input type="text" name="from" placeholder="From : City">
<input type="text" name="to" placeholder="To : City">
<input type="number" name="depart" placeholder="Depart : dd/mm/yyyy">
<input type="number" name="return1" placeholder="Return : dd/mm/yyyy">
<input type="submit" value="Get Set Go">
</form>
</body>
</html>
    
     --%>
     
     
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Enquiry Page</title>
<link rel="stylesheet" href="css/enquiry_style.css">
</head>
<body>
<h1>Welcome to Airline Enquiry System</h1>
<br>
  <h2>Enquiry about Domestic and International Flights</h2><br><br>
<div class="container">
  <div class="center">
  

<form class="myForm" method="get" enctype="application/x-www-form-urlencoded" action="Enquirycont">

<label class="audioOnly" for="from">From</label> 
<input type="text" name="from" required placeholder="From : City">

<label class="audioOnly" for="to">To</label> 
<input type="text" name="to" required placeholder="To : City">

<br>
<br>

<label class="audioOnly" for="depart">Depart</label> 
<input type="date" name="depart" required placeholder="Depart : yyyy/mm/dd">

<label class="audioOnly" for="return">Return</label> 
<input type="date" name="return1" placeholder="Return : yyyy/mm/dd">

<br>
<br>

<button>Get Set Go</button>





</form>


</div>
</div>

<br>
<br>
<a href = "Home_page.jsp"><h2>Home Page</h2></a>


</body>
</html>