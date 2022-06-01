<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Details</title>
<%@ include file="all_css.jsp"%>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<h1 class="container text-center">Sales</h1>
	<div class="container text-center">
		<form action="processcustomer" method="post" class="container mt-3">

			<div class="input-group mb-3">
				<div class="input-group-prepend">
					<label class="input-group-text" for="inputGroupSelect01">CustomerType</label>
				</div>
				<select class="custom-select" id="inputGroupSelect01"
					name="customertype1">
					<option selected>Option</option>
					<option value="General">General</option>
					<option value="Premium">Premium</option>
				</select>
			</div>
	
	<div class="container text-center">
		Billing Amount <input type="text" placeholder="Rs." name="amount1">
	</div>
	<div class="container text-center">
		<input type="submit" value="Submit">
	</div>
	</form>
</div>
</body>
</html>