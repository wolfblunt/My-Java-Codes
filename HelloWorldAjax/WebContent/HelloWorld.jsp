<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function callServletWithAjax(methodtype){
		var xmlhttp;
		if(window.XMLHttpRequest){
			xmlhttp = new XMLHttpRequest();
		}
		else{
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		
		xmlhttp.onreadystatechange = function(){
			if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
				document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
			}
		}
		
		var params = "uname="+document.getElementById("uname").value;
		if(methodtype == 'POST'){
			xmlhttp.open(methodtype,"/js_servlet/HelloWorldServlet",true);
			xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
			xmlhttp.send(params);
		}
		else if(methodtype== 'GET'){
			xmlhttp.open(methodtype, "/HelloWorld/HelloWorldServlet?"+params, true);
			xmlhttp.send();
		}
	}
</script>
</head>
<body>
<form id="helloworldForm">
Name:<input type="text" id="uname" width ="20"/>
<button type="button" onclick="callServletWithAjax('GET')">doGetAjax</button>
<button type="button" onclick="callServletWithAjax('POST')">doPostAjax</button>
<div id="myDiv"></div>
</form>
</body>
</html>