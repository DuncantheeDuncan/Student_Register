<?php	
// require_once "db.php";
// require_once "sessions_start.php";

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
 					var Lecture_login = 1111111111; // this is temporary 'Lecturer'
 					var Admin_login = 5555555555; // this is temp 'admin'
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