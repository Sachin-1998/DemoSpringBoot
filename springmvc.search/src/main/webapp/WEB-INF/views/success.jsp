<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>${student }</h1>
<hr>

<h1>Student name is : ${student.name }</h1>
<h1>Student Id is: ${student.id }</h1>
<h1>Your Date is: ${student.date }</h1>
<h1>Student courses are: ${student.courses }</h1>
<h1>Your Gender is: ${student.gender }</h1>
<h1>Student type: ${student.type }</h1>
<h1>Student Address Street: ${student.address.street }</h1>
<h1>Student address City: ${student.address.city }</h1>


</body>
</html>