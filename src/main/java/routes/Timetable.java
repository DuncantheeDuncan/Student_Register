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
System.out.println("percentage "+percentage / 30 + "%");

return attending /daysInAMounth;

}
int is = 0;
int net =0;
int wbt =0;
int engl  =0 ;
int zulu = 0;


int modules[] = {is,net,wbt,engl,zulu};


int absent = 0;
int pre = 0;

void get(){

	for (int i = 0 ;i < modules.length;i++ ) {

if (i == modules[4]) {
		++zulu;
		++pre;
	}else{
		++absent;
	}	

}
System.out.println("modules "+ zulu);
System.out.println("present "+ pre);
System.out.println("absent "+ absent);
}


public static void main(String[] args) {

Timetable time = new Timetable();
time.attendancePercentage(10);
time.get();





}

}