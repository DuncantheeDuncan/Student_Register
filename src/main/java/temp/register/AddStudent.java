package temp.register;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddStudent {

    List<StudentDetails> studentList = new ArrayList<>();


    class StudentDetails {
        private String studentName;
        private String studentSurname;
        private String studentMiddleName;
        private long studentNumber;
        private long studentIdNumber;
        private int studentCurrentYear;

        private StudentDetails(String studentName, String studentSurname, String studentMiddleName, long studentNumber, long studentIdNumber, int studentCurrentYear) {
            this.studentName = studentName;
            this.studentSurname = studentSurname;
            this.studentMiddleName = studentMiddleName;
            this.studentNumber = studentNumber;
            this.studentIdNumber = studentIdNumber;
            this.studentCurrentYear = studentCurrentYear;
        }

        public StudentDetails() {

        }


        public int getStudentCurrentYear() {
            return studentCurrentYear;
        }

//        public void setStudentCurrentYear(int studentCurrentYear) {
//            this.studentCurrentYear = studentCurrentYear;
//        }

        public String getStudentName() {
            return studentName;
        }

//        public void setStudentName(String studentName) {
//            this.studentName = studentName;
//        }

        public String getStudentSurname() {
            return studentSurname;
        }

//        public void setStudentSurname(String studentSurname) {
//            this.studentSurname = studentSurname;
//        }

        public String getStudentMiddleName() {
            return studentMiddleName;
        }

//        public void setStudentMiddleName(String studentMiddleName) {
//            this.studentMiddleName = studentMiddleName;
//        }

        public long getStudentNumber() {
            return studentNumber;
        }

//        public void setStudentNumber(long studentNumber) {
//            this.studentNumber = studentNumber;
//        }

        public long getStudentIdNumber() {
            return studentIdNumber;
        }

//        public void setStudentIdNumber(long studentIdNumber) {
//            this.studentIdNumber = studentIdNumber;
//        }
    }

    Map<Long, String> mapOfStudents = new HashMap<>();

    public String addStudent(String studentName, String studentMiddleName, String studentSurname, Long studentNumber, long studentIdNumber, int studentCurrentYear) {

        studentList.add(new StudentDetails(studentName, studentSurname, studentMiddleName, studentNumber, studentIdNumber, studentCurrentYear));

        for (StudentDetails studentDetails : studentList) {
            mapOfStudents.put(studentDetails.getStudentNumber(),
                    studentDetails.getStudentName() + " " + studentDetails.getStudentMiddleName() + " " + studentDetails.getStudentSurname() +
                            " " + studentDetails.getStudentNumber() + " " + studentDetails.getStudentIdNumber() + " " + studentDetails.getStudentCurrentYear());
        }

        String aStudent = "Name " + studentName + " Middle Name " + studentMiddleName + " Surname " + studentSurname + " Student Number " + studentNumber + " ID Number " + studentIdNumber + " Year " + studentCurrentYear;
        return aStudent;
    }

    public String getAllStudentsWhoAreDoingSpecifYear(int year){
        String name="";
        int i = new StudentDetails().getStudentCurrentYear();




        return name;
    }

}
