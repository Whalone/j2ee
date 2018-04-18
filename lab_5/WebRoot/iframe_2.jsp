<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <style>
      *{
        font-family: 微软雅黑;
        text-align: center;
      }
    </style>


  </head>
  
  <body>
    <form action="saveMark.jsp" method="post">
      	名字：<input type="text" name="name"><br>
      	学号：<input type="text" name="id"><br>
      	语文：<input type="text" name="chinese"><br>
      	数学：<input type="text" name="math"><br>
      	英语：<input type="text" name="english"><br>
      	<input type="submit" value="保存">
      	<input type="reset" value="取消">
    </form>
  </body>
</html>
