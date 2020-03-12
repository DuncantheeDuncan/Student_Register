<?php	
// require_once "db.php";
// require_once "sessions_start.php";
session_start();
require_once("connection.php");
	if($_SERVER["REQUEST_METHOD"]== "POST"){
	$UniqueCode = mysqli_real_escape_string($conn,$_POST['passcode']);
	$userName= $_GET['Name'];
	$userSurname = $_GET['Surname'];
	$sql = "SELECT UniqueID from Lecturers_Details Where UniqueID= '$UniqueCode'";
	$sqlSESSION = "SELECT $userName,$userSurname from Lecturers_Details Where UniqueID= '$UniqueCode'";
	$sql2 = "SELECT UniqueID  from Admin Where UniqueID= '$UniqueCode'";
	$result = mysqli_query($conn,$sql);
	$result2 = mysqli_query($conn,$sql2);
	$row = mysqli_fetch_array($result,MYSQLI_ASSOC);
	$row2 = mysqli_fetch_array($result2,MYSQLI_ASSOC);
	$active = $row['active'];
	$active2 = $row2['active'];
	$count = mysqli_num_rows($result);
	$count2 = mysqli_num_rows($result2);

	if($count === 1){
		// session_register("myusername");
		$_SESSION['login_ID']=$UniqueCode;
		$_SESSION['login_Name']= $userName;
		$_SESSION['login_Surname']= $userSurname;
		header("location: php/confirmation.php");
	}else if ($count2==1) {
		header("location: html/admin/administrator.html");
	}
}
 ?>
 <!DOCTYPE html>
 <html>

 <head>
     <meta charset='utf-8'>
     <meta http-equiv='X-UA-Compatible' content='IE=edge'>
     <title>LOGIN PAGE</title>
     <meta name='viewport' content='width=device-width, initial-scale=1'>

     <link rel="stylesheet" type="text/css" href="css/index.css">


 </head>
 <body>

 <div class="container">
     <div id="logo_container">
         <img class="img-responsive" id="Logo" src="images/home_rgi_logo.png">
         <!-- <img class="img-responsive" id="Logo" src="confirmation.html"> -->
         <script type="text/javascript" src="jquery-1.3.2.min.js/jquery-1.3.2.min.js"></script>
         <script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
     </div>
     <div class="main_div">
         <h2>STAFF SIGN IN</h2>
         <p>ENTER YOUR ASSIGNED CODE</p><BR>
         <form class="input_group" id="form" method="post" action="">
             <input id="input_box" type="numbers" name="passcode" placeholder="unique code"
                    onkeypress="javascript:return isNumber(event)">

         </form>
         <script type="text/javascript">
 				//if numbers entered are equal to 10 digits it must attempt to load to the next page..

 				$('input').keypress(function () {
 					var ten = 10;
 					// var Lecture_login = 1111111111; // this is temporary 'Lecturer'
 					// var Admin_login = 5555555555; // this is temp 'admin'
 					$('p').text(ten.size);

 					if (this.value.length == ten) {
 						$(function () {
 							$("#form").submit();
 						});
 						if (this.value == Lecture_login) { // this if block is temp.

 <!--    window.location.assign("html/confirmation.html");-->

 window.location.replace("html/confirmation.html");

 						} else if (this.value == Admin_login) {

 window.location.replace("html/admin/administrator.html");

 						} else {
 							alert("Incorrect login ID");

 						}
 					}
 				});

         </script>
     </div>
 </div>

 <script type="text/javascript" src="javascript/indexjs.js"></script>

 <script src='main.js'></script>
 </body>
 </html>