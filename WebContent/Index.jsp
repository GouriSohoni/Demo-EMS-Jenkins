<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="MyPkg.Validator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<title>SSGS Profile Editor</title>
</head>
<body>
	<h1>SSGS IT EDUCON Services Pvt. Ltd.</h1>
		<form action="Index.jsp" method="get">
		<% if (request.getParameter("uname") != null && request.getParameter("pwd") != null ) 
		{
			String UserName = request.getParameter("uname") ;
			String Passwd = request.getParameter("pwd");
			Validator val  = new Validator();
			if (val.Validate(UserName.trim(), Passwd.trim()))
					{
						out.println("Welcome: " + UserName);
					}
		}
		%>
		<p>
			Enter your name: <input type="text" name="uname"/><br><br>
			Enter your password: <input type="text" name="pwd"/><br><br>
			<input type="submit" name="submoit"/>
		</p>
	</form>
</body>
</html>