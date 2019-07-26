<?php	

// next to try snd search if the user is valid or not..
require_once "db.php";
require_once "sessions_start.php";


 ?>
<?php $htmlString= 'testing'; 

 
?>


<html>
<head>
	<title>Lecture login</title>
	<script type="text/javascript" src="jquery-1.3.2.min.js/jquery-1.3.2.min.js"></script>
	<script typetext="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
	<link rel="stylesheet" type="text/css" href= "css/main.css">
</head>
<body>
 
	<div class="container">
		<div id="logo_container">
			<img class="img-responsive" id="Logo" src="rgi.png">
		</div>
		<div class= "main_div">
				<h2>LECTURE<br> SIGN IN</h2>
				<p>ENTER YOUR ASSIGNED CODE</p><BR>
				<?php	echo $_SESSION['name']; ?>
		

			<form class="input_group"  id="form" method="post" action=""  >
				<input id="input_box" type="int" name="passcode" placeholder="UNIQUE CODE">
				<!-- <input type="submit" name="submit"  value="Submit" class="btnSubmit"> -->
			</form>
				
			<script type="text/javascript">
				$('input').keypress(function () {
					var ten = 10;
					$('p').text(ten.size);
					if (this.value.length == ten) {
		
						$(function(){
							$("#form").submit();
						})
				// window.close("index.php");
				window.open("php/confirmation.php");
				
				
					}
				});
			</script>

		</div>
	</div>
</body>
</html>