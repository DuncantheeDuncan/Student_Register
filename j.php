<?php

if(!isset($_SESSION['loggedin'])){
	echo "connected confirmation";
	header('location: ../index.php');
	exit();
}

?>