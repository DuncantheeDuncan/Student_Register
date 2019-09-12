<?php	
// require_once "db.php";
// require_once "sessions_start.php";

 ?>
 
<html>
<head>
	<title>Log-in page</title>

	<script type="text/javascript" src="jquery-1.3.2.min.js/jquery-1.3.2.min.js"></script>

	<script typetext="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>

	<script typetext="text/javascript" src="javascript/indexjs.js"></script>


	<link rel="stylesheet" type="text/css" href= "css/main.css">
	<script src="sweetalert2.all.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/promise-polyfill"></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@8"></script>


</head>
<body>
 
	<div class="container">
		<div id="logo_container">
			<img class="img-responsive" id="Logo" src="images/home_rgi_logo.png">
		</div>
		<div class= "main_div">
				<h2>LECTURE<br> SIGN IN</h2>
				<p>ENTER YOUR ASSIGNED CODE</p><BR>
				<!-- <?php	echo $_SESSION['name']; ?> -->
		

			<form class="input_group"  id="form" method="post" action=""  >
				<input id="input_box"
				 type="numbers" name="passcode"
				  placeholder="unique code"
				  onkeypress="javascript:return isNumber(event)"  
				  title="enter the assigned code">
				  <p id="one"></p>
				<!-- <input type="submit" name="submit"  value="Submit" class="btnSubmit"> -->
			</form>
				
	
			<script type="text/javascript">
				 //if numbers enterd are equal to 10 digits it must attempt to load to the next page..

				$('input').keypress(function () {
					var ten = 10;
					var login = 1111111111;// this is temporary
					$('p').text(ten.size);

					if (this.value.length == ten) {$(function(){ $("#form").submit();})
					if(this.value == login){// this if block is temp.
				// window.close("index.php");
				window.open("php/confirmation.php");
				}else {

					// alert("unrecognised code");
					document.getElementById("one").innerHTML =  warnin();
					

				}
				
				  
					}
				});
			</script>



		</div>
	</div>
</body>
</html>