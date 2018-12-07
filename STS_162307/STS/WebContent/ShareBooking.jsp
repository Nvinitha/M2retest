<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Share Price</title>
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
<for:form method="post" action="ordershare" >
<table>
<tr>
<th>Stock</th>
<td><for:input path="stock" value="${stockname}" readonly="true" /></td>

</tr>

<tr>
<th>Quote</th>
<td><for:input path="quote"  value="410.65" readonly="true"/></td>
<td><for:errors path="quote"></for:errors></td>
</tr>


<tr>
<th>Select Action</th>
<td><for:radiobutton path="action" value="Buy" />Buy</td>
<td><for:radiobutton path="action" value="sell"/>Sell</td>
</tr>

<tr>
<th>Quantity</th>
<td><for:input path="quantity"/></td>
<td><for:errors path="quantity"></for:errors>
</tr>


<tr>
<td align="center"><input type="submit" value="Order"></input></td>
</tr>
</table>

</for:form>



</body>
</html>