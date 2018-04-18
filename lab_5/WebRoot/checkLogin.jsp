<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.lab_5Mvc.user.services.UserService"%>
<%@page import="com.lab_5Mvc.user.domain.User"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'checkLogin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  <style>
  	*{
  		font-family: 微软雅黑;
  	}
  </style>
  </head>
  
  <body>
    	<%
		request.setCharacterEncoding("utf-8");
		String userName = request.getParameter("name");
		String password = request.getParameter("password");
		UserService userSrv = new UserService();
		User user = userSrv.checkLogin(userName, password);
		if (user != null) {
			request.getSession().setAttribute("LoginUser", userName);
			
			request.getRequestDispatcher("index.jsp").forward(request,
					response);
		} else {
			response.sendRedirect("login.jsp");
		}
	%>
  </body>
</html>
