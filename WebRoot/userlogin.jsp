<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
  request.setCharacterEncoding("UTF-8");
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">

 

	function resetForm(){
		$("#userName").val("");
		$("#password").val("");
	}
	function checkForm(){
     	var userName = $("#userName").val();
		var password = $("#password").val();
		if(userName == ""){
			alert("Please enter username");
			return false;
		}
		if(password == ""){
			alert("Please enter password");
			return false;
		}
		return true;
	}
</script>
<style>
  div{
  margin:0 auto;
  text-align:center;
  background-color:;
  }
   .div1
  {
  border-radius: 15px;
   border-radius: 15px;
  width:1000px;
  border-color:#b8b8b8;
  border-style:groove;
  border-width:2px;
  background-color:red: 
  }
  .div2{
  border-radius: 15px;
  border-radius: 15px;
  width:350px;
  height:40px;
  border-bottom-color:#000;
  back-bottom-style:;
  border-bottomwidth:20px;
  line-height:30px;
  front-weight:bold;
  background-color:#999;
  font-family:myFirstFont;
  font-size:18px;
 
  }
 .div3{
  border-radius: 15px;
  front-size:18px;
  front-weight:bold;
  border-radius:20%;
  transform: translate(-50%,-50%);
   margin-top:80px;
    margin-left: 510px;
  }
    </style>
    <style>
     ul{
		 	margin: 30px auto;
			width: 800px;
			height: 50px;
			padding: 0px;
			border:1px solid #000;
		}
		li{
			list-style-type: none;
			float: left;
		}
		a{
			display: block;
			width: 160px;
			height: 50px;
			font-family: Microsoft Yahei;
			line-height: 50px;
			background-color: #2f4f4f;
			margin: 0px 0px;
			color: #fff;
			text-align: center;
			text-decoration: none;
			font-size: 15px;
		}
		a:hover{
			background-color: #2f6f4f;
		}
		  </style>
  </head>
  <center>
  <body>
 <img alt="" src="top.jpg"  style="width:900px;height:250px; alin:center">
         <div class="div1">
         <ul>
         	<li><a href="loginfirst.jsp">首页</a></li>
            <li><a href="userlogin.jsp">重新登陆</a></li>
			<li><a href="adminlogin.jsp">管理员管理</a></li>
			<li><a href="save.jsp">注册</a></li>
			<li><a href="http://lib.jxufe.edu.cn/index">图书馆</a></li>
		 
			
		 </ul>
<div class="div2"> 用户登陆(user login)</div>
      <div class="div3">
      <s:form action="checkUser" onsubmit="return checkForm()">
     	<s:textfield name="user.username" id="userName"  label="username" required="true" style="width:300px;height:40px;background-color:#999;border-style:hidden"></s:textfield>
     	<s:password name="user.userpassword" id="password" required="true" requiredLabel="true" label="userpassword"  style="width:300px;height:40px;background-color:#999;border-style:hidden"></s:password>
     	<s:submit value="submit"  style="width:150px;height:35px;background-color:#99ccc;"></s:submit> 
     	   
     </s:form>
      </div>
    </div>
  </body>
   </center>
    
</html>
