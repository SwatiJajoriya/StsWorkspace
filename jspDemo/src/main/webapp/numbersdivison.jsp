<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page errorPage="Exceptionhandle.jsp"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int c=Integer.parseInt(request.getParameter("num1"))/Integer.parseInt(request.getParameter("num2"));
out.print("the result is "+c);
%>

</body>
</html>