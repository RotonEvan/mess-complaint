<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- This is to get the latest rendering engine -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">

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
	color: white;
}

h3 {
	font-size: 25px;
	color: white;
}

.glyphicon-pencil {
	font-size: 35px;
	color: white;
	float: right;
	margin-top: 20px;
}

.col-md-5 {
	margin-top: 80px;
	box-shadow: : 1px 1px 60px 10px black;
	background: rgba(0, 0, 0, 0.4);
}

.label {
	font-weight: normal;
	margin-top: 15px;
	color: white;
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
	color: white;
}

input[type="checkbox"] {
	margin-top: 15px;
	width: 15px;
	height: 15px;
}

.breaker {
	color: red;
	border: 1px solid green;
	margin-bottom: 5px;
}

small {
	font-size: 18px;
	color: white;
}

input[type="radio"] {
	margin-top: 20px;
}

option {
	color: grey;
}

.btn-info {
	margin-top: 20px;
	font-size: 18px;
	width: 120px;
	margin-left: 80px;
	margin-bottom: 20px;
}

.btn-warning {
	margin-top: 20px;
	font-size: 18px;
	width: 120px;
	margin-bottom: 20px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-7">
				<h1 class="text-left">Mess complaint form for IIT Bhilai</h1>
				<p class="text-left">Responses of this form will be directly
					forwarded to the people working in the mess.</p>
			</div>
			<div class="col-md-5">
				<div class="row">
					<div class="col-md-10">
						<h3 class="text-left">Complaint form of IIT Bhilai</h3>
					</div>
					<div class="col-md-6">
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					</div>
				</div>
				<div class="breaker"></div>
				<div class="row">
					<label class="label col-md-2 control-label">Name</label>
					<div class="col-md-10">
						<input type="text" class="form-control" name="name"
							placeholder="Name">
					</div>
				</div>
				<div class="row">
					<label class="label col-md-2 control-label">ID</label>
					<div class="col-md-10">
						<input type="text" class="form-control" name="id"
							placeholder="ID Number">
					</div>
				</div>
				<div class="row">
					<label class="label col-md-2 control-label">Mess</label>
					<div class="col-md-10">
						<select class="form-control">
							<option>Castle Dio</option>
							<option>Castle Ena</option>
						</select>
					</div>
				</div>
				<div class="row">
					<label class="label col-md-2 control-label">Meal</label>
					<div class="col-md-10">
						<select class="form-control">
							<option>Breakfast</option>
							<option>Lunch</option>
							<option>Snacks</option>
							<option>Dinner</option>
						</select>
					</div>
				</div>
				<div class="row">
					<label class="label col-md-2 control-label">Date</label>
					<div class="col-md-10">
						<input type="date" class="form-control" name="date"
							placeholder="Date">
					</div>
				</div>
				<div class="row">
					<label class="label col-md-2 control-label">Complaint</label>
					<div class="col-md-10">
						<textarea rows="5" class="form-control"
							placeholder="Describe your complaint here"></textarea>
					</div>
				</div>

				<a href="#"><div class="btn btn-info">Submit</div></a> <a href="#"><div
						class="btn btn-warning">Cancel</div></a>
			</div>
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