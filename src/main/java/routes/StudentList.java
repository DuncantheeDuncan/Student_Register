package routes;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

public class StudentList  extends AddStudents{

List <AddStudents> list = new ArrayList<>();

    public void listStudents(){


       get("/studentlist",(req, res) ->{
//           Map<String, Object> map = new HashMap<>();
           Map<String, Object> school_form_map = new HashMap<>();
           return new HandlebarsTemplateEngine().render(new ModelAndView(school_form_map, "studentlist.handlebars"));
       });

       post("/studentlist", (req, response)-> {
           Map<String, Object> school_form_map = new HashMap<>();


           System.out.println(list.size() + " siiiiiiize");

//
           return new HandlebarsTemplateEngine().render(new ModelAndView(school_form_map, "studentlist.handlebars"));
       });
   }

}
