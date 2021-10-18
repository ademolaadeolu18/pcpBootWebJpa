<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Welcome to login
<form:form modelAttribute="userlogin" method="post" >
 
 Username: <form:input path="uname"/>
 
 <br/>
 
 Password: <form:password path= "upassword"/>
 <br/>
 
 <button>Login</button>
</form:form>
</body>
</html>