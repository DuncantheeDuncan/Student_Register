<?php
require_once("connection.php");
$TableName = $_POST['Name'].$_POST['Surname'];
$UniqueNo=abs( crc32( uniqid() ) );
$CreateTable = "CREATE TABLE $TableName (
StudentNo INT(6) NOT NULL PRIMARY KEY, 
Name VARCHAR(30) NOT NULL,
Surname VARCHAR(30),
Faculty VARCHAR(30) NOT NULL,
YearOfStudy VARCHAR(30) NOT NULL,
DateOfAttendance  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)";
if ($conn->query($CreateTable) === TRUE) {
    echo "Table". $TableName." created successfully";
} else {
    echo "Error creating table: " . $conn->error;
}
$sql = "INSERT INTO Lecturers(LecturerNumber,UniqueNumber, Name,Surname,Faculty,ContactNumber,Email,TableName)VALUES ('" .$_POST['LecturerNumber'] . "','".$UniqueNo."','" .$_POST['Name'] . "','" . $_POST['Surname'] . "','" .$_POST['Faculty']. "','".$_POST['ContactNumber']."','".$_POST['EmailAddress']."','".$TableName."')";
   
if( mysqli_query($conn,$sql)){
    echo "Lecturer Added";
}
else{
    echo "Lecturer not added". $conn->error;
}
// mysqli_query($conn,$sql);
	$current_id = mysqli_insert_id($conn);

$conn->close();
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
                        <h2> Adding New Lecturer</h2>
                    </div>
<form method="post" action="">
<div class="form-group">   <label for="LecturerNumber">Lecturer Number</label> <input class="form-control" type="text" name="LecturerNumber" required><br>
   </div>
<div class="form-group"><label for="Name">First Name</label><input class="form-control" type="text" name="Name" required><br>
 </div>
<div class="form-group"> <label for="Surname">Last Name</label><input class="form-control" type="text" name="Surname" required><br>
 </div>
<div class="form-group"><label for="Faculty">Faculty</label><input class="form-control" type="text" name="Faculty" required><br>
   </div>
<div class="form-group"><label for="ContactNumber">Contact Number</label><input class="form-control" type="text" name="ContactNumber" required><br>
   </div>
<div class="form-group"><label for="EmailAddress">Email Address</label><input class="form-control" type="email" name="EmailAddress" required><br>
   </div>
   <input type="submit" class="btn btnSubmit" value="Submit">
                        <a href="Lecturers.php" class="btn btn-default">Cancel</a></form> 
</div></div></div></div>
</body>
</html>
