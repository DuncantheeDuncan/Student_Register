<?php
//this ill remember logged in users
session_start(); 

// cooneting to Database
$conn = mysqli_connect("localhost","root","","student_Register");

if($conn == true){
    echo "connected index";
}else{
    die ("opps somthing wrong " );
}



?>