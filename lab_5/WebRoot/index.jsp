<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String name = (String)request.getSession().getAttribute("LoginUser");
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	 
	 <style type="text/css">
	   #main{
	     border:1px red solid;
	     height:800px;
	     width:1000px;
	     margin: 0 auto;
	   }
	   #top{
	   	 border:1px red solid;
	   	 height:10%;
	   	 width:100%;
	   }
	   #left{
	     border:1px blue solid;
	     height:90%;
	     width:25%;
	     float:left;
	   }
	   #right{
	     border:1px black solid;
	     height:90%;
	     width:74%; 
	     float:right;
	   }
	   #iframe{
	     width:100%;
	     height:100%;
	   }
	 </style>
  </head>
  
  <script type="text/javascript">
  	function js_method1(){
  		document.getElementById("iframe").src="iframe_2.jsp";
  	}
  
  </script>
  
  <body>
    <div id="main">
      <div id="top"><h2>欢迎登陆，<%=name %></h2></div>
      	
      <div id="left">
        <ul>
          <li><a href="javascript:void(0)" onclick="js_method1();">学生信息管理</a></li>
        </ul>
      </div>
      
      <div id="right">
        <iframe id="iframe" src="iframe_1.jsp"></iframe>
        
      </div>
     
      
    
    </div>
    
  </body>
</html>
