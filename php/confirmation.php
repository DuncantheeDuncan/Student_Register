<?php 

session_start();
if(!isset($_SESSION['loggedin'])){
	echo "connected confirmation";
	header('location: ../index.php');
	exit();
}



?>
<!DOCTYPE html>
<html>
<head>
	<title>Confirm</title>
	<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body onload="closeTab()">
	<div class="container">
		<div id="logo_container">
			<img class="img-responsive" id="Logo" src="rgi.png">
		</div>
		<div class= "main_div">
				<img class="Lecture_img"src="photo.png"> 	
			<p>
				<span id="ICAS_NUMBER">121589</span><BR>
				<span id="Name">Arnold Mubaiwa </span>
				<span id="Name"><?php $_SESSION['name']?>! </span>
			</p>
			<p>Faculty Of<br>
				<span id="Faculty">Information Technology</span> 
			</p>
			<a href="timetable.html">
				<button>
					Confirm
				</button>
			</a>
			
		</div>
	</div>
</body>
</html>