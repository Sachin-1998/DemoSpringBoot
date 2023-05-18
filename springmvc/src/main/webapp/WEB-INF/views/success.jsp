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
<p>${desc }</p>
<h1 style="colour: greeen">${msg }</h1>
<hr>
<h1>welcome, ${user.userName}</h1>
<h1>your email address is ${user.email}</h1>
<h1>your password is ${user.userPassword} try to secure your password</h1>

</body>
</html>