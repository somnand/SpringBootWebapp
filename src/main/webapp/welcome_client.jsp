<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
<p>
	Welcome <b>${client.name}</b><br/>
	Client ID : <b>${client.id }</b><br/>
	Languages Known : <i>${client.language}</i><br/>
	Current system time : <%=System.currentTimeMillis() %><br/>
</p>
</body>
</html>