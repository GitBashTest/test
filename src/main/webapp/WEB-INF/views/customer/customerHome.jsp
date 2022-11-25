<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.mju.insurance.enums.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Customer</title>
</head>
<body>
	<h1>일병이병건</h1>
	<p>고객 서비스 메뉴</p>
	<div>
	<%
		for(ECustomerMenu menu: ECustomerMenu.values()){
	%>
			<a href="<%="customer/" + menu.getUrl()%>"><%=menu.getStr()%></a> 
	<%
		}
	%> 
	</div>
</body>
</html>
