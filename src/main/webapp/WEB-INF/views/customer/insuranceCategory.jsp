<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.mju.insurance.enums.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><%=ECustomerMenu.insuranceList.getStr()%></title>
</head>
<body>
	<h1>일병이병건</h1>
	<p><%=ECustomerMenu.insuranceList.getStr()%></p>
	<div>
		<div>
		<%
			for(EInsuranceListMenu menu: EInsuranceListMenu.values()){
		%>
				<a href="ins/list?category=<%=menu.getUrl()%>"><%=menu.getStr()%></a>
		<%
			}
		%>
		</div>
	</div>
</body>
</html>
