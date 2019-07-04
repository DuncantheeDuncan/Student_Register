<?php	

// next to try snd search if the user is valid or not..
require_once "db.php";
// require_once "php/admin/add_lecture.php";

// $sql = "SELECT userId FROM logins WHERE passcode = ?";
if($statement = $conn->prepare('SELECT userId, lecture_name FROM logins WHERE passcode = ?')){

	$statement->bind_param('i',$_POST['passcode']);
	$statement->execute();
	$statement->store_result();// storing results to check if this person exist or what..
}

	if($statement->num_rows > 0){
    //    $hash_passwords = password_hash($passcode,PASSWORD_DEFAULT);

		$statement->bind_result($userId,$lecture_name,$passcode);// this just stores the variables nje
		$statement->fetch();

		// if(password_verify($_POST['VerificationCode'],$hash_passwords)){
			if($_POST['VerificationCode'] === $passcode){

			session_regenerate_id();

			$_SESSION['loggedin'] = TRUE;
			$_SESSION['name'] = $lecture_name;
			$_SESSION['userId'] = $userId;
			echo 'welcome '.$_SESSION['name'] . '!';

		}else{
			echo 'Incorect Passcode!';
		}
	}else{
		echo 'incorect passcode 222';
	}
	$statement->close();


?>
<?php $htmlString= 'testing'; 

 
?>
<html>
<head>
	<title>Lecture login</title>
	<script type="text/javascript" src="jquery-1.3.2.min.js/jquery-1.3.2.min.js"></script>
	<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
	<link rel="stylesheet" type="text/css" href=" main.css">
</head>
<body>


    <!-- <script type="text/javascript">  
      // notice the quotes around the ?php tag         
      var htmlString="<?php echo $htmlString; ?>";
      alert(htmlString);
    </script> -->
  
	<div class="container">
		<div id="logo_container">
			<img class="img-responsive" id="Logo" src="rgi.png">
		</div>
		<div class= "main_div">
				<h2>LECTURE<br> SIGN IN</h2>
				<p>ENTER YOUR ASSIGNED CODE</p><BR>
				<?php	echo "php connected"; ?>
		

			<form class="input_group">
				<input id="input_box" type="text" name="VerificationCode" placeholder="UNIQUE CODE">
			</form>

			<script type="text/javascript">
				$('input').keypress(function () {
					var ten = 9;
					if (this.value.length == ten) {

						// var htmlString="<?php  echo $htmlString; ?>";
							//   alert(htmlString);
						// var jj="<?php $jj;?>";
						
						window.close("index.php");
				window.open("php/confirmation.php");
				
					}
				});
			</script>

		</div>
	</div>
</body>
</html>