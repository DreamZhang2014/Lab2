<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a book</title>
</head>
<body>
<center>
		<h1>Please input the information</h1>
		<form action="add.action" method="post">
		<h2>AuthorName��<input Price=text name=type>
		Title��<input Title=text name=type>
		AuthorID��<input AuthorID=text name=type></h2>
		<h3>Publisher��<input Publisher=text name=type>
		Publishdate��<input PublishDate=text name=type>
		Price��<input Price=text name=type></h3>
		<h4>ISBN��<input writer_name=text name=type>
		AuthorAge��<input Age=text name=type>
		AuthorCountry��<input Country=text name=type></h4>
		<input type=submit name=subm value="submit">
		</form>
		<form action="back.action" method="post">
		<input type=submit name=subm value="return">
		</form>

</center>

</body>
</html>