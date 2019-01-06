<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'save.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
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
   margin-top: 100px;
    margin-left: 510px;
  }
    </style>
    <style>
     ul{/*设置导航栏的框框*/
		 	margin: 30px auto;/*框框整体的位置，30px是指离网页的顶部和下部的距离，auto控制的是左右距离为自动调节*/
			width: 800px;/*框框的宽度*/
			height: 50px;/*框框的长度*/
			padding: 0px;/*将框框的padding设置为零，不然会导致框框里的内容与框边缘有间隔*/
			border:1px solid #000;/*添加边框*/
		}
		li{
			list-style-type: none;/* 去掉li前的点 */
			float: left;/*将li设置成做浮动，变为联动*/
		}
		a{
			display: block;/*将a变成块状*/
			width: 160px;/*设置块的宽度*/
			height: 50px;/*设置块的长度*/
			font-family: Microsoft Yahei;
			line-height: 50px;/*设置字体在块中的高度*/
			background-color: #2f4f4f;
			margin: 0px 0px;/*块里的高宽通过margin设置*/
			color: #fff;
			text-align: center;/*字体居中*/
			text-decoration: none;/*去掉下划线*/
			font-size: 15px;
		}
		a:hover{
			background-color: #2f6f4f;
		}
		  </style>
  </head>
  <center>
  <body>
    <img alt="" src="top.jpg"style="width:900px;height:250px">
         <div class="div1">
         <ul>
         	<li><a href="loginfirst.jsp">首页</a></li>
            <li><a href="userlogin.jsp">重新登陆</a></li>
			<li><a href="userlogin.jsp">用户管理</a></li>
			<li><a href="adminlogin.jsp">书籍查看</a></li>
			<li><a href="http://lib.jxufe.edu.cn/index">图书馆</a></li>
		
			
		 </ul>
    <div class="div2">保存用户(save user)</div>
      <div class="div3">
     <s:form action="saveUser">
     
     	<s:textfield name="user.username" label="username" style="width:300px;height:40px;background-color:#999;border-style:hidden"></s:textfield>
     	<s:textfield name="user.userpassword" label="userpassword" style="width:300px;height:40px;background-color:#999;border-style:hidden"></s:textfield>
     	<s:textfield name="user.userphone" label="phone" style="width:300px;height:40px;background-color:#999;border-style:hidden"></s:textfield>
     	<s:submit value="submit" style="width:150px;height:35px;background-color:#99ccc;"></s:submit>
     	
      
     </s:form>
     </div>
    </div>
   
  </body>
  </center>
</html>
