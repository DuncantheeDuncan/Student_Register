<?php 

// session_start();


// if(!isset($_SESSION['loggedin'])){
	// header('location: ../index.php');	
	// exit();
// }
// header("location: confirmation.php");
// $lecture_name = 

// echo $lecture_name." this";
// $page = $_SERVER['PHP_SELF']; // this is to refresh the page // but we can find away to make it stop after it 
// it refreshed..
// $sec = 1;




?>
<!DOCTYPE html>
<html>
<head>
	<title>Confirm</title>
	<link rel="stylesheet" type="text/css" href="../css/main.css">
	<!-- <meta http-equiv="refresh" content="<?php echo $sec?>;URL='<?php echo $page?>'"> -->
</head>
<body onload="closeTab()">
	<div class="container">
		<div id="logo_container">
			<img class="img-responsive" id="Logo" src="images/rgi.png">
		</div>
		<div class= "main_div">
				<img class="Lecture_img"src="https://duncantheeduncan.github.io/my-git-images/Summative_assessment2/classAndInterface.png"> 	
			<p>
				<span id="ICAS_NUMBER">121589</span><BR>
				
				<span id="name"><?php echo '<br/>welcomeeer '
				// .$_SESSION['name']. '!!';?>
					
				</span>
				
				
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