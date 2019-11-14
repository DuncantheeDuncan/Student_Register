package routes;

class Timetable{

public  int attendancePercentage(int attending){
	// attending gains you 10 points
	// max number of classes 300
	// attendin +3 lecturers gains you a percentage

int percentage =  attending * 10;
int daysInAMounth = 30;

System.out.println("absent "+ attending);
System.out.println("present "+ attending);
System.out.println("percentage "+percentage / 25 + "%");

return attending /daysInAMounth;

}



//public static void main(String[] args) {

Timetable time = new Timetable();
//time.attendancePercentage(10);






//}

}