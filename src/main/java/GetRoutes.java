
import routes.AddLectures;
import routes.AddStudents;

import static spark.Spark.*;

public class GetRoutes {

    void runRoutes(){

        AddLectures addLectures = new AddLectures();
        AddStudents addStudents = new AddStudents();

        port(8080);
        staticFiles.location("/public");
        staticFiles.location("/templates");


        addLectures.runLecture();
        addStudents.runStudent();
    }

//    public static void main(String[] args) {
//
//
//
//
//    }


}
