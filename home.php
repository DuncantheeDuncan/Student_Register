<!DOCTYPE html>
<html>
<head>
	<title>Lecture login</title>
	<script type="text/javascript" src="jquery-1.3.2.min.js/jquery-1.3.2.min.js"></script>
	<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
	<link rel="stylesheet" type="text/css" href=" main.css">
</head>
<body>
	<div class="container">
		<div id="logo_container">
			<img class="img-responsive" id="Logo" src="rgi.png">
		</div>
		<div class= "main_div">
				<h2>LECTURE<br> SIGN IN</h2>
				<p>ENTER YOUR ASSIGNED CODE</p><BR>
			<form class="input_group">
				<input id="input_box" type="text" name="VerificationCode" placeholder="UNIQUE CODE">
			</form>

			<script type="text/javascript">
				$('input').keypress(function () {
					var ten = 9;
					if (this.value.length == ten) {
				window.open("confirmation.html");
				window.close("Home.html");
					}
				});
			</script>

		</div>
	</div>
</body>
</html>