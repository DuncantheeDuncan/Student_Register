<?php
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
			

		}else{
			echo 'Incorect Passcode!';
		}
	}else{
		echo 'incorect passcode 222';
	}
	$stmt->close();


?>
