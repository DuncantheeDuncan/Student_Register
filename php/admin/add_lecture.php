<?php

if(count($_POST)>0){
    require_once("../../db.php"); 
    // $_SERVER['']
    
    
    $sql = "INSERT INTO logins (lecture_name,passcode) VALUES ('" . $_POST["lecture_name"] . "','" . $_POST["passcode"] . "')";
    // $sql = "INSERT INTO pictures (lecture_picture) VALUES ('" . $_POST["lecture_picture"] . "')";
    mysqli_query($conn,$sql);
// --------------------------------------------------------------------------


// $im = $_POST["lecture_picture"];
    $imagename= $_FILES["lecture_picture"]["name"];// NOT SURE HY ADD NAME IN THIS ARRY???
    // $image_name=$_FILES['". $_POST[""]"']['name'];


    $imagetmp= addslashes(file_get_contents($_FILES['lecture_picture']['temp_name']));// getting content
    


// inserting
$insert_image="INSERT INTO pictures VALUES ('$imagetmp','$imagename')";
mysqli_query($conn,$insert_image);

                        if(isset($_POST["submit"]))
                        {
                            
                            $file = addslashes(file_get_contents($_FILES["lectures_picture"]["temp_name"]));
                            
                            $query = "INSERT INTO pictures  VALUES $file ";
                        
                            if(mysqli_query($conn,$query))
                            {
                                echo '<script>alert("Image inserted into database")</script><';
                            }
                        }


                        

                        // if (isset($_FILES["lecture_picture"]["name"])) {
                        
                        //     $name = $_FILES["lecture_picture"]["name"];
                        //     $tmp_name = $_FILES['lecture_picture']['tmp_name'];
                        //     $error = $_FILES['lecture_picture']['error'];
                        
                        //     if (!empty($name)) {
                        //         $location = '../rgi2.png';
                                
                        //         // $location = '../hhh/rgi2.png';
                        //         if  (move_uploaded_file($tmp_name, $location.$name)){
                        //             echo 'Uploaded';
                        //         }
                        
                        //     } else {
                        //         echo 'please choose a file';
                        //     }
                        // }
                        
                        
                        // <form action="test.php" method="POST" enctype="multipart/form-data">
                        //     <input type="file" name="file"><br><br>
                        //     <input type="submit" value="Submit">
                        // </form>

// if (!$_POST) {
//     printf("Error: %s\n", mysqli_error($conn));
//     exit();
// }
  // we must make sure that what's inserted here is hashes..
    
	$current_id = mysqli_insert_id($conn);
	if(!empty($current_id)) {
        $message = "A new lecture has bee succesfully added ";
    }else{
        $message = "<h1>opps.. somthing wrong!!</h1>";
    }


}

?>


<html>
    <head>
</head>
<body>
    <h1>checking.. </h1>
    <form name="frmUser" method="post" action="" enctype="multipart/form-data">
   
   
        <!-- <img alt='List' title='List' src='images/list.png' width='15px' height='15px'/> List User</a></div> -->
    <table border ="0" cellpadding="10" cellspacing="0" width="500" align="center">
    <tr>
    <td colspan="2">Add New User</td>
    </tr>
    <td><label>Name: </label></td>
    <td><input type="text" name="lecture_name"  class="txtField"></td>
    <td><label>passcode: </label></td>
    <td><input type="text" name="passcode" class="txtField"></td>
    </tr>
    <tr>
    <td><label>Add lectrurer's picture: </label></td>
    <td><input type="file" name="lecture_picture"  id="lecture_picture" value="upload" class="txtField"></td>
    </tr>
   
    <tr>
    <td colspan="2"><input type="submit" name="submit"  id= "submit" value="Submit" class="btnSubmit"></td>
    </tr>
    <?php
    require_once("../../db.php"); 
    $query = "SELECT * FROM pictures ORDER BY pictures_ID DESC";
    $result = mysqli_query($conn,$query);
    // if (!$check1_res) {
    //     printf("Error: %s\n", mysqli_error($conn));
    //     exit();
    // }
    while($row = mysqli_fetch_array($result))
    {
        echo '
<tr>
    <td>
    <img src="data:image/jpeg;base64,'.base64_encode($row['Lectures_picture']).'" height="400" width="400"/>
    </td>
</tr>

        ';
    }
    // echo $_FILES['lecture_picture'];
    ?>
    </table>
    </div>
    </form>
    </html>
    <Script>
    function(){
        
    }
    $(document).ready(function()){
        $('#submit').click(function(){

            var image_name = $('#lecture_picture').val();
            if(image_name == '')
            {
                alert("please select Image ");
                return false;
            }else
            {
                var extention = $('#lecture_picture').val().split('.').pop().toLowercase();
                if(jQuery.inArray(extention,['gif','png','jpg','jpeg'])== -1)
                {
                    alert("invalid image file");
                    $('#lectures_picture').val('');
                    return false;
                }
            }
        });
    };
    </script>
    