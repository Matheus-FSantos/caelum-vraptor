<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Update - VRaptor Project</title>
		<!-- Bootstrap -->
		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
			crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<div align="center">
				<h1>Product Edit</h1>
			</div>
			
			<form method="POST" action="persistUpdate">
				<!-- Id para método -->
				<input type="hidden" name="product.id" value="${product.id}"/>
				
				<!-- Name input -->
				<div class="form-outline mb-4">
					<label class="form-label" for="inputName">Name</label>
					<input type="text" id="inputName" name="product.name" value="${product.name}" class="form-control" placeholder="Insert name here..."/> 
					<div class="form-text">Min.: 3 characters.</div>
				</div>
		
				<!-- Price input -->
				<div class="form-outline mb-4">
					<label class="form-label" for="inputPrice">Price</label>
					<input type="text" id="inputPrice" name="product.price" value="${product.price}" class="form-control" placeholder="Insert price here..."/> 
					<div class="form-text">Min.: R$ 1.00</div>
				</div>
		
				<!-- Description input -->
				<div class="form-outline mb-4">
					<label class="form-label" for="inputDescription">Description</label>
					<textarea class="form-control" id="inputDescription" name="product.description" rows="3" placeholder="Insert description here...">${product.description}</textarea>
					<div class="form-text">Max.: 40 characters.</div>
				</div>
				
		
				<!-- Submit button -->
				<div class="d-grid gap-2 col-6 mx-auto">
					<button type="submit" class="btn btn-primary btn-lg">Edit</button>
					<a href="index" class="btn btn-outline-danger btn-sm">Leave</a>
				</div>
			</form>
		</div>
		
		<!-- Scripts Bootstrap -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
			crossorigin="anonymous"></script>
	</body>
</html>