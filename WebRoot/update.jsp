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
    
    <title>My JSP 'update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
   <center>
  <body bgcolor="#ccccff">
    <div class="div1">
  <div class="div2">用户信息更新（update user） </div>
    <div class="div3">
    
     <s:form action="updateUser">
     
     <table>
     
     <tr>
     <td>
     	<s:hidden name="user.userid" value="%{user.userid}" style="width:300px;height:40px;background-color:#999;border-style:hidden"></s:hidden>
     
     </td>
     </tr>
     
     
     <tr>
     <td>
     	<s:textfield name="user.username" value="%{user.username}" label="username" style="width:300px;height:40px;background-color:#999;border-style:hidden"></s:textfield>
     
     </td>
     </tr>
     
     
     <tr>
     <td>
     	<s:textfield name="user.userpassword" value="%{user.userpassword}" label="userpassword" style="width:300px;height:40px;background-color:#999;border-style:hidden"></s:textfield>
     
     </td>
     </tr>
     
     
     <tr>
     <td>
     	
		<s:textfield name="user.userphone" value="%{user.userphone}" label="userphone" style="width:300px;height:40px;background-color:#999;border-style:hidden"></s:textfield>
     </td>
     </tr>
     <tr>
     <td>
     	<s:submit value="submit" style="width:150px;height:35px;background-color:#99ccc;"></s:submit>
     </td>
     </tr>
     </table>
     </s:form>
    </div>
    </div>
  </body>
    </center>
    <style>
  div{
  margin:0 auto;
  text-align:center;
  background-color:#ccccff;
  }
  .div1
  {
   border-radius: 15px;
  width:500px;
  hight:200px;
  border-color:#b8b8b8;
  border-style:groove;
  border-width:2px;
  margin-top:100px;
  background-color:: 
  }
  .div2{
  border-radius: 15px;
  width:500px;
  height:30px;
  border-bottom-color:#000;
  back-bottom-style:groove;
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

  }
    </style>
    
</html>
