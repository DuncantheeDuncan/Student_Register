<?php

if(count($_POST)>0){
    require_once("db.php"); 
    
    $sql = "INSERT INTO logins (passcode) VALUES ('" . $_POST["passcode"] . "')";
    mysqli_query($conn,$sql);
	$current_id = mysqli_insert_id($conn);
	if(!empty($current_id)) {
        $message = "New User111 Added Successfully";
    }

}

?>

<html>
    <head>
</head>
<body>
    <h1>checking... </h1>
    <form name="frmUser" method="post" action="">
    <div style="width:500px;">
    <div class="message"> <?php if(isset($message)) { echo $message; } ?> </div>
    <div align="right" style="padding-bottom:5px">
      <a href="index.php" class="link">
        <img alt='List' title='List' src='images/list.png' width='15px' height='15px'/> List User</a></div>
    <table border ="0" cellpadding="10" cellspacing="0" width="500" align="center" class="tblSaveForm">
    <tr class="tableheader">
    <td colspan="2">Add New User</td>
    </tr>

    <td><label>Password</label></td>
    <td><input type="password" name="passcode" class="txtField"></td>
    </tr>
   
    <tr>
    <td colspan="2"><input type="submit" name="submit" value="Submit" class="btnSubmit"></td>
    </tr>
    </table>
    </div>
    </form>

    </html>