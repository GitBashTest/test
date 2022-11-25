<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.mju.insurance.enums.*" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><%=ECustomerMenu.insuranceList.getStr()%></title>
</head>
<body>
	<h1>일병이병건</h1>
	<p>선택된 보험 종류 = ${category}</p>
	<div>
		<c:choose>
			<c:when test="${empty insurances}">
				<p>고객님의 조건에 맞는 상품이 없습니다</p>
			</c:when>
			<c:otherwise>
				<table>
					<thead>
					<tr>
						<th>보험상품명</th>
						<th>최대 가입금액</th>
						<th>총 보험료</th>
					</tr>
					</thead>
					<tbody>
						<c:forEach var="insurance" items="${insurances}">
							<tr>
								<td><c:out value="${insurance.name}"/></td>
								<td><c:out value="${insurance.insuredAmountSum}"/>원</td>
								<td><c:out value="${insurance.premiumSum}"/>원</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:otherwise> 
		</c:choose>
	</div>
</body>
</html>
