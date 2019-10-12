<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IIT Bhilai Mess Complaint System</title>

<!-- Reference of bootstrap file -->
<link href="style_login.css" type="text/css" rel="stylesheet">

<!-- Stylesheet of font-awesome -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>

	<div class="box">
		<h2>IIT Bhilai Mess Complaint System</h2>
		<form action="Login" method="post">
			<label class="radio-inline"><input type="radio"
				name="user-radio-button" value="user" checked>User</label>
			<label class="radio-inline"><input
				type="radio" name="mess-radio-button" value="mess">Mess</label>
			<div class="inputBox">
				<input type="text" id="username" name="username" required> <label>Username</label>
			</div>
			<div class="inputBox">
				<i class="fa fa-eye" id="eye"></i> <input type="password"
					id="password" name="password" required> <label>Password</label>

			</div>
			<div style="color: red; padding-bottom: 10px;">
				<!-- "Invalid credentials" message will display when username or password or maybe both are wrong -->
				<%
					if (request.getAttribute("message") != null) {
						out.println(request.getAttribute("message"));
					}
				%>
			</div>
			<input type="submit" name="" value="Login">
			<!-- Login button -->
		</form>

	</div>



	<!-- Script for toggle password starts here -->
	<script>
		var password = document.getElementById('password');
		var eye = document.getElementById('eye');

		eye.addEventListener('click', togglePass);
		function togglePass() {
			if ($('.fa').hasClass('fa-eye')) {
				$('.fa').removeClass('fa-eye').addClass('fa-eye-slash');
			} else {
				$('.fa').removeClass('fa-eye-slash').addClass('fa-eye');
			}
			(password.type == 'password') ? password.type = 'text'
					: password.type = 'password';
		}
	</script>
	<!-- Script for toggle password starts here -->



	<!-- Google CDN for jquery starts here -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js">
		
	</script>
	<!-- Google CDN for jquery ends here -->

</body>
</html>