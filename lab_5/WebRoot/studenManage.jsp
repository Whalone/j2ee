<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'studenManage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <style>
  	#main{
  	  width:750px;
  	  text-align: center;
  	}
  </style>
  </head>
  
  <body>
    <div id="main">
      <form action="checkServlet" method="post">
      	名字：<input type="text" name="name"><br>
      	学号：<input type="text" name="number"><br>
      	学院：<input type="text" name="college"><br>
      	班级：<input type="text" name="class"><br>
      	<input type="submit" value="保存">
      	<input type="reset" value="重置">
      </form>
    </div>
  </body>
</html>
