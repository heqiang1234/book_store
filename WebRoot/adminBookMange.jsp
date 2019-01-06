<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  <div class="div2">书籍管理(book manage) </div>
    <div class="div3">
  <b></b>
  <tbody>
  <tr>
    <th><s:a href="BookSave.jsp"  >Save Book</s:a> <br><br><br></th>
   <th><s:a href="listBook.action">List Book</s:a><br><br><br></th>
    <th><s:a href="adminControl.jsp" style="width:150px;height:35px;background-color:#99ccc;">返回管理员</s:a> <br></th>
    <th> <s:a href="loginfirst.jsp" style="width:150px;height:35px;background-color:#99ccc;">返回首页</s:a> <br></th>
    </tr>
    </tbody>
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
  width:300px;
  hight:200px;
  border-color:;
  border-style:groove;
  border-width:2px;
  margin-top:100px;
  background-color:black: 
  }
  .div2{
  border-radius: 15px;
  width:300px;
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
