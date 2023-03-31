<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i>Delete the product name</i></h1>
<form action="DeleteController.jsp">
<input type="hidden" name="pid" value=<%=request.getParameter("id") %>>
<input type="submit" value="Delete">

</form>

</body>
</html>