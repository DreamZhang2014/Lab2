<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%  String path = request.getContextPath();  String basePath = request.getScheme() + "://"    + request.getServerName() + ":" + request.getServerPort()   + path + "/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome!</title>
</head>
<body>
<center>
<h1>Welcome to The Library Management System!</h1>
</center>	
		<center>
		Please input the author's name to search books
		<form action="search.action" method="post">
		Author's name£º<input writer_name=text name=type>
		<input type=submit name=subm value="search">
		</form>
		<form action="add_book.action" method="post">
		<input type=submit name=subm value="Add a book">
		</form>
</center>		
</body>
</html>