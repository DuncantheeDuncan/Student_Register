<?php
// Check existence of id parameter before processing further
// if(isset($_GET["LecturerNumber"]) && !empty(trim($_GET["LecturerNumber"]))){
    // Include config file
    require_once "connection.php";
    
    // Prepare a select statement
    $sql = "SELECT * FROM Lecturers WHERE LecturerNumber = ?";
    
    if($stmt = mysqli_prepare($conn, $sql)){
        // Bind variables to the prepared statement as parameters
        mysqli_stmt_bind_param($stmt, "i", $param_id);
        
        // Set parameters
        $param_id = trim($_GET["LecturerNumber"]);
        
        // Attempt to execute the prepared statement
        if(mysqli_stmt_execute($stmt)){
            $result = mysqli_stmt_get_result($stmt);
    
            if(mysqli_num_rows($result) == 1){
                /* Fetch result row as an associative array. Since the result set contains only one row, we don't need to use while loop */
                $row = mysqli_fetch_array($result, MYSQLI_ASSOC);
                
                // Retrieve individual field value
                $Name = $row["Name"];
                $Surname = $row["Surname"];
                $Faculty = $row["Faculty"];
            } else{
                // URL doesn't contain valid id parameter. Redirect to error page
                header("location: error.php");
                exit();
            }
            
        } else{
            echo "Oops! Something went wrong. Please try again later.";
        }
    }
     
    // Close statement
    mysqli_stmt_close($stmt);
    
    // Close connection
    mysqli_close($conn);
// } else{
//     // URL doesn't contain id parameter. Redirect to error page
//     header("location: error.php");
//     exit();
// }
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>View Record</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="main.css">
</head>
<body>
    <div class="wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12">
                    <div class="page-header">
                        <h1>View Record</h1>
                    </div>
                    <div class="form-group">
                        <label>Name</label>
                        <p class="form-control-static"><?php echo $row["Name"]; ?></p>
                    </div>
                    <div class="form-group">
                        <label>Surname</label>
                        <p class="form-control-static"><?php echo $row["Surname"]; ?></p>
                    </div>
                    <div class="form-group">
                        <label>Faculty</label>
                        <p class="form-control-static"><?php echo $row["Faculty"]; ?></p>
                    </div>
                    <p><a href="Lecturers.php" class="btn btnSubmit">Back</a></p>
                </div>
            </div>        
        </div>
    </div>
</body>
</html>