<?php	

// next to try snd search if the user is valid or not..
require_once "db.php";


// NOT WORKING q00 pERCENT!!
// if(!isset($_POST['passcode'])){
// 	die ('please enter passcode');
// }

if($stmt = $conn->prepare('SELECT userId, lecture_name FROM logins WHERE passcode = ?')){
	$stmt->bind_param('i',$_POST['passcode']);
	$stmt->execute();
	$stmt->store_result();// storing results to check if this person exist or what..
}
	if($stmt->num_rows > 0){
    //    $hash_passwords = password_hash($passcode,PASSWORD_DEFAULT);
		$stmt->bind_result($userId,$lecture_name);// this just stores the variables nje
		$stmt->fetch();
		// if(password_verify($_POST['VerificationCode'],$hash_passwords)){
			$passcode = $_POST['passcode'];
			if( $passcode == $_POST['passcode']){
				session_regenerate_id();

			$_SESSION['loggedin'] = TRUE;
			$_SESSION['name'] = $lecture_name;
			$_SESSION['userId'] = $userId;
			echo '<br/>welcome '.$_SESSION['name'] . '!';

		}else{
			echo 'Incorect Passcode!';
		}
	}else{
		echo 'incorect passcode 222';
	}
	$stmt->close();


?>
<?php $htmlString= 'testing'; 

 
?>


<html>
<head>
	<title>Lecture login</title>
	<script type="text/javascript" src="jquery-1.3.2.min.js/jquery-1.3.2.min.js"></script>
	<script typetext="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
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
				<?php	echo "php connected"; ?>
		

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
				window.close("index.php");
				window.open("php/confirmation.php");
				
					}
				});
			</script>

		</div>
	</div>
</body>
</html>