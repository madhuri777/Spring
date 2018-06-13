<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
/* HttpSession httpSession=request.getSession();

if(httpSession.getAttribute("UserPojo")==null){
	response.sendRedirect("Login.jsp");
} */
%><center>
<div>
<h3>Welcome User</h3><h2>UserName: ${name}</h2>

<div class="button">
<a href="LogOut"><button type="button">Logout</button></a>
</div>
</div>
</center>
</body>
</html>