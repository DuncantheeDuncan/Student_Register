<?php
if(count($_POST)>0){
    require_once("db.php");
    
	$sql = "INSERT INTO student_Register (passcode) VALUES ('" . $_POST["password"] . "')";

}

?>
