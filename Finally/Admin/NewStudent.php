<?php 
require_once("connection.php");
try{
$sql = "INSERT INTO Students(StudentNumber, Name,Surname,Faculty,Qualification,YearOfStudy,ContactNumber,Email,GuardianContactNo,GuardianEmailAd)VALUES ('" .$_POST['StudentNumber'] . "','" .$_POST['Name'] . "','" . $_POST['Surname'] . "','" .$_POST['Faculty']. "','".$_POST['Qualification']."','".$_POST['YearOfStudy']."','".$_POST['ContactNumber']."','".$_POST['Email']."','".$_POST['GuardianContactNo']."','".$_POST['GuardianEmailAd']."')";
if( mysqli_query($conn,$sql)){
    echo "Student Added";
}
else{
    echo "Student not added";
}}
catch(Exception $e){

}
    // mysqli_query($conn,$sql);
	$current_id = mysqli_insert_id($conn);
 ?>
<!Doctype html>
<html>
<head>	
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">
<link rel="stylesheet" href="main.css">
</head>
<body>
<div class="wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <div class="page-header">
                        <h2>Adding New Student</h2>
                    </div>
<form method="post" action="">
<div class="form-group">   <label for="StudentNumber">Student Number</label> <input class="form-control" type="text" name="StudentNumber" required><br>
   </div>
<div class="form-group"><label for="Name">First Name</label><input class="form-control" type="text" name="Name" required><br>
 </div>
<div class="form-group"> <label for="Surname">Last Name</label><input class="form-control" type="text" name="Surname" required><br>
 </div>
<div class="form-group"><label for="Faculty">Faculty</label><input class="form-control" type="text" name="Faculty" required><br>
   </div>
<div class="form-group"><label for="Qualification">Qualification</label><input class="form-control" type="text" name="Qualification" required><br>
   </div>
<div class="form-group"><label for="YearOfStudy">Year Of Study</label><input class="form-control" type="text" name="YearOfStudy" required><br>
   </div>
<div class="form-group"><label for="ContactNumber">Contact Number</label><input class="form-control" type="text" name="ContactNumber" required><br>
   </div>
<div class="form-group"><label for="Email">Email</label><input class="form-control" type="email" name="Email" required><br>
   </div>
<div class="form-group"><label for="GuardianContactNo">Guardian ContactNo</label><input class="form-control" type="text" name="GuardianContactNo" required><br>
   </div>
<div class="form-group"><label for="GuardianEmailAd">Guardian Email Address</label><input class="form-control" type="email" name="GuardianEmailAd" required><br>
   </div>
   <input type="submit" class="btn btnSubmit" value="Submit">
                        <a href="Students.php" class="btn btn-default">Cancel</a></form> 
</div></div></div></div>
</body>
</html>