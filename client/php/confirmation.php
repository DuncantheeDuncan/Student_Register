<?php
session_start();
require_once('connection.php')
?>
<!DOCTYPE html>
<html>
<head>
	<title>Confirm</title>
	<script type="text/javascript" src="../jquery-1.3.2.min.js/jquery-1.3.2.min.js"></script>
	<script typetext="text/javascript" src="../http://code.jquery.com/jquery-latest.min.js"></script>
	<link rel="stylesheet" type="text/css" href= "../css/main.css">


</head>
<body onload="closeTab()">
	<div class="container">
		<div id="logo_container">
			<img class="img-responsive" id="Logo" src="../images/home_rgi_logo.png">
		</div>
		<div class= "main_div">
				<img class="Lecture_img" src="../images/lectures/photo.png">
			<p>
				<span id="ICAS_NUMBER"><?php echo $_SESSION['login_ID'] ?></span><BR>
				<span id="Name">Arnold Mubaiwa</span>
				<span><?php echo $_SESSION['login_Name']  ?></span>
			</p>
			<p>Faculty Of<br>
				<span id="Faculty">Information Technology</span> 
			</p>
			<a href="timetable.php">
				<button id="confirm">
					Confirm
				</button>
			</a>
			
		</div>
	</div>
</body>
</html>