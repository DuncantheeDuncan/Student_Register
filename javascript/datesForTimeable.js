var days = new Date();

//to write the date
function weekDay() {
    var today = days.getUTCDay();
    var month = days.getUTCMonth();
    var daysOfTheWeek = new Array("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saterday");
    var monthOfTheYear = new Array("January","February","March","April","May","June","July","August","September","October","November","December");

    document.getElementById("day").innerHTML = daysOfTheWeek[today]+" "+days.getDate()+" "+monthOfTheYear[month]; 
}

//to open a new page..
function toRegister() {
    window.open("InclassStudents.html");

}
