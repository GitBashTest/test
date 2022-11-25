<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form class="mb-3" action="signup" method="post">
		<div class="form-group">
			<label for="name">Name: </label>
			<input type="text" class="form-control" placeholder="Enter your name" id="name" name="name">
		</div>
		<div class="form-group">
			<label for="email">Email: </label>
			<input type="email" class="form-control" placeholder="Enter your email" id="email" name="email">
		</div>
		<div class="form-group">
			<label for="password">Password: </label>
			<input type="password" class="form-control" placeholder="Enter your password" id="password" name="password">
		</div>
		<div class="form-group">
			<label for="confirm">Confirm: </label>
			<input type="password" class="form-control" placeholder="Enter your password one more time" id="confirm" name="confirm">
		</div>
		<div class="form-group">
			<label for="age">Age: </label>
			<input type="number" class="form-control" placeholder="Enter your age" id="age" name="age" min="1" max="150" value="1">
		</div>
		<div class="form-group">
			<label for="gender">Gender: </label>
			<div>
				<input type="radio" id="male" name="gender" value="male">
				<label for="male">Male</label><br>
				<input type="radio" id="female" name="gender" value="female">
				<label for="female">Female</label><br>
			</div>
		</div>
		<div class="form-group">
			<label for="registrationNo">Registration No. (ex.011230-4444444): </label>
			<input type="text" class="form-control" placeholder="Enter your registration number" id="registrationNo" name="registrationNo">
		</div>
		<div class="form-group">
			<label for="phoneNo">Phone No.: </label>
			<input type="tel" class="form-control" placeholder="Enter your phone number" id="phoneNo" name="phoneNo">
		</div>
		<div class="form-group">
			<label for="bank">Bank: </label>
			<input type="text" class="form-control" placeholder="Enter your bank" id="bank" name="bank">
		</div>
		<div class="form-group">
			<label for="accountNo">Account No.: </label>
			<input type="number" class="form-control" placeholder="Enter your account number" id="accountNo" name="accountNo">
		</div>
		<button type="submit" class="btn btn-primary">Register</button>
	</form>
	<c:if test="${not empty alert}">
		<div class="alert alert-danger" role="alert">${alert}</div>
	</c:if>
</div>

<%@ include file="../layout/footer.jsp"%>