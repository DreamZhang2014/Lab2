<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Information</title>
</head>
<body>
<center>
	<h1>Book Information</h1>
	<table border=1>
		<tr>
			<th>ISBN</th>
			<th>Title</th>
			<th>AuthorID</th>
			<th>Publisher</th>
			<th>PublishDate</th>
			<th>Price</th>
			<th>AuthorName</th>
			<th>AuthorAge</th>
			<th>AuthorCountry</th>
			
		</tr>
		<!--  <c:forEach var="ele" items="${bl}">-->
			<tr>	
				<td>${requestScope.b1}</td>
				<td>${requestScope.b2}</td>
				<td>${requestScope.b3}</td>
				<td>${requestScope.b4}</td>
				<td>${requestScope.b5}</td>
				<td>${requestScope.b6}</td>
				<td>${requestScope.b7}</td>
				<td>${requestScope.b8}</td>
				<td>${requestScope.b9}</td>
			</tr>
		<!--  </c:forEach>-->
	</table>
				<form action="back.action" method="post">
					<input type=submit name=subm value="return">
				</form>
</center>
</body>
</html>