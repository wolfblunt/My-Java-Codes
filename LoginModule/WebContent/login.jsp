<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>Insert title here</title>
</head>
<body>

<form action="Login">
<div class="login-box">
<h1>Login</h1>

<div class="textbox">
<i class="fa fa-user" aria-hidden="true"></i>
<input type="text" name="t1" placeholder="UserName">
</div>
<div class="textbox">
<i class="fa fa-lock" aria-hidden="true"></i>
<input type="password" name="p1" placeholder="Password">
</div>
<input type="submit" value="Login" class="btn">
</div>
</form>
<form action="signUp.jsp">
<div class="signup-box">
<div class="button">
<input type="submit" value="SignUp">
</div>
</div>
</form>

</body>
</html>