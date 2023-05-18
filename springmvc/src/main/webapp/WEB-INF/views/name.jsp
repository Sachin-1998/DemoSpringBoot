<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sending data from controller to view</title>
</head>
<body>
<% String n=(String) request.getAttribute("name"); 
   Integer id=(Integer) request.getAttribute("ID");
   List<String> list= (List<String>) request.getAttribute("List");
%>
<h1>my name is <%=n %></h1>
<h1>my id is <%=id %></h1>

<%for(String s:list)
{
%>
   <h1><%=s %></h1>
<% 
}
%>

</body>
</html>