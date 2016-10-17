<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!--  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>-->
<%  String path = request.getContextPath();  String basePath = request.getScheme() + "://"    + request.getServerName() + ":" + request.getServerPort()   + path + "/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Result!</title>
</head>
<body>
<center>
	<h1>the Result</h1>
	<table border=1>
		<tr>
			<th>Title</th>
			<td>Delete</td>
		</tr>
		<!--  <c:forEach var="ele" items="${bl}">-->
			<tr>
				<td><a href="the_result.action?str=${requestScope.b0}">${requestScope.bl}</a></td>
				 <td><a href="delete.action?str_new=${requestScope.bl}"> Delete</a></td>
			</tr>
<!--  </c:forEach>-->
	</table>
				<form action="back.action" method="post">
					<input type=submit name=subm value="return">
				</form>
</center>
</body>
</html>