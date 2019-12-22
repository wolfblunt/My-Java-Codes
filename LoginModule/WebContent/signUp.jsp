<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="mainsignupcss.css">
<title>Insert title here</title>
</head>
<body>

<form action="Register">
<h1>Sign Up</h1>
        
        <fieldset>
          <legend>Your basic info</legend>
          <label for="name">Name:</label>
          <input type="text" id="name" name="t1">
          
          <label for="name">User Name:</label>
          <input type="text" id="name" name="t2">
          
          <label for="password">Password:</label>
          <input type="password" id="password" name="p1">

	  <label for="password">Re-Password:</label>
          <input type="password" id="password" name="p2">
          
          <label>Age:</label>
          <input type="radio" id="under_13" value="under_13" name="user_age"><label for="under_13" class="light">Under 13</label><br>
          <input type="radio" id="over_13" value="over_13" name="user_age"><label for="over_13" class="light">13 or older</label>
        </fieldset>
        
        <button type="submit">Sign Up</button>
</form>

</body>
</html>