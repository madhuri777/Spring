<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link href="<c:url value="/resources/CSS/Login.css"/>" rel="stylesheet">
<script src="<c:url value="/resources/javaScript/LoginValidation.js"/>" type="text/javascript" ></script> 
<title>Insert title here</title>
</head>
<body>
<%-- <%
Cookie[] cookies = request.getCookies();

if (cookies != null) {
 for (Cookie cookie : cookies) {
   if (cookie.getName().equals("UserPojo")) {
     //do something
     //value can be retrieved using #cookie.getValue()
     String name=cookie.getValue();
     out.print("cookie value is "+name);
     response.sendRedirect("hello");
    //response.sendRedirect("loginServlet");
    }
  }
}
%> --%>
<div class="login">
<div class="login-header">
  <h1>Login</h1>
  <p><h5><font color="red">${message }</font></h5></p>
  </div>
   <div class="login-form">
   <form action="welcomePage" modelAttribute="login" name="MyForm" onSubmit="return LoginValidation()" method="post">
    <h3>Username:</h3><input type="email" id="username" name="username" placeholder="email"/><br>
   <!--  <h3>Email:</h3><input type="email" id="emails" name="emails" placeholder="email_id"/><br> -->
    <h3>Password:</h3><input type="password" id="passwd" name="password" placeholder="Password"/>
    <br><br>
    <input type="submit" value="Login" class="login-button"/>
    <a href="registration"><input type="button" value="SignUp" class="register"></a>
    </form>
    
    <br>
    <h6 class="no-access">Can't access your account?</h6>
    <div class="error-page">
  <div class="try-again">Error: Try again?</div>
  </div>
  
</div>
  </div>
</body>
</html>