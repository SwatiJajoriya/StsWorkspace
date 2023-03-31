<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jspex.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Student s=new Student(); 
s.setName(request.getParameter("name"));
s.setEmail(request.getParameter("email"));

StudentDAO dao=new StudentDAO();
try {
	int row=dao.update(s);
	if(row>0) {
		response.sendRedirect("success.jsp");
	}
	else {
		response.sendRedirect("fail.jsp");
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 

%>
</body>
</html>