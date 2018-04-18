<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="com.lab_5Mvc.user.services.StudentService"%>
<%@page import="com.lab_5Mvc.user.domain.Student"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'saveMark.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  </head>
  
  <body>
    <% 
      request.setCharacterEncoding("utf-8");
      String name = request.getParameter("name");
      String id = request.getParameter("id");
      String chinese = request.getParameter("chinese");
      String math = request.getParameter("math");
      String english = request.getParameter("english");      
      StudentService stdSrv = new StudentService();
      stdSrv.saveMark(name, id, chinese, math, english);
      response.sendRedirect("MyJsp.jsp");
    %>
  </body>
</html>
