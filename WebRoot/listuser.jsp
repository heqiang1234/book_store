<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<style>
html, body{
	padding:0;
	margin:0;
	position:relative;
	background:url(body.jpg);
	background-repeat:repeat;
	color:#fff;
	letter-spacing:1px;
	font-family:Georgia, "Times New Roman", Times, serif;
}

.zebra caption{
	font-size:20px;
	font-weight:normal;
	background:url(zebratable.png);
	background-repeat:no-repeat;
	background-position: 130px center;
	padding-top: 20px;
	height:50px;}

#container{
	padding-top:20px;
	width:960px;
	margin:0 auto;
}

table {
    border-collapse: collapse;
    border-spacing: 0;
	width:100%;
	-webkit-box-shadow:  0px 2px 1px 5px rgba(242, 242, 242, 0.1);
    box-shadow:  0px 2px 1px 5px rgba(242, 242, 242, 0.1);
}

.zebra {
    border: 1px solid #555;
}

.zebra td {
    border-left: 1px solid #555;
    border-top: 1px solid #555;
    padding: 10px;
    text-align: left;    
}

.zebra th, .zebra th:hover {
    border-left: 1px solid #555;
	border-bottom: 1px solid #828282;
    padding: 20px;  
    background-color:#151515 !important;
    background-image: -webkit-gradient(linear, left top, left bottom, from(#151515), to(#404040)) !important;
    background-image: -webkit-linear-gradient(top, #151515, #404040) !important;
    background-image:    -moz-linear-gradient(top, #151515, #404040) !important;
    background-image:     -ms-linear-gradient(top, #151515, #404040) !important;
    background-image:      -o-linear-gradient(top, #151515, #404040) !important;
    background-image:         linear-gradient(top, #151515, #404040) !important;
	color:#fff !important;
	font-weight:normal;
}

.zebra tbody tr:nth-child(even) {
    background: #000 !important;
	color:#fff;
}

.zebra tr:hover *{
    background: #eeeeee;
	color:#000;
}

.zebra tr {
	background:#404040;
	color:#fff;
}

</style>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<script type="text/javascript">
	
	function del()
	{
		 window.location.href = "adminControl.jsp";
	}
	</script>


  </head>
  
  <body>
   		<div id="container">
   	 <input type="button" name="Submit" onclick="del()" value="返回上一页">
   
   
   <table class="zebra">
   	 <caption><center>Users List</center></caption>
   
   <thead>
   
   	<tr>
   	
   	<th>
   		序号
   	</th>
   	
   	<th>
   	用户名
   	</th>
   	
   	<th>
   		密码
   	</th>
   	
   	<th>
   		电话
   	</th>
   	
   	<th>
   		删除
   	</th>
   	
   	<th>
   		更新
   	</th>
   	
   	</tr>
   </thead>
   <tbody>
   	<s:iterator value="#request.list" id="us">
   	
   		<tr>
   		
   			<th>
   				<s:property value="#us.userid"/>
   			</th>
   			
   			<th>
   				<s:property value="#us.username"/>
   			</th>
   			
   			<th>
   				<s:property value="#us.userpassword"/>
   			</th>
   			
   			<th>
   				<s:property value="#us.userphone"/>
   			</th>
   			
   			<th>
   				<s:a href="deleteUser.action?user.userid=%{#us.userid}" onclick="return del();">delete</s:a>
   			</th>
   			
   			<th>
   				<s:a href="updatePUser.action?user.userid=%{#us.userid}">update</s:a>
   			</th>
   		
   		
   		</tr>
   	
   	
   	</s:iterator>
   </tbody>
   
   
   
   
   </table>
   
   
   
   </div>
   
   
   
   
   
   
   
   
   
   
   
   
  </body>
</html>
