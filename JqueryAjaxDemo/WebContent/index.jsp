<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AJAX calls using Jquery in Servlet</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#submit").click(function(event){
			var username = $('#user').val();
			$.get('ActionServlet',{user:username},function(responseText){
				$('#welcometext').text(responseText);
			});
		});
	});
</script>
</head>
<body>
<form id="form1">
Enter your Name<input type="text" id="user">
<input type="button" id="submit" value="Ajax Submit">
<br>
<div id="welcometext"></div>
</form>	
</body>
</html>