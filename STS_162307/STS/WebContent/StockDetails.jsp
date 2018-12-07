<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Stock Trading System.</title>
<style>
table {
	text-align: center;
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
}
</style>
</head>

<body>

<div align="center">
<br>
Welcome to SharePrice.
<br>
<table border="1">
<tr>
<th>Stock</th>
<th>Quote</th>

</tr>
<a:forEach var="stock" items="${list}">
<tr>

<td><a href="stockbook?name=${stock.stock}"> ${stock.stock} </a></td>
<td>${stock.quote}</td>

</tr>
</a:forEach>
</table>

</div>
</body>
</html>