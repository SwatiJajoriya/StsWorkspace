<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.jspex.*" %>
      <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
StudentDAO dao=new StudentDAO();
List<Student> list=dao.getall();%>

<table border=1>
<tr><th>Name</th> <th>Email</th><th>Password</th><th>Phono</th></tr>
<% for(Student s:list) {%>
<tr><td><%=s.getName()%></td><td><%=s.getEmail()%></td><td><%=s.getPassword()%></td><td><%=s.getPhono()%></td></tr>
<%} %>
</table>
</body>
</html>