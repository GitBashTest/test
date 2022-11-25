<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.mju.insurance.enums.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Employee</title>
</head>
<body>
	<h1>일병이병건</h1>
	<p>직원 업무 메뉴</p>
	<div>
	<%
		for(EEmployeeMenu menu: EEmployeeMenu.values()){
	%>
			<a href="<%=menu.getUrl()%>"><%=menu.getStr()%></a> 
	<%
		}
	%>
	</div>
</body>
</html>
