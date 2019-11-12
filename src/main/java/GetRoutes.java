
import routes.AddLectures;
import routes.AddStudents;
import routes.StudentList;

import static spark.Spark.*;

public class GetRoutes {

    void runRoutes(){

        AddLectures addLectures = new AddLectures();
        AddStudents addStudents = new AddStudents();
        StudentList studentList = new StudentList();

        port(8080);
        staticFiles.location("/public");
        staticFiles.location("/templates");


        addLectures.runLecture();
        addStudents.runStudent();
        studentList.listStudents();

    }

//    public static void main(String[] args) {
//
//
//
//
//    }


}
