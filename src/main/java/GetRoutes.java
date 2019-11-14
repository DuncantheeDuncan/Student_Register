
import routes.AddLectures;
import routes.AddStudents;
import routes.JDBCSTUDENTS;
import routes.StudentList;

import static spark.Spark.*;

public class GetRoutes {

    void runRoutes() {

        AddLectures addLectures = new AddLectures();
        AddStudents addStudents = new AddStudents();
        StudentList studentList = new StudentList();
        JDBCSTUDENTS jdbcstudents = new JDBCSTUDENTS();
        port(8080);
        staticFiles.location("/public");
        staticFiles.location("/templates");


        addLectures.runLecture();
        addStudents.runStudent();
//        jdbcstudents.runJDBCStudent();
        studentList.listStudents();


    }

//    public static void main(String[] args) {
//
//
//
//
//    }


}
