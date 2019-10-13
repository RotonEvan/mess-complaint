<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- This is basically to set the page width to device width and zoom level to 1 -->
<meta name="viewport" content="width = device-width,initial-scale=1">
<!-- To get the bootstrap;s comppiled CSS -->
<link rel="stylesheet" type="text/css"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<style>
* {
	margin: 0px;
	padding: 0px;
}

body {
	background-image: url(img1.jpg);
	background-size: cover;
	background-attachment: fixed;
	font-family: new Line roman;
}

h1 {
	font-size: 40px;
	color: white;
	margin-top: 250px;
}

p {
	font-size: 17px;
	color: black;
}

h3 {
	font-size: 25px;
	color: white;
}

.glyphicon-pencil {
	font-size: 35px;
	color: black;
	float: right;
	margin-top: 20px;
}

.col-md-5 {
	position: relative;
}

.label {
	font-weight: normal;
	margin-top: 15px;
	color: black;
	font-size: 19px;
}

.form-control {
	background: transparent;
	border-radius: 0px;
	border: 0px;
	border-bottom: 1px solid white;
	font-size: 18px;
	margin-top: 15px;
	height: 40px;
	color: black;
	border: 1px solid black;
}

input[type="checkbox"] {
	margin-top: 15px;
	width: 15px;
	height: 15px;
}

input[type="text"] {
	border: 1px solid black;
}

.breaker {
	color: red;
	border: 1px solid green;
	margin-bottom: 10px;
}

small {
	font-size: 18px;
	color: black;
}

option {
	color: grey;
}

.btn-info {
	position: relative;
	margin-top: 20px;
	font-size: 18px;
	width: 120px;
	margin-bottom: 20px;
}

.btn-warning {
	margin-top: 20px;
	font-size: 18px;
	width: 120px;
	margin-bottom: 20px;
}

.col-md-12 {
	margin-top: 20px;
}

.col-centered {
	display: inline-block;
	float: inherit;
	margin-right: -4px;
	text-align: center;
	margin: 0 auto;
}

.text-centered {
	text-align: center;
}

.btn-default {
	border: 1px solid green;
}

.list-item {
	background-color: white;
	opacity: 0.8;
	padding: 10px 10px 10px 30px;
	padding-bottom: 20px;
	border-radius: 30px;
	position: relative;
	-webkit-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.3), 0 0 40px
		rgba(0, 0, 0, 0.1) inset;
	-moz-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.3), 0 0 40px
		rgba(0, 0, 0, 0.1) inset;
	box-shadow: 0 1px 4px rgba(0, 0, 0, 0.3), 0 0 40px rgba(0, 0, 0, 0.1)
		inset;
}

.list-item:before, .list-item:after {
	content: "";
	position: absolute;
	z-index: -1;
	-webkit-box-shadow: 0 0 20px white;
	-moz-box-shadow: 0 0 20px white;
	box-shadow: 0 0 30px white;
	top: 10px;
	bottom: 10px;
	left: 0;
	right: 0;
	-moz-border-radius: 30px;
	border-radius: 30px;
}

.list-item:after {
	right: 10px;
	left: auto;
	-webkit-transform: skew(8deg) rotate(3deg);
	-moz-transform: skew(8deg) rotate(3deg);
	-ms-transform: skew(8deg) rotate(3deg);
	-o-transform: skew(8deg) rotate(3deg);
	transform: skew(8deg) rotate(3deg);
}
</style>

<title>IIT Bhilai Mess Complaint System</title>
</head>
<body>

	<div class="container">

		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-12">
						<h3 class="text-centered">Complaint form responses for Castle
							Ena mess</h3>
					</div>
				</div>
				<div class="breaker"></div>
				<div class="row">
					<div class="col-md-5 col-centered">
						<button type="button" class=" btn btn-info carousel-control-prev"
							href="#demo" data-slide="prev">Previous</button>
						<button type="button"
							class="btn btn-warning carousel-control-next" href="#demo"
							data-slide="next">Next</button>
					</div>
				</div>

				<c:forEach items="${complaintList}" var="complaint">
					<div class="list-item">
						<div class="row">
							<label class="label col-md-1 control-label">Name</label>
							<div class="col-md-10">
								<input type="text" class="form-control" name="name"
									placeholder="${complaint.name}" readonly="true">
							</div>
						</div>
						<div class="row">
							<label class="label col-md-1 control-label">ID</label>
							<div class="col-md-10">
								<input type="text" class="form-control" name="id"
									placeholder="${complaint.id}" readonly="true">
							</div>
						</div>
						<div class="row">
							<label class="label col-md-1 control-label">Mess</label>
							<div class="col-md-10">
								<input type="text" class="form-control" name="id"
									placeholder="${complaint.mess}" readonly="true">
							</div>
						</div>
						<div class="row">
							<label class="label col-md-1 control-label">Meal</label>
							<div class="col-md-10">
								<input type="text" class="form-control" name="id"
									placeholder="${complaint.meal}" readonly="true">
							</div>
						</div>
						<div class="row">
							<label class="label col-md-1 control-label">Date</label>
							<div class="col-md-10">
								<input type="text" class="form-control" name="id"
									placeholder="${complaint.date}" readonly="true">
							</div>
						</div>
						<div class="row">
							<label class="label col-md-1 control-label">Complaint</label>
							<div class="col-md-10">
								<textarea rows="5" class="form-control"
									placeholder="${complaint.complaint_description}"></textarea>
							</div>
						</div>
					</div>
				</c:forEach>

			</div>

			<!-- Left and right controls --
                          <a class="carousel-control-prev" href="#demo" data-slide="prev">
                            <span class="carousel-control-prev-icon"></span>
                          </a>
                          <a class="carousel-control-next" href="#demo" data-slide="next">
                            <span class="carousel-control-next-icon"></span>
                          </a> -->

		</div>

	</div>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>


</body>
</html>