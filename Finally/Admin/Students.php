<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.js"></script>
    <link rel="stylesheet" href="main.css">
    <style type="text/css">
        .page-header h2{
            margin-top: 0;
        }
        th{
            background-color: rgb(11, 19, 46);
            color:white;
        }
        table tr td:last-child a{
            margin-right: 10px;
        }
        body{
            padding:40px;
        }
        td{
            font-size:14px;
        }
        .addBTN{
            background-color: rgb(11, 19, 46);
            color:white;
        }
        tr{
            background-color: gray;
            color:black;
        }
    </style>
    <script type="text/javascript">
        $(document).ready(function(){
            $('[data-toggle="tooltip"]').tooltip();   
        });
    </script>
</head>
<body>
            <div class="row">
                <div class="col-md-12">
                    <div class="page-header clearfix">
                        <h2 class="pull-left">Students Details</h2>
                        <a href="NewStudent.php" class="btn pull-right addBTN" >Add New Student</a>
                    </div>
                    <?php
                    // Include config file
                    require_once "connection.php";
                    
                    // Attempt select query execution
                    $sql = "SELECT * FROM Students";

                    if($result = mysqli_query($conn, $sql)){
                        if(mysqli_num_rows($result) > 0){
                            echo "<table class='table table-bordered table-striped'>";
                                echo "<thead>";
                                    echo "<tr>";
                                        echo "<th>Student Number</th>";
                                        echo "<th>Name</th>";
                                        echo "<th>Surname</th>";
                                        echo "<th>Contact Number</th>";
                                        echo "<th>Faculty</th>";
                                        echo "<th>Qualification</th>";
                                        echo "<th>Year Of Study</th>";
                                        echo "<th>Email Address</th>";
                                        echo "<th>Guardian Contact No</th>";
                                        echo "<th>Guardian Email</th>";
                                    echo "</tr>";
                                echo "</thead>";
                                echo "<tbody>";
                                while($row = mysqli_fetch_array($result)){
                                    echo "<a href='SearchLecturer.php?StudentNumber=". $row['StudentNumber'] ."' > ";
                                    echo "<tr>";
                                        echo "<td>" . $row['StudentNumber'] . "</td>";
                                        echo "<td>" . $row['Name'] . "</td>";
                                        echo "<td>" . $row['Surname'] . "</td>";
                                        echo "<td>" . $row['ContactNumber'] . "</td>";
                                        echo "<td>" . $row['Faculty'] . "</td>";
                                        echo "<td>" . $row['Qualification'] . "</td>";
                                        echo "<td>" . $row['YearOfStudy'] . "</td>";
                                        echo "<td>" . $row['Email'] . "</td>";
                                        echo "<td>" . $row['GuardianContactNo'] . "</td>";
                                        echo "<td>" . $row['GuardianEmailAd'] . "</td>";
                                    echo "</tr>";
                                    echo "</a>";
                                }
                                echo "</tbody>";                            
                            echo "</table>";
                            // Free result set
                            mysqli_free_result($result);
                        } else{
                            echo "<p class='lead'><em>No records were found.</em></p>";
                        }
                    } else{
                        echo "ERROR: Could not able to execute $sql. " . mysqli_error($conn);
                    }
                    // Close connection
                    mysqli_close($conn);
                    ?>
                </div>
            </div>        
</body>
</html>