<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Products - VRaptor Project</title>
		<!-- Bootstrap -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
	</head>
	<body>
		<table class="table container">
			<thead>
				<tr>
					<td>Name</td>
					<td>Description</td>
					<td>Price</td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productList}" var="product">
					<tr>
						<td>${product.name}</td>
						<td>${product.description}</td>
						<td>R$ ${product.price}</td>
						<td><a href="put?id=${product.id}" class="btn btn-warning">Edit</a></td>
						<td><a href="delete?id=${product.id}" class="btn btn-danger">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
		
		<!-- Scripts Bootstrap -->
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
	</body>
</html>