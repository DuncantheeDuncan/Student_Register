<?php
session_start();
// cooneting to Database
$conn = mysqli_connect("localhost","root","","student_Register");
// echo "connected for lecture";
if($conn == true){
    echo "connected lecture";
}else{
    die ("opps somthing wrong " );
}



?>