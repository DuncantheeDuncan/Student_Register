// alert("Indicating that javascript is still connected..");


    // validating that only  numbers are entered!!
    function isNumber(evt) {
        var iKeyCode = (evt.which) ? evt.which : evt.keyCode
        if (iKeyCode != 10 && iKeyCode > 31 && (iKeyCode < 48 || iKeyCode > 57))
            return false;

        return true;
    }    

function warnin(){
						Swal.fire({
						
					  type: 'error',
					  title: 'Oops...',
					  text: 'Something went wrong!',
					  timer: 1800000,
					  footer: '<a href>Why do I have this issue?</a>'
					})
alert("aibo!!");
		

					}
