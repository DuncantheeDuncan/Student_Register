//cons
// var days = new Date();

// function timeTable(){
    // weekDay();
    // sortTheTableLineUp();
// }
// //to write the date
// function weekDay() {
//     var today = days.getUTCDay();
//     var month = days.getUTCMonth();
//     var daysOfTheWeek = new Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
//     var monthOfTheYear = new Array("January","February","March","April","May","June","July","August","September","October","November","December");

//     document.getElementById("day").innerHTML = daysOfTheWeek[today]+" "+days.getDate()+" "+monthOfTheYear[month]; 
//     console.log("day :"+today);}
//////////////////////////////////////////////////////////////////////////////////////////////////
// function sortTheTableLineUp() {
   
//     console.log(classModule);
//     let time = days.getHours();
//     let minute = days.getMinutes();
//     console.log("time :"+time+" "+minute);

//     let classModule = document.getElementById("myList");
//     let newList = document.createElement("li");
//     let node = document.createTextNode("Tis is the new li");
//     newList.appendChild(node);
        
//     classModule.appendChild(newList);
//     classModule.removeChild(classModule.childNodes[0]);

//     let list = document.querySelector("#myList");
//     let items = document.getElementsByClassName('list-group-item');
//     let newItem = document.createElement('li');
//     newItem.innerHTML="New item here";
//     newItem.className="list-group-item";
//     list.appendChild(newItem);
//     // list.removeChild(list.childNodes[0]);
//     console.log(list.childNodes[0]);
//     console.log(items);
//     console.log(list);
// }
//////////////////////////////////////////////////////////////////////////////////////////////////////
//to open a new page..
function toRegister() {
    window.open("InclassStudents.html");
}
//validate user input
// function validateStudentNumber(){
//     let StudentNo=document.getElementById("input_box");
//     let studentNumber=document.getElementById("input_box").value;
//     var hiddenPara = document.getElementById("output_text");
//     // hiddenPara.innerHTML="What is this Working!!!";
//     let numberPattern = /\d/g;
//     let startvalue = /^1/gi;
//     let findText = /\D/gi;
//         let validNum = studentNumber.match(numberPattern).length;
//         let matchsRules = startvalue.test(studentNumber);
//         let anyText = findText.test(studentNumber);

//         if(validNum === 6 && matchsRules && anyText==false){
//            console.log("valid");
//             hiddenPara.innerHTML="valid";
//             StudentNo.style.borderBottomColor="black";
//             console.log("length :"+validNum);
//             console.log("starts with 1 : "+matchsRules);
//             console.log("have letters : "+anyText);
//         }//Arnold19()
//         else{
//             console.log("Value not valid");
//             StudentNo.style.borderBottomColor="red";
//             hiddenPara.innerHTML="invalid text";
//             console.log("length : "+validNum);
//             console.log("starts with 1 : "+matchsRules);
//             console.log("have letters : "+anyText);
//         }
// }
    //             let field = "08/19"
    //             let day = new Date();
				// let mm= day.getMonth()+1;
				// let yy= day.getFullYear().toString().substr(-2);

				// if(mm<10){
				// 	mm= '0'+mm;
				// }
				// let today = mm+"/"+yy;
				// if(field==today){
    //                 console.log("true");
    //                 console.log(today);
				// }
				// else{
    //                 console.log("false");
    //                 console.log(today);
    //             }
                

    //         let user ="Hi my";
    //         let regExp = /\s/;
    //         let result = regExp.test(user);
    //         if (result == true && user.length>=8 && user.length<=20){
    //         console.log(result);
    //         console.log(user.length);

    //         }else{

    //             console.log("requirements not met");
    //             console.log(user.length);
    //         }
          
            
            
    //         $(function(){
                
    //            $("#active1").click(function() {
    //             for (let i = 0; i < 8; i++) {
    //                 let htmlElenent = "#active" + i;
    //                 $(htmlElenent).fadeOut(10000*i+2);
    //                 console.log(htmlElenent);
    //             }
    //            });   
    //         });