<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@page isELIgnored="false" %>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sending data using modelandview</title>
</head>
<body>
<%
/*String name=(String) request.getAttribute("name");

Integer rollnum=(Integer) request.getAttribute("rollnumber");
LocalDateTime time=(LocalDateTime)request.getAttribute("time");*/

%>

<h1>my name is ${name}  <%--<%=name --%> </h1>
<h1>my roll num is ${rollnumber }    <%--<%=rollnum --%> </h1>
<h1>Date and time is : ${time}   <%--<%=time.toString() --%> </h1>

<hr> 
<h1>List of marks</h1>
<c:forEach var="item" items="${marks }">
<h1>${item}</h1>
</c:forEach>

</body>
</html>