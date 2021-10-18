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
Register here


<form:form modelAttribute="registration" method="post" >
 Username: <form:input path="uname"/>
 <br/>
 Password: <form:password path= "password"/>
 <br/>
 Email: <form:input path = "email" />
 <br/>
 City: <form:input path = "city"/>
 <br/>   
 Department: <form:input path = "department" />
 
 <br/>   
 <button>Submit</button>
</form:form>
</body>
</html>