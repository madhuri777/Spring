<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/CSS/Registration.css"/>" rel="stylesheet">
<script src="<c:url value="/resources/javaScript/Validation.js"/>" type="text/javascript" ></script> 
<!--<script src="Javascript/validation.js"></script>-->
<title>Insert title here</title>
</head>
<body>

<div class="registration">
<div class="registration-header">
<h2>Register</h2>
<p><font color="red">${message}</font></p>
<p><font color="red">${messages}</font></p>
</div>
<form action="registerprocess" modelAttribute="regstruser" name="RegistrationForm" onSubmit="return validation()" method="post">
<div class="registration-form">
<h3>UserName:</h3><input type="text" id="username" name="username" placeholder="username" /><br>
<h3>Email:</h3><input type="email" id="emails" name="email" placeholder="email_id" /><br>
<h3>Password:</h3><input type="password" id="password" name="password" placeholder="password" /><br>
<h3>Re-Enter-password:</h3><input type="password" id="repasswd" name="repasswd" placeholder="re-password" /><br>
<h3>Date Of Birth:</h3><input type="date" id="date" name="bdydate" placeholder="" /><br>
<input type="submit" value="Register" class="register">
</div>

</form>
</div>

</body>
</html>