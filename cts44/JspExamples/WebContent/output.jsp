<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String n1=(String)session.getAttribute("sname");
String p1=(String)session.getAttribute("spassword");
String a1=(String)session.getAttribute("sage");
out.print("Hello user: you have enterdthe name:"+n1);
out.print(a1+" "+p1);
%>

</body>
</html>