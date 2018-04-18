<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title> 
  </head>
  <script type="text/javascript">
    function changeCode(){
    	var img = document.getElementById("checknum");
    	img.src = "CheckNum";
    }
  </script>
  <body>
    <form action="checkLogin.jsp" method="post">
			用户名:<input type="text" name="name"><br />
			密码:<input type="password" name="password"><br />
			验证码:<input type="text" name="checknum"><img src="CheckNum"/>
			<a href="CheckNum">看不清，换一张。</a><br/>
			<input type="submit" value="登陆"> 
	</form>
  </body>
</html>
